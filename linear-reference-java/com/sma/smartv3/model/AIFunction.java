package com.sma.smartv3.model;

import android.content.Intent;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIFunction implements Serializable {
    private int bg;

    @aa1
    private String desc;
    private int detailsBg;

    @aa1
    private String detailsDescribe;

    @aa1
    private String detailsExample;

    @aa1
    private String detailsHint;

    @aa1
    private String detailsQuestion;
    private int icon;

    @tb1
    private transient Intent intent;
    private boolean isHot;

    @aa1
    private String title;

    @aa1
    private AIFunctionType type;

    public AIFunction(@aa1 AIFunctionType r2, @aa1 String r3, int r4, @aa1 String r5, int r6, int r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, boolean r12, @tb1 Intent r13) {
        Intrinsics.X0O(r2, "type");
        Intrinsics.X0O(r3, "title");
        Intrinsics.X0O(r5, "desc");
        Intrinsics.X0O(r8, "detailsDescribe");
        Intrinsics.X0O(r9, "detailsHint");
        Intrinsics.X0O(r10, "detailsExample");
        Intrinsics.X0O(r11, "detailsQuestion");
        this.type = r2;
        this.title = r3;
        this.bg = r4;
        this.desc = r5;
        this.icon = r6;
        this.detailsBg = r7;
        this.detailsDescribe = r8;
        this.detailsHint = r9;
        this.detailsExample = r10;
        this.detailsQuestion = r11;
        this.isHot = r12;
        this.intent = r13;
    }

    public static /* synthetic */ AIFunction copy$default(AIFunction r0, AIFunctionType r1, String r2, int r3, String r4, int r5, int r6, String r7, String r8, String r9, String r10, boolean r11, Intent r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.title;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.bg;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.desc;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.icon;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.detailsBg;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.detailsDescribe;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.detailsHint;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.detailsExample;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.detailsQuestion;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.isHot;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.intent;
    L38:
        boolean r15 = r11;
        Intent r16 = r12;
        String r17 = r9;
        String r18 = r10;
        String r19 = r7;
        String r110 = r8;
        int r20 = r5;
        int r21 = r6;
        int r22 = r3;
        String r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    @aa1
    public final AIFunctionType component1() {
        return this.type;
    }

    @aa1
    public final String component10() {
        return this.detailsQuestion;
    }

    public final boolean component11() {
        return this.isHot;
    }

    @tb1
    public final Intent component12() {
        return this.intent;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.bg;
    }

    @aa1
    public final String component4() {
        return this.desc;
    }

    public final int component5() {
        return this.icon;
    }

    public final int component6() {
        return this.detailsBg;
    }

    @aa1
    public final String component7() {
        return this.detailsDescribe;
    }

    @aa1
    public final String component8() {
        return this.detailsHint;
    }

    @aa1
    public final String component9() {
        return this.detailsExample;
    }

    @aa1
    public final AIFunction copy(@aa1 AIFunctionType r15, @aa1 String r16, int r17, @aa1 String r18, int r19, int r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, boolean r25, @tb1 Intent r26) {
        Intrinsics.X0O(r15, "type");
        Intrinsics.X0O(r16, "title");
        Intrinsics.X0O(r18, "desc");
        Intrinsics.X0O(r21, "detailsDescribe");
        Intrinsics.X0O(r22, "detailsHint");
        Intrinsics.X0O(r23, "detailsExample");
        Intrinsics.X0O(r24, "detailsQuestion");
        return new AIFunction(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AIFunction) == true) goto L8;
        return false;
    L8:
        AIFunction r6 = (AIFunction) r5;
        if (this.type == r6.type) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.title, r6.title) == true) goto L15;
        return false;
    L15:
        if (this.bg == r6.bg) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.desc, r6.desc) == true) goto L21;
        return false;
    L21:
        if (this.icon == r6.icon) goto L24;
        return false;
    L24:
        if (this.detailsBg == r6.detailsBg) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.detailsDescribe, r6.detailsDescribe) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.detailsHint, r6.detailsHint) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.detailsExample, r6.detailsExample) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.detailsQuestion, r6.detailsQuestion) == true) goto L39;
        return false;
    L39:
        if (this.isHot == r6.isHot) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.intent, r6.intent) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final int getBg() {
        return this.bg;
    }

    @aa1
    public final String getDesc() {
        return this.desc;
    }

    public final int getDetailsBg() {
        return this.detailsBg;
    }

    @aa1
    public final String getDetailsDescribe() {
        return this.detailsDescribe;
    }

    @aa1
    public final String getDetailsExample() {
        return this.detailsExample;
    }

    @aa1
    public final String getDetailsHint() {
        return this.detailsHint;
    }

    @aa1
    public final String getDetailsQuestion() {
        return this.detailsQuestion;
    }

    public final int getIcon() {
        return this.icon;
    }

    @tb1
    public final Intent getIntent() {
        return this.intent;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @aa1
    public final AIFunctionType getType() {
        return this.type;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((this.type.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.bg)) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.detailsBg)) * 31) + this.detailsDescribe.hashCode()) * 31) + this.detailsHint.hashCode()) * 31) + this.detailsExample.hashCode()) * 31) + this.detailsQuestion.hashCode()) * 31) + Boolean.hashCode(this.isHot)) * 31;
        Intent r1 = this.intent;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final boolean isHot() {
        return this.isHot;
    }

    public final void setBg(int r1) {
        this.bg = r1;
    }

    public final void setDesc(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.desc = r2;
    }

    public final void setDetailsBg(int r1) {
        this.detailsBg = r1;
    }

    public final void setDetailsDescribe(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.detailsDescribe = r2;
    }

    public final void setDetailsExample(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.detailsExample = r2;
    }

    public final void setDetailsHint(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.detailsHint = r2;
    }

    public final void setDetailsQuestion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.detailsQuestion = r2;
    }

    public final void setHot(boolean r1) {
        this.isHot = r1;
    }

    public final void setIcon(int r1) {
        this.icon = r1;
    }

    public final void setIntent(@tb1 Intent r1) {
        this.intent = r1;
    }

    public final void setTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.title = r2;
    }

    public final void setType(@aa1 AIFunctionType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    @aa1
    public String toString() {
        return "AIFunction(type=" + this.type + ", title=" + this.title + ", bg=" + this.bg + ", desc=" + this.desc + ", icon=" + this.icon + ", detailsBg=" + this.detailsBg + ", detailsDescribe=" + this.detailsDescribe + ", detailsHint=" + this.detailsHint + ", detailsExample=" + this.detailsExample + ", detailsQuestion=" + this.detailsQuestion + ", isHot=" + this.isHot + ", intent=" + this.intent + I000IiI1O.iO.iO;
    }

    public /* synthetic */ AIFunction(AIFunctionType r11, String r12, int r13, String r14, int r15, int r16, String r17, String r18, String r19, String r20, boolean r21, Intent r22, int r23, DefaultConstructorMarker r24) {
        String r2 = "";
        if ((r23 & 2) == 0) goto L5;
        r12 = "";
    L5:
        boolean r3 = false;
        if ((r23 & 4) == 0) goto L9;
        r13 = 0;
    L9:
        if ((r23 & 8) == 0) goto L11;
        String r1 = "";
    L13:
        if ((r23 & 16) == 0) goto L15;
        int r4 = 0;
    L17:
        if ((r23 & 32) == 0) goto L19;
        int r5 = 0;
    L21:
        if ((r23 & 64) == 0) goto L23;
        String r6 = "";
    L25:
        if ((r23 & 128) == 0) goto L27;
        String r7 = "";
    L29:
        if ((r23 & 256) == 0) goto L31;
        String r8 = "";
    L33:
        if ((r23 & 512) != 0) goto L37;
        r2 = r20;
    L37:
        if ((r23 & 1024) != 0) goto L41;
        r3 = r21;
    L41:
        if ((r23 & 2048) == 0) goto L44;
        Intent r25 = null;
    L45:
        this(r11, r12, r13, r1, r4, r5, r6, r7, r8, r2, r3, r25);
        return;
    L44:
        r25 = r22;
        goto L45
    L31:
        r8 = r19;
        goto L33
    L27:
        r7 = r18;
        goto L29
    L23:
        r6 = r17;
        goto L25
    L19:
        r5 = r16;
        goto L21
    L15:
        r4 = r15;
        goto L17
    L11:
        r1 = r14;
        goto L13
    }
}
