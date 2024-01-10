package Pattern.factorymethod;

public class JavaCourseFactory extends CourseFactory{
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
