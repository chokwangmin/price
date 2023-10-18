package com.example.price.controller;

import com.example.price.domain.Child;
import com.example.price.service.ChildService;
import io.swagger.models.Model;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class ChildController {

   @Autowired
   private ChildService childService;

    @GetMapping("/childlist")
    public String ChildList(int child){

        childService.ChildList(child);

        return "ChildList";
    }


}
