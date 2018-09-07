package com.yz.tc.base;

import com.yz.tc.req.PageBaseVO;

import java.util.Date;
import java.util.List;

public class RetryingListPageBaseVO extends PageBaseVO {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private List<Long> idList;

    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }


    private String batchNo;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    private List<String> batchNoList;

    public List<String> getBatchNoList() {
        return batchNoList;
    }

    public void setBatchNoList(List<String> batchNoList) {
        this.batchNoList = batchNoList;
    }

    private String batchNoLike;

    public String getBatchNoLike() {
        return batchNoLike;
    }

    public void setBatchNoLike(String batchNoLike) {
        this.batchNoLike = batchNoLike;
    }

    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private List<String> errorCodeList;

    public List<String> getErrorCodeList() {
        return errorCodeList;
    }

    public void setErrorCodeList(List<String> errorCodeList) {
        this.errorCodeList = errorCodeList;
    }

    private String errorCodeLike;

    public String getErrorCodeLike() {
        return errorCodeLike;
    }

    public void setErrorCodeLike(String errorCodeLike) {
        this.errorCodeLike = errorCodeLike;
    }

    private String errorMsg;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    private Byte deleteFlag;

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    private List<Byte> deleteFlagList;

    public List<Byte> getDeleteFlagList() {
        return deleteFlagList;
    }

    public void setDeleteFlagList(List<Byte> deleteFlagList) {
        this.deleteFlagList = deleteFlagList;
    }


    private Byte doingType;

    public Byte getDoingType() {
        return doingType;
    }

    public void setDoingType(Byte doingType) {
        this.doingType = doingType;
    }

    private List<Byte> doingTypeList;

    public List<Byte> getDoingTypeList() {
        return doingTypeList;
    }

    public void setDoingTypeList(List<Byte> doingTypeList) {
        this.doingTypeList = doingTypeList;
    }


    private String doingTypeName;

    public String getDoingTypeName() {
        return doingTypeName;
    }

    public void setDoingTypeName(String doingTypeName) {
        this.doingTypeName = doingTypeName;
    }

    private List<String> doingTypeNameList;

    public List<String> getDoingTypeNameList() {
        return doingTypeNameList;
    }

    public void setDoingTypeNameList(List<String> doingTypeNameList) {
        this.doingTypeNameList = doingTypeNameList;
    }

    private String doingTypeNameLike;

    public String getDoingTypeNameLike() {
        return doingTypeNameLike;
    }

    public void setDoingTypeNameLike(String doingTypeNameLike) {
        this.doingTypeNameLike = doingTypeNameLike;
    }

    private Byte finalResult;

    public Byte getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(Byte finalResult) {
        this.finalResult = finalResult;
    }

    private List<Byte> finalResultList;

    public List<Byte> getFinalResultList() {
        return finalResultList;
    }

    public void setFinalResultList(List<Byte> finalResultList) {
        this.finalResultList = finalResultList;
    }


    private Integer retryCount;

    public Integer getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
    }

    private List<Integer> retryCountList;

    public List<Integer> getRetryCountList() {
        return retryCountList;
    }

    public void setRetryCountList(List<Integer> retryCountList) {
        this.retryCountList = retryCountList;
    }


    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    private String tradeSceneNo;

    public String getTradeSceneNo() {
        return tradeSceneNo;
    }

    public void setTradeSceneNo(String tradeSceneNo) {
        this.tradeSceneNo = tradeSceneNo;
    }

    private List<String> tradeSceneNoList;

    public List<String> getTradeSceneNoList() {
        return tradeSceneNoList;
    }

    public void setTradeSceneNoList(List<String> tradeSceneNoList) {
        this.tradeSceneNoList = tradeSceneNoList;
    }

    private String tradeSceneNoLike;

    public String getTradeSceneNoLike() {
        return tradeSceneNoLike;
    }

    public void setTradeSceneNoLike(String tradeSceneNoLike) {
        this.tradeSceneNoLike = tradeSceneNoLike;
    }


    private Date createTimeFrom;

    public Date getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(Date createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    private Date createTimeTo;

    public Date getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(Date createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    private String createUser;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }


    private String createUserLike;

    public String getCreateUserLike() {
        return createUserLike;
    }

    public void setCreateUserLike(String createUserLike) {
        this.createUserLike = createUserLike;
    }

    private String createUserName;

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }


    private String createUserNameLike;

    public String getCreateUserNameLike() {
        return createUserNameLike;
    }

    public void setCreateUserNameLike(String createUserNameLike) {
        this.createUserNameLike = createUserNameLike;
    }


    private Date updateTimeFrom;

    public Date getUpdateTimeFrom() {
        return updateTimeFrom;
    }

    public void setUpdateTimeFrom(Date updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
    }

    private Date updateTimeTo;

    public Date getUpdateTimeTo() {
        return updateTimeTo;
    }

    public void setUpdateTimeTo(Date updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
    }

    private String updateUser;

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }


    private String updateUserLike;

    public String getUpdateUserLike() {
        return updateUserLike;
    }

    public void setUpdateUserLike(String updateUserLike) {
        this.updateUserLike = updateUserLike;
    }

    private String updateUserName;

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }


    private String updateUserNameLike;

    public String getUpdateUserNameLike() {
        return updateUserNameLike;
    }

    public void setUpdateUserNameLike(String updateUserNameLike) {
        this.updateUserNameLike = updateUserNameLike;
    }

    private Boolean isDeleted;

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    private List<Boolean> isDeletedList;

    public List<Boolean> getIsDeletedList() {
        return isDeletedList;
    }

    public void setIsDeletedList(List<Boolean> isDeletedList) {
        this.isDeletedList = isDeletedList;
    }
}