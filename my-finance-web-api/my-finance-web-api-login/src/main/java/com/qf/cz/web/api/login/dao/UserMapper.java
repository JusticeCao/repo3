package com.qf.cz.web.api.login.dao;

import com.qf.zsm.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User  findByName(@Param("loginName") String loginName,@Param("loginPassword") String loginPassword);
}