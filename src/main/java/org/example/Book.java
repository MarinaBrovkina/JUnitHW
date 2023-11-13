package org.example;

public class Book {

    public Author author;
    public String title;
    public int releaseYear;
    public int pages;

    public Book(Author author, String title, int pages, int releaseYear) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return title + ", " + pages + " страниц, " + releaseYear + " год.";
    }

    public boolean isBig(int pages) {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }
    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word) ;
    }
    public int estimatePrice() {
        return (int) Math.floor (Math.sqrt(author.rating) * 3 * pages);
    }
}
