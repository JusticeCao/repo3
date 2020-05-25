package com.qf.cz.web.api.bankcard.service;

import com.qf.zsm.domain.Bankcard;

import java.util.List;

public interface BankcardService {
    void  deleteByPrimaryKey(String cardId);

    Bankcard insert(Bankcard record);

    Bankcard insertSelective(Bankcard record);

    List<Bankcard> findAll();

    Bankcard selectByPrimaryKey(String cardId);

    Bankcard updateByPrimaryKeySelective(Bankcard record);

    Bankcard updateByPrimaryKey(Bankcard record);
}
