package com.example.demo.dao;

import com.example.demo.entity.MultimediaCourseDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDataDao extends JpaRepository<MultimediaCourseDataEntity,Integer> {
}
