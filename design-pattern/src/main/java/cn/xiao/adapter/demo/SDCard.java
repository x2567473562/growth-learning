package cn.xiao.adapter.demo;

public interface SDCard {
    /**
     * 读卡
     * @return String 返参
     */
    String readSD();

    /**
     * 写入
     * @param msg 传入的参数
     */
    void writeSD(String msg);
}
