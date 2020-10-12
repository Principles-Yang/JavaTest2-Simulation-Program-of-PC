package pc.components;

public class Cpu {
    //cpu的速度、温度、核心数
    private int speed;
    private float temperature;
    private int core;

    Cpu(){
    }

    Cpu(int speed,float temperature){
        this.speed=speed;
        this.temperature=temperature;
    }

    public Cpu(int speed,float temperature,int core){
        setSpeed(speed);
        this.temperature=temperature;
        this.core=core;
    }

    float getTemperature(){
        return temperature;
    }
    int getCore(){
        return core;
    }
    int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if (speed>0){
            this.speed = speed;
        }
        else {
            System.out.print("cpu的速度：输入值为非法数值");
        }
    }
}
