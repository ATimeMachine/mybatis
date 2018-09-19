package com.example.mybatis.comment.comment.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class promotional {
    /**
     * 促销ID
     * 表字段 : t_promotional.prom_id
     */
    private Integer promId;

    /**
     * 企业编码
     * 表字段 : t_promotional.enterprise_code
     */
    private String enterpriseCode;

    /**
     * 促销名称
     * 表字段 : t_promotional.prom_name
     */
    private String promName;

    /**
     * 促销开始时间
     * 表字段 : t_promotional.start_time
     */
    private Date startTime;

    /**
     * 促销结束时间
     * 表字段 : t_promotional.end_time
     */
    private Date endTime;

    /**
     * 享受优惠会员等级(V1,V2,V3,NEW,ALL)
     * 表字段 : t_promotional.vip_level
     */
    private String vipLevel;

    /**
     * 使用平台(pc,wap,offline)
     * 表字段 : t_promotional.use_platform
     */
    private String usePlatform;

    /**
     * 促销类型(买赠buyPresent，特价specialOffer，折扣discount，多买overBuy , 返利rebate，满减fullCut，满折fullDiscount，阶梯满ladderFull)
     * 表字段 : t_promotional.sale_type
     */
    private String saleType;

    /**
     * 备注说明
     * 表字段 : t_promotional.remark
     */
    private String remark;

    /**
     * 订单多买-优惠条件-满 (N) 件
     * 表字段 : t_promotional.full_condition
     */
    private Short fullCondition;

    /**
     * 批量特价
     * 表字段 : t_promotional.batch_special_price
     */
    private BigDecimal batchSpecialPrice;

    /**
     * 批量减价
     * 表字段 : t_promotional.batch_reduce_price
     */
    private BigDecimal batchReducePrice;

    /**
     * 满减/换购/返券-优惠条件：(满 (N) 元)
     * 表字段 : t_promotional.full_element
     */
    private BigDecimal fullElement;

    /**
     * 满减/换购/返券-每满(N元)
     * 表字段 : t_promotional.each_full_money
     */
    private BigDecimal eachFullMoney;

    /**
     * 多买/满减/换购/返券-是否累计限额（0：不限额；1：限额/件）
     * 表字段 : t_promotional.limits
     */
    private Short limits;

    /**
     * 多买-限购数量-限购（N）件（N为限购数量）
     * 表字段 : t_promotional.each_single
     */
    private Integer eachSingle;

    /**
     * 满减-减现金(N元)
     * 表字段 : t_promotional.minus_money
     */
    private BigDecimal minusMoney;

    /**
     * 换购-换购限制-每单N件(0:表示不限制，N是限制多少件)
     * 表字段 : t_promotional.change_buy_limit
     */
    private Integer changeBuyLimit;

    /**
     * 制单人
     * 表字段 : t_promotional.touching_user
     */
    private String touchingUser;

    /**
     * 制单时间
     * 表字段 : t_promotional.touching_time
     */
    private Date touchingTime;

    /**
     * 审核人
     * 表字段 : t_promotional.auditor_user
     */
    private String auditorUser;

    /**
     * 审核时间
     * 表字段 : t_promotional.auditor_time
     */
    private Date auditorTime;

    /**
     * 是否审核后立即发布(1 审核后立即发布 2 定时发布)
     * 表字段 : t_promotional.releases
     */
    private Short releases;

    /**
     * 按时发布时间
     * 表字段 : t_promotional.release_time
     */
    private Date releaseTime;

    /**
     * 审核状态(1：待提交；2：待审核；3：已驳回；4：已生效未发布；5:已发布未开始 6：活动中；7：已结束)
     * 表字段 : t_promotional.auditor_status
     */
    private Short auditorStatus;

    /**
     * 优惠范围 1:商品活动,2:分类活动,3:品牌活动,4:全场活动
     * 表字段 : t_promotional.pref_range
     */
    private Short prefRange;

    /**
     * 优惠方式(1：不累计；2：每满按比例累计；3：阶梯满)
     * 表字段 : t_promotional.pref_way
     */
    private Short prefWay;

    /**
     * 多买-优惠每满(N件)
     * 表字段 : t_promotional.each_full_num
     */
    private Integer eachFullNum;

    /**
     * 多买优惠(减N件)
     * 表字段 : t_promotional.minus_num
     */
    private Integer minusNum;

    /**
     * 促销编号
     * 表字段 : t_promotional.prom_code
     */
    private String promCode;

    /**
     * (1 已废弃 0 可用)
     * 表字段 : t_promotional.deleted
     */
    private Short deleted;

    /**
     * 批量设置类型（1特价 2减价 3 折扣）
     * 表字段 : t_promotional.batch_type
     */
    private Short batchType;

    /**
     * 多买优惠(打N折)
     * 表字段 : t_promotional.minus_sale
     */
    private BigDecimal minusSale;

    /**
     * 多买优惠类型（1减件 2 每件打折 3 每件N元 4 第N件打折 ）
     * 表字段 : t_promotional.minus_type
     */
    private Short minusType;

    /**
     * 满减/换购/返券-最高累计N元
     * 表字段 : t_promotional.limit_quota_price
     */
    private BigDecimal limitQuotaPrice;

    /**
     * 批量折扣(折扣设置0-10)
     * 表字段 : t_promotional.batch_discount
     */
    private BigDecimal batchDiscount;

    /**
     * 订单满减-优惠条件-优惠折扣N折（0-10）
     * 表字段 : t_promotional.discount
     */
    private BigDecimal discount;

    /**
     * 审核意见or驳回原因
     * 表字段 : t_promotional.audit_opinion
     */
    private String auditOpinion;

    /**
     * 企业Id
     * 表字段 : t_promotional.enterprise_id
     */
    private Integer enterpriseId;

    /**
     * 是否限时（0：不限时，1：限时）
     * 表字段 : t_promotional.time_limit_status
     */
    private Short timeLimitStatus;

    /**
     * 限时的开始时间
     * 表字段 : t_promotional.time_limit_start
     */
    private Date timeLimitStart;

    /**
     * 限时的结束时间
     * 表字段 : t_promotional.time_limit_end
     */
    private Date timeLimitEnd;

    /**
     * 门店ID
     * 表字段 : t_promotional.store_id
     */
    private Integer storeId;

    /**
     * 门店编码
     * 表字段 : t_promotional.store_code
     */
    private String storeCode;

    /**
     * 多买优惠/每件N元
     * 表字段 : t_promotional.each_piece_money
     */
    private BigDecimal eachPieceMoney;

    /**
     * 多买优惠-第N件N折-第N折的字段
     * 表字段 : t_promotional.the_pieces_discount
     */
    private BigDecimal thePiecesDiscount;

    /**
     * 宣传语
     * 表字段 : t_promotional.slogan
     */
    private String slogan;

    /**
     * 优先级
     * 表字段 : t_promotional.priority
     */
    private Integer priority;

    /**
     * 订单返券-总限量（0:不限量，0<N,表示限量的数量）
     * 表字段 : t_promotional.total_limit
     */
    private Short totalLimit;

    /**
     * 订单返券-每日限量
     * 表字段 : t_promotional.daily_limit
     */
    private Short dailyLimit;

    /**
     * 订单返券-每人限量
     * 表字段 : t_promotional.people_limit
     */
    private Short peopleLimit;

    /**
     * 订单返券-每人每日限量
     * 表字段 : t_promotional.daily_people_limit
     */
    private Short dailyPeopleLimit;

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getUsePlatform() {
        return usePlatform;
    }

    public void setUsePlatform(String usePlatform) {
        this.usePlatform = usePlatform;
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getFullCondition() {
        return fullCondition;
    }

    public void setFullCondition(Short fullCondition) {
        this.fullCondition = fullCondition;
    }

    public BigDecimal getBatchSpecialPrice() {
        return batchSpecialPrice;
    }

    public void setBatchSpecialPrice(BigDecimal batchSpecialPrice) {
        this.batchSpecialPrice = batchSpecialPrice;
    }

    public BigDecimal getBatchReducePrice() {
        return batchReducePrice;
    }

    public void setBatchReducePrice(BigDecimal batchReducePrice) {
        this.batchReducePrice = batchReducePrice;
    }

    public BigDecimal getFullElement() {
        return fullElement;
    }

    public void setFullElement(BigDecimal fullElement) {
        this.fullElement = fullElement;
    }

    public BigDecimal getEachFullMoney() {
        return eachFullMoney;
    }

    public void setEachFullMoney(BigDecimal eachFullMoney) {
        this.eachFullMoney = eachFullMoney;
    }

    public Short getLimits() {
        return limits;
    }

    public void setLimits(Short limits) {
        this.limits = limits;
    }

    public Integer getEachSingle() {
        return eachSingle;
    }

    public void setEachSingle(Integer eachSingle) {
        this.eachSingle = eachSingle;
    }

    public BigDecimal getMinusMoney() {
        return minusMoney;
    }

    public void setMinusMoney(BigDecimal minusMoney) {
        this.minusMoney = minusMoney;
    }

    public Integer getChangeBuyLimit() {
        return changeBuyLimit;
    }

    public void setChangeBuyLimit(Integer changeBuyLimit) {
        this.changeBuyLimit = changeBuyLimit;
    }

    public String getTouchingUser() {
        return touchingUser;
    }

    public void setTouchingUser(String touchingUser) {
        this.touchingUser = touchingUser;
    }

    public Date getTouchingTime() {
        return touchingTime;
    }

    public void setTouchingTime(Date touchingTime) {
        this.touchingTime = touchingTime;
    }

    public String getAuditorUser() {
        return auditorUser;
    }

    public void setAuditorUser(String auditorUser) {
        this.auditorUser = auditorUser;
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public Short getReleases() {
        return releases;
    }

    public void setReleases(Short releases) {
        this.releases = releases;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Short getAuditorStatus() {
        return auditorStatus;
    }

    public void setAuditorStatus(Short auditorStatus) {
        this.auditorStatus = auditorStatus;
    }

    public Short getPrefRange() {
        return prefRange;
    }

    public void setPrefRange(Short prefRange) {
        this.prefRange = prefRange;
    }

    public Short getPrefWay() {
        return prefWay;
    }

    public void setPrefWay(Short prefWay) {
        this.prefWay = prefWay;
    }

    public Integer getEachFullNum() {
        return eachFullNum;
    }

    public void setEachFullNum(Integer eachFullNum) {
        this.eachFullNum = eachFullNum;
    }

    public Integer getMinusNum() {
        return minusNum;
    }

    public void setMinusNum(Integer minusNum) {
        this.minusNum = minusNum;
    }

    public String getPromCode() {
        return promCode;
    }

    public void setPromCode(String promCode) {
        this.promCode = promCode;
    }

    public Short getDeleted() {
        return deleted;
    }

    public void setDeleted(Short deleted) {
        this.deleted = deleted;
    }

    public Short getBatchType() {
        return batchType;
    }

    public void setBatchType(Short batchType) {
        this.batchType = batchType;
    }

    public BigDecimal getMinusSale() {
        return minusSale;
    }

    public void setMinusSale(BigDecimal minusSale) {
        this.minusSale = minusSale;
    }

    public Short getMinusType() {
        return minusType;
    }

    public void setMinusType(Short minusType) {
        this.minusType = minusType;
    }

    public BigDecimal getLimitQuotaPrice() {
        return limitQuotaPrice;
    }

    public void setLimitQuotaPrice(BigDecimal limitQuotaPrice) {
        this.limitQuotaPrice = limitQuotaPrice;
    }

    public BigDecimal getBatchDiscount() {
        return batchDiscount;
    }

    public void setBatchDiscount(BigDecimal batchDiscount) {
        this.batchDiscount = batchDiscount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Short getTimeLimitStatus() {
        return timeLimitStatus;
    }

    public void setTimeLimitStatus(Short timeLimitStatus) {
        this.timeLimitStatus = timeLimitStatus;
    }

    public Date getTimeLimitStart() {
        return timeLimitStart;
    }

    public void setTimeLimitStart(Date timeLimitStart) {
        this.timeLimitStart = timeLimitStart;
    }

    public Date getTimeLimitEnd() {
        return timeLimitEnd;
    }

    public void setTimeLimitEnd(Date timeLimitEnd) {
        this.timeLimitEnd = timeLimitEnd;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public BigDecimal getEachPieceMoney() {
        return eachPieceMoney;
    }

    public void setEachPieceMoney(BigDecimal eachPieceMoney) {
        this.eachPieceMoney = eachPieceMoney;
    }

    public BigDecimal getThePiecesDiscount() {
        return thePiecesDiscount;
    }

    public void setThePiecesDiscount(BigDecimal thePiecesDiscount) {
        this.thePiecesDiscount = thePiecesDiscount;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Short getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(Short totalLimit) {
        this.totalLimit = totalLimit;
    }

    public Short getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(Short dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Short getPeopleLimit() {
        return peopleLimit;
    }

    public void setPeopleLimit(Short peopleLimit) {
        this.peopleLimit = peopleLimit;
    }

    public Short getDailyPeopleLimit() {
        return dailyPeopleLimit;
    }

    public void setDailyPeopleLimit(Short dailyPeopleLimit) {
        this.dailyPeopleLimit = dailyPeopleLimit;
    }
}