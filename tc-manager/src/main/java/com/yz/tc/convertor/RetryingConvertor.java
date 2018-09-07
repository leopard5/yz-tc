package com.yz.tc.convertor;

import com.yz.tc.model.Retrying;
import com.yz.tc.req.RetryingVO;
import com.yz.tc.resp.PageQuery;
import com.yz.tc.resp.RetryingDTO;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

/**
 * @CopyRright (c)2008-2017: <yz>
 * @Project: <tc>
 * @Comments: <Dubbo层重试补偿转换类 Dubbo层的Info对象与dal层的model对象相互转换>
 * @JDK 1.7
 * @Author: <yazhong.qi>
 * @email : <qiyazhong@163.com>
 * @Create Date: <2018-08-29>
 * @Modify Date: <2018-08-29>
 * @Version: <1.0>
 */
public abstract class RetryingConvertor {
    private static final BeanCopier beanCopierForRetrying = BeanCopier.create(RetryingVO.class, Retrying.class, false);
    private static final BeanCopier beanCopierForRetryingDTO = BeanCopier.create(Retrying.class, RetryingDTO.class, false);

    public static Retrying toRetrying(RetryingVO source) {
        Retrying target = new Retrying();
        beanCopierForRetrying.copy(source, target, null);
        return target;
    }

    public static RetryingDTO toRetryingDTO(Retrying source) {
        if (source == null) {
            return null;
        }
        RetryingDTO target = new RetryingDTO();
        beanCopierForRetryingDTO.copy(source, target, null);
        return target;
    }

    public static List<Retrying> toRetryingList(List<RetryingVO> sourceList) {
        if (sourceList == null || sourceList.isEmpty()) {
            return null;
        }
        List<Retrying> retryingList = new ArrayList<Retrying>(sourceList.size());
        for (RetryingVO item : sourceList) {
            retryingList.add(toRetrying(item));
        }
        return retryingList;
    }

    public static List<RetryingDTO> toRetryingDTOList(List<Retrying> sourceList) {
        if (sourceList == null || sourceList.isEmpty()) {
            return null;
        }
        List<RetryingDTO> retryingInfoList = new ArrayList<RetryingDTO>(sourceList.size());
        for (Retrying item : sourceList) {
            retryingInfoList.add(toRetryingDTO(item));
        }
        return retryingInfoList;
    }

    public static PageQuery<RetryingDTO> toPageQueryList(PageQuery<Retrying> source) {
        PageQuery<RetryingDTO> target = new PageQuery<RetryingDTO>();
        target.setPageNo(source.getPageNo());
        target.setPageSize(source.getPageSize());
        target.setTotalPages(source.getTotalPages());
        target.setTotalRecords(source.getTotalRecords());
        target.setRecords(toRetryingDTOList(source.getRecords()));
        return target;
    }
}