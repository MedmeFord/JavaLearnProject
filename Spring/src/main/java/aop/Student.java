package aop;

public class Student {
    private String surname;
    private int course;
    private double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Student(String surname, int course, double avgGrade) {
        this.surname = surname;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
