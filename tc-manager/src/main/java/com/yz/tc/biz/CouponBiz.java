package com.yz.tc.biz;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yz.tc.dao.CouponMapper;
import com.yz.tc.dao.ext.CouponExtMapper;
import com.yz.tc.exception.CommonBizException;
import com.yz.tc.model.Coupon;
import com.yz.tc.req.CouponPageVO;
import com.yz.tc.req.OperatorVO;
import com.yz.tc.resp.PageBase;
import com.yz.tc.resp.TCResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service("couponBiz")
public class CouponBiz {
    private final Logger LOGGER = LoggerFactory.getLogger(CouponBiz.class);

    @Autowired
    private CouponMapper couponMapper;
    @Autowired
    private CouponExtMapper couponExtMapper;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 删除优惠券
     *
     * @param userVo
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer deleteCoupon(OperatorVO userVo) {
        Coupon coupon = couponMapper.selectByPrimaryKey(userVo.getIdKey());
        if (coupon == null) {
            throw new CommonBizException(TCResultCode.DATA_NOT_EXIST, "优惠券");
        }
        int result = couponMapper.logicalDeleteByPrimaryKey(userVo.getIdKey(), userVo.getOperator(), userVo.getOperatorName(), new Date());
        return result;
    }

    /**
     * 创建优惠券
     *
     * @param coupon
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer createCoupon(Coupon coupon) throws CommonBizException {
        couponMapper.insertSelective(coupon);
        return coupon.getId();
    }

    /**
     * 更新优惠券
     *
     * @param coupon
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
    public Integer updateCoupon(Coupon coupon) {
        Coupon couponLast = couponMapper.selectByPrimaryKeyForUpdate(coupon.getId());
        if (couponLast == null || couponLast.getIsDeleted()) {
            throw new CommonBizException(TCResultCode.DATA_NOT_EXIST, "优惠券");
        }
        if (!couponLast.getOwnerType().equals(coupon.getOwnerType())
                || !couponLast.getOwnerId().equals(coupon.getOwnerId())) {
            throw new CommonBizException(TCResultCode.CAN_NOT_BE_OPERATE, "不是属于自己的优惠券", "编辑");
        }
        Integer result = couponMapper.updateByPrimaryKeySelective(coupon);
        return result;
    }

    /**
     * 分页查询优惠券信息
     *
     * @param couponQuery
     * @return
     * @author yazhong.qi
     * @version 1.0.0
     */
    @Transactional(readOnly = true)
    public PageBase<Coupon> queryCoupon(CouponPageVO couponQuery) {
        PageBase<Coupon> pageBase = new PageBase<Coupon>();
        // 使用分页插件PageHelper实现分页功能
        PageHelper.startPage(couponQuery.getPageNo(), couponQuery.getPageSize());
        List<Coupon> couponList = couponMapper.queryCoupon(couponQuery);
        PageInfo<Coupon> pageInfo = new PageInfo<Coupon>(couponList);
        pageBase.setPageNo(pageInfo.getPageNum());
        pageBase.setPageSize(pageInfo.getPageSize());
        pageBase.setTotalPages(pageInfo.getPages());
        pageBase.setTotalRecords(pageInfo.getTotal());
        pageBase.setRecords(couponList);
        return pageBase;
    }

}