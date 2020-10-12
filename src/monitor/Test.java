package monitor;

import pc.components.Cpu;
import pc.components.HardDisk;
import pc.components.Pc;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        int x,y;
        Cpu cpu = new Cpu(1000,80,8);
        HardDisk HD = new HardDisk(100,30,30);
        System.out.println("请设定cpu的速度：");
        Scanner scan = new Scanner(System.in);
        x=scan.nextInt();
        System.out.println("请设定硬盘的容量：");
        y=scan.nextInt();
        if (x>0&&y>0){
            cpu.setSpeed(x);
            HD.setAmount(y);
            Pc pc = new Pc();
            pc.setCPU(cpu);
            pc.setHardDisk(HD);
            pc.show();
        }
        else {
            System.out.print("cpu速度或硬盘容量的值为非法数值,此电脑已死在生产线上，请重新制造！");
        }
//        cpu.setSpeed(-100);
//        HD.setAmount(200);

    }
}