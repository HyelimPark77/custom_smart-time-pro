package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import com.sma.smartv3.network.AICreateJobV2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AudioItem extends JsonFieldContainer implements Serializable {

    @aa1
    private final Stream stream;

    public AudioItem(@aa1 Stream r2) {
        Intrinsics.X0O(r2, AICreateJobV2.AI_Stream);
        this.stream = r2;
    }

    public static /* synthetic */ AudioItem copy$default(AudioItem r0, Stream r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.stream;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final Stream component1() {
        return this.stream;
    }

    @aa1
    public final AudioItem copy(@aa1 Stream r2) {
        Intrinsics.X0O(r2, AICreateJobV2.AI_Stream);
        return new AudioItem(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AudioItem) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.stream, ((AudioItem) r4).stream) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final Stream getStream() {
        return this.stream;
    }

    public int hashCode() {
        return this.stream.hashCode();
    }

    @aa1
    public String toString() {
        return "AudioItem(stream=" + this.stream + I000IiI1O.iO.iO;
    }
}
