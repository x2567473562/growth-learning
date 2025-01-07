package cn.xiao.design_principles.open_close_principle;

public class DefaultSkin extends AbstractSkin {
    @Override
    public void display() {
        System.out.println("默认皮肤");
    }
}
