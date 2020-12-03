package com.example.demo.dao;

import com.example.demo.entity.TableNameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TableNameDao extends JpaRepository<TableNameEntity, Integer> {

    @Query("select  t from TableNameEntity t where t.translation like CONCAT('%',:translation,'%') ")
    List<TableNameEntity> findByTranslationLike(@Param("translation") String translation);

}
