package com.yz.tc.model;

import javax.persistence.*;

@Table(name = "tc_retrying")
public class TcRetrying {
    /**
     * 自增主键ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 批次号
     */
    @Column(name = "batch_no")
    private String batchNo;

    /**
     * 错误码
     */
    @Column(name = "error_code")
    private String errorCode;

    /**
     * 获取自增主键ID
     *
     * @return id - 自增主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增主键ID
     *
     * @param id 自增主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取批次号
     *
     * @return batch_no - 批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置批次号
     *
     * @param batchNo 批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * 获取错误码
     *
     * @return error_code - 错误码
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误码
     *
     * @param errorCode 错误码
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}