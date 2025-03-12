package cn.xiao.spring.service.impl;



import cn.xiao.spring.pojo.BeanDefinition;
import cn.xiao.spring.service.ApplicationContext;
import cn.xiao.spring.service.BeanDefinitionReader;
import cn.xiao.spring.service.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractApplicationContext implements ApplicationContext {
    protected BeanDefinitionReader beanDefinitionReader;

    //用来存储bean对象的容器   key存储的是bean的id值，value存储的是bean对象
    protected Map<String, Object> singletonObjects = new HashMap<String, Object>();

    //存储配置文件的路径
    protected String configLocation;

    @Override
    public void refresh() throws IllegalStateException, Exception {
        beanDefinitionReader.loadBeanDefinitions(configLocation);

        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanNames = registry.getBeanDefinitionNames();

        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            getBean(beanName);
        }
    }
}
