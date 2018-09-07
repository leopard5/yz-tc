package com.yz.tc.convertor;

import com.yz.tc.model.Coupon;
import com.yz.tc.model.CouponQuery;
import com.yz.tc.req.CouponPageVO;
import com.yz.tc.req.CouponVO;
import com.yz.tc.resp.CouponDTO;
import com.yz.tc.resp.PageBase;
import org.springframework.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.List;

public abstract class CouponConvertor {

    private static final BeanCopier beanCopierForCouponInfo = BeanCopier.create(Coupon.class, CouponDTO.class, false);
    private static final BeanCopier beanCopierForCoupon = BeanCopier.create(CouponVO.class, Coupon.class, false);
    private static final BeanCopier beanCopierForCouponQuery = BeanCopier.create(CouponPageVO.class, CouponQuery.class, false);

    public static CouponDTO toCouponInfo(Coupon coupon) {
        if (coupon == null) {
            return null;
        }
        CouponDTO couponInfo = new CouponDTO();
        beanCopierForCouponInfo.copy(coupon, couponInfo, null);
        return couponInfo;
    }

    public static Coupon toCoupon(CouponVO couponReq) {
        Coupon coupon = new Coupon();
        beanCopierForCoupon.copy(couponReq, coupon, null);
        return coupon;
    }

    public static List<CouponDTO> toCouponInfoList(List<Coupon> couponList) {
        if (couponList == null || couponList.isEmpty()) {
            return null;
        }
        List<CouponDTO> couponInfoList = new ArrayList<CouponDTO>(couponList.size());
        for (Coupon coupon : couponList) {
            couponInfoList.add(toCouponInfo(coupon));
        }
        return couponInfoList;
    }

    public static List<Coupon> toCouponList(List<CouponVO> couponReqList) {
        if (couponReqList == null || couponReqList.isEmpty()) {
            return null;
        }
        List<Coupon> couponList = new ArrayList<Coupon>(couponReqList.size());
        for (CouponVO couponReq : couponReqList) {
            couponList.add(toCoupon(couponReq));
        }
        return couponList;
    }

    public static CouponQuery toCouponQuery(CouponPageVO couponQueryReq) {
        if (couponQueryReq == null) {
            return null;
        }
        CouponQuery couponQuery = new CouponQuery();
        beanCopierForCouponQuery.copy(couponQueryReq, couponQuery, null);
        return couponQuery;
    }

    public static PageBase<CouponDTO> toQueryResultInfo(PageBase<Coupon> pageBase) {
        PageBase<CouponDTO> pageBaseInfo = new PageBase<CouponDTO>();
        pageBaseInfo.setPageNo(pageBase.getPageNo());
        pageBaseInfo.setPageSize(pageBase.getPageSize());
        pageBaseInfo.setTotalPages(pageBase.getTotalPages());
        pageBaseInfo.setTotalRecords(pageBase.getTotalRecords());
        pageBaseInfo.setRecords(toCouponInfoList(pageBase.getRecords()));
        return pageBaseInfo;
    }
}