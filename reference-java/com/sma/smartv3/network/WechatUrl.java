package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class WechatUrl {

    @aa1
    public static final String CHANGE_DEVICE_STATE = "/wechat/pay/changeDeviceState";

    @aa1
    public static final String GET_DEVICE_STATE = "/wechat/pay/getDeviceState";

    @aa1
    public static final String GET_PAY_MAC_ADDRESS = "/wechat/pay/getPayMacAddress";

    @aa1
    public static final WechatUrl INSTANCE = new WechatUrl();

    private WechatUrl() {
    }
}
