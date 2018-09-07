package com.yz.tc.controller;

import com.yz.tc.req.OperatorVO;
import com.yz.tc.req.RetryingListPageVO;
import com.yz.tc.req.RetryingVO;
import com.yz.tc.resp.PageQuery;
import com.yz.tc.resp.RetryingDTO;
import com.yz.tc.resp.TCResult;
import com.yz.tc.service.IRetryingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("retrying")
@RestController
@Api(value = "retrying", description = "重试补偿管理接口")
public class RetryingController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(RetryingController.class);

    @Autowired
    private IRetryingService retryingService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "内部错误"),
            @ApiResponse(code = 401, message = "用户不存在"),
            @ApiResponse(code = 402, message = "没有此操作权限"),
    })
    @ApiOperation(value = "deleteRetrying", notes = "删除重试补偿")
    @RequestMapping(value = "deleteRetrying", method = {RequestMethod.POST})
    public TCResult<Integer> deleteRetrying(Long id) {
        TCResult<Integer> result = TCResult.newSuccess();
        OperatorVO vo = new OperatorVO();
        vo.setIdKey(id);
        vo.setOperator("operator");
        vo.setOperatorName("operator name");
        result = retryingService.deleteRetrying(vo);
        return result;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "内部错误"),
            @ApiResponse(code = 401, message = "用户不存在"),
            @ApiResponse(code = 402, message = "没有此操作权限"),
    })
    @ApiOperation(value = "createRetrying", notes = "创建重试补偿")
    @RequestMapping(value = "createRetrying", method = {RequestMethod.POST})
    public TCResult<Long> createRetrying(@Valid @RequestBody RetryingVO retryingVO) {
        TCResult<Long> result = retryingService.createRetrying(retryingVO);
        return result;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "内部错误"),
            @ApiResponse(code = 401, message = "用户不存在"),
            @ApiResponse(code = 402, message = "没有此操作权限"),
    })
    @ApiOperation(value = "updateRetrying", notes = "更新重试补偿")
    @RequestMapping(value = "updateRetrying", method = {RequestMethod.POST})
    public TCResult<Integer> updateRetrying(@Valid @RequestBody RetryingVO retryingVO) {
        TCResult<Integer> result = retryingService.updateRetrying(retryingVO);
        return result;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "内部错误"),
            @ApiResponse(code = 401, message = "用户不存在"),
            @ApiResponse(code = 402, message = "没有此操作权限"),
    })
    @ApiOperation(value = "getRetrying/{id}", notes = "根据重试补偿ID获取重试补偿信息")
    @RequestMapping(value = "getRetrying/{id}", method = {RequestMethod.GET})
    public TCResult<RetryingDTO> getRetrying(@PathVariable Long id) {
        TCResult<RetryingDTO> result = retryingService.getRetrying(id);
        return result;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 500, message = "内部错误"),
            @ApiResponse(code = 401, message = "用户不存在"),
            @ApiResponse(code = 402, message = "没有此操作权限"),
    })
    @ApiOperation(value = "listPageRetrying", notes = "分页获取重试补偿列表信息")
    @RequestMapping(value = "listPageRetrying", method = {RequestMethod.GET})
    TCResult<PageQuery<RetryingDTO>> listPageRetrying(@Valid @RequestBody RetryingListPageVO retryingQueryVO) {
        TCResult<PageQuery<RetryingDTO>> result = retryingService.listPageRetrying(retryingQueryVO);
        return result;
    }
}
