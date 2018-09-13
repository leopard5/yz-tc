package com.yz.tc.validate;

import com.yz.tc.model.Retrying;
import com.yz.tc.resp.TCResult;

import static com.yz.tc.util.ValidationUtil.*;

/**
 * @CopyRright (c)2008-2017: <yz>
 * @Project: <tc>
 * @Comments: <service层重试补偿验证类>
 * @JDK 1.7
 * @Author: <yazhong.qi>
 * @email : <qiyazhong@163.com>
 * @Create Date: <2018-08-29>
 * @Modify Date: <2018-08-29>
 * @Version: <1.0>
 */
public class RetryingValidate {

    public static boolean validateForCreate(Retrying retrying, TCResult<?> message) {
        if (isEmptyOrMoreThan(message, Retrying.C_BATCH_NO, retrying.getBatchNo(), 36)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_ERROR_CODE, retrying.getErrorCode(), 10)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_ERROR_MSG, retrying.getErrorMsg(), 100)) {
            return false;
        }

        if (isNull(message, Retrying.C_DELETE_FLAG, retrying.getDeleteFlag())) {
            return false;
        }

        if (isNull(message, Retrying.C_DOING_TYPE, retrying.getDoingType())) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_DOING_TYPE_NAME, retrying.getDoingTypeName(), 20)) {
            return false;
        }

        if (isNull(message, Retrying.C_FINAL_RESULT, retrying.getFinalResult())) {
            return false;
        }

        if (isNull(message, Retrying.C_RETRY_COUNT, retrying.getRetryCount())) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_TRADE_SCENE_NO, retrying.getTradeSceneNo(), 10)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_CREATE_USER, retrying.getCreateUser(), 64)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_CREATE_USER_NAME, retrying.getCreateUserName(), 64)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_UPDATE_USER, retrying.getUpdateUser(), 64)) {
            return false;
        }
        if (isEmptyOrMoreThan(message, Retrying.C_UPDATE_USER_NAME, retrying.getUpdateUserName(), 64)) {
            return false;
        }
        return true;
    }

    public static void validate(Retrying retrying, TCResult<?> message) {
        validateForCreate(retrying, message);
        LogicValidate.retryingValidate(retrying, message);
    }

    public static boolean validateForUpdate(Retrying retrying, TCResult<?> message) {
        if (isNull(message, Retrying.C_ID, retrying.getId())) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_BATCH_NO, retrying.getBatchNo(), 36)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_ERROR_CODE, retrying.getErrorCode(), 10)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_ERROR_MSG, retrying.getErrorMsg(), 100)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_DOING_TYPE_NAME, retrying.getDoingTypeName(), 20)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_TRADE_SCENE_NO, retrying.getTradeSceneNo(), 10)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_CREATE_USER, retrying.getCreateUser(), 64)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_CREATE_USER_NAME, retrying.getCreateUserName(), 64)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_UPDATE_USER, retrying.getUpdateUser(), 64)) {
            return false;
        }
        if (isMoreThan(message, Retrying.C_UPDATE_USER_NAME, retrying.getUpdateUserName(), 64)) {
            return false;
        }
        return true;
    }
}