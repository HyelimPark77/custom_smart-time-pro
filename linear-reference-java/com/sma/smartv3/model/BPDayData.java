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
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
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

    public final void setDbpMax(int r1) {
        this.dbpMax = r1;
    }

    public final void setDbpMin(int r1) {
        this.dbpMin = r1;
    }

    public final void setSbpMax(int r1) {
        this.sbpMax = r1;
    }

    public final void setSbpMin(int r1) {
        this.sbpMin = r1;
    }

    public final void setStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    public BPDayData(int r2, int r3, int r4, int r5, @aa1 String r6) {
        Intrinsics.X0O(r6, "status");
        this.dbpMax = r2;
        this.dbpMin = r3;
        this.sbpMax = r4;
        this.sbpMin = r5;
        this.status = r6;
    }

    public /* synthetic */ BPDayData(int r2, int r3, int r4, int r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L17:
        String r9 = r6;
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
    }
}
