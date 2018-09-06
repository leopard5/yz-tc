package com.yz.tc.service;

import com.yz.tc.req.CouponQueryVO;
import com.yz.tc.req.CouponVO;
import com.yz.tc.req.OperatorVO;
import com.yz.tc.resp.CouponDTO;
import com.yz.tc.resp.KXResult;
import com.yz.tc.resp.QueryResult;

public interface ICouponService {

    /**
     * 删除优惠券
     *
     * @param userVo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    KXResult<Integer> deleteCoupon(OperatorVO userVo);

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    KXResult<Integer> createCoupon(CouponVO couponReq);

    /**
     * 更新优惠券
     *
     * @param couponReq
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    KXResult<Integer> updateCoupon(CouponVO couponReq);

    /**
     * 分页查询优惠券
     *
     * @param couponQueryReq
     * @return
     */
    KXResult<QueryResult<CouponDTO>> queryCoupon(CouponQueryVO couponQueryReq);

}