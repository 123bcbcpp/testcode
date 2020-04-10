package com.souti.dao;

import com.souti.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Dao {
    List<User> selectAll() ;
    boolean insert(User user);
}
