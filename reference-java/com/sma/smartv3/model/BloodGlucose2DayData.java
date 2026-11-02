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
        this(0, 0, null, 7, null);
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

    public BloodGlucose2DayData(int i, int i2, @aa1 String status) {
        Intrinsics.X0O(status, "status");
        this.max = i;
        this.min = i2;
        this.status = status;
    }

    public /* synthetic */ BloodGlucose2DayData(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str);
    }
}
