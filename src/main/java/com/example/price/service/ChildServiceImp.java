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

    @Override
    public List<Child> ChildList(int parentNo){
       /* List<Child> ChildList = childMapper.selectCild(parentNo);
        return ChildList;*/

        return childMapper.selectChild(parentNo);

    }

}
