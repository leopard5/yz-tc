package com.yz.tc.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
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
}
