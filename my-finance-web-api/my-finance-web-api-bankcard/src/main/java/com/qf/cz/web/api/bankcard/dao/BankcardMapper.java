package com.qf.cz.web.api.bankcard.dao;

import com.qf.zsm.domain.Bankcard;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankcardMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(Bankcard record);

    int insertSelective(Bankcard record);

    List<Bankcard> findAll();

    Bankcard selectByPrimaryKey(String cardId);

    int updateByPrimaryKeySelective(Bankcard record);

    int updateByPrimaryKey(Bankcard record);
}