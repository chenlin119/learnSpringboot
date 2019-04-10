package com.example.demo.dao.master;

import com.example.demo.domain.BaseUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BaseUserDao {
     BaseUser getUserById(@Param("id") int id);
}
