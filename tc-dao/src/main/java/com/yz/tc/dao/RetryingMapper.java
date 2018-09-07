package com.yz.tc.dao;

import com.yz.tc.model.Retrying;
import com.yz.tc.model.RetryingExample;
import com.yz.tc.req.RetryingListPageVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface RetryingMapper {
    
    long countByExample(RetryingExample example);

    int deleteByExample(RetryingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Retrying record);

    int insertSelective(Retrying record);

    List<Retrying> selectByExampleWithBLOBs(RetryingExample example);

    List<Retrying> selectByExample(RetryingExample example);

    Retrying selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Retrying record, @Param("example") RetryingExample example);

    int updateByExampleWithBLOBs(@Param("record") Retrying record, @Param("example") RetryingExample example);

    int updateByExample(@Param("record") Retrying record, @Param("example") RetryingExample example);

    int updateByPrimaryKeySelective(Retrying record);

    int updateByPrimaryKeyWithBLOBs(Retrying record);

    int updateByPrimaryKey(Retrying record);

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