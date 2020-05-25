package com.qf.zsm.domain;

import lombok.Data;

@Data
public class Bankcard {
    /**
    * 银行卡号
    */
    private String cardId;

    /**
    * 银行卡名称
    */
    private String cardName;

    /**
    * 银行卡种类
    */
    private Integer cardType;

    /**
    * 银行卡预留手机号(银行卡绑定的手机号)
    */
    private String cardBindTelNo;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardBindTelNo() {
        return cardBindTelNo;
    }

    public void setCardBindTelNo(String cardBindTelNo) {
        this.cardBindTelNo = cardBindTelNo;
    }
}