package MCV_Pattern;

public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseTeacher;

    public String getId() {
        return CourseId;
    }

    public void setId(String id) {
        this.CourseId = id;
    }

    public String getName() {
        return CourseName;
    }

    public void setName(String name) {
        this.CourseName = name;
    }

    public String getTeacher() {
        return CourseTeacher;
    }

    public void setTeacher(String teacher) {
        this.CourseTeacher = teacher;
    }

}
