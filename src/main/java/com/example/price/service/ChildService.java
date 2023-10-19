package com.example.price.service;

import com.example.price.domain.Child;

import java.util.List;


public interface ChildService {

    void ChildCreate (Child child);
    List<Child> ChildInfo (int parentNo);
}
