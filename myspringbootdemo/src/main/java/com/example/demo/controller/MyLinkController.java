package com.example.demo.controller;

import com.example.demo.domain.MyLink;
import com.example.demo.service.MyLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyLinkController {

    @Autowired
    private MyLinkService myLinkService;

    @RequestMapping(value = "/mylink", method = RequestMethod.GET)
    public MyLink getLink(@RequestParam(value = "id") int id){
        return myLinkService.getMyLinkById(id);

    }
}
