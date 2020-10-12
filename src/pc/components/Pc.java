package pc.components;

public class Pc {
    Cpu cpu;
    HardDisk HD;
    public  Pc(){

    }
    public Pc(Cpu cpu){

    }
    public void setCPU(Cpu cpu){
        this.cpu = cpu;
    }
    public void setHardDisk(HardDisk HD){
        this.HD = HD;
    }
    public void show(){

        System.out.print(" 硬盘容量："+HD.getAmount());
        System.out.print(" 硬盘写入速度："+HD.getWriteSpeed());
        System.out.println(" 硬盘读取速度："+HD.getreadSpeed());
        System.out.printf(" CPU速度："+cpu.getSpeed()+" CPU温度："+cpu.getTemperature()+" CPU核心数："+cpu.getCore());
//        System.out.print(" CPU温度："+cpu.getTemperature());
//        System.out.println(" CPU核心数："+cpu.getCore());

    }
}
