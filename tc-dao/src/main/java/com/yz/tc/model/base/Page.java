package com.yz.tc.model.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author yazhong
 */
@Getter
@Setter
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
}
