package UiTapshyrma;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private LocalDate denRojdenya;
    private String name;
    private String lastName;
    private String email;

    public Student() {

    }

    public Student(LocalDate denRojdenya, String name, String lastName, String email) {
        this.denRojdenya = getDenRojdenya(denRojdenya);
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public LocalDate getDenRojdenya(LocalDate denRojdenya) {
        Period between = Period.between(denRojdenya, LocalDate.now());
        if (between.getYears() > 0) {
            return denRojdenya;
        }
        return null;
    }

    public void setDenRojdenya(LocalDate denRojdenya) {
            this.denRojdenya = denRojdenya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "denRojdenya=" + denRojdenya +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}