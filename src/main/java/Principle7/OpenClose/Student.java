package Principle7.OpenClose;

public class Student implements Human {
    @Override
    public void run() {
        System.out.println("I am running");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");

    }


}
