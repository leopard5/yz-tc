package com.yz.tc.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-test.xml",
        "classpath:*/applicationContext-bean.xml",
        "classpath:*/applicationContext-consumer.xml",
        "classpath:*/applicationContext-redis.xml",
        "classpath:*/applicationContext-ds.xml",
})
public class CouponTest extends TestBase {

//    @Autowired
//    private ICouponService couponService;
//
//    @Test
//    public void createCoupon() {
//        couponService.createCoupon();
//    }


}