package com.qf.cz.web.api.bankcard.controller;

import com.qf.cz.web.api.bankcard.service.BankcardService;
import com.qf.zsm.domain.Bankcard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bank")
public class BankcardController {

    private static final Logger logger = LoggerFactory.getLogger(BankcardController.class);

    @Resource
    private BankcardService bankcardService;

    @RequestMapping(value = "/selectByPrimaryKey/{cardId}", method = RequestMethod.GET)
    public Bankcard selectByPrimaryKey(@PathVariable("cardId") String cardId) {
        Bankcard bankcard = bankcardService.selectByPrimaryKey(cardId);
        return bankcard;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Bankcard> findAll() {
        List<Bankcard> list = bankcardService.findAll();
        return list;
    }

    @ResponseBody
    @PutMapping("/update/{cardId}")
    public Bankcard update(@PathVariable("cardId")String cardId){
        Bankcard bankcard = bankcardService.selectByPrimaryKey(cardId);

        return bankcardService.updateByPrimaryKey(bankcard);
    }

    @RequestMapping("/save")
    public ModelAndView save(@RequestBody Bankcard bankcard){
        bankcardService.insert(bankcard);
        return new ModelAndView("redirect:http://localhost:8080/day29/static/bankcard.html");
    }

    @RequestMapping(value = "/delete/{cardId}", method = RequestMethod.GET)
    public void delete(@PathVariable("cardId")String cardId){
        bankcardService.deleteByPrimaryKey(cardId);
    }
}
