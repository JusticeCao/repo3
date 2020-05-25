package com.qf.cz.web.api.login.dao;


import com.qf.zsm.domain.PersonData;

public interface PersondataMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(PersonData record);

    int insertSelective(PersonData record);

    PersonData selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(PersonData record);

    int updateByPrimaryKey(PersonData record);
}