import java.util.Scanner;

public class SearchStuct {
    public static void main(String[] argv) {
        Year y21 = new Year();
        Year y22 = new Year();
        Scanner input = new Scanner(System.in);

    }
}

class Year {
    public int Rycovoditel;
    public int Specialist;
    public int MedPersUpLevel;
    public int MedPersMiddleLevel;
    public int AllMedPerson;
    public int AllPerson;
    public int SuportPerson;
    public int ObslPerson;

    public static void All(Year y) {
        y.AllPerson = y.AllMedPerson + y.ObslPerson + y.SuportPerson + y.Rycovoditel +
    }
}
