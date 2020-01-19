package com.yz.tc.constant;

/**
 * @author yazhong
 */
public abstract class RedisConsts {
    private RedisConsts(){}

    public static final String REDIS_DELIMETER = ":";
    public static final String LOCK = "lock:";
    public static final String TC_PREFIX = "tc:";
}
