package cn.xiao.design_principles.dependency_reversal_principle.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {
    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;


    public void run() {
        System.out.println("计算机工作");
        cpu.run();
        memory.save("内存");
        String data = hardDisk.read();
        System.out.println("从硬盘中获取的数据为：" + data);
    }
}
