package structure.flyweight;

public class Manager implements Employee{
    private String dept;
    private String content;

    public Manager(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void report() {
        System.out.println(content + " " + dept);
    }
}
