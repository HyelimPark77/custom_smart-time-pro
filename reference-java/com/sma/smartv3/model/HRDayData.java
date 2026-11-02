package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class HRDayData {
    private int avg;
    private int max;
    private int min;

    @aa1
    private String status;

    public HRDayData() {
        this(0, 0, 0, null, 15, null);
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

    public final void setAvg(int i) {
        this.avg = i;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    public HRDayData(int i, int i2, int i3, @aa1 String status) {
        Intrinsics.X0O(status, "status");
        this.max = i;
        this.min = i2;
        this.avg = i3;
        this.status = status;
    }

    public /* synthetic */ HRDayData(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str);
    }
}
