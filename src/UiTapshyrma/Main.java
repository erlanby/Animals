package UiTapshyrma;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Student student = new Student(LocalDate.of(2011, 11, 12), "Aza", "Azamatov", "Aza@mail.com" + "\n");
    System.out.println();
    Student student2 = new Student(LocalDate.of(1996, 11, 1), "Era", "Gera", "era@mail.com"+ "\n");

    Student[] students = {student, student2};
    Group group = new Group(students, "Java1", LocalDate.of(2022, 6, 1)) ;
        System.out.println();
    Group group2 = new Group(students, "Js", LocalDate.of(2022, 6, 1));

    Group[] groups = {group, group2};
    Course course = new Course(" Java", 3, "Aida", groups );

        System.out.println(course);
    }
}
