package cn.xiao.design_principles.dependency_reversal_principle.before;

public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Intel CPU运行中");
    }
}
