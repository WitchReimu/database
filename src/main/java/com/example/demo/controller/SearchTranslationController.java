package com.example.demo.controller;

import com.example.demo.base.BaseEntity;
import com.example.demo.dao.WordDao;
import com.example.demo.entity.WordEntity;
import com.example.demo.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchTranslationController {
    @Autowired
    private WordDao wordDao;

    @RequestMapping(value = {"/searchTranslation/{cn}"}, method = RequestMethod.GET)
    public BaseEntity<List<WordEntity>> searchTranslation(@PathVariable(value = "cn") String cn) {
        List<WordEntity> list = wordDao.findByCnLike("%" + cn + "%");
        System.out.println(list);
        if (list.size() == 0) {
            return new BaseEntity<>(Status.EMPTY, list);
        }
        return new BaseEntity<>(Status.SUCCEES, list);
    }

}
