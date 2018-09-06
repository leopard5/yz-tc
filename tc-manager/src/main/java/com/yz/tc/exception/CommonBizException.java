package com.yz.tc.exception;

import com.yz.tc.resp.TCResultCode;

public class CommonBizException extends BaseException {
    private static final long serialVersionUID = 1L;

    private TCResultCode mmcResultCode;

    public CommonBizException(String errorCode, String errorMsg, Throwable caused) {
        super(errorCode, errorMsg, caused);
    }

    public CommonBizException(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    public CommonBizException(String errorCode, String errorMsg, Object... args) {
        super(errorCode, errorMsg, args);
    }

    public CommonBizException(TCResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
        this.mmcResultCode = resultCode;
    }

    public CommonBizException(TCResultCode resultCode, Object... args) {
        this(resultCode.getCode(), resultCode.getMessage(), args);
        this.mmcResultCode = resultCode;
    }

    public CommonBizException(String errorCode, Throwable caused) {
        super(errorCode, caused);
    }

    public TCResultCode getMmcResultCode() {
        return mmcResultCode;
    }
}