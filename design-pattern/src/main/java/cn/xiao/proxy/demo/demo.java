package cn.xiao.proxy.demo;

public class demo {
    public static void main(String[] args) {
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
