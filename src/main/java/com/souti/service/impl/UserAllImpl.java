package com.souti.service.impl;

import com.souti.dao.Dao;
import com.souti.pojo.User;
import com.souti.service.UserAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAllImpl implements UserAll {
    @Autowired
    Dao dao;
    @Override
    public List<User> SelectAll() {
        List<User> user = dao.selectAll();
        return user;
    }

    @Override
    public boolean insert(User user) {
        boolean insert = dao.insert(user);
        return insert;
    }
}
