package com.qf.zsm.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class User {

    /**
     * 用户主键
     */

    private Integer userId;

    /**
     * 资料表自增主键
     */
    private Integer personId;

    /**
     * 银行卡号
     */
    private String cardId;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 登陆密码
     */
    @JSONField(serialize = false)
    private String loginPassword;

    /**
     * 展示在前台界面的名称
     */
    private String userName;

    /**
     * 用户绑定的手机号
     */
    private String userBindTelNo;

    private Integer status;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserBindTelNo() {
        return userBindTelNo;
    }

    public void setUserBindTelNo(String userBindTelNo) {
        this.userBindTelNo = userBindTelNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User(String loginName, String loginPassword, String userName, String userBindTelNo) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.userName = userName;
        this.userBindTelNo = userBindTelNo;
    }
}
