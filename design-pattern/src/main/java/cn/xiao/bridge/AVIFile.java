package cn.xiao.bridge;

public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi file decode"+fileName);
    }
}
