package com.xbsx.bos.system.basis.entity;

import java.util.Date;

public class BaseOrganization {
    //主键
    private Long id;

    //机构id
    private String orgId;

    //机构名
    private String orgName;

    //联系人
    private String linkman;

    //电话
    private String phone;

    //邮箱
    private String mail;

    //地址
    private String address;

    //删除标记（0:未删除,1:已删除）
    private Integer isDeleted;

    //创建人id
    private String createOperatorId;

    //创建时间
    private Date createTime;

    //更新人id
    private String updateOperatorId;

    //更新时间
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(String createOperatorId) {
        this.createOperatorId = createOperatorId == null ? null : createOperatorId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateOperatorId() {
        return updateOperatorId;
    }

    public void setUpdateOperatorId(String updateOperatorId) {
        this.updateOperatorId = updateOperatorId == null ? null : updateOperatorId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}