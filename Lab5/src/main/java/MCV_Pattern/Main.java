package MCV_Pattern;

public class Main {
    private static Course retriveCourse(){
        Course course = new Course();
        course.setName("Моделювання і проектування ПЗ");
        course.setId("01");
        course.setTeacher("Петренко С.В.");
        return course;
    }
    public static void main(String[] args) {
        Course model  = retriveCourse();

        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();

        controller.setCourseName("Kрос-платформенне програмування ");
        controller.setCourseId("24");
        System.out.println("After updating:");
        controller.updateView();


    }
}
