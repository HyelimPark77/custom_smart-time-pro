package com.sma.smartv3.biz.voice.ai;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TimestampedAudioData {

    @aa1
    private final byte[] data;
    private final long timestamp;

    public TimestampedAudioData(@aa1 byte[] r2, long r3) {
        Intrinsics.X0O(r2, "data");
        this.data = r2;
        this.timestamp = r3;
    }

    public static /* synthetic */ TimestampedAudioData copy$default(TimestampedAudioData r0, byte[] r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.data;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.timestamp;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final byte[] component1() {
        return this.data;
    }

    public final long component2() {
        return this.timestamp;
    }

    @aa1
    public final TimestampedAudioData copy(@aa1 byte[] r2, long r3) {
        Intrinsics.X0O(r2, "data");
        return new TimestampedAudioData(r2, r3);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L5;
        return true;
    L5:
        if (r8 == null) goto L7;
        Class<?> r1 = r8.getClass();
    L9:
        if (Intrinsics.XOO0ii0(TimestampedAudioData.class, r1) == true) goto L11;
        return false;
    L11:
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.sma.smartv3.biz.voice.ai.TimestampedAudioData");
        TimestampedAudioData r9 = (TimestampedAudioData) r8;
        if (Arrays.equals(this.data, r9.data) == true) goto L15;
        return false;
    L15:
        if (this.timestamp == r9.timestamp) goto L17;
        return false;
    L17:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    @aa1
    public final byte[] getData() {
        return this.data;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.data) * 31) + Long.hashCode(this.timestamp);
    }

    @aa1
    public String toString() {
        return "TimestampedAudioData(data=" + Arrays.toString(this.data) + ", timestamp=" + this.timestamp + I000IiI1O.iO.iO;
    }
}
