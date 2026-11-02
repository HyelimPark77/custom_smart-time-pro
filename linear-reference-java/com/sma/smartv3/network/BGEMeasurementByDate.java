package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMeasurementByDate {

    @aa1
    public static final BGEMeasurementByDate INSTANCE = null;

    @aa1
    public static final String URL = "/glicemia/measurement";

    static {
        INSTANCE = new BGEMeasurementByDate();
    }

    private BGEMeasurementByDate() {
    }

    @aa1
    public final String getURL(@aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "startDate");
        Intrinsics.X0O(r4, "endDate");
        return "/glicemia/measurement?startDate=" + r3 + "&endDate=" + r4;
    }
}
