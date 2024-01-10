package Pattern.factorymethod;

public class PythonCourseFactory extends CourseFactory{
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
