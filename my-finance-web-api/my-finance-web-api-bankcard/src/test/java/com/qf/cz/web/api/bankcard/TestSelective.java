package com.qf.cz.web.api.bankcard;

import com.qf.cz.web.api.bankcard.dao.BankcardMapper;
import com.qf.zsm.domain.Bankcard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"

})
public class TestSelective {


    @Autowired
    private BankcardMapper bankcardMapper;

    @Test
    public void test1(){
        Bankcard bankcard = bankcardMapper.selectByPrimaryKey("1");

        System.out.println(bankcard);
    }

    @Test
    public void test2(){
         Bankcard bankcard = bankcardMapper.selectByPrimaryKey("2");
         bankcard.setCardName("中国平安银行");
         int rows = bankcardMapper.updateByPrimaryKey(bankcard);
        System.out.println(rows);
    }
    @Test
    public void test3(){
         Bankcard bankcard = new Bankcard();
         bankcard.setCardId("10");
         bankcard.setCardName("中国招商银行");
         bankcard.setCardType(3);
         bankcard.setCardBindTelNo("5757575757");
        int rows  = bankcardMapper.insertSelective(bankcard);

        System.out.println(rows);
    }

    @Test
    public void test4(){
        Bankcard bankcard = new Bankcard();
        bankcard.setCardId("5");
        bankcard.setCardName("中国农商银行");
        bankcard.setCardType(3);
        bankcard.setCardBindTelNo("5757575757");
        int rows  = bankcardMapper.insert(bankcard);

        System.out.println(rows);
    }

    @Test
    public void test5(){
        int rows  = bankcardMapper.deleteByPrimaryKey("10");
    }
}
