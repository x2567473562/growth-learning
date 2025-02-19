package cn.xiao.singleton;

import java.io.Serializable;

public class SingletonDemo implements Serializable {

    public SingletonDemo() {
    }
    //饿汉式 存在内存浪费
    /*public static SingletonDemo instance = new SingletonDemo();

    public static SingletonDemo getInstance() {
        return instance;
    }*/

     //饿汉式-静态代码块 存在内存浪费
    /*public static SingletonDemo instance;

    static {
        instance = new SingletonDemo();
    }

    public static SingletonDemo getInstance() {
        return instance;
    }*/

    //懒汉式-线程不安全
    /*public static SingletonDemo instance;

    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }*/

    //懒汉式-线程安全
    /*public static SingletonDemo instance;

    public static synchronized SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }*/

    //懒汉式-线程安全 双重验证
     /*public static SingletonDemo instance;
     public static SingletonDemo getInstance(){
         if (instance == null){
             synchronized (SingletonDemo.class){
                 if (instance == null){
                     instance = new SingletonDemo();
                 }
             }
         }
         return instance;
     }*/

    //静态内部类方式 - 推荐(常用)
    private  static class SingletonHolder{
        public static final SingletonDemo INSTANCE = new SingletonDemo();
    }

    private  static SingletonDemo getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return  SingletonHolder.INSTANCE;
    }

    /**
     * 枚举方式
     */
    public enum Singleton {
        INSTANCE;
    }
}
