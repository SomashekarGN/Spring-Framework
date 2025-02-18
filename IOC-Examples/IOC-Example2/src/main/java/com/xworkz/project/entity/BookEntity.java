package com.xworkz.project.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Book_Info")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Book_Id")
    private Integer bookId;
    @Column(name = "Book_Name")
    private String bookName;
    @Column(name = "Book_Author")
    private String bookAuthor;
    @Column(name = "Book_Price")
    private Double bookPrice;
}
