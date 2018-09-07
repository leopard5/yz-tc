package com.yz.tc.service.impl;

import com.yz.tc.biz.RetryingBiz;
import com.yz.tc.convertor.RetryingConvertor;
import com.yz.tc.model.Retrying;
import com.yz.tc.req.OperatorVO;
import com.yz.tc.req.RetryingListPageVO;
import com.yz.tc.req.RetryingVO;
import com.yz.tc.resp.PageQuery;
import com.yz.tc.resp.RetryingDTO;
import com.yz.tc.resp.TCResult;
import com.yz.tc.service.IRetryingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.yz.tc.validate.RetryingValidate.validateForCreate;
import static com.yz.tc.validate.RetryingValidate.validateForUpdate;

/**
 * @CopyRright (c)2008-2017: <yz>
 * @Project: <tc>
 * @Comments: <Dubbo Service 重试补偿管理类>
 * @JDK 1.7
 * @Author: <yazhong.qi>
 * @email : <qiyazhong@163.com>
 * @Create Date: <2018-08-29>
 * @Modify Date: <2018-08-29>
 * @Version: <1.0>
 */
@Service("retryingService")
public class RetryingServiceImpl implements IRetryingService {
    private final Logger logger = LoggerFactory.getLogger(RetryingServiceImpl.class);

    @Autowired
    private RetryingBiz retryingBiz;

    /**
     * 删除重试补偿
     *
     * @param vo
     * @return
     * @Author: <qiyazhong@163.com>
     * @Version: <1.0>
     */
    @Override
    public TCResult<Integer> deleteRetrying(OperatorVO vo) {
        TCResult<Integer> result = TCResult.newSuccess();
        result.setDataMap(retryingBiz.deleteRetrying(vo));
        return result;
    }

    /**
     * 创建重试补偿
     *
     * @param vo
     * @return
     * @Author: <qiyazhong@163.com>
     * @Version: <1.0>
     */
    @Override
    public TCResult<Long> createRetrying(RetryingVO vo) {
        TCResult<Long> result = TCResult.newSuccess();
        Retrying retrying = RetryingConvertor.toRetrying(vo);
        if (!validateForCreate(retrying, result)) {
            return result;
        }
        result.setDataMap(retryingBiz.createRetrying(retrying));
        return result;
    }

    /**
     * 批量写入
     *
     * @param vos
     * @return
     */
    @Override
    public TCResult<Integer> batchCreate(List<RetryingVO> vos) {
        TCResult<Integer> result = TCResult.newSuccess();
        List<Retrying> items = RetryingConvertor.toRetryingList(vos);
        result.setDataMap(retryingBiz.batchCreateRetrying(items));
        return result;
    }

    /**
     * 更新重试补偿
     *
     * @param vo
     * @return
     * @Author: <qiyazhong@163.com>
     * @Version: <1.0>
     */
    @Override
    public TCResult<Integer> updateRetrying(RetryingVO vo) {
        TCResult<Integer> result = TCResult.newSuccess();
        Retrying retrying = null;
        retrying = RetryingConvertor.toRetrying(vo);
        if (!validateForUpdate(retrying, result)) {
            return result;
        }
        result.setDataMap(retryingBiz.updateRetrying(retrying));
        return result;
    }

    /**
     * 根据ID获取重试补偿信息
     *
     * @param id
     * @return
     * @Author: <qiyazhong@163.com>
     * @Version: <1.0>
     */
    @Override
    public TCResult<RetryingDTO> getRetrying(Long id) {
        TCResult<RetryingDTO> result = TCResult.newSuccess();
        Retrying retrying = retryingBiz.getRetrying(id);
        RetryingDTO retryingODTO = RetryingConvertor.toRetryingDTO(retrying);
        result.setDataMap(retryingODTO);
        return result;
    }

    /**
     * 分页查询重试补偿信息
     *
     * @param vo
     * @return
     * @Author: <qiyazhong@163.com>
     * @Version: <1.0>
     */
    @Override
    public TCResult<PageQuery<RetryingDTO>> listPageRetrying(RetryingListPageVO vo) {
        TCResult<PageQuery<RetryingDTO>> result = TCResult.newSuccess();

        PageQuery<Retrying> resultInfo = retryingBiz.listPageRetrying(vo);
        result.setDataMap(RetryingConvertor.toPageQueryList(resultInfo));

        return result;
    }
}