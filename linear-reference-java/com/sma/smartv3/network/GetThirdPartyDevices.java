package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetThirdPartyDevices {

    @aa1
    public static final GetThirdPartyDevices INSTANCE = null;

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/appConfigInfo/get_tp_device_listObject";

    static {
        INSTANCE = new GetThirdPartyDevices();
    }

    private GetThirdPartyDevices() {
    }
}
