package org.example;

public class Author {

    public String name;
    public String surname;
    public int rating;

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String toString() {
        return name + " " + surname + ", рейтинг: " + rating;
    }
}
