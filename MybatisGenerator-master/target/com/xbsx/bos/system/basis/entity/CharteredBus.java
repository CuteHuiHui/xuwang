package com.xbsx.bos.system.basis.entity;

import java.util.Date;

public class CharteredBus {
    //主键
    private Long id;

    //运营商编号
    private String merchantNo;

    //包车预约电话
    private Integer charBusPhone;

    //包车预约日期限制（单位：日）
    private Integer charBusDateLimit;

    //包车定金规则(1.统一定金，2.根据车型配置定金)
    private Integer charBusMoneyRuleType;

    //包车定金金额(单位：分)
    private Integer charBusMoneyPrice;

    //包车退款密码
    private String charBusRefundPwd;

    //创建人id
    private String createOperatorId;

    //创建时间
    private Date createTime;

    //更新人id
    private String updateOperatorId;

    //修改时间
    private Date updateTime;

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

    public Integer getCharBusPhone() {
        return charBusPhone;
    }

    public void setCharBusPhone(Integer charBusPhone) {
        this.charBusPhone = charBusPhone;
    }

    public Integer getCharBusDateLimit() {
        return charBusDateLimit;
    }

    public void setCharBusDateLimit(Integer charBusDateLimit) {
        this.charBusDateLimit = charBusDateLimit;
    }

    public Integer getCharBusMoneyRuleType() {
        return charBusMoneyRuleType;
    }

    public void setCharBusMoneyRuleType(Integer charBusMoneyRuleType) {
        this.charBusMoneyRuleType = charBusMoneyRuleType;
    }

    public Integer getCharBusMoneyPrice() {
        return charBusMoneyPrice;
    }

    public void setCharBusMoneyPrice(Integer charBusMoneyPrice) {
        this.charBusMoneyPrice = charBusMoneyPrice;
    }

    public String getCharBusRefundPwd() {
        return charBusRefundPwd;
    }

    public void setCharBusRefundPwd(String charBusRefundPwd) {
        this.charBusRefundPwd = charBusRefundPwd == null ? null : charBusRefundPwd.trim();
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