package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BloodGlucose2DayData {
    private int max;
    private int min;

    @aa1
    private String status;

    public BloodGlucose2DayData() {
        int r1 = 0;
        int r2 = 0;
        String r3 = null;
        this(r1, r2, r3, 7, null);
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

    public BloodGlucose2DayData(int r2, int r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "status");
        this.max = r2;
        this.min = r3;
        this.status = r4;
    }

    public /* synthetic */ BloodGlucose2DayData(int r2, int r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L11:
        this(r2, r3, r4);
    }
}
