package com.forteach.external.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-24 16:34
 * @Version: 1.0
 * @Description:
 */
@Entity
@Table(name = "T_S_DATA_RULE", schema = "SZXY", catalog = "")
public class TSDataRuleEntity implements Serializable {
    @Id
    private String id;
    private String ruleName;
    private String ruleColumn;
    private String ruleConditions;
    private String ruleValue;
    private Date createDate;
    private String createBy;
    private String createName;
    private Date updateDate;
    private String updateBy;
    private String updateName;
    private String functionid;

    @Basic
    @Column(name = "ID", nullable = true, length = 96)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RULE_NAME", nullable = true, length = 96)
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Basic
    @Column(name = "RULE_COLUMN", nullable = true, length = 300)
    public String getRuleColumn() {
        return ruleColumn;
    }

    public void setRuleColumn(String ruleColumn) {
        this.ruleColumn = ruleColumn;
    }

    @Basic
    @Column(name = "RULE_CONDITIONS", nullable = true, length = 300)
    public String getRuleConditions() {
        return ruleConditions;
    }

    public void setRuleConditions(String ruleConditions) {
        this.ruleConditions = ruleConditions;
    }

    @Basic
    @Column(name = "RULE_VALUE", nullable = true, length = 300)
    public String getRuleValue() {
        return ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "CREATE_BY", nullable = true, length = 96)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "CREATE_NAME", nullable = true, length = 96)
    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Basic
    @Column(name = "UPDATE_DATE", nullable = true)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "UPDATE_BY", nullable = true, length = 96)
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "UPDATE_NAME", nullable = true, length = 96)
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Basic
    @Column(name = "FUNCTIONID", nullable = true, length = 96)
    public String getFunctionid() {
        return functionid;
    }

    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TSDataRuleEntity that = (TSDataRuleEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(ruleColumn, that.ruleColumn) &&
                Objects.equals(ruleConditions, that.ruleConditions) &&
                Objects.equals(ruleValue, that.ruleValue) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(createName, that.createName) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateName, that.updateName) &&
                Objects.equals(functionid, that.functionid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ruleName, ruleColumn, ruleConditions, ruleValue, createDate, createBy, createName, updateDate, updateBy, updateName, functionid);
    }
}
