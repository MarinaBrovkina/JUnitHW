package org.example;

public class Main {


    public static void main(String[] args) {

        Author author = new Author ("Itan", "Smith", 7);
        System.out.println(author);
        Book book = new Book (author, "Sky", 750, 2003);
        System.out.println(book);
        System.out.println("Эта книга содержит переданное слово? " + book.matches("Sky"));
        System.out.println("Эта книга большая? " + book.isBig(book.pages));
        System.out.println("Стоимость книги: " + book.estimatePrice());

    }
}