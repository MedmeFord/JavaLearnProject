package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Library library = context.getBean("libraryBean", Library.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

        uniLibrary.getBook();
        uniLibrary.addBook("Medme",book);
//        uniLibrary.returnBook();
        uniLibrary.addMagazine();
//        schoolLibrary.getBook();

        context.close();
    }
}
