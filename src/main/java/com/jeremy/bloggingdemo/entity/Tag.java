package com.jeremy.bloggingdemo.entity;

import javax.persistence.*;

/**
 * Created by jeremy on 11/2/17.
 */
@Entity
@Table(name = "TAGS")
public class Tag {

    private int id;
    private String name;

    public Tag() {
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Id
    @GeneratedValue
    @Column(name = "tagId")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
