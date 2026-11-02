package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMeasurementById {

    @aa1
    public static final BGEMeasurementById INSTANCE = null;

    @aa1
    public static final String URL = "/glicemia/measurement";

    static {
        INSTANCE = new BGEMeasurementById();
    }

    private BGEMeasurementById() {
    }

    @aa1
    public final String getURL(@aa1 String r3) {
        Intrinsics.X0O(r3, "measurementId");
        return "/glicemia/measurement/" + r3;
    }
}
