package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStrudents() {
        Student st1 = new Student("Kostya Zuravlev", 4, 4);
        Student st2 = new Student("Daveltshin Aibulat", 2, 3);
        Student st3 = new Student("Ivan Ivanov", 3, 5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("InformationMethods getStudents:");
        System.out.println(students);
        return students;
    }
}
