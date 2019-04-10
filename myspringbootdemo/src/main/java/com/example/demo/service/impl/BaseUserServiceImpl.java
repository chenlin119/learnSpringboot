package com.example.demo.service.impl;

import com.example.demo.dao.master.BaseUserDao;
import com.example.demo.domain.BaseUser;
import com.example.demo.service.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    private BaseUserDao userDao;

    
    public BaseUser getUserById(int id) {
        return userDao.getUserById(id);
    }
}
