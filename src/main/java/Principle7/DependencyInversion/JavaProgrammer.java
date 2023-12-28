package Principle7.DependencyInversion;

public class JavaProgrammer extends Programmer {
    @Override
    public void run() {
        System.out.println("Java programmer is running");
    }

    @Override
    public void eat() {
        System.out.println("Java programmer is eating");
    }

    @Override
    public void profile() {
        System.out.println("I am a java programmer");
    }
}
