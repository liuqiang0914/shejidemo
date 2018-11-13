package factory;

public class AmdFactory implements AbstractFactory {
    public Cpu createCpu() {
        return new Cpu("AMD");
    }

    public Mainboard createMainboard() {
        return new Mainboard("AMD");
    }
}
