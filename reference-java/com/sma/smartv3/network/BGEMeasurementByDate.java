package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMeasurementByDate {

    @aa1
    public static final BGEMeasurementByDate INSTANCE = new BGEMeasurementByDate();

    @aa1
    public static final String URL = "/glicemia/measurement";

    private BGEMeasurementByDate() {
    }

    @aa1
    public final String getURL(@aa1 String startDate, @aa1 String endDate) {
        Intrinsics.X0O(startDate, "startDate");
        Intrinsics.X0O(endDate, "endDate");
        return "/glicemia/measurement?startDate=" + startDate + "&endDate=" + endDate;
    }
}
