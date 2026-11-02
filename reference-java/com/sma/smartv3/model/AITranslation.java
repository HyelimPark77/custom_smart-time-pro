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
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ AITranslation copy$default(AITranslation aITranslation, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aITranslation.text;
        }
        if ((i2 & 2) != 0) {
            str2 = aITranslation.dst;
        }
        if ((i2 & 4) != 0) {
            i = aITranslation.status;
        }
        return aITranslation.copy(str, str2, i);
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
    public final AITranslation copy(@aa1 String text, @aa1 String dst, int i) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(dst, "dst");
        return new AITranslation(text, dst, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITranslation)) {
            return false;
        }
        AITranslation aITranslation = (AITranslation) obj;
        return Intrinsics.XOO0ii0(this.text, aITranslation.text) && Intrinsics.XOO0ii0(this.dst, aITranslation.dst) && this.status == aITranslation.status;
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

    public final void setDst(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.dst = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.text = str;
    }

    @aa1
    public String toString() {
        return "AITranslation(text=" + this.text + ", dst=" + this.dst + ", status=" + this.status + I000IiI1O.C2156iO.f1007iO;
    }

    public AITranslation(@aa1 String text, @aa1 String dst, int i) {
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(dst, "dst");
        this.text = text;
        this.dst = dst;
        this.status = i;
    }

    public /* synthetic */ AITranslation(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
