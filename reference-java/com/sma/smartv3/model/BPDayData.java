package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BPDayData {
    private int dbpMax;
    private int dbpMin;
    private int sbpMax;
    private int sbpMin;

    @aa1
    private String status;

    public BPDayData() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public final int getDbpMax() {
        return this.dbpMax;
    }

    public final int getDbpMin() {
        return this.dbpMin;
    }

    public final int getSbpMax() {
        return this.sbpMax;
    }

    public final int getSbpMin() {
        return this.sbpMin;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public final void setDbpMax(int i) {
        this.dbpMax = i;
    }

    public final void setDbpMin(int i) {
        this.dbpMin = i;
    }

    public final void setSbpMax(int i) {
        this.sbpMax = i;
    }

    public final void setSbpMin(int i) {
        this.sbpMin = i;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    public BPDayData(int i, int i2, int i3, int i4, @aa1 String status) {
        Intrinsics.X0O(status, "status");
        this.dbpMax = i;
        this.dbpMin = i2;
        this.sbpMax = i3;
        this.sbpMin = i4;
        this.status = status;
    }

    public /* synthetic */ BPDayData(int i, int i2, int i3, int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : str);
    }
}
