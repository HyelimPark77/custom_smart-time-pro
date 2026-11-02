package com.sma.smartv3.biz.ai;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.OiXX1X0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AIError extends JsonFieldContainer {

    @aa1
    private String code;

    @aa1
    private String message;

    @aa1
    private String param;

    @aa1
    private String type;

    public AIError() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ AIError copy$default(AIError r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.message;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.type;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.param;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.code;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    @aa1
    public final String component1() {
        return this.message;
    }

    @aa1
    public final String component2() {
        return this.type;
    }

    @aa1
    public final String component3() {
        return this.param;
    }

    @aa1
    public final String component4() {
        return this.code;
    }

    @aa1
    public final AIError copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "message");
        Intrinsics.X0O(r3, "type");
        Intrinsics.X0O(r4, OiXX1X0.OIX0iXi);
        Intrinsics.X0O(r5, "code");
        return new AIError(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AIError) == true) goto L8;
        return false;
    L8:
        AIError r6 = (AIError) r5;
        if (Intrinsics.XOO0ii0(this.message, r6.message) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.type, r6.type) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.param, r6.param) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.code, r6.code) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getCode() {
        return this.code;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    @aa1
    public final String getParam() {
        return this.param;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.message.hashCode() * 31) + this.type.hashCode()) * 31) + this.param.hashCode()) * 31) + this.code.hashCode();
    }

    public final void setCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.code = r2;
    }

    public final void setMessage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.message = r2;
    }

    public final void setParam(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.param = r2;
    }

    public final void setType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    @aa1
    public String toString() {
        return "AIError(message=" + this.message + ", type=" + this.type + ", param=" + this.param + ", code=" + this.code + I000IiI1O.iO.iO;
    }

    public AIError(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "message");
        Intrinsics.X0O(r3, "type");
        Intrinsics.X0O(r4, OiXX1X0.OIX0iXi);
        Intrinsics.X0O(r5, "code");
        this.message = r2;
        this.type = r3;
        this.param = r4;
        this.code = r5;
    }

    public /* synthetic */ AIError(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
