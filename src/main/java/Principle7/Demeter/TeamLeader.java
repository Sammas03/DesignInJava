package Principle7.Demeter;

public class TeamLeader {

    public void assign(Programmer programmer){
        System.out.println("dispatch task");
        // Java programmer
        if(programmer instanceof JavaProgrammer){
            ((JavaProgrammer)programmer).work();
        }else {
            ((TestProgrammer)programmer).work();
        }
        // Test programmer
    }
}
