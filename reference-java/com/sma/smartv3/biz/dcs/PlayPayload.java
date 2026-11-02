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

    public PlayPayload(@aa1 AudioItem audioItem) {
        Intrinsics.X0O(audioItem, "audioItem");
        this.audioItem = audioItem;
    }

    public static /* synthetic */ PlayPayload copy$default(PlayPayload playPayload, AudioItem audioItem, int i, Object obj) {
        if ((i & 1) != 0) {
            audioItem = playPayload.audioItem;
        }
        return playPayload.copy(audioItem);
    }

    @aa1
    public final AudioItem component1() {
        return this.audioItem;
    }

    @aa1
    public final PlayPayload copy(@aa1 AudioItem audioItem) {
        Intrinsics.X0O(audioItem, "audioItem");
        return new PlayPayload(audioItem);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayPayload) && Intrinsics.XOO0ii0(this.audioItem, ((PlayPayload) obj).audioItem);
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
        return "PlayPayload(audioItem=" + this.audioItem + I000IiI1O.C2156iO.f1007iO;
    }
}
