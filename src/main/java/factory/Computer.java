package factory;

public class Computer {
    private Cpu cpu=null;
    private Mainboard mainboard=null;

    public void makeComputer(AbstractFactory abstractFactory){
        prepareHardwares(abstractFactory);
        System.out.print(cpu.getPoint()+mainboard.getPoint());
    }

    private void prepareHardwares(AbstractFactory abstractFactory) {
        this.cpu=abstractFactory.createCpu();
        this.mainboard=abstractFactory.createMainboard();


    }

}
