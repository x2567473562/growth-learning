package cn.xiao.observer;

public class WeixinUser implements Observer {

    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "：收到微信通知，消息是：" + message);
    }
}
