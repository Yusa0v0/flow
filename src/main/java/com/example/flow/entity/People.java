package com.example.flow.entity;

import java.io.Serializable;

/**
 * (People)实体类
 *
 * @author makejava
 * @since 2023-11-07 22:13:46
 */
public class People implements Serializable {
    private static final long serialVersionUID = -20056879390050023L;
    
    private Integer id;
    
    private Double score;
    
    private Integer level;
    
    private String phone;
    
    private Integer relationship;
    /**
     * 0存在，1删除
     */
    private Integer delFlag;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRelationship() {
        return relationship;
    }

    public void setRelationship(Integer relationship) {
        this.relationship = relationship;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

