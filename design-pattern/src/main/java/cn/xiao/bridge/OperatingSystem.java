package cn.xiao.bridge;

public abstract class OperatingSystem {
    //声明videFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
