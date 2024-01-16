package structure.composition;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String deptNo;
    private Long salary;
    private List<Employee> employeeList;

    public Employee(String name, String deptNo, Long salary) {
        this.name = name;
        this.deptNo = deptNo;
        this.salary = salary;
        this.employeeList = new ArrayList<>();
    }

    public void add(Employee e){
        this.employeeList.add(e);
    }

    public void remove(Employee e){
        this.employeeList.remove(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", salary=" + salary;
    }
}
