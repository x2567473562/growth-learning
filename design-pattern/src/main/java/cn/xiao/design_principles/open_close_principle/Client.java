package cn.xiao.design_principles.open_close_principle;

public class Client {

    public static void main(String[] args) {
        SouGouInPut souGouInPut = new SouGouInPut();
        DefaultSkin defaultSkin = new DefaultSkin();
        ColorfulSkin colorfulSkin = new ColorfulSkin();
        souGouInPut.setSkin(defaultSkin);
        souGouInPut.display();
    }
}
