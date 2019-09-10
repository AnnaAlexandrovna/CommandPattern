public class Stereo {

    public boolean power;
    public boolean cd;
    public int volume;

    public Stereo(){
        power = false;
        cd = false;
        volume = 0;
    }

    public  void on(){
        power = true;
        System.out.println("Stereo is on");
    }

    public  void off(){
        power = false;
        System.out.println("Stereo is off");
    }

    public void setCd() {
        this.cd = true;
        System.out.println("CD is " + cd);
    }

    public void pullOutCD(){
        this.cd = false;
        System.out.println("CD is " + cd);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume is " + volume);
    }
}
