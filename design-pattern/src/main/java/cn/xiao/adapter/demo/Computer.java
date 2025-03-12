package cn.xiao.adapter.demo;

import java.util.Objects;

public class Computer {
    public String readSD(SDCard sdCard) {
        if(Objects.isNull(sdCard)) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
