package com.souti.service;

import com.souti.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserAll {
    public List<User> SelectAll();
    public boolean insert(User user);
}
