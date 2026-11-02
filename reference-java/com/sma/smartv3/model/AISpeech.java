package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AISpeech implements Serializable {
    private int LanguageModel;

    @aa1
    private String dst;
    private long endTime;

    @aa1
    private String lang;
    private long startTime;
    private int status;

    @aa1
    private String targetLang;

    @aa1
    private String text;

    @aa1
    private String ttsVoiceName;

    public AISpeech() {
        this(null, null, 0, 0, null, null, null, 0L, 0L, 511, null);
    }

    public static /* synthetic */ AISpeech copy$default(AISpeech aISpeech, String str, String str2, int i, int i2, String str3, String str4, String str5, long j, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = aISpeech.text;
        }
        if ((i3 & 2) != 0) {
            str2 = aISpeech.dst;
        }
        if ((i3 & 4) != 0) {
            i = aISpeech.status;
        }
        if ((i3 & 8) != 0) {
            i2 = aISpeech.LanguageModel;
        }
        if ((i3 & 16) != 0) {
            str3 = aISpeech.lang;
        }
        if ((i3 & 32) != 0) {
            str4 = aISpeech.targetLang;
        }
        if ((i3 & 64) != 0) {
            str5 = aISpeech.ttsVoiceName;
        }
        if ((i3 & 128) != 0) {
            j = aISpeech.startTime;
        }
        if ((i3 & 256) != 0) {
            j2 = aISpeech.endTime;
        }
        long j3 = j2;
        long j4 = j;
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        int i4 = i;
        return aISpeech.copy(str, str2, i4, i2, str8, str6, str7, j4, j3);
    }

    @aa1
    public final String component1() {
        return this.text;
    }

    @aa1
    public final String component2() {
        return this.dst;
    }

    public final int component3() {
        return this.status;
    }

    public final int component4() {
        return this.LanguageModel;
    }

    @aa1
    public final String component5() {
        return this.lang;
    }

    @aa1
    public final String component6() {
        return this.targetLang;
    }

    @aa1
    public final String component7() {
        return this.ttsVoiceName;
    }

    public final long component8() {
        return this.startTime;
    }

    public final long component9() {
        return this.endTime;
    }

    @aa1
    public final AISpeech copy(@aa1 String text, @aa1 String dst, int i, int i2, @aa1 String lang, @aa1 String targetLang, @aa1 String ttsVoiceName, long j, long j2) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(dst, "dst");
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        Intrinsics.X0O(ttsVoiceName, "ttsVoiceName");
        return new AISpeech(text, dst, i, i2, lang, targetLang, ttsVoiceName, j, j2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AISpeech)) {
            return false;
        }
        AISpeech aISpeech = (AISpeech) obj;
        return Intrinsics.XOO0ii0(this.text, aISpeech.text) && Intrinsics.XOO0ii0(this.dst, aISpeech.dst);
    }

    @aa1
    public final String getDst() {
        return this.dst;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @aa1
    public final String getLang() {
        return this.lang;
    }

    public final int getLanguageModel() {
        return this.LanguageModel;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @aa1
    public final String getTargetLang() {
        return this.targetLang;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    @aa1
    public final String getTtsVoiceName() {
        return this.ttsVoiceName;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.dst.hashCode();
    }

    public final void setDst(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dst = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.lang = str;
    }

    public final void setLanguageModel(int i) {
        this.LanguageModel = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTargetLang(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.targetLang = str;
    }

    public final void setText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.text = str;
    }

    public final void setTtsVoiceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsVoiceName = str;
    }

    @aa1
    public String toString() {
        return "AISpeech(text=" + this.text + ", dst=" + this.dst + ", status=" + this.status + ", LanguageModel=" + this.LanguageModel + ", lang=" + this.lang + ", targetLang=" + this.targetLang + ", ttsVoiceName=" + this.ttsVoiceName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + I000IiI1O.C2156iO.f1007iO;
    }

    public AISpeech(@aa1 String text, @aa1 String dst, int i, int i2, @aa1 String lang, @aa1 String targetLang, @aa1 String ttsVoiceName, long j, long j2) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(dst, "dst");
        Intrinsics.X0O(lang, "lang");
        Intrinsics.X0O(targetLang, "targetLang");
        Intrinsics.X0O(ttsVoiceName, "ttsVoiceName");
        this.text = text;
        this.dst = dst;
        this.status = i;
        this.LanguageModel = i2;
        this.lang = lang;
        this.targetLang = targetLang;
        this.ttsVoiceName = ttsVoiceName;
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ AISpeech(String str, String str2, int i, int i2, String str3, String str4, String str5, long j, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? 0L : j, (i3 & 256) != 0 ? 0L : j2);
    }
}
