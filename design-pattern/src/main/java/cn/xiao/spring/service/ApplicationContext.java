package cn.xiao.spring.service;

public interface ApplicationContext extends BeanFactory {
    void refresh() throws IllegalStateException, Exception;
}
