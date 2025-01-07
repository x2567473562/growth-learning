package cn.xiao.design_principles.dependency_reversal_principle.before;

public class KingstonMemory implements Memory{
    @Override
    public String read() {
        return "内存";
    }

    @Override
    public void save(String data) {
        System.out.println("内存存储数据"+data);
    }

    @Override
    public void delete() {
        System.out.println("内存删除数据");
    }
}
