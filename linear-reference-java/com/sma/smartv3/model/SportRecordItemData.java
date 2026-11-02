package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class SportRecordItemData {
    private final int iv;

    @aa1
    private final String tv;

    public SportRecordItemData(@aa1 String r2, int r3) {
        Intrinsics.X0O(r2, "tv");
        this.tv = r2;
        this.iv = r3;
    }

    public final int getIv() {
        return this.iv;
    }

    @aa1
    public final String getTv() {
        return this.tv;
    }
}
