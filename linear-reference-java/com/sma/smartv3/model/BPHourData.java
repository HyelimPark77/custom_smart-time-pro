package com.sma.smartv3.model;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class BPHourData {
    private int dbpMax;
    private int dbpMin;
    private int dbpNum;
    private int dbpTotal;
    private int sbpMax;
    private int sbpMin;
    private int sbpNum;
    private int sbpTotal;

    public BPHourData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public final int getDbpMax() {
        return this.dbpMax;
    }

    public final int getDbpMin() {
        return this.dbpMin;
    }

    public final int getDbpNum() {
        return this.dbpNum;
    }

    public final int getDbpTotal() {
        return this.dbpTotal;
    }

    public final int getSbpMax() {
        return this.sbpMax;
    }

    public final int getSbpMin() {
        return this.sbpMin;
    }

    public final int getSbpNum() {
        return this.sbpNum;
    }

    public final int getSbpTotal() {
        return this.sbpTotal;
    }

    public final void setDbpMax(int r1) {
        this.dbpMax = r1;
    }

    public final void setDbpMin(int r1) {
        this.dbpMin = r1;
    }

    public final void setDbpNum(int r1) {
        this.dbpNum = r1;
    }

    public final void setDbpTotal(int r1) {
        this.dbpTotal = r1;
    }

    public final void setSbpMax(int r1) {
        this.sbpMax = r1;
    }

    public final void setSbpMin(int r1) {
        this.sbpMin = r1;
    }

    public final void setSbpNum(int r1) {
        this.sbpNum = r1;
    }

    public final void setSbpTotal(int r1) {
        this.sbpTotal = r1;
    }

    public BPHourData(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8) {
        this.dbpMax = r1;
        this.dbpMin = r2;
        this.dbpTotal = r3;
        this.dbpNum = r4;
        this.sbpMax = r5;
        this.sbpMin = r6;
        this.sbpTotal = r7;
        this.sbpNum = r8;
    }

    public /* synthetic */ BPHourData(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r10 & 128) == 0) goto L27;
        int r12 = 0;
    L26:
        int r13 = r8;
        int r14 = r7;
        int r15 = r6;
        int r16 = r5;
        int r17 = r4;
        this(r2, r3, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
