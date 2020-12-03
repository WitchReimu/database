package com.example.demo.controller;


import com.example.demo.base.BaseEntity;
import com.example.demo.dao.CourseDataDao;
import com.example.demo.dao.CourseDetailsDao;
import com.example.demo.entity.MultimediaCourseDataEntity;
import com.example.demo.entity.MultimediaCourseEntity;
import com.example.demo.entity.data.MultimediaCourseData;
import com.example.demo.util.Status;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// TODO: 2020/12/3  整理此类的代码
@RestController
public class SearchMediaCourseData {

    @Autowired
    private CourseDataDao courseDataDao;
    @Autowired
    private CourseDetailsDao courseDetailsDao;

    @RequestMapping(value = {"/searchCourseMediaData/{id}"}, method = RequestMethod.GET)
    public BaseEntity<List<MultimediaCourseDataEntity>> searchMediaCourseData(@PathVariable(value = "id") String id) {
        MultimediaCourseDataEntity multimediaCourseDataEntity = new MultimediaCourseDataEntity();
        multimediaCourseDataEntity.setId(id);
        Example<MultimediaCourseDataEntity> example = Example.of(multimediaCourseDataEntity);
        List<MultimediaCourseDataEntity> list = courseDataDao.findAll(example);
        Gson gson = new Gson();
        for (MultimediaCourseDataEntity courseDataEntity : list) {
            String data = list.get(0).getData();
            MultimediaCourseData multimediaCourseData = gson.fromJson(data, MultimediaCourseData.class);
            multimediaCourseDataEntity.setMultimediaCourseData(multimediaCourseData);
            list.get(0).setMultimediaCourseData(multimediaCourseData);
        }
        if (list.size() > 0)
            return new BaseEntity<>(Status.SUCCEES, list);
        else
            return new BaseEntity<>(Status.EMPTY, list);

    }

    @RequestMapping(value = {"/searchCourseDetails/{title}"}, method = {RequestMethod.GET})
    public BaseEntity<List<MultimediaCourseEntity>> searchMediaCourseDetails(@PathVariable(value = "title") String title) {
        List<MultimediaCourseEntity> list = courseDetailsDao.findByTitleLike(title);
        System.out.println(list);
        if (list.size() > 0)
            return new BaseEntity<>(Status.SUCCEES, list);
        else
            return new BaseEntity<>(Status.EMPTY, list);
    }
}
