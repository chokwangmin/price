package com.example.price.controller;

import com.example.price.domain.Child;
import com.example.price.service.ChildService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class ChildController {
    @Autowired
    private ChildService childService;

    @PostMapping("/childinfo") //localhost:8088/api/child/post
    public String ChildCreate(@RequestBody Child child){
        // 마이바티스가 아니고 insert
//        childMapper.insertBaby(child);
        // 마이바티스 연동해서 insert
        childService.ChildCreate(child);

        return "";

    }
    @GetMapping("/childinfo")
    public String childinfo(Model model , Authentication authentication){



        int userNo = 123;

        List<Child> ChildInfo = childService.ChildInfo(userNo);
        model.addAttribute("childinfo", ChildInfo );
        return "childinfo";

    }


//    @GetMapping("/api/child") //localhost:8088/api/child
//    public List<Child> read(){
//        List<Child> child = childService.findAll();
//
//        return child;
//
//    }

//    @GetMapping("/api/child/{child_no}")  //localhost:8088/api/child/5
//    public Child read(@PathVariable int child_no){
//        System.out.println("여기로 들어왔슴abc");
//        Child child = childService.ChildCreate(child_no);
//
//        System.out.println("내이름은abcabc: " + child.getName());
//
//        return child;
//
//    }
}
