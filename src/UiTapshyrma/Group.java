package UiTapshyrma;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student[] students;
    private String description;
    private LocalDate dateOfStart;

    public Group() {
    }

    public Group(Student[] students, String courseName, LocalDate dateOfStart) {
        this.students = students;
        this.description = courseName;
        this.dateOfStart = dateOfStart;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getCourseName() {
        return description;
    }

    public void setCourseName(String courseName) {
        this.description = courseName;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", courseName='" + description + '\'' +
                ", dateOfStart=" + dateOfStart +
                '}';
    }
}
