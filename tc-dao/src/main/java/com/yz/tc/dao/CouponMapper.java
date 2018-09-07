package com.yz.tc.dao;

import com.yz.tc.model.Coupon;
import com.yz.tc.model.CouponExample;
import com.yz.tc.req.CouponPageVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CouponMapper {

    int countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    int logicalDeleteByPrimaryKey(
            @Param("id") Long id,
            @Param("updateUser") String updateUser,
            @Param("updateUserName") String updateUserName,
            @Param("updateTime") Date updateTime);

    Coupon selectByPrimaryKeyForUpdate(Integer id);

    List<Coupon> queryCoupon(CouponPageVO couponQuery);
}