package Principle7.DependencyInversion;

import Principle7.DependencyInversion.Programmer;

public class TestProgrammer extends Programmer {
    @Override
    public void run() {
        System.out.println("");
    }

    @Override
    public void eat() {
        System.out.println("");
    }

    @Override
    public void profile() {
        System.out.println("I am a test programmer");
    }
}
