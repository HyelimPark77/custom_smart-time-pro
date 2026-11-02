package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PressureDayData {
    private int avg;
    private int max;
    private int min;

    @aa1
    private String status;

    public PressureDayData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public final void setAvg(int r1) {
        this.avg = r1;
    }

    public final void setMax(int r1) {
        this.max = r1;
    }

    public final void setMin(int r1) {
        this.min = r1;
    }

    public final void setStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    public PressureDayData(int r2, int r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r5, "status");
        this.max = r2;
        this.min = r3;
        this.avg = r4;
        this.status = r5;
    }

    public /* synthetic */ PressureDayData(int r2, int r3, int r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L14:
        this(r2, r3, r4, r5);
    }
}
