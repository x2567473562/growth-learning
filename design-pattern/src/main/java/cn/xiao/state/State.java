package cn.xiao.state;

public enum State {

    OPEN(0, "OPEN"),
    CLOSE(1, "CLOSE"),
    RUNNING(2, "RUNNING"),
    STOP(3, "STOP");


    private final Integer code;

    private final String remark;

    State(Integer code, String remark) {
        this.code = code;
        this.remark = remark;
    }
}
