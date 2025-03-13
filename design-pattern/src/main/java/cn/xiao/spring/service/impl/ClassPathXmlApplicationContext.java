package cn.xiao.spring.service.impl;

import cn.xiao.spring.pojo.BeanDefinition;
import cn.xiao.spring.pojo.PropertyValue;
import cn.xiao.spring.service.BeanDefinitionRegistry;
import cn.xiao.spring.MutablePropertyValues;
import cn.xiao.spring.util.StringUtils;

import java.lang.reflect.Method;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建XmlBeanDefinitionReader对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception e) {
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }

        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        if (beanDefinition == null) {
            return null;
        }
        String className = beanDefinition.getClassName();
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && !"".equals(ref)) {
                Object bean = getBean(ref);
                String methodName = StringUtils.getSetterMethodNameByFieldName(propertyName);
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        method.invoke(beanObj, bean);
                    }
                }
            }

            if (value != null && !"".equals(value)) {
                String methodName = StringUtils.getSetterMethodNameByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj, value);
            }
        }
        singletonObjects.put(name, beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean != null) {
            return clazz.cast(bean);
        }
        return null;
    }
}
