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
        this(0L, 0, 0L, false, 15, null);
    }

    public static /* synthetic */ EvaluationTimeData copy$default(EvaluationTimeData evaluationTimeData, long j, int i, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = evaluationTimeData.time;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = evaluationTimeData.versionCode;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = evaluationTimeData.clickTime;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            z = evaluationTimeData.noShowPop;
        }
        return evaluationTimeData.copy(j3, i3, j4, z);
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
    public final EvaluationTimeData copy(long j, int i, long j2, boolean z) {
        return new EvaluationTimeData(j, i, j2, z);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationTimeData)) {
            return false;
        }
        EvaluationTimeData evaluationTimeData = (EvaluationTimeData) obj;
        return this.time == evaluationTimeData.time && this.versionCode == evaluationTimeData.versionCode && this.clickTime == evaluationTimeData.clickTime && this.noShowPop == evaluationTimeData.noShowPop;
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

    public final void setClickTime(long j) {
        this.clickTime = j;
    }

    public final void setNoShowPop(boolean z) {
        this.noShowPop = z;
    }

    @aa1
    public String toString() {
        return "EvaluationTimeData(time=" + this.time + ", versionCode=" + this.versionCode + ", clickTime=" + this.clickTime + ", noShowPop=" + this.noShowPop + I000IiI1O.C2156iO.f1007iO;
    }

    public EvaluationTimeData(long j, int i, long j2, boolean z) {
        this.time = j;
        this.versionCode = i;
        this.clickTime = j2;
        this.noShowPop = z;
    }

    public /* synthetic */ EvaluationTimeData(long j, int i, long j2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? 0L : j2, (i2 & 8) != 0 ? false : z);
    }
}
