package cn.xiao.proxy.demo;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
