package factory;

import org.junit.Test;

public class JDSotre {
    @Test
    public  void test1(){
        Computer computer=new Computer();
        AbstractFactory factory=new AmdFactory();
        computer.makeComputer(factory);
    }
    /*public static void main(String[]args){
       *//* Computer computer=new Computer();
        AbstractFactory factory=new AmdFactory();
        computer.makeComputer(factory);*//*
        test1();
    }*/
}
