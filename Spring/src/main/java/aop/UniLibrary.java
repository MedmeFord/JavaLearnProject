package aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Me get book for univesity library");
        System.out.println("-------------------------------------------");
    }

    public String returnBook() {
        System.out.println("Me return book");
        return "War world Z";
    }

    public void getMagazine() {
        System.out.println("Me get magazine");
        System.out.println("-------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Me add book Library");
        System.out.println("-------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Me add magazine in library");
        System.out.println("-------------------------------------------");
    }
}
