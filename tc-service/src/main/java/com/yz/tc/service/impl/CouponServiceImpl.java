package com.yz.tc.service.impl;

import com.yz.tc.biz.CouponBiz;
import com.yz.tc.convertor.CouponConvertor;
import com.yz.tc.model.Coupon;
import com.yz.tc.req.CouponQueryVO;
import com.yz.tc.req.CouponVO;
import com.yz.tc.req.OperatorVO;
import com.yz.tc.resp.CouponDTO;
import com.yz.tc.resp.KXResult;
import com.yz.tc.resp.QueryResult;
import com.yz.tc.resp.TCResultCode;
import com.yz.tc.service.ICouponService;
import com.yz.tc.validate.CouponValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import static com.yz.tc.util.ValidationUtil.*;

@Service("couponService")
public class CouponServiceImpl implements ICouponService {
    private final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    @Autowired
    private CouponBiz couponBiz;

    /**
     * 删除优惠券
     *
     * @param vo
     * @return
     * @Author: <yazhong.qi@163.com>
     * @Version: <1.0>
     */
    @Override
    public KXResult<Integer> deleteCoupon(OperatorVO vo) {
        KXResult<Integer> result = KXResult.newSuccess();

        if (isNull(result, "优惠券ID", vo.getIdKey())) {
            return result;
        }
        if (vo.getIdKey() <= 0) {
            result.setErrorCode(TCResultCode.COMMON_PARAM_INVALID, Coupon.ID);
            return result;
        }
        result.setDataMap(couponBiz.deleteCoupon(vo));
        return result;
    }

    /**
     * 创建优惠券
     *
     * @param couponReq
     * @return
     * @Author: <yazhong.qi@163.com>
     * @Version: <1.0>
     */
    @Override
    public KXResult<Integer> createCoupon(CouponVO couponReq) {
        KXResult<Integer> result = KXResult.newSuccess();

        Coupon coupon = CouponConvertor.toCoupon(couponReq);
        if (!CouponValidate.validateForCreate(coupon, result, false)) {
            return result;
        }

        result.setDataMap(couponBiz.createCoupon(coupon));
        return result;
    }

    /**
     * 更新优惠券
     *
     * @param vo
     * @return
     * @Author: <yazhong.qi@163.com>
     * @Version: <1.0>
     */
    @Override
    public KXResult<Integer> updateCoupon(CouponVO vo) {
        KXResult<Integer> result = KXResult.newSuccess();

        Coupon coupon = CouponConvertor.toCoupon(vo);
        if (!CouponValidate.validateForUpdate(coupon, result)) {
            return result;
        }
        result.setDataMap(couponBiz.updateCoupon(coupon));
        return result;
    }

    /**
     * 分页查询优惠券信息
     *
     * @param couponQueryReq
     * @return
     * @Author: <yazhong.qi@163.com>
     * @Version: <1.0>
     */
    @Override
    public KXResult<QueryResult<CouponDTO>> queryCoupon(CouponQueryVO couponQueryReq) {
        KXResult<QueryResult<CouponDTO>> result = KXResult.newSuccess();
        QueryResult<Coupon> resultInfo = couponBiz.queryCoupon(couponQueryReq);
        result.setDataMap(CouponConvertor.toQueryResultInfo(resultInfo));
        return result;
    }
}