package com.qf.zsm.domain;

import lombok.Data;

@Data
public class PersonData {
    /**
     * 资料表自增主键
     */
    private Integer personId;

    /**
     * QQ
     */
    private String qq;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 最高学历
     */
    private String academic;

    /**
     * 毕业院校
     */
    private String graduateSchool;

    /**
     * 婚姻状况
     */
    private String maritalStatus;

    /**
     * 所在行业
     */
    private String industry;

    /**
     * 月收入
     */
    private String salary;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAcademic() {
        return academic;
    }

    public void setAcademic(String academic) {
        this.academic = academic;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
