package cn.xiao.spring.service.impl;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

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
        return null;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean != null) {
            return clazz.cast(bean);
        }
        return null;
    }
}
