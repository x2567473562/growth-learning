package cn.xiao.builder.demo01;

public class PhoneTest {
    public static void main(String[] args) {
        //构建Phone对象
        //Phone phone = new Phone("intel","三星屏幕","金士顿","华硕");
        //System.out.println(phone);

        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
