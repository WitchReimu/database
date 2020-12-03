package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word")
public class WordEntity extends SuperEntity{

    @Id
    private Integer really_id;
    @Column
    private String word;
    @Column
    private String us;
    @Column
    private String uk;
    @Column
    private String us_url;
    @Column
    private String uk_url;
    @Column
    private String cn;

    @Override
    public String toString() {
        return "WordEntity{" +
                "really_id=" + really_id +
                ", word='" + word + '\'' +
                ", us='" + us + '\'' +
                ", uk='" + uk + '\'' +
                ", us_url='" + us_url + '\'' +
                ", uk_url='" + uk_url + '\'' +
                ", cn='" + cn + '\'' +
                '}';
    }

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

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    public String getUk() {
        return uk;
    }

    public void setUk(String uk) {
        this.uk = uk;
    }

    public String getUs_url() {
        return us_url;
    }

    public void setUs_url(String us_url) {
        this.us_url = us_url;
    }

    public String getUk_url() {
        return uk_url;
    }

    public void setUk_url(String uk_url) {
        this.uk_url = uk_url;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
}
