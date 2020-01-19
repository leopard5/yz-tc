package com.yz.tc.dao;

import com.yz.tc.model.Retrying;
import com.yz.tc.req.RetryingListPageVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author yazhong.qi
 */
public interface RetryingMapper {

    int logicalDeleteByPrimaryKey(
            @Param("id") Long id,
            @Param("updateUser") String updateUser,
            @Param("updateUserName") String updateUserName,
            @Param("updateTime") Date updateTime);

    Retrying selectByPrimaryKeyForUpdate(Long id);

    List<Retrying> listPageRetrying(RetryingListPageVO retryingQuery);

    int insertBatch(@Param("modelList") List<Retrying> modelList);

    List<Retrying> selectByBatchNo(@Param("batchNo") String batchNo);
}