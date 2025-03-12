package cn.xiao.bridge;

public class demo {
    public static void main(String[] args) {
        OperatingSystem mac = new Mac(new AVIFile());
        mac.play("mac.avi");
    }
}
