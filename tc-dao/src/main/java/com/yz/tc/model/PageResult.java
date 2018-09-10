package com.yz.tc.model;

import java.io.Serializable;
import java.util.List;

public class PageResult<E> implements Serializable {
    private static final long serialVersionUID = 8189778548880809030L;

    /**
     * @Fields pageNo : 第几页
     */
    private Integer pageNo;

    /**
     * @Fields pageSize : 每页多少数据
     */
    private Integer pageSize;

    /**
     * @Fields totalPages : 总页数
     */
    private Integer totalPages;

    /**
     * @Fields totalRecords : 总记录数
     */
    private Long totalRecords;

    /**
     * @Fields records : 返回记录列表
     */
    private List<E> records;

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

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<E> getRecords() {
        return records;
    }

    public void setRecords(List<E> records) {
        this.records = records;
    }
}
