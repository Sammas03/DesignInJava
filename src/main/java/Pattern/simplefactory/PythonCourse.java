package Pattern.simplefactory;

import Pattern.simplefactory.Course;

public class PythonCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作python课程");
    }
}
