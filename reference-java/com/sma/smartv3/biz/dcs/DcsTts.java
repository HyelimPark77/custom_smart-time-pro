package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DcsTts extends JsonFieldContainer implements Serializable {

    @aa1
    private final String logid;

    @aa1
    private final String text;

    @aa1
    private final String tts_optional;

    public DcsTts(@aa1 String logid, @aa1 String text, @aa1 String tts_optional) {
        Intrinsics.X0O(logid, "logid");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(tts_optional, "tts_optional");
        this.logid = logid;
        this.text = text;
        this.tts_optional = tts_optional;
    }

    public static /* synthetic */ DcsTts copy$default(DcsTts dcsTts, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsTts.logid;
        }
        if ((i & 2) != 0) {
            str2 = dcsTts.text;
        }
        if ((i & 4) != 0) {
            str3 = dcsTts.tts_optional;
        }
        return dcsTts.copy(str, str2, str3);
    }

    @aa1
    public final String component1() {
        return this.logid;
    }

    @aa1
    public final String component2() {
        return this.text;
    }

    @aa1
    public final String component3() {
        return this.tts_optional;
    }

    @aa1
    public final DcsTts copy(@aa1 String logid, @aa1 String text, @aa1 String tts_optional) {
        Intrinsics.X0O(logid, "logid");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(tts_optional, "tts_optional");
        return new DcsTts(logid, text, tts_optional);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsTts)) {
            return false;
        }
        DcsTts dcsTts = (DcsTts) obj;
        return Intrinsics.XOO0ii0(this.logid, dcsTts.logid) && Intrinsics.XOO0ii0(this.text, dcsTts.text) && Intrinsics.XOO0ii0(this.tts_optional, dcsTts.tts_optional);
    }

    @aa1
    public final String getLogid() {
        return this.logid;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getTts_optional() {
        return this.tts_optional;
    }

    public int hashCode() {
        return (((this.logid.hashCode() * 31) + this.text.hashCode()) * 31) + this.tts_optional.hashCode();
    }

    @aa1
    public String toString() {
        return "DcsTts(logid=" + this.logid + ", text=" + this.text + ", tts_optional=" + this.tts_optional + I000IiI1O.C2156iO.f1007iO;
    }
}
