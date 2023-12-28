package Principle7.Demeter;

public class Boss {

    public void meet(TeamLeader teamLeader){
        System.out.println("dispatch tasks");
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        TestProgrammer testProgrammer = new TestProgrammer();

        boss.meet(teamLeader);
        teamLeader.assign(javaProgrammer);
        teamLeader.assign(testProgrammer);
    }
}
