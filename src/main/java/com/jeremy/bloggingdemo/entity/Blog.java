package com.jeremy.bloggingdemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * Created by jeremy on 11/2/17.
 */
@Entity
@Table(name = "BLOG")
public class Blog {
    private int id;
    private String body;
    private User author;
    private int numberOfViews;
    private LocalDateTime datePosted;
    private List<Comments> comments;
    private Set<Tag> tags;

    public Blog() {
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", author=" + author +
                ", numberOfViews=" + numberOfViews +
                ", datePosted=" + datePosted +
                ", comments=" + comments +
                ", tags=" + tags +
                '}';
    }

    @Id
    @GenericGenerator(name="blogIdGen",strategy = "increment")
    @GeneratedValue(generator = "blogIdGen")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @OneToOne
    @JoinColumn(name = "id")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "BLOG_TAG", joinColumns = {@JoinColumn(name = "ID")}, inverseJoinColumns = {@JoinColumn(name = "tagID")})
    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
