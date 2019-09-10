public class CelinfFanHighCommand implements Command {
    CeilingFan ceilingFan;
    public int prevSpeed;

    public CelinfFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.speed;
        ceilingFan.setHight();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGHT){
            ceilingFan.setHight();
        } else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.setLow();
        } else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.setMedium();
        } else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.setOff();
        }
    }
}
