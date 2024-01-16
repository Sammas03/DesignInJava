package structure.composition;

public class Test {
    public static void main(String[] args) {
        Employee CEO = new Employee("CEO","CEO",10000L);
        Employee Manager = new Employee("Manager","Manager",1000L);
        CEO.add(Manager);
        System.out.println(CEO.getEmployeeList());
    }
}
