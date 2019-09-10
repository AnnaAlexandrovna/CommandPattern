public class Light {

    public String type;
    public boolean light;

    public Light(String type) {
        light = false;
        this.type = type;
    }

    public void on() {
        light = true;
        System.out.println("light " + light);
    }

    public void off() {
        light = false;
        System.out.println("light " + light);
    }

    public boolean isLight() {
        return light;
    }
}
