package Pattern.simplefactory;

import Pattern.simplefactory.Course;

public class JavaCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作java课程");
    }
}
