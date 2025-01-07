package cn.xiao.design_principles.dependency_reversal_principle.before;

public interface Memory {

        String read();

        void save(String data);

        void delete();
}
