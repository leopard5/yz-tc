package com.yz.tc.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yazhong
 */
@ApiModel("重试补偿")
@Data
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
}