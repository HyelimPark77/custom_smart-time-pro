package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Q6;
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
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        long r8 = 0;
        long r10 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r10, 511, null);
    }

    public static /* synthetic */ AISpeech copy$default(AISpeech r0, String r1, String r2, int r3, int r4, String r5, String r6, String r7, long r8, long r10, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.dst;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.status;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.LanguageModel;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.lang;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.targetLang;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.ttsVoiceName;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.startTime;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r10 = r0.endTime;
    L29:
        long r14 = r10;
        long r11 = r8;
        String r9 = r6;
        String r15 = r7;
        int r16 = r4;
        String r17 = r5;
        int r18 = r3;
        String r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r9, r15, r11, r14);
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
    public final AISpeech copy(@aa1 String r14, @aa1 String r15, int r16, int r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, long r21, long r23) {
        Intrinsics.X0O(r14, "text");
        Intrinsics.X0O(r15, "dst");
        Intrinsics.X0O(r18, Q6.q);
        Intrinsics.X0O(r19, "targetLang");
        Intrinsics.X0O(r20, "ttsVoiceName");
        return new AISpeech(r14, r15, r16, r17, r18, r19, r20, r21, r23);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AISpeech) == true) goto L8;
        return false;
    L8:
        AISpeech r6 = (AISpeech) r5;
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L11;
    L13:
        return false;
    L11:
        if (Intrinsics.XOO0ii0(this.dst, r6.dst) == false) goto L13;
        return true;
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

    public final void setDst(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dst = r2;
    }

    public final void setEndTime(long r1) {
        this.endTime = r1;
    }

    public final void setLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.lang = r2;
    }

    public final void setLanguageModel(int r1) {
        this.LanguageModel = r1;
    }

    public final void setStartTime(long r1) {
        this.startTime = r1;
    }

    public final void setStatus(int r1) {
        this.status = r1;
    }

    public final void setTargetLang(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.targetLang = r2;
    }

    public final void setText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.text = r2;
    }

    public final void setTtsVoiceName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.ttsVoiceName = r2;
    }

    @aa1
    public String toString() {
        return "AISpeech(text=" + this.text + ", dst=" + this.dst + ", status=" + this.status + ", LanguageModel=" + this.LanguageModel + ", lang=" + this.lang + ", targetLang=" + this.targetLang + ", ttsVoiceName=" + this.ttsVoiceName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + I000IiI1O.iO.iO;
    }

    public AISpeech(@aa1 String r2, @aa1 String r3, int r4, int r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, long r9, long r11) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, "dst");
        Intrinsics.X0O(r6, Q6.q);
        Intrinsics.X0O(r7, "targetLang");
        Intrinsics.X0O(r8, "ttsVoiceName");
        this.text = r2;
        this.dst = r3;
        this.status = r4;
        this.LanguageModel = r5;
        this.lang = r6;
        this.targetLang = r7;
        this.ttsVoiceName = r8;
        this.startTime = r9;
        this.endTime = r11;
    }

    public /* synthetic */ AISpeech(String r3, String r4, int r5, int r6, String r7, String r8, String r9, long r10, long r12, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r14 & 128) == 0) goto L27;
        r10 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        long r13 = 0;
    L29:
        long r11 = r10;
        String r16 = r9;
        String r17 = r8;
        String r18 = r7;
        int r19 = r6;
        int r20 = r5;
        this(r3, r4, r20, r19, r18, r17, r16, r11, r13);
        return;
    L30:
        r13 = r12;
        goto L29
    }
}
