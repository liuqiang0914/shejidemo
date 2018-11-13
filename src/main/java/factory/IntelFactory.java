package factory;

public class IntelFactory implements AbstractFactory{
    public Cpu createCpu() {
        return new Cpu("因特尔");
    }

    public Mainboard createMainboard() {
        return new Mainboard("因特尔");
    }
}
