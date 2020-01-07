package com.xbsx.bos.system.basis.entity;

import java.util.Date;

public class CustomLine {
    //主键
    private Long id;

    //运营商编号
    private String merchantNo;

    //定制班线-退款密码
    private String custLineRefundPwd;

    //定制班线-部分退款时，折扣票退款规则
    private Integer custLineRefundTicketRule;

    //定制班线-日票退款时间
    private Integer custLineSingleRefundTime;

    //定制班线-日票购票日期限制（单位：日）
    private Integer custLineSingleDateLimit;

    //定制班线-单个班次日票购票数量限制
    private Integer custLineSingleCountLimit;

    //定制班线-周票退款时间
    private Integer custLineWeekRefundTime;

    //定制班线-周票购票日期限制（单位：周）
    private Integer custLineWeekDateLimit;

    //定制班线-单个班次周票购票数量限制
    private Integer custLineWeekCountLimit;

    //定制班线-月票退款时间
    private Integer custLineMonthRefundTime;

    //定制班线-月票购票日期限制（单位：月）
    private Integer custLineMonthDateLimit;

    //定制班线-单个班次月票数量数量限制
    private Integer custLineMonthCountLimit;

    //正向公钥
    private String positivePublicKey;

    //正向私钥
    private String positivePrivateKey;

    //创建人id
    private String createOperatorId;

    //创建时间
    private Date createTime;

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

    public String getCustLineRefundPwd() {
        return custLineRefundPwd;
    }

    public void setCustLineRefundPwd(String custLineRefundPwd) {
        this.custLineRefundPwd = custLineRefundPwd == null ? null : custLineRefundPwd.trim();
    }

    public Integer getCustLineRefundTicketRule() {
        return custLineRefundTicketRule;
    }

    public void setCustLineRefundTicketRule(Integer custLineRefundTicketRule) {
        this.custLineRefundTicketRule = custLineRefundTicketRule;
    }

    public Integer getCustLineSingleRefundTime() {
        return custLineSingleRefundTime;
    }

    public void setCustLineSingleRefundTime(Integer custLineSingleRefundTime) {
        this.custLineSingleRefundTime = custLineSingleRefundTime;
    }

    public Integer getCustLineSingleDateLimit() {
        return custLineSingleDateLimit;
    }

    public void setCustLineSingleDateLimit(Integer custLineSingleDateLimit) {
        this.custLineSingleDateLimit = custLineSingleDateLimit;
    }

    public Integer getCustLineSingleCountLimit() {
        return custLineSingleCountLimit;
    }

    public void setCustLineSingleCountLimit(Integer custLineSingleCountLimit) {
        this.custLineSingleCountLimit = custLineSingleCountLimit;
    }

    public Integer getCustLineWeekRefundTime() {
        return custLineWeekRefundTime;
    }

    public void setCustLineWeekRefundTime(Integer custLineWeekRefundTime) {
        this.custLineWeekRefundTime = custLineWeekRefundTime;
    }

    public Integer getCustLineWeekDateLimit() {
        return custLineWeekDateLimit;
    }

    public void setCustLineWeekDateLimit(Integer custLineWeekDateLimit) {
        this.custLineWeekDateLimit = custLineWeekDateLimit;
    }

    public Integer getCustLineWeekCountLimit() {
        return custLineWeekCountLimit;
    }

    public void setCustLineWeekCountLimit(Integer custLineWeekCountLimit) {
        this.custLineWeekCountLimit = custLineWeekCountLimit;
    }

    public Integer getCustLineMonthRefundTime() {
        return custLineMonthRefundTime;
    }

    public void setCustLineMonthRefundTime(Integer custLineMonthRefundTime) {
        this.custLineMonthRefundTime = custLineMonthRefundTime;
    }

    public Integer getCustLineMonthDateLimit() {
        return custLineMonthDateLimit;
    }

    public void setCustLineMonthDateLimit(Integer custLineMonthDateLimit) {
        this.custLineMonthDateLimit = custLineMonthDateLimit;
    }

    public Integer getCustLineMonthCountLimit() {
        return custLineMonthCountLimit;
    }

    public void setCustLineMonthCountLimit(Integer custLineMonthCountLimit) {
        this.custLineMonthCountLimit = custLineMonthCountLimit;
    }

    public String getPositivePublicKey() {
        return positivePublicKey;
    }

    public void setPositivePublicKey(String positivePublicKey) {
        this.positivePublicKey = positivePublicKey == null ? null : positivePublicKey.trim();
    }

    public String getPositivePrivateKey() {
        return positivePrivateKey;
    }

    public void setPositivePrivateKey(String positivePrivateKey) {
        this.positivePrivateKey = positivePrivateKey == null ? null : positivePrivateKey.trim();
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