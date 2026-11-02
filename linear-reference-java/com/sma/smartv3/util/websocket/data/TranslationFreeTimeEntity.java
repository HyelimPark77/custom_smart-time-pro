package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class TranslationFreeTimeEntity {

    @aa1
    private final String expireTime;
    private final float remainDuration;
    private final float totalDuration;

    public TranslationFreeTimeEntity() {
        float r1 = 0.0f;
        float r2 = 0.0f;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ TranslationFreeTimeEntity copy$default(TranslationFreeTimeEntity r0, float r1, float r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.totalDuration;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.remainDuration;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.expireTime;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final float component1() {
        return this.totalDuration;
    }

    public final float component2() {
        return this.remainDuration;
    }

    @aa1
    public final String component3() {
        return this.expireTime;
    }

    @aa1
    public final TranslationFreeTimeEntity copy(float r2, float r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "expireTime");
        return new TranslationFreeTimeEntity(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TranslationFreeTimeEntity) == true) goto L8;
        return false;
    L8:
        TranslationFreeTimeEntity r6 = (TranslationFreeTimeEntity) r5;
        if (Float.compare(this.totalDuration, r6.totalDuration) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.remainDuration, r6.remainDuration) == 0) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.expireTime, r6.expireTime) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getExpireTime() {
        return this.expireTime;
    }

    public final float getRemainDuration() {
        return this.remainDuration;
    }

    public final float getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (((Float.hashCode(this.totalDuration) * 31) + Float.hashCode(this.remainDuration)) * 31) + this.expireTime.hashCode();
    }

    @aa1
    public String toString() {
        return "TranslationFreeTimeEntity(totalDuration=" + this.totalDuration + ", remainDuration=" + this.remainDuration + ", expireTime=" + this.expireTime + I000IiI1O.iO.iO;
    }

    public TranslationFreeTimeEntity(float r2, float r3, @aa1 String r4) {
        Intrinsics.X0O(r4, "expireTime");
        this.totalDuration = r2;
        this.remainDuration = r3;
        this.expireTime = r4;
    }

    public /* synthetic */ TranslationFreeTimeEntity(float r2, float r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0.0f;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
