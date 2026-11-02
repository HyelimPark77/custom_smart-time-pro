package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetDeviceList {

    @aa1
    public static final GetDeviceList INSTANCE = null;

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/appConfigInfo/get_device_list";

    static {
        INSTANCE = new GetDeviceList();
    }

    private GetDeviceList() {
    }
}
