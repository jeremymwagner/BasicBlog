package com.jeremy.bloggingdemo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by jeremy on 11/2/17.
 */
@Entity
@Table(name = "COMMENTS")
public class Comments {
    private int id;
    private String commentBody;
    private User author;
    private LocalDateTime datePosted;
    private Blog parentBlog;

    public Comments() {
    }

    @Override
    public String toString() {
        return "Comments{" +
                "id=" + id +
                ", commentBody='" + commentBody + '\'' +
                ", author=" + author +
                ", datePosted=" + datePosted +
                ", parentBlog=" + parentBlog +
                '}';
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    @OneToOne
    @JoinColumn(name = "id")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    @OneToOne
    @JoinColumn(name = "id")
    public Blog getParentBlog() {
        return parentBlog;
    }

    public void setParentBlog(Blog parentBlog) {
        this.parentBlog = parentBlog;
    }
}
