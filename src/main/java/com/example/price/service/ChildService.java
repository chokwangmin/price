package com.example.price.service;

import com.example.price.domain.Child;

import java.util.List;


public interface ChildService {
   // void ChildSelect(Child child);

    List<Child> ChildList(int parentNo);
    //List<Child> ChildList (String pretnNo);
}
