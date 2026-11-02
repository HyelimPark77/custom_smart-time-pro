package com.sma.smartv3.biz.voice.p244ai;

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

    public TimestampedAudioData(@aa1 byte[] data, long j) {
        Intrinsics.X0O(data, "data");
        this.data = data;
        this.timestamp = j;
    }

    public static /* synthetic */ TimestampedAudioData copy$default(TimestampedAudioData timestampedAudioData, byte[] bArr, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = timestampedAudioData.data;
        }
        if ((i & 2) != 0) {
            j = timestampedAudioData.timestamp;
        }
        return timestampedAudioData.copy(bArr, j);
    }

    @aa1
    public final byte[] component1() {
        return this.data;
    }

    public final long component2() {
        return this.timestamp;
    }

    @aa1
    public final TimestampedAudioData copy(@aa1 byte[] data, long j) {
        Intrinsics.X0O(data, "data");
        return new TimestampedAudioData(data, j);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.XOO0ii0(TimestampedAudioData.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.X1ii(obj, "null cannot be cast to non-null type com.sma.smartv3.biz.voice.ai.TimestampedAudioData");
        TimestampedAudioData timestampedAudioData = (TimestampedAudioData) obj;
        return Arrays.equals(this.data, timestampedAudioData.data) && this.timestamp == timestampedAudioData.timestamp;
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
        return "TimestampedAudioData(data=" + Arrays.toString(this.data) + ", timestamp=" + this.timestamp + I000IiI1O.C2156iO.f1007iO;
    }
}
