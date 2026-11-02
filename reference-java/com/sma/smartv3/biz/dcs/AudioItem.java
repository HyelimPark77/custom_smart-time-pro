package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AudioItem extends JsonFieldContainer implements Serializable {

    @aa1
    private final Stream stream;

    public AudioItem(@aa1 Stream stream) {
        Intrinsics.X0O(stream, "stream");
        this.stream = stream;
    }

    public static /* synthetic */ AudioItem copy$default(AudioItem audioItem, Stream stream, int i, Object obj) {
        if ((i & 1) != 0) {
            stream = audioItem.stream;
        }
        return audioItem.copy(stream);
    }

    @aa1
    public final Stream component1() {
        return this.stream;
    }

    @aa1
    public final AudioItem copy(@aa1 Stream stream) {
        Intrinsics.X0O(stream, "stream");
        return new AudioItem(stream);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioItem) && Intrinsics.XOO0ii0(this.stream, ((AudioItem) obj).stream);
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
        return "AudioItem(stream=" + this.stream + I000IiI1O.C2156iO.f1007iO;
    }
}
