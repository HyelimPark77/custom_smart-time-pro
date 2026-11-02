package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.entity.Languages;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LanguageTranslationData extends JsonFieldContainer implements Serializable {

    @aa1
    private String accent;

    @aa1
    private String asrLanguage;
    private int code;
    private boolean isSupportTransfer;

    @aa1
    private String name;

    @aa1
    private String rtasrLanguage;

    @aa1
    private String ttsViuceName;
    private int type;

    public LanguageTranslationData(@aa1 String name, @aa1 String asrLanguage, @aa1 String rtasrLanguage, @aa1 String ttsViuceName, boolean z, int i, @aa1 String accent, int i2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(asrLanguage, "asrLanguage");
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        Intrinsics.X0O(ttsViuceName, "ttsViuceName");
        Intrinsics.X0O(accent, "accent");
        this.name = name;
        this.asrLanguage = asrLanguage;
        this.rtasrLanguage = rtasrLanguage;
        this.ttsViuceName = ttsViuceName;
        this.isSupportTransfer = z;
        this.code = i;
        this.accent = accent;
        this.type = i2;
        this.code = Intrinsics.XOO0ii0(rtasrLanguage, "cn") ? Languages.INSTANCE.languageBriefToCode(Languages.DEFAULT_LANGUAGE_ZH, 10000) : Languages.INSTANCE.languageBriefToCode(this.rtasrLanguage, 10000);
    }

    public static /* synthetic */ LanguageTranslationData copy$default(LanguageTranslationData languageTranslationData, String str, String str2, String str3, String str4, boolean z, int i, String str5, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = languageTranslationData.name;
        }
        if ((i3 & 2) != 0) {
            str2 = languageTranslationData.asrLanguage;
        }
        if ((i3 & 4) != 0) {
            str3 = languageTranslationData.rtasrLanguage;
        }
        if ((i3 & 8) != 0) {
            str4 = languageTranslationData.ttsViuceName;
        }
        if ((i3 & 16) != 0) {
            z = languageTranslationData.isSupportTransfer;
        }
        if ((i3 & 32) != 0) {
            i = languageTranslationData.code;
        }
        if ((i3 & 64) != 0) {
            str5 = languageTranslationData.accent;
        }
        if ((i3 & 128) != 0) {
            i2 = languageTranslationData.type;
        }
        String str6 = str5;
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        return languageTranslationData.copy(str, str2, str3, str4, z2, i5, str6, i4);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    @aa1
    public final String component2() {
        return this.asrLanguage;
    }

    @aa1
    public final String component3() {
        return this.rtasrLanguage;
    }

    @aa1
    public final String component4() {
        return this.ttsViuceName;
    }

    public final boolean component5() {
        return this.isSupportTransfer;
    }

    public final int component6() {
        return this.code;
    }

    @aa1
    public final String component7() {
        return this.accent;
    }

    public final int component8() {
        return this.type;
    }

    @aa1
    public final LanguageTranslationData copy(@aa1 String name, @aa1 String asrLanguage, @aa1 String rtasrLanguage, @aa1 String ttsViuceName, boolean z, int i, @aa1 String accent, int i2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(asrLanguage, "asrLanguage");
        Intrinsics.X0O(rtasrLanguage, "rtasrLanguage");
        Intrinsics.X0O(ttsViuceName, "ttsViuceName");
        Intrinsics.X0O(accent, "accent");
        return new LanguageTranslationData(name, asrLanguage, rtasrLanguage, ttsViuceName, z, i, accent, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageTranslationData)) {
            return false;
        }
        LanguageTranslationData languageTranslationData = (LanguageTranslationData) obj;
        return Intrinsics.XOO0ii0(this.name, languageTranslationData.name) && Intrinsics.XOO0ii0(this.asrLanguage, languageTranslationData.asrLanguage) && Intrinsics.XOO0ii0(this.rtasrLanguage, languageTranslationData.rtasrLanguage) && Intrinsics.XOO0ii0(this.ttsViuceName, languageTranslationData.ttsViuceName) && this.isSupportTransfer == languageTranslationData.isSupportTransfer && this.code == languageTranslationData.code && Intrinsics.XOO0ii0(this.accent, languageTranslationData.accent) && this.type == languageTranslationData.type;
    }

    @aa1
    public final String getAccent() {
        return this.accent;
    }

    @aa1
    public final String getAsrLanguage() {
        return this.asrLanguage;
    }

    public final int getCode() {
        return this.code;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    @aa1
    public final String getRtasrLanguage() {
        return this.rtasrLanguage;
    }

    @aa1
    public final String getTtsViuceName() {
        return this.ttsViuceName;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.asrLanguage.hashCode()) * 31) + this.rtasrLanguage.hashCode()) * 31) + this.ttsViuceName.hashCode()) * 31) + Boolean.hashCode(this.isSupportTransfer)) * 31) + Integer.hashCode(this.code)) * 31) + this.accent.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final boolean isSupportTransfer() {
        return this.isSupportTransfer;
    }

    public final void setAccent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.accent = str;
    }

    public final void setAsrLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.asrLanguage = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setRtasrLanguage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.rtasrLanguage = str;
    }

    public final void setSupportTransfer(boolean z) {
        this.isSupportTransfer = z;
    }

    public final void setTtsViuceName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.ttsViuceName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @aa1
    public String toString() {
        return "LanguageTranslationData(name=" + this.name + ", asrLanguage=" + this.asrLanguage + ", rtasrLanguage=" + this.rtasrLanguage + ", ttsViuceName=" + this.ttsViuceName + ", isSupportTransfer=" + this.isSupportTransfer + ", code=" + this.code + ", accent=" + this.accent + ", type=" + this.type + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ LanguageTranslationData(String str, String str2, String str3, String str4, boolean z, int i, String str5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? "zh-cn" : str2, (i3 & 4) != 0 ? "cn" : str3, (i3 & 8) != 0 ? "x4_enus_catherine_profnews" : str4, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 10000 : i, (i3 & 64) != 0 ? "mandarin" : str5, (i3 & 128) != 0 ? 0 : i2);
    }
}
