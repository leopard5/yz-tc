package com.yz.tc.service;

import com.yz.tc.req.OperatorVO;
import com.yz.tc.req.RetryingListPageVO;
import com.yz.tc.req.RetryingVO;
import com.yz.tc.resp.PageQuery;
import com.yz.tc.resp.RetryingDTO;
import com.yz.tc.resp.TCResult;

import java.util.List;

/**
 * @CopyRright (c)2008-2017: <yz>
 * @Project: <tc>
 * @Comments: <对外API 重试补偿管理接口>
 * @JDK 1.7
 * @Author: <yazhong.qi>
 * @email : <qiyazhong@163.com>
 * @Create Date: <2018-08-29>
 * @Modify Date: <2018-08-29>
 * @Version: <1.0>
 */
public interface IRetryingService {

    /**
     * 删除重试补偿
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<Integer> deleteRetrying(OperatorVO vo);

    /**
     * 创建重试补偿
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<Long> createRetrying(RetryingVO vo);

    /**
     * 批量创建重试补偿
     *
     * @param vos
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<Integer> batchCreate(List<RetryingVO> vos);

    /**
     * 更新重试补偿
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<Integer> updateRetrying(RetryingVO vo);

    /**
     * 根据ID获取重试补偿信息
     *
     * @param id
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<RetryingDTO> getRetrying(Long id);

    /**
     * 分页查询重试补偿信息
     *
     * @param vo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    TCResult<PageQuery<RetryingDTO>> listPageRetrying(RetryingListPageVO vo);

    /**
     * The following custom service interface about dubbo
     */
}