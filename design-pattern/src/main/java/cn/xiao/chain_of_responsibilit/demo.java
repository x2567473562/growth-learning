package cn.xiao.chain_of_responsibilit;

public class demo {
    public static void main(String[] args) {
        //请假条来一张
        LeaveRequest leave = new LeaveRequest("小花",5,"身体不适");
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(leave);
    }
}
