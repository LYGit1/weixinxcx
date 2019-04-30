package com.springboot.weixinxcx.entity;

import java.util.Date;

public class Area {
    private Integer areaId;

    private String areaName;

    private Integer priority;

    private Date createTime;

    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.area_id
     *
     * @return the value of tb_area.area_id
     *
     * @mbg.generated
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.area_id
     *
     * @param areaId the value for tb_area.area_id
     *
     * @mbg.generated
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.area_name
     *
     * @return the value of tb_area.area_name
     *
     * @mbg.generated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.area_name
     *
     * @param areaName the value for tb_area.area_name
     *
     * @mbg.generated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.priority
     *
     * @return the value of tb_area.priority
     *
     * @mbg.generated
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.priority
     *
     * @param priority the value for tb_area.priority
     *
     * @mbg.generated
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.create_time
     *
     * @return the value of tb_area.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.create_time
     *
     * @param createTime the value for tb_area.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.last_update_time
     *
     * @return the value of tb_area.last_update_time
     *
     * @mbg.generated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.last_update_time
     *
     * @param lastUpdateTime the value for tb_area.last_update_time
     *
     * @mbg.generated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}