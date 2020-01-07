package com.xbsx.bos.system.basis.entity;

import java.util.Date;

public class Merchant {
    //主键
    private Long id;

    //交通运营商编号
    private String merchantNo;

    //运营商名称
    private String merchantName;

    //中文缩写
    private String merchantCn;

    //英文缩写
    private String merchantEn;

    //城市id
    private Integer cityId;

    //地址
    private String address;

    //电话
    private Integer phone;

    //邮箱
    private String email;

    //logo路径
    private String logoUrl;

    //应用接入服务列表（1：定制班线系统，2：包车系统。以";"分隔）
    private String serviceTypeList;

    //状态（0:已停用,1:已启用）
    private Integer state;

    //删除标记（0:未删除,1:已删除）
    private Integer isDeleted;

    //创建时间
    private Date createTime;

    //创建人id
    private String createOperatorId;

    //修改时间
    private Date updateTime;

    //更新人id
    private String updateOperatorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantCn() {
        return merchantCn;
    }

    public void setMerchantCn(String merchantCn) {
        this.merchantCn = merchantCn == null ? null : merchantCn.trim();
    }

    public String getMerchantEn() {
        return merchantEn;
    }

    public void setMerchantEn(String merchantEn) {
        this.merchantEn = merchantEn == null ? null : merchantEn.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getServiceTypeList() {
        return serviceTypeList;
    }

    public void setServiceTypeList(String serviceTypeList) {
        this.serviceTypeList = serviceTypeList == null ? null : serviceTypeList.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(String createOperatorId) {
        this.createOperatorId = createOperatorId == null ? null : createOperatorId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(String updateOperatorId) {
        this.updateOperatorId = updateOperatorId == null ? null : updateOperatorId.trim();
    }
}