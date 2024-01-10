package Pattern.factorymethod;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        System.out.println(factory.getCourse());

    }
}
