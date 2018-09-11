package com.yz.tc.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yz.tc.dao.RetryingMapper;
import com.yz.tc.model.Retrying;
import com.yz.tc.req.OperatorVO;
import com.yz.tc.req.RetryingListPageVO;
import com.yz.tc.resp.PageQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @CopyRright (c)2008-2017: <yz>
 * @Project: <tc>
 * @Comments: <业务层重试补偿管理类>
 * @JDK 1.7
 * @Author: <yazhong.qi>
 * @email : <qiyazhong@163.com>
 * @Create Date: <2018-08-29>
 * @Modify Date: <2018-08-29>
 * @Version: <1.0>
 */
@Service("retryingBiz")
public class RetryingBiz {
    private final Logger logger = LoggerFactory.getLogger(RetryingBiz.class);

    @Autowired
    RetryingMapper retryingMapper;

    /**
     * 逻辑删除重试补偿
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer deleteRetrying(OperatorVO vo) {
        // TODO: Describe business logic and implement it
        int result = retryingMapper.logicalDeleteByPrimaryKey(vo.getIdKey(), vo.getOperator(), vo.getOperatorName(), new Date());
        return result;
    }

    /**
     * 创建重试补偿
     *
     * @param retrying
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Long createRetrying(Retrying retrying) {
        settingDefaultFields(retrying);
        // TODO: Describe business logic and implement it
        retryingMapper.insertSelective(retrying);
        return retrying.getId();
    }

    /**
     * 批量创建
     *
     * @param retryingList
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public int batchCreateRetrying(List<Retrying> retryingList) {
        // TODO: Describe business logic and implement it
        return retryingMapper.insertBatch(retryingList);
    }

    /**
     * 更新重试补偿
     *
     * @param retrying
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer updateRetrying(Retrying retrying) {
        Integer result = null;
        Retrying retryingLast = retryingMapper.selectByPrimaryKeyForUpdate(retrying.getId());
        if (retryingLast == null) {
            // TODO：这里请写清楚
        }
        // TODO: Describe business logic and implement it
        result = retryingMapper.updateByPrimaryKeySelective(retrying);
        return result;
    }

    /**
     * 根据ID获取重试补偿信息
     *
     * @param id
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public Retrying getRetrying(Long id) {
        // TODO: Describe business logic and implement it
        Retrying retrying = retryingMapper.selectByPrimaryKey(id);
        return retrying;
    }

    /**
     * 分页查询重试补偿信息
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public PageQuery<Retrying> listPageRetrying(RetryingListPageVO vo) {
        PageQuery<Retrying> queryResult = new PageQuery<Retrying>();
        // 使用分页插件PageHelper实现分页功能
        PageHelper.startPage(vo.getPageNo(), vo.getPageSize());
        List<Retrying> retryingList = retryingMapper.listPageRetrying(vo);
        PageInfo<Retrying> pageInfo = new PageInfo<Retrying>(retryingList);
        queryResult.setPageNo(pageInfo.getPageNum());
        queryResult.setPageSize(pageInfo.getPageSize());
        queryResult.setTotalPages(pageInfo.getPages());
        queryResult.setTotalRecords(pageInfo.getTotal());
        queryResult.setRecords(retryingList);
        return queryResult;
    }

    private void settingDefaultFields(Retrying vo){

    }

}