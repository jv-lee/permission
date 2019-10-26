package com.lee.permission.core;

/**
 * @author jv.lee
 * @date 2019-10-19
 * @description 授权回调接口
 */
public interface IPermission {

    /**
     * 已授权
     */
    void granted();

    /**
     * 取消授权
     */
    void cancel();

    /**
     * 拒绝授权
     */
    void denied();
}
