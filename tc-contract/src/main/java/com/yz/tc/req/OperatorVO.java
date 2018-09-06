package com.yz.tc.req;

import java.io.Serializable;

public class OperatorVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long idKey;
    private String ownerId;
    private Byte ownerType;
    private String operator;
    private String operatorName;

    public OperatorVO(Long idKey, String ownerId, Byte ownerType, String operator, String operatorName) {
        this.idKey = idKey;
        this.ownerId = ownerId;
        this.ownerType = ownerType;
        this.operator = operator;
        this.operatorName = operatorName;
    }

    public Long getIdKey() {
        return idKey;
    }

    public void setIdKey(Long idKey) {
        this.idKey = idKey;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Byte getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Byte ownerType) {
        this.ownerType = ownerType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperatorVO that = (OperatorVO) o;

        if (getIdKey() != null ? !getIdKey().equals(that.getIdKey()) : that.getIdKey() != null) return false;
        if (getOwnerId() != null ? !getOwnerId().equals(that.getOwnerId()) : that.getOwnerId() != null) return false;
        if (getOwnerType() != null ? !getOwnerType().equals(that.getOwnerType()) : that.getOwnerType() != null)
            return false;
        if (getOperator() != null ? !getOperator().equals(that.getOperator()) : that.getOperator() != null)
            return false;
        return getOperatorName() != null ? getOperatorName().equals(that.getOperatorName()) : that.getOperatorName() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdKey() != null ? getIdKey().hashCode() : 0;
        result = 31 * result + (getOwnerId() != null ? getOwnerId().hashCode() : 0);
        result = 31 * result + (getOwnerType() != null ? getOwnerType().hashCode() : 0);
        result = 31 * result + (getOperator() != null ? getOperator().hashCode() : 0);
        result = 31 * result + (getOperatorName() != null ? getOperatorName().hashCode() : 0);
        return result;
    }
}
