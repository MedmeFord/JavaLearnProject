package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice; logging the receipt of a students"
                + "list before methods getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String surname = firstStudent.getSurname();
        surname = "Mr" + surname;
        firstStudent.setSurname(surname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade += 1;
        firstStudent.setAvgGrade(avgGrade);
        System.out.println("afterGetStudentsLoggingAdvice; logging the receipt of a students"
                + "list after methods getStudents");
    }

}
