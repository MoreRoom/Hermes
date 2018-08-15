package com.hermes.core.market.entity;

import java.util.Date;

/**
 * @ClassName ActiveEntity
 * @Description TODO
 * @Author MoreRoom
 * @Since 2018/8/15
 */
public class ActiveEntity {
    private Long id;
    private Long version;
    private Date createTime;
    private Date lastModifyTime;
    /** 开始时间 */
    private Date activeBeginTime;
    /** 结束时间 */
    private Date activeEndTime;
    /** 活动名称 */
    private String activeName;
    /** 活动状态 */
    private String activeStatus;
    /** 活动编号 */
    private String activeNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Date getActiveBeginTime() {
        return activeBeginTime;
    }

    public void setActiveBeginTime(Date activeBeginTime) {
        this.activeBeginTime = activeBeginTime;
    }

    public Date getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(Date activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getActiveNo() {
        return activeNo;
    }

    public void setActiveNo(String activeNo) {
        this.activeNo = activeNo;
    }
}
