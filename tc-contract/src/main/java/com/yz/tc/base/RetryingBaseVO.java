package com.yz.tc.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel("重试补偿")
public class RetryingBaseVO implements Serializable {
    /**
     * serialVersionUID
     */ 
    private static final long serialVersionUID = 1L;

        
    @ApiModelProperty("自增主键ID")
    private Long id;
        
    @ApiModelProperty("批次号")
    private String batchNo;
        
    @ApiModelProperty("错误码")
    private String errorCode;
        
    @ApiModelProperty("错误信息")
    private String errorMsg;
        
    @ApiModelProperty("是否删除")
    private Byte deleteFlag;
        
    @ApiModelProperty("操作类型")
    private Byte doingType;
        
    @ApiModelProperty("操作类型名称")
    private String doingTypeName;
        
    @ApiModelProperty("最终处理结果 0处理中 1成功 2失败")
    private Byte finalResult;
        
    @ApiModelProperty("补偿次数")
    private Integer retryCount;
        
    @ApiModelProperty("报文内容")
    private String content;
        
    @ApiModelProperty("业务场景编号")
    private String tradeSceneNo;
        
    @ApiModelProperty("创建时间")
    private Date createTime;
        
    @ApiModelProperty("创建人ID")
    private String createUser;
        
    @ApiModelProperty("创建人名称")
    private String createUserName;
        
    @ApiModelProperty("更新时间")
    private Date updateTime;
        
    @ApiModelProperty("更新人ID")
    private String updateUser;
        
    @ApiModelProperty("更新人名称")
    private String updateUserName;
        
    @ApiModelProperty("是否删除：0.未删除，1.已删除")
    private Boolean isDeleted;
    

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public String getBatchNo(){
        return batchNo;
    }
    
    public void setBatchNo(String batchNo){
        this.batchNo = batchNo;
    }

    public String getErrorCode(){
        return errorCode;
    }
    
    public void setErrorCode(String errorCode){
        this.errorCode = errorCode;
    }

    public String getErrorMsg(){
        return errorMsg;
    }
    
    public void setErrorMsg(String errorMsg){
        this.errorMsg = errorMsg;
    }

    public Byte getDeleteFlag(){
        return deleteFlag;
    }
    
    public void setDeleteFlag(Byte deleteFlag){
        this.deleteFlag = deleteFlag;
    }

    public Byte getDoingType(){
        return doingType;
    }
    
    public void setDoingType(Byte doingType){
        this.doingType = doingType;
    }

    public String getDoingTypeName(){
        return doingTypeName;
    }
    
    public void setDoingTypeName(String doingTypeName){
        this.doingTypeName = doingTypeName;
    }

    public Byte getFinalResult(){
        return finalResult;
    }
    
    public void setFinalResult(Byte finalResult){
        this.finalResult = finalResult;
    }

    public Integer getRetryCount(){
        return retryCount;
    }
    
    public void setRetryCount(Integer retryCount){
        this.retryCount = retryCount;
    }

    public String getContent(){
        return content;
    }
    
    public void setContent(String content){
        this.content = content;
    }

    public String getTradeSceneNo(){
        return tradeSceneNo;
    }
    
    public void setTradeSceneNo(String tradeSceneNo){
        this.tradeSceneNo = tradeSceneNo;
    }

    public Date getCreateTime(){
        return createTime;
    }
    
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    public String getCreateUser(){
        return createUser;
    }
    
    public void setCreateUser(String createUser){
        this.createUser = createUser;
    }

    public String getCreateUserName(){
        return createUserName;
    }
    
    public void setCreateUserName(String createUserName){
        this.createUserName = createUserName;
    }

    public Date getUpdateTime(){
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    public String getUpdateUser(){
        return updateUser;
    }
    
    public void setUpdateUser(String updateUser){
        this.updateUser = updateUser;
    }

    public String getUpdateUserName(){
        return updateUserName;
    }
    
    public void setUpdateUserName(String updateUserName){
        this.updateUserName = updateUserName;
    }

    public Boolean getIsDeleted(){
        return isDeleted;
    }
    
    public void setIsDeleted(Boolean isDeleted){
        this.isDeleted = isDeleted;
    }

    //-----------------------------------------------------------------------
    // custom property definition
}