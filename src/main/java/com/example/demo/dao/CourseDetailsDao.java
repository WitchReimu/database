package com.example.demo.dao;

import com.example.demo.entity.MultimediaCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDetailsDao extends JpaRepository<MultimediaCourseEntity, Integer> {

    @Query("select m from MultimediaCourseEntity m where m.title like concat('%',:title,'%') ")
    List<MultimediaCourseEntity> findByTitleLike(@Param("title") String title);
}
