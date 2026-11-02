package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AppConfigInfo extends JsonFieldContainer {

    @aa1
    private String aiPrompt;

    @aa1
    private String supAdsc_;

    @aa1
    private String supComment;

    @aa1
    private String supCreate;

    @aa1
    private String supMember;

    public AppConfigInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ AppConfigInfo copy$default(AppConfigInfo r0, String r1, String r2, String r3, String r4, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.supComment;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.supCreate;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.supMember;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.aiPrompt;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.supAdsc_;
    L17:
        String r8 = r4;
        String r9 = r5;
        String r10 = r3;
        String r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    @aa1
    public final String component1() {
        return this.supComment;
    }

    @aa1
    public final String component2() {
        return this.supCreate;
    }

    @aa1
    public final String component3() {
        return this.supMember;
    }

    @aa1
    public final String component4() {
        return this.aiPrompt;
    }

    @aa1
    public final String component5() {
        return this.supAdsc_;
    }

    @aa1
    public final AppConfigInfo copy(@aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12) {
        Intrinsics.X0O(r8, "supComment");
        Intrinsics.X0O(r9, "supCreate");
        Intrinsics.X0O(r10, "supMember");
        Intrinsics.X0O(r11, "aiPrompt");
        Intrinsics.X0O(r12, "supAdsc_");
        return new AppConfigInfo(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppConfigInfo) == true) goto L8;
        return false;
    L8:
        AppConfigInfo r6 = (AppConfigInfo) r5;
        if (Intrinsics.XOO0ii0(this.supComment, r6.supComment) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.supCreate, r6.supCreate) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.supMember, r6.supMember) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.aiPrompt, r6.aiPrompt) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.supAdsc_, r6.supAdsc_) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final String getAiPrompt() {
        return this.aiPrompt;
    }

    @aa1
    public final String getSupAdsc_() {
        return this.supAdsc_;
    }

    @aa1
    public final String getSupComment() {
        return this.supComment;
    }

    @aa1
    public final String getSupCreate() {
        return this.supCreate;
    }

    @aa1
    public final String getSupMember() {
        return this.supMember;
    }

    public int hashCode() {
        return (((((((this.supComment.hashCode() * 31) + this.supCreate.hashCode()) * 31) + this.supMember.hashCode()) * 31) + this.aiPrompt.hashCode()) * 31) + this.supAdsc_.hashCode();
    }

    public final void setAiPrompt(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.aiPrompt = r2;
    }

    public final void setSupAdsc_(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supAdsc_ = r2;
    }

    public final void setSupComment(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supComment = r2;
    }

    public final void setSupCreate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supCreate = r2;
    }

    public final void setSupMember(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supMember = r2;
    }

    @aa1
    public String toString() {
        return "AppConfigInfo(supComment=" + this.supComment + ", supCreate=" + this.supCreate + ", supMember=" + this.supMember + ", aiPrompt=" + this.aiPrompt + ", supAdsc_=" + this.supAdsc_ + I000IiI1O.iO.iO;
    }

    public AppConfigInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6) {
        Intrinsics.X0O(r2, "supComment");
        Intrinsics.X0O(r3, "supCreate");
        Intrinsics.X0O(r4, "supMember");
        Intrinsics.X0O(r5, "aiPrompt");
        Intrinsics.X0O(r6, "supAdsc_");
        this.supComment = r2;
        this.supCreate = r3;
        this.supMember = r4;
        this.aiPrompt = r5;
        this.supAdsc_ = r6;
    }

    public /* synthetic */ AppConfigInfo(String r2, String r3, String r4, String r5, String r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "0";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "0";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "1";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r9 = "0";
    L17:
        String r10 = r5;
        String r11 = r4;
        String r12 = r3;
        this(r2, r12, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
