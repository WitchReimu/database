package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "multimedia_course")
public class MultimediaCourseEntity {

    @Id
    private Integer really_id;
    @Column
    private String id;
    @Column
    private String title;

    public Integer getReally_id() {
        return really_id;
    }

    public void setReally_id(Integer really_id) {
        this.really_id = really_id;
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

    @Override
    public String toString() {
        return "MultimediaCourseEntity{" +
                "really_id=" + really_id +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
