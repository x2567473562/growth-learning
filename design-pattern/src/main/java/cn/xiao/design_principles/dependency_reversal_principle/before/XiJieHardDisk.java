package cn.xiao.design_principles.dependency_reversal_principle.before;

public class XiJieHardDisk implements HardDisk{
    @Override
    public String read() {
        System.out.println("西部数据硬盘读取数据");
        return "硬盘";
    }

    @Override
    public void save(String data) {
        System.out.println("西部数据硬盘存储数据"+data);
    }

    @Override
    public void delete() {
        System.out.println("西部数据硬盘删除数据");
    }
}
