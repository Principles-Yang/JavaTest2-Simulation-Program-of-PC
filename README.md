## 一、实验目的
 1、掌握第四章的基本知识，如：包类定义，修饰词，构造方法等<br>
 2、独立编写程序
## 二、实验内容
#### 1、用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序由4个类，名字分别是PC、CPU、HardDisk、和Test，其中Test是主类。
  其中，CPU类要求getSpeed()返回speed的值，要求setSpeed(int m)方法将参数m的值赋值给speed；<br>
  HardDisk类要求getAmount()返回amount的值，要求setAmount（int m）方法将参数m的值赋值给amount；<br>
  PC类要求setCPU(CPU c)将参数c的值赋值给CPU，要求setHardDisk(HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示CPU的速度和硬盘的容量。<br>
 ##### 主类Test的要求:
（1）main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200.<br>
（2）main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200。<br>
（3）main方法中创建一个PC对象pc。<br>
（4）pc调用setCPU(CPU c)方法，调用时实参是cpu。<br>
（5）pc调用setHardDisk(HardDisk h）方法，调用时实参是disk。<br>
（6）pc调用show方法。<br>
#### 2、附加要求：
 a)类中定义不少于两个构造方法；<br>
 b)每个类定义不少于2个属性，且属性的类型应该多样化；<br>
 c)根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过“类对象.属性”的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断；<br>
 d)尝试把本次实验的多个类放置在不同的包中，体会修饰符private的用法。<br>
 
## 三、实验设计
 #### 如图：
 ##### 基础图
 ![](https://github.com/Principles-Yang/JavaTest2-Simulation-Program-of-PC/blob/main/BasicUml.png) <br><br>
 ##### 进阶图
 ![](https://github.com/Principles-Yang/JavaTest2-Simulation-Program-of-PC/blob/main/Pc-cpu-harddisk.png) <br><br>

## 五、关键代码
1、多样化的属性与构造方法：
```Java
public class HardDisk {
    private int amount;
    private float WriteSpeed;
    private float readSpeed;

    HardDisk(){
    }

    public HardDisk(int amount,float WriteSpeed,float readSpeed){
        this.amount=amount;
        this.WriteSpeed=WriteSpeed;
        this.readSpeed=readSpeed;
    }
}
```
2、测试类的调用：
```Java
public class Test {
    public static void main(String args[]) {
        Cpu cpu = new Cpu(1000,80,8);
        HardDisk HD = new HardDisk(100,30,30);
        cpu.setSpeed(2200);
        HD.setAmount(200);
        Pc pc = new Pc();
        pc.setCPU(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }
}
   ```
  3、符合常理的逻辑判断：
```Java
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
   ```
 
## 六、系统运行截图

  ##### 正常流水线-超频电脑
  ![](https://github.com/Principles-Yang/JavaTest2-Simulation-Program-of-PC/blob/main/result.png) <br><br>
  
  ##### 错误流水线-设定错误
  ![]( https://github.com/Principles-Yang/JavaTest2-Simulation-Program-of-PC/blob/main/result1.png) <br><br>
 
  
## 七、感想与体会
   通过这次实验让我对Java的基本语法有了更深的了解,下次要主动多思考，编写出更加符合常理的逻辑判断的程序，希望以后自己有更深入的学习。
