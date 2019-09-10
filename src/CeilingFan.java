public class CeilingFan {
    public static final int HIGHT = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    public String location;
    public int speed;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void setHight(){
        speed = HIGHT;
    }

    public void setMedium(){
        speed = MEDIUM;
    }

    public void setLow(){
        speed = LOW;
    }

    public void setOff(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }
}
