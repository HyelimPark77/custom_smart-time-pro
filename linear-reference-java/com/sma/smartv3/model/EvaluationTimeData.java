package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class EvaluationTimeData {
    private long clickTime;
    private boolean noShowPop;
    private final long time;
    private final int versionCode;

    public EvaluationTimeData() {
        long r1 = 0;
        int r3 = 0;
        long r4 = 0;
        boolean r6 = false;
        this(r1, r3, r4, r6, 15, null);
    }

    public static /* synthetic */ EvaluationTimeData copy$default(EvaluationTimeData r7, long r8, int r10, long r11, boolean r13, int r14, Object r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = r7.time;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        r10 = r7.versionCode;
    L8:
        int r3 = r10;
        if ((r14 & 4) == 0) goto L11;
        r11 = r7.clickTime;
    L11:
        long r4 = r11;
        if ((r14 & 8) == 0) goto L15;
        r13 = r7.noShowPop;
    L15:
        return r7.copy(r1, r3, r4, r13);
    }

    public final long component1() {
        return this.time;
    }

    public final int component2() {
        return this.versionCode;
    }

    public final long component3() {
        return this.clickTime;
    }

    public final boolean component4() {
        return this.noShowPop;
    }

    @aa1
    public final EvaluationTimeData copy(long r8, int r10, long r11, boolean r13) {
        return new EvaluationTimeData(r8, r10, r11, r13);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof EvaluationTimeData) == true) goto L8;
        return false;
    L8:
        EvaluationTimeData r9 = (EvaluationTimeData) r8;
        if (this.time == r9.time) goto L12;
        return false;
    L12:
        if (this.versionCode == r9.versionCode) goto L15;
        return false;
    L15:
        if (this.clickTime == r9.clickTime) goto L18;
        return false;
    L18:
        if (this.noShowPop == r9.noShowPop) goto L20;
        return false;
    L20:
        return true;
    }

    public final long getClickTime() {
        return this.clickTime;
    }

    public final boolean getNoShowPop() {
        return this.noShowPop;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.time) * 31) + Integer.hashCode(this.versionCode)) * 31) + Long.hashCode(this.clickTime)) * 31) + Boolean.hashCode(this.noShowPop);
    }

    public final void setClickTime(long r1) {
        this.clickTime = r1;
    }

    public final void setNoShowPop(boolean r1) {
        this.noShowPop = r1;
    }

    @aa1
    public String toString() {
        return "EvaluationTimeData(time=" + this.time + ", versionCode=" + this.versionCode + ", clickTime=" + this.clickTime + ", noShowPop=" + this.noShowPop + I000IiI1O.iO.iO;
    }

    public EvaluationTimeData(long r1, int r3, long r4, boolean r6) {
        this.time = r1;
        this.versionCode = r3;
        this.clickTime = r4;
        this.noShowPop = r6;
    }

    public /* synthetic */ EvaluationTimeData(long r4, int r6, long r7, boolean r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r4 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r6 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r7 = 0;
    L12:
        if ((r10 & 8) == 0) goto L15;
        boolean r12 = false;
    L16:
        this(r4, r6, r7, r12);
        return;
    L15:
        r12 = r9;
        goto L16
    }
}
