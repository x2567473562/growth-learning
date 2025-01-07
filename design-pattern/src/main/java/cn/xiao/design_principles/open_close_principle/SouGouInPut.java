package cn.xiao.design_principles.open_close_principle;

public class SouGouInPut {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
