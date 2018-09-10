package com.yz.tc.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel("分页输出结果基类")
public class PageQuery<E> implements Serializable {
    private static final long serialVersionUID = 1572680453817033022L;

    /**
     * @Fields pageNo : 第几页
     */
    @ApiModelProperty("第几页")
    private Integer pageNo;

    /**
     * @Fields pageSize : 每页多少数据
     */
    @ApiModelProperty("每页多少数据")
    private Integer pageSize;

    /**
     * @Fields totalPages : 总页数
     */
    @ApiModelProperty("总页数")
    private Integer totalPages;

    /**
     * @Fields totalRecords : 总记录数
     */
    @ApiModelProperty("总记录数")
    private Long totalRecords;

    /**
     * @Fields records : 返回记录列表
     */
    @ApiModelProperty("返回记录列表")
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
