package com.mybatis.test.entity;

import java.util.Date;

public class Stu {
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Long stuId;

    private Double score;

    private String description;

    private String name;

    private Integer price;

    private Long projectId;

    private String headImgs;

    private String bodyImgs;

    private String tagIds;

    private Byte status;

    private String producingArea;

    private Long spuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(String headImgs) {
        this.headImgs = headImgs == null ? null : headImgs.trim();
    }

    public String getBodyImgs() {
        return bodyImgs;
    }

    public void setBodyImgs(String bodyImgs) {
        this.bodyImgs = bodyImgs == null ? null : bodyImgs.trim();
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds == null ? null : tagIds.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getProducingArea() {
        return producingArea;
    }

    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea == null ? null : producingArea.trim();
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }
}