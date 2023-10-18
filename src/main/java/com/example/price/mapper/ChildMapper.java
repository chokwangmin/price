package com.example.price.mapper;

import com.example.price.domain.Child;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ChildMapper {

    List<Child> selectChild(int child_no);
}
