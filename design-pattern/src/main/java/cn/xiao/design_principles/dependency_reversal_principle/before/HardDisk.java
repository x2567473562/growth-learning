package cn.xiao.design_principles.dependency_reversal_principle.before;

public interface  HardDisk {

    String read();

    void save(String data);

    void delete();


}
