package Principle7.OpenClose;

public class HighSchoolStudent extends Student{
    @Override
    public void run() {
        System.out.println("A high school student is running");
    }

    @Override
    public void eat() {
        System.out.println("A high school student is eating");
    }
}
