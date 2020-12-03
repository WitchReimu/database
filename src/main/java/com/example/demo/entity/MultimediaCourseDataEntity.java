package com.example.demo.entity;

import com.example.demo.entity.data.MultimediaCourseData;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "multimedia_course_data")
public class MultimediaCourseDataEntity {


    @Id
    private Integer really_id;
    @Column
    private String id;
    @Column
    @JsonIgnore
    private String data;

    @Transient
    private MultimediaCourseData multimediaCourseData;

    public MultimediaCourseData getMultimediaCourseData() {
        return multimediaCourseData;
    }

    public void setMultimediaCourseData(MultimediaCourseData multimediaCourseData) {
        this.multimediaCourseData = multimediaCourseData;
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
