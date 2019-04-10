package com.example.demo.controller;

import com.example.demo.domain.BaseUser;
import com.example.demo.domain.MyLink;
import com.example.demo.service.BaseUserService;
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
    @Autowired
    private BaseUserService baseUserService;

    @RequestMapping(value = "/mylink", method = RequestMethod.GET)
    public MyLink getLink(@RequestParam(value = "id") int id){
        return myLinkService.getMyLinkById(id);
    }

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public BaseUser getUser(@RequestParam(value = "id") int id){
        MyLink link=myLinkService.getMyLinkById(1);
        BaseUser user=baseUserService.getUserById(id);
        user.setMyLink(link);
        return user;
    }
}
