package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

        library.getBook();
        uniLibrary.getBook();
        uniLibrary.returnBook();
        uniLibrary.getMagazine();
        schoolLibrary.getBook();

        context.close();
    }
}
