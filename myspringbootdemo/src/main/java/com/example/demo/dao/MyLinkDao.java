package com.example.demo.dao;


import com.example.demo.domain.MyLink;

import org.apache.ibatis.annotations.Param;


public interface MyLinkDao {
    MyLink getMyLinkById(@Param("id") int id);
}
