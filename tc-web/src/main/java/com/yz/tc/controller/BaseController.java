package com.yz.tc.controller;

import com.alibaba.fastjson.JSON;
import com.yz.tc.resp.TCResult;
import com.yz.tc.resp.TCResultCode;
import com.yz.tc.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {
    private final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Value("${user.key}")
    private String userKey;

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;

    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
        this.session = request.getSession(false);
    }

    /**
     * 获取登录用户
     *
     * @param result
     * @return
     */
    protected UserVo getUser(TCResult<?> result) {
        Object object = session.getAttribute(userKey);
        UserVo userVo = null;

        if (null != object) {
            logger.info("user：" + object.toString());
            return JSON.parseObject(object.toString(), UserVo.class);
        }
        return userVo;
    }

    /**
     * req封装请求用户信息
     *
     * @param result
     * @return
     */
    protected void getBaseReq(TCResult<?> result) {
        try {
            UserVo userVo = this.getUser(result);
            if (null == userVo) {
                result.setCode(TCResultCode.USER_NOT_EXIST.getCode());
                result.setMessage(TCResultCode.USER_NOT_EXIST.getMessage());
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setCode(TCResultCode.SYS_ERROR.getCode());
            result.setMessage(TCResultCode.SYS_ERROR.getMessage());
        }
    }

}
