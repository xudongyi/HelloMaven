package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;//ceshi

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }//feichang
    
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {//nihao
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);//nibuhao
    }
    
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
