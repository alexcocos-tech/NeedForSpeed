public class NeedForSpeed {
    int speed;
    int batteryDrain;
    private int distanceDriven;
    private int batteryPrecentage;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPrecentage = 100;
    }
    public void drive(){
        if(batteryPrecentage >= batteryDrain){
            batteryPrecentage -= batteryDrain;
            distanceDriven += speed;
        }
    }
    public int getDistanceDriven(){
        return distanceDriven;
    }
    public boolean batteryDrained(){
        return batteryPrecentage < batteryDrain;
    }
    public static NeedForSpeed nitro(){
        return new NeedForSpeed(50,4);
    }
}
