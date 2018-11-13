import factory.AbstractFactory;
import factory.AmdFactory;
import factory.Computer;

public class Test {
    @org.junit.Test
    public  void test1(){
        Computer computer=new Computer();
        AbstractFactory factory=new AmdFactory();
        computer.makeComputer(factory);
    }
}
