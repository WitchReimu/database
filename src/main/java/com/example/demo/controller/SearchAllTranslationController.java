package com.example.demo.controller;

import com.example.demo.base.BaseEntity;
import com.example.demo.dao.TableNameDao;
import com.example.demo.entity.TableNameEntity;
import com.example.demo.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchAllTranslationController {
    @Autowired
    private TableNameDao tableNameDao;

    @RequestMapping(value = {"/searchAllTranslation/{translation}"}, method = {RequestMethod.GET})
    public BaseEntity<List<TableNameEntity>> searchAllTranslation(@PathVariable(value = "translation") String translation) {
        List<TableNameEntity> list = tableNameDao.findByTranslationLike("%" + translation + "%");
        System.out.println(list);
        if (list.size() == 0) {
            return new BaseEntity<>(Status.EMPTY, list);
        }
        return new BaseEntity<>(Status.SUCCEES, list);
    }


}
