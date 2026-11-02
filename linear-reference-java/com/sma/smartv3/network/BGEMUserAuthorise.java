package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMUserAuthorise {

    @aa1
    public static final String AGE = "age";

    @aa1
    public static final String FAMILY_HISTORY = "family_history";

    @aa1
    public static final String GENDER = "gender";

    @aa1
    public static final String HEIGHT = "height";

    @aa1
    public static final String HIGH_CHOLESTEROL = "high_cholesterol";

    @aa1
    public static final BGEMUserAuthorise INSTANCE = null;

    @aa1
    public static final String URL = "/glicemia/user/authorise";

    @aa1
    public static final String WEIGHT = "weight";

    static {
        INSTANCE = new BGEMUserAuthorise();
    }

    private BGEMUserAuthorise() {
    }
}
