package interfaces;

public class Car implements Break, Engine {
    @Override
    public void Break() {
        System.out.println("I Break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");


    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");


    }

    @Override
    public void acc() {
        System.out.println("I Accelerate like a normal car");


    }
}
