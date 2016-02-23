package com.midtermexam2;

import java.util.Date;

/**
 * Created by junvir on 2/23/2016.
 */
public class Book {

    String id;
    String title;
    String genre;
    String author;
    String isRead;

    public Book(){


    }

    public Book(String id, String isRead, String genre, String title, String author) {
        this.id = id;
        this.isRead = isRead;
        this.genre = genre;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", isRead='" + isRead + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }
}
