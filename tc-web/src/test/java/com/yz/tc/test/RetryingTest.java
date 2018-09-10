package com.yz.tc.test;

import com.yz.tc.req.OperatorVO;
import com.yz.tc.req.RetryingListPageVO;
import com.yz.tc.req.RetryingVO;
import com.yz.tc.resp.PageQuery;
import com.yz.tc.resp.RetryingDTO;
import com.yz.tc.resp.TCResult;
import com.yz.tc.service.IRetryingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-test.xml",
        "classpath:*/applicationContext-bean.xml",
        "classpath:*/applicationContext-consumer.xml",
        "classpath:*/applicationContext-redis.xml",
        "classpath:*/applicationContext-ds.xml",
})
public class RetryingTest extends TestBase {

    @Resource
    private IRetryingService retryingService;

    /**
     * 测试删除重试补偿
     */
    @Test
    public void deleteRetrying() {
        OperatorVO vo = new OperatorVO();
        vo.setIdKey(1L);
        vo.setOperatorName("test user");
        vo.setOperatorName("system");
        TCResult<Integer> result = retryingService.deleteRetrying(vo);
        printAndAssertEquals(result);
    }

    /**
     * 测试创建重试补偿
     */
    @Test
    public void createRetrying() {
        RetryingVO vo = new RetryingVO();
        vo.setId(1L);
        vo.setBatchNo("test string");
        vo.setErrorCode("test string");
        vo.setErrorMsg("test string");
        vo.setDeleteFlag((byte) 1);
        vo.setDoingType((byte) 1);
        vo.setDoingTypeName("test string");
        vo.setFinalResult((byte) 1);
        vo.setRetryCount(1);
        vo.setTradeSceneNo("test string");
        vo.setCreateTime(null);
        vo.setCreateUser("test string");
        vo.setCreateUserName("test string");
        vo.setUpdateTime(null);
        vo.setUpdateUser("test string");
        vo.setUpdateUserName("test string");
        vo.setIsDeleted(true);
        TCResult<Long> result = retryingService.createRetrying(vo);
        printAndAssertEquals(result);
    }

    /**
     * 测试更新重试补偿
     */
    @Test
    public void updateRetrying() {
        RetryingVO vo = new RetryingVO();
        vo.setId(1L);
        vo.setBatchNo("test string");
        vo.setErrorCode("test string");
        vo.setErrorMsg("test string");
        vo.setDeleteFlag((byte) 1);
        vo.setDoingType((byte) 1);
        vo.setDoingTypeName("test string");
        vo.setFinalResult((byte) 1);
        vo.setRetryCount(1);
        vo.setTradeSceneNo("test string");
        vo.setCreateTime(null);
        vo.setCreateUser("test string");
        vo.setCreateUserName("test string");
        vo.setUpdateTime(null);
        vo.setUpdateUser("test string");
        vo.setUpdateUserName("test string");
        vo.setIsDeleted(true);
        TCResult<Integer> messageInfo = retryingService
                .updateRetrying(vo);
        printAndAssertEquals(messageInfo);
    }

    /**
     * 测试获取重试补偿信息
     */
    @Test
    public void getRetrying() {
        Long id = 1L;
        TCResult<RetryingDTO> messageInfo = retryingService.getRetrying(id);
        printAndAssertEquals(messageInfo);
    }

    /**
     * 测试分页获取重试补偿信息
     */
    @Test
    public void queryRetrying() {
        RetryingListPageVO vo = new RetryingListPageVO();
        vo.setPageNo(1);
        vo.setPageSize(10);
        vo.setOrder("desc");
        vo.setOrderBy("id");
        vo.setId(1L);
        vo.setBatchNo("test string");
        vo.setErrorCode("test string");
        vo.setErrorMsg("test string");
        vo.setDeleteFlag((byte) 1);
        vo.setDoingType((byte) 1);
        vo.setDoingTypeName("test string");
        vo.setFinalResult((byte) 1);
        vo.setRetryCount(1);
        vo.setTradeSceneNo("test string");
        vo.setCreateUser("test string");
        vo.setCreateUserName("test string");
        vo.setUpdateUser("test string");
        vo.setUpdateUserName("test string");
        vo.setIsDeleted(true);
        TCResult<PageQuery<RetryingDTO>> result = retryingService
                .listPageRetrying(vo);
        printAndAssertEquals(result);
    }

}