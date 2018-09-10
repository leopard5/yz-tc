package com.yz.tc.model.base;

import java.io.Serializable;

/**
 * @author yazhong
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pageNo : 第几页
     */
    private Integer pageNo = 1;

    /**
     * pageSize : 每页多少数据
     */
    private Integer pageSize = 10;

    /**
     * order : 哪个字段排序
     */
    private String order;

    /**
     * orderBy : 升序or降序
     */
    private String orderBy;

    /**
     * returnFields : 指定返回哪些字段
     */
    private String returnFields;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getReturnFields() {
        return returnFields;
    }

    public void setReturnFields(String returnFields) {
        this.returnFields = returnFields;
    }
}
