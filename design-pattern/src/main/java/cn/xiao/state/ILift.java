package cn.xiao.state;

public interface ILift {
    //电梯的4个状态
    //开门状态
    final static int OPENING_STATE = 1;
    //关门状态
    final static int CLOSING_STATE = 2;
    //运行状态
    final static int RUNNING_STATE = 3;
    //停止状态
    final static int STOPPING_STATE = 4;

    //设置电梯的状态
    void setState(int state);

    //电梯的动作
    void open();

    void close();

    void run();

    void stop();
}
