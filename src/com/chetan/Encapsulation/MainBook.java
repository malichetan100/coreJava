package com.chetan.Encapsulation;

public class MainBook {
    public static void main(String[] args) {

        Book book=new Book();

        System.out.println(book.title+" "+book.title+" "+book.isbn+" "+book.price);

        Book book1=new Book("Java","Chetan","2155dac",20.00);

        System.out.println(book1.title+" "+book1.author+" "+book1.isbn+" "+book1.price);

        Book book2=new Book();
        book2.setTitle("Python");
        book2.setAuthor("Deepak");
        book2.setIsbn("2323Chetan");
        book2.setPrice(50.00);
        System.out.println(book2.getTitle()+" "+book2.getAuthor()+" "+book2.getIsbn()+" "+book2.getPrice());
    }
}
