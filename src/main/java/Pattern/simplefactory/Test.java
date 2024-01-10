package Pattern.simplefactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        System.out.println(factory.getCourse("java"));
    }
}
