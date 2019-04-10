package com.example.demo.service.impl;

import com.example.demo.dao.cluster.MyLinkDao;
import com.example.demo.domain.MyLink;
import com.example.demo.service.MyLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyLinkServiceImpl implements MyLinkService {

    @Autowired
    private MyLinkDao myLinkDao;

    public MyLink getMyLinkById(int id){
        return myLinkDao.getMyLinkById(id);
    }
}
