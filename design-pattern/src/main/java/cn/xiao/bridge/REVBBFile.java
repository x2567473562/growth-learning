package cn.xiao.bridge;

public class REVBBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("decode REVBB file"+fileName);
    }
}
