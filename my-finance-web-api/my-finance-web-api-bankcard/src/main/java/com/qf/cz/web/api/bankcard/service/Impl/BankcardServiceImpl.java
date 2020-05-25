package com.qf.cz.web.api.bankcard.service.Impl;

import com.qf.cz.web.api.bankcard.dao.BankcardMapper;
import com.qf.cz.web.api.bankcard.service.BankcardService;
import com.qf.zsm.domain.Bankcard;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BankcardServiceImpl implements BankcardService {
    @Resource
    private BankcardMapper bankcardMapper;

    @Override
    public void deleteByPrimaryKey(String cardId) {
        bankcardMapper.deleteByPrimaryKey(cardId);
    }

    @Override
    public Bankcard insert(Bankcard record) {
        return record;
    }

    @Override
    public Bankcard insertSelective(Bankcard record) {
        return record;
    }

    @Override
    public List<Bankcard> findAll() {
        return bankcardMapper.findAll();
    }

    @Override
    public Bankcard selectByPrimaryKey(String cardId) {
        return bankcardMapper.selectByPrimaryKey(cardId);
    }

    @Override
    public Bankcard updateByPrimaryKeySelective(Bankcard record) {
        return record;
    }

    @Override
    public Bankcard updateByPrimaryKey(Bankcard record) {
        return record;
    }
}
