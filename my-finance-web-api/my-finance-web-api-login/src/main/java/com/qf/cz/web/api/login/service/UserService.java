package com.qf.cz.web.api.login.service;

import com.qf.zsm.domain.User;

public interface UserService {

    int insert(User record);


    User checkLogin(String loginName,String loginPassword);

}
