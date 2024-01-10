package Pattern.simplefactory;

public class CourseFactory {

    public Object getCourse(String course){

        if("java".equalsIgnoreCase(course)){
            return new JavaCourse();
        }else if("python".equalsIgnoreCase(course)) {
            return new PythonCourse();
        }
        return "course is not exist";
    }
}
