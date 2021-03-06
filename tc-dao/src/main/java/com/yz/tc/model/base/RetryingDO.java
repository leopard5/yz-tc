/**
 * Autogenerated by code generator (1.0.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.yz.tc.model.base;

import lombok.Data;

import java.util.Date;

/**
 * @author yazhong
 */
@Data
public class RetryingDO {
    public static final String C_ID = "自增主键ID";
    public static final String C_BATCH_NO = "批次号";
    public static final String C_ERROR_CODE = "错误码";
    public static final String C_ERROR_MSG = "错误信息";
    public static final String C_DELETE_FLAG = "是否删除";
    public static final String C_DOING_TYPE = "操作类型";
    public static final String C_DOING_TYPE_NAME = "操作类型名称";
    public static final String C_FINAL_RESULT = "最终处理结果 0处理中 1成功 2失败";
    public static final String C_RETRY_COUNT = "补偿次数";
    public static final String C_CONTENT = "报文内容";
    public static final String C_TRADE_SCENE_NO = "业务场景编号";
    public static final String C_CREATE_TIME = "创建时间";
    public static final String C_CREATE_USER = "创建人ID";
    public static final String C_CREATE_USER_NAME = "创建人名称";
    public static final String C_UPDATE_TIME = "更新时间";
    public static final String C_UPDATE_USER = "更新人ID";
    public static final String C_UPDATE_USER_NAME = "更新人名称";
    public static final String C_IS_DELETED = "是否删除：0.未删除，1.已删除";

    /**
     * 自增主键ID
     */
    private Long id;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 是否删除
     */
    private Byte deleteFlag;

    /**
     * 操作类型
     */
    private Byte doingType;

    /**
     * 操作类型名称
     */
    private String doingTypeName;

    /**
     * 最终处理结果 0处理中 1成功 2失败
     */
    private Byte finalResult;

    /**
     * 补偿次数
     */
    private Integer retryCount;

    /**
     * 报文内容
     */
    private String content;

    /**
     * 业务场景编号
     */
    private String tradeSceneNo;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人ID
     */
    private String createUser;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新人ID
     */
    private String updateUser;

    /**
     * 更新人名称
     */
    private String updateUserName;

    /**
     * 是否删除：0.未删除，1.已删除
     */
    private Boolean isDeleted;
}