package Pattern.prototype;

public class Pig implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Pig() {
        System.out.println("小猪被初始化了");
    }

    private String name;
    private String doSomething;
    private Integer age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", doSomething='" + doSomething + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoSomething(String doSomething) {
        this.doSomething = doSomething;
    }

    public String getName() {
        return name;
    }

    public String getDoSomething() {
        return doSomething;
    }


}
