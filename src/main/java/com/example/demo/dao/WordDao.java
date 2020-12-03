package com.example.demo.dao;

import com.example.demo.entity.WordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface WordDao extends JpaRepository<WordEntity, Integer> {

    @Query("select w from WordEntity w where w.cn like concat('%',:cn,'%') ")
    List<WordEntity> findByCnLike(@Param("cn") String cn);

}