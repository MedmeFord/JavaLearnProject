package aop;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Me get book for univesity library");
    }

    public String returnBook() {
        System.out.println("Me return book");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Me get magazine");
    }
}
