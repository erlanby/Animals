package UiTapshyrma;

import java.util.Arrays;

public class Course {
    private String courseName;
    private int number;
    private String courseTeacher;
    private Group[] groups;


    public Course(){

    }

    public Course(String courseName, int number, String courseTeacher, Group[] groups) {
        this.courseName = courseName;
        this.number = number;
        this.courseTeacher = courseTeacher;
        this.groups = groups;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", number=" + number +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}