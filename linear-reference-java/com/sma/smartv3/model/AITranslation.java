package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AITranslation {

    @aa1
    private String dst;
    private int status;

    @aa1
    private String text;

    public AITranslation() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ AITranslation copy$default(AITranslation r0, String r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.text;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.dst;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.status;
    L12:
        return r0.copy(r1, r2, r3);
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

    @aa1
    public final AITranslation copy(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, "dst");
        return new AITranslation(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AITranslation) == true) goto L8;
        return false;
    L8:
        AITranslation r6 = (AITranslation) r5;
        if (Intrinsics.XOO0ii0(this.text, r6.text) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dst, r6.dst) == true) goto L15;
        return false;
    L15:
        if (this.status == r6.status) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getDst() {
        return this.dst;
    }

    public final int getStatus() {
        return this.status;
    }

    @aa1
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.dst.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    public final void setDst(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dst = r2;
    }

    public final void setStatus(int r1) {
        this.status = r1;
    }

    public final void setText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.text = r2;
    }

    @aa1
    public String toString() {
        return "AITranslation(text=" + this.text + ", dst=" + this.dst + ", status=" + this.status + I000IiI1O.iO.iO;
    }

    public AITranslation(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r3, "dst");
        this.text = r2;
        this.dst = r3;
        this.status = r4;
    }

    public /* synthetic */ AITranslation(String r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
