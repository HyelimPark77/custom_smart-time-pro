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

    public LanguageTranslationData(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, boolean r6, int r7, @aa1 String r8, int r9) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "asrLanguage");
        Intrinsics.X0O(r4, "rtasrLanguage");
        Intrinsics.X0O(r5, "ttsViuceName");
        Intrinsics.X0O(r8, "accent");
        this.name = r2;
        this.asrLanguage = r3;
        this.rtasrLanguage = r4;
        this.ttsViuceName = r5;
        this.isSupportTransfer = r6;
        this.code = r7;
        this.accent = r8;
        this.type = r9;
        if (Intrinsics.XOO0ii0(r4, "cn") == false) goto L5;
        int r10 = Languages.INSTANCE.languageBriefToCode(Languages.DEFAULT_LANGUAGE_ZH, 10000);
    L6:
        this.code = r10;
        return;
    L5:
        r10 = Languages.INSTANCE.languageBriefToCode(this.rtasrLanguage, 10000);
        goto L6
    }

    public static /* synthetic */ LanguageTranslationData copy$default(LanguageTranslationData r0, String r1, String r2, String r3, String r4, boolean r5, int r6, String r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.asrLanguage;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.rtasrLanguage;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.ttsViuceName;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.isSupportTransfer;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.code;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.accent;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.type;
    L26:
        String r11 = r7;
        int r12 = r8;
        boolean r13 = r5;
        int r14 = r6;
        String r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
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
    public final LanguageTranslationData copy(@aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, boolean r15, int r16, @aa1 String r17, int r18) {
        Intrinsics.X0O(r11, "name");
        Intrinsics.X0O(r12, "asrLanguage");
        Intrinsics.X0O(r13, "rtasrLanguage");
        Intrinsics.X0O(r14, "ttsViuceName");
        Intrinsics.X0O(r17, "accent");
        return new LanguageTranslationData(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LanguageTranslationData) == true) goto L8;
        return false;
    L8:
        LanguageTranslationData r6 = (LanguageTranslationData) r5;
        if (Intrinsics.XOO0ii0(this.name, r6.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.asrLanguage, r6.asrLanguage) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.rtasrLanguage, r6.rtasrLanguage) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.ttsViuceName, r6.ttsViuceName) == true) goto L21;
        return false;
    L21:
        if (this.isSupportTransfer == r6.isSupportTransfer) goto L24;
        return false;
    L24:
        if (this.code == r6.code) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.accent, r6.accent) == true) goto L30;
        return false;
    L30:
        if (this.type == r6.type) goto L32;
        return false;
    L32:
        return true;
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

    public final void setAccent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.accent = r2;
    }

    public final void setAsrLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.asrLanguage = r2;
    }

    public final void setCode(int r1) {
        this.code = r1;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setRtasrLanguage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.rtasrLanguage = r2;
    }

    public final void setSupportTransfer(boolean r1) {
        this.isSupportTransfer = r1;
    }

    public final void setTtsViuceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsViuceName = r2;
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    @aa1
    public String toString() {
        return "LanguageTranslationData(name=" + this.name + ", asrLanguage=" + this.asrLanguage + ", rtasrLanguage=" + this.rtasrLanguage + ", ttsViuceName=" + this.ttsViuceName + ", isSupportTransfer=" + this.isSupportTransfer + ", code=" + this.code + ", accent=" + this.accent + ", type=" + this.type + I000IiI1O.iO.iO;
    }

    public /* synthetic */ LanguageTranslationData(String r9, String r10, String r11, String r12, boolean r13, int r14, String r15, int r16, int r17, DefaultConstructorMarker r18) {
        if ((r17 & 2) == 0) goto L5;
        String r1 = "zh-cn";
    L7:
        if ((r17 & 4) == 0) goto L9;
        String r2 = "cn";
    L11:
        if ((r17 & 8) == 0) goto L13;
        String r3 = "x4_enus_catherine_profnews";
    L15:
        if ((r17 & 16) == 0) goto L17;
        boolean r4 = false;
    L19:
        if ((r17 & 32) == 0) goto L21;
        int r6 = 10000;
    L23:
        if ((r17 & 64) == 0) goto L25;
        String r7 = "mandarin";
    L27:
        if ((r17 & 128) == 0) goto L30;
        int r19 = 0;
    L31:
        this(r9, r1, r2, r3, r4, r6, r7, r19);
        return;
    L30:
        r19 = r16;
        goto L31
    L25:
        r7 = r15;
        goto L27
    L21:
        r6 = r14;
        goto L23
    L17:
        r4 = r13;
        goto L19
    L13:
        r3 = r12;
        goto L15
    L9:
        r2 = r11;
        goto L11
    L5:
        r1 = r10;
        goto L7
    }
}
