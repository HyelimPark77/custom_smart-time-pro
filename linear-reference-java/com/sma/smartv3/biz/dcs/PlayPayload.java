package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PlayPayload extends JsonFieldContainer implements Serializable {

    @aa1
    private final AudioItem audioItem;

    public PlayPayload(@aa1 AudioItem r2) {
        Intrinsics.X0O(r2, "audioItem");
        this.audioItem = r2;
    }

    public static /* synthetic */ PlayPayload copy$default(PlayPayload r0, AudioItem r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.audioItem;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final AudioItem component1() {
        return this.audioItem;
    }

    @aa1
    public final PlayPayload copy(@aa1 AudioItem r2) {
        Intrinsics.X0O(r2, "audioItem");
        return new PlayPayload(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof PlayPayload) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.audioItem, ((PlayPayload) r4).audioItem) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final AudioItem getAudioItem() {
        return this.audioItem;
    }

    public int hashCode() {
        return this.audioItem.hashCode();
    }

    @aa1
    public String toString() {
        return "PlayPayload(audioItem=" + this.audioItem + I000IiI1O.iO.iO;
    }
}
