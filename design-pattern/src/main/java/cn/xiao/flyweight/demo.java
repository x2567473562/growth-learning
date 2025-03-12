package cn.xiao.flyweight;

public class demo {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getBox("I");
        box1.display("灰色");

        //获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getBox("L");
        box2.display("绿色");

        //获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getBox("O");
        box3.display("灰色");

        //获取O图形对象
        AbstractBox box4 = BoxFactory.getInstance().getBox("O");
        box4.display("红色");

        System.out.println("两次获取到的O图形对象是否是同一个对象：" + (box3 == box4));
    }
}
