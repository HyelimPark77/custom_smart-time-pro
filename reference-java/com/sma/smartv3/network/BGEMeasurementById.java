package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMeasurementById {

    @aa1
    public static final BGEMeasurementById INSTANCE = new BGEMeasurementById();

    @aa1
    public static final String URL = "/glicemia/measurement";

    private BGEMeasurementById() {
    }

    @aa1
    public final String getURL(@aa1 String measurementId) {
        Intrinsics.X0O(measurementId, "measurementId");
        return "/glicemia/measurement/" + measurementId;
    }
}
