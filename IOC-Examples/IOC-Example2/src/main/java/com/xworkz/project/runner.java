package com.xworkz.project;

import com.xworkz.project.dto.BookDTO;
import com.xworkz.project.service.BookService;
import com.xworkz.project.springconfig.ProjectConfigutaion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class runner {

    public static void main(String[] args) {

        ApplicationContext app=new AnnotationConfigApplicationContext(ProjectConfigutaion.class);
        BookService bookService=app.getBean(BookService.class);

        BookDTO bookDTO=new BookDTO();
        bookDTO.setBookName("Rich Dad Poor Dad");
        bookDTO.setBookAuthor("Robert Kiyosaki");
        bookDTO.setBookPrice(499.99);

        bookService.validateAndSave(bookDTO);

        BookDTO bookDTO1=new BookDTO();
        bookDTO1.setBookName("Think And Grow Rich");
        bookDTO1.setBookAuthor("Napolen");
        bookDTO1.setBookPrice(399.99);

        bookService.validateAndSave(bookDTO1);

        BookDTO bookDTO2=new BookDTO();
        bookDTO2.setBookName("I wish i could love you");
        bookDTO2.setBookAuthor("Chetan Bagath");
        bookDTO2.setBookPrice(249.99);

        bookService.validateAndSave(bookDTO2);



    }
}
