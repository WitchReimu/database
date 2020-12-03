package com.example.demo.controller;

import com.example.demo.base.BaseEntity;
import com.example.demo.dao.TableNameDao;
import com.example.demo.dao.WordDao;
import com.example.demo.entity.SuperEntity;
import com.example.demo.entity.TableNameEntity;
import com.example.demo.entity.WordEntity;
import com.example.demo.util.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/searchWord")
public class SearchWordController {
    @Autowired
    private WordDao wordDao;
    @Autowired
    private TableNameDao tableNameDao;


    @GetMapping("/searchCTE4Word")
    public BaseEntity<List<WordEntity>> searchCTE4(String word) {
        WordEntity wordEntity = new WordEntity();
        return getListBaseEntity(wordEntity, wordDao, word);
    }

    @GetMapping("/searchAllWord")
    public BaseEntity<List<TableNameEntity>> searchAll(String word) {
        TableNameEntity wordEntity = new TableNameEntity();
        return getListBaseEntity(wordEntity, tableNameDao, word);
    }

    private <T extends SuperEntity> BaseEntity<List<T>> getListBaseEntity(T entity, JpaRepository dao, String word) {
        entity.setWord(word);
        Example<T> example = Example.of(entity);
        List<T> list = dao.findAll(example);
        if (list.size() == 0) {
            return new BaseEntity<>(Status.EMPTY, list);
        }
        return new BaseEntity<>(Status.SUCCEES, list);
    }
}
