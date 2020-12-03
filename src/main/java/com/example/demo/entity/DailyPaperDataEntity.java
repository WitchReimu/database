package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daily_paper")
public class DailyPaperDataEntity {
    @Id
    private Integer really_id;
    @Column
    private String id;
    @Column
    private String title;


}
