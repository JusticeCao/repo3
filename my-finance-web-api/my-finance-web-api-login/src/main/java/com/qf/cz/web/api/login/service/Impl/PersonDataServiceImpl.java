package com.qf.cz.web.api.login.service.Impl;

import com.qf.cz.web.api.login.service.PersonDataService;
import com.qf.zsm.domain.PersonData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonDataServiceImpl implements PersonDataService {

    @Resource
    private PersonDataService personDataService;

    @Override
    public int insert(PersonData record) {
        return personDataService.insert(record);
    }
}
