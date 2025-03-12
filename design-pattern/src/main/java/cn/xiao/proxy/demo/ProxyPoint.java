package cn.xiao.proxy.demo;

public class ProxyPoint implements SellTickets{
    private TrainStation ts =new TrainStation();
    @Override
    public void sell() {
     ts.sell();
     System.out.println("代理点收取一些服务费");
    }
}
