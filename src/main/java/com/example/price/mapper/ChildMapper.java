package com.example.price.mapper;

import com.example.price.domain.Child;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ChildMapper {

    // mybatis 사용하지 않고 스프링 어노테이션을 이용해서 .xml 안쓰고 쿼리사용할 수 있도록 작성

    void insertBaby(Child child);

    // 아래 mapper 쿼리는 mybatis 연동해서 조회.
    //@Select("SELECT * FROM child")
    void insertChild(Child child);

    //@Select("SELECT * FROM child WHERE child_no = #{child_no}")
    List<Child> selectChild(int child_no);
}