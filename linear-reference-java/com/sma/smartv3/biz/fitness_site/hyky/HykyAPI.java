package com.sma.smartv3.biz.fitness_site.hyky;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.oe5;
import com.sma.smartv3.network.Api;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class HykyAPI {

    @aa1
    private static final String BASE_URL_HYKY = null;
    public static final int DeviceType = 592044;

    @aa1
    public static final HykyAPI INSTANCE = null;

    static {
        INSTANCE = new HykyAPI();
        BASE_URL_HYKY = oe5.IXO0OOi(Api.INSTANCE.getBASE_URL(), "/kotlinweb", "/ky-api", false, 4, null);
    }

    private HykyAPI() {
    }

    @aa1
    public final String getBASE_URL_HYKY() {
        return BASE_URL_HYKY;
    }
}
