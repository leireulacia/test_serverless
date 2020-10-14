package com.testBook.model;

public class Book {

    private int bookId;
    private String title;
    private int year;
    private int authorid;

    public Book(int bookId, String title, int year) {
        this.bookId = bookId;
        this.title = title;
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
