package com.sma.smartv3.biz.dcs;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ResponseData extends JsonFieldContainer implements Serializable {

    @aa1
    private final String answer;
    private final int index;

    @aa1
    private final String part;

    @aa1
    private final String role;

    public ResponseData(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "answer");
        Intrinsics.X0O(r3, "part");
        Intrinsics.X0O(r5, "role");
        this.answer = r2;
        this.part = r3;
        this.index = r4;
        this.role = r5;
    }

    public static /* synthetic */ ResponseData copy$default(ResponseData r0, String r1, String r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.answer;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.part;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.index;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.role;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.answer;
    }

    @aa1
    public final String component2() {
        return this.part;
    }

    public final int component3() {
        return this.index;
    }

    @aa1
    public final String component4() {
        return this.role;
    }

    @aa1
    public final ResponseData copy(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "answer");
        Intrinsics.X0O(r3, "part");
        Intrinsics.X0O(r5, "role");
        return new ResponseData(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ResponseData) == true) goto L8;
        return false;
    L8:
        ResponseData r6 = (ResponseData) r5;
        if (Intrinsics.XOO0ii0(this.answer, r6.answer) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.part, r6.part) == true) goto L15;
        return false;
    L15:
        if (this.index == r6.index) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.role, r6.role) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getAnswer() {
        return this.answer;
    }

    public final int getIndex() {
        return this.index;
    }

    @aa1
    public final String getPart() {
        return this.part;
    }

    @aa1
    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return (((((this.answer.hashCode() * 31) + this.part.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + this.role.hashCode();
    }

    @aa1
    public String toString() {
        return "ResponseData(answer=" + this.answer + ", part=" + this.part + ", index=" + this.index + ", role=" + this.role + I000IiI1O.iO.iO;
    }
}
