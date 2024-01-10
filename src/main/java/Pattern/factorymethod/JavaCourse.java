package Pattern.factorymethod;

public class JavaCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作java课程");
    }
}
