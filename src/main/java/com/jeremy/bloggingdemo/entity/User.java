package com.jeremy.bloggingdemo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeremy on 11/2/17.
 */
@Entity
@Table(name = "Users")
public class User {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private List<Blog> blogPosts = new ArrayList<>();

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", blogPosts=" + blogPosts +
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

    @NotNull
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @NotNull
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    public List<Blog> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(List<Blog> blogPosts) {
        this.blogPosts = blogPosts;
    }
}
