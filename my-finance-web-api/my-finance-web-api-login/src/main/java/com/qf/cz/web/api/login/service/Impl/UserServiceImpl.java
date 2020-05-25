package com.qf.cz.web.api.login.service.Impl;

import com.qf.cz.web.api.login.dao.UserMapper;
import com.qf.cz.web.api.login.service.UserService;
import com.qf.zsm.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User checkLogin(String loginName, String loginPassword) {
        User user = userMapper.findByName(loginName,loginPassword);
        if(user != null && user.getLoginPassword().equals(loginPassword)){

            return user;
        }
        return null;
    }
}
