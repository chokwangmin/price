package com.example.price.service;

import com.example.price.domain.Child;
import com.example.price.mapper.ChildMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChildServiceImp implements ChildService {

    @Autowired
    private ChildMapper childMapper;

    public void ChildCreate(Child child){
        childMapper.insertChild(child);
    }

    @Override
    public List<Child> ChildInfo(int parentNo) {
        List<Child> ChildInfo = childMapper.selectChild(parentNo);
        return ChildInfo;
    }
}

