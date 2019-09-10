public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do something");
    }
    @Override
    public void undo(){}
}
