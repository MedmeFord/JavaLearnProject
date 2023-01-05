package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibrary")
public class SchoolLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("Me get book for School library");
    }
}
