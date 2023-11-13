package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Author author = new Author("Itan", "Smith", 7);
    Book book = new Book(author, "Sky", 1, 2003);


    @Test
    void isBig() {
        int pages = 407;
        boolean result = book.isBig(pages);
        Assertions.assertTrue(result);
    }

    @Test
    void matches() {
        boolean result =  book.matches("Sky");
        Assertions.assertTrue(result);

    }

    @Test
    void estimatePrice() {
        int result = book.estimatePrice();
        Assertions.assertTrue(result > 0);
    }
}