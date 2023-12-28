package Principle7.LiskovsubSituation;

public class Student extends Teacher{
    @Override
    public void run() {
        System.out.println("Student is running");
    }


    public void StudentEat(){
        System.out.println("Student is eating");
    }

    public void TeacherEat(Teacher teacher){
        teacher.eat();
    }
}
