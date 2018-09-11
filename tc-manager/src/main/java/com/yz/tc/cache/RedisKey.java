package com.yz.tc.cache;

import com.yz.tc.constant.RedisConsts;

/**
 * @author yazhong
 */
public class RedisKey {
    public static String getCacheKey(Long keyUnique) {
        if (keyUnique == null || keyUnique.intValue() <= 0) {
            return "";
        }
        StringBuilder sbBuilder = new StringBuilder(50);
        sbBuilder.append(RedisConsts.TC_PREFIX);
        sbBuilder.append(keyUnique);
        return sbBuilder.toString();
    }
}
