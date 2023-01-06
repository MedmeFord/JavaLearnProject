package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Prestyplenie and Nakazanie")
    private String name;

    @Value("Dostoevski")
    private String author;

    @Value("1886")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
