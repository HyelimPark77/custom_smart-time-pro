package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class SportRecordItemData {

    /* JADX INFO: renamed from: iv */
    private final int f51320iv;

    /* JADX INFO: renamed from: tv */
    @aa1
    private final String f51321tv;

    public SportRecordItemData(@aa1 String tv, int i) {
        Intrinsics.X0O(tv, "tv");
        this.f51321tv = tv;
        this.f51320iv = i;
    }

    public final int getIv() {
        return this.f51320iv;
    }

    @aa1
    public final String getTv() {
        return this.f51321tv;
    }
}
