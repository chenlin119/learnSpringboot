package com.example.demo.dao.cluster;


import com.example.demo.domain.MyLink;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MyLinkDao {
    MyLink getMyLinkById(@Param("id") int id);
}
