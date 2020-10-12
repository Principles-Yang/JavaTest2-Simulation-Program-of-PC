package pc.components;

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

    float getWriteSpeed(){
        return WriteSpeed;
    }
    float getreadSpeed(){
        return readSpeed;
    }
    int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
