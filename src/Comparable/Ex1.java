package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {
    public static void main(String[] argv) {
        List<Employe> list = new ArrayList<>();
        Employe emp1 = new Employe(1,"Medme", "Ford", 10000);
        Employe emp2 = new Employe(22,"Venom", "Feed", 4000);
        Employe emp3 = new Employe(10,"Ya", "Karta", 6000);

        list.add(emp3);
        list.add(emp1);
        list.add(emp2);

        System.out.println("Before Sort id: " + list);
        Collections.sort(list);     // сортировка по айди
        System.out.println("After Sort id: " + list + "\n");

        System.out.println("Before Sort name: " + list);
        Collections.sort(list, new NameComparator());     // сортировка по имени
        System.out.println("After Sort name: " + list + "\n");

        System.out.println("Before Sort salary: " + list);
        Collections.sort(list, new SalaryComparator());     // сортировка по зарплате вариант 1
        System.out.println("After Sort: salary" + list + "\n");

        System.out.println("Before Sort salary: " + list);
        Collections.sort(list, (Employe o1, Employe o2) -> {return (o1.getSalary() - o2.getSalary());});     // сортировка по зарплате вариант 2
        System.out.println("After Sort: salary" + list + "\n");
    }
}

class Employe implements Comparable<Employe> {
    private int id;
    private String surname;
    private String lastname;
    private int salary;

    public Employe(int id, String surname, String lastname, int salary) {
        this.id = id;
        this.surname = surname;
        this.lastname = lastname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Employe otherEmploy) {
        return this.id - otherEmploy.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }


    public int getSalary() {
        return salary;
    }

}

class NameComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe otherEmploye1,Employe otherEmploye2) {
        return otherEmploye1.compareTo(otherEmploye2);
    }
}

class SalaryComparator implements Comparator<Employe> {
    @Override
    public int compare(Employe otherEmploye1,Employe otherEmploye2) {
        return otherEmploye1.getSalary() - otherEmploye2.getSalary();
    }
}
