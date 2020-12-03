package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tablename")
public class TableNameEntity extends SuperEntity{

    @Id
    private Integer really_id;
    @Column
    private String word;
    @Column
    private String translation;

    public Integer getReally_id() {
        return really_id;
    }

    public void setReally_id(Integer really_id) {
        this.really_id = really_id;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "TableNameEntity{" +
                "really_id=" + really_id +
                ", word='" + word + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
