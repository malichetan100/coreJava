package com.chetan.Encapsulation;

public class Book {
    String title,author,isbn;
    double price;

    public Book(){
        this.author="";
        this.title="";
        this.isbn="";
        this.price=0.0;
    }

    public Book(String title,String author,String isbn,double price){
        this.author=author;
        this.title=title;
        this.isbn=isbn;
        this.price=price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
