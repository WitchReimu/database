package com.example.demo;

import com.example.demo.dao.WordDao;
import com.example.demo.entity.WordEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private WordDao wordDao;

    @Test
    void contextLoads() {

        WordEntity wordEntity = new WordEntity();
        wordEntity.setWord("application");
        Example<WordEntity> example = Example.of(wordEntity);
        List<WordEntity> all = wordDao.findAll(example);
        System.out.println(all);

    }

}
