package com.yz.tc.controller;

import com.yz.tc.service.ICouponService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "coupon", description = "优惠券管理接口")
@RequestMapping("coupon")
@RestController
public class CouponController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(CouponController.class);

    @Autowired
    private ICouponService couponService;


}
