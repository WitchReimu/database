package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class DailyPaperEntity {

    @Id
    private Integer really_id;
    @Column
    private String id;
    @Column
    private String title;
}
