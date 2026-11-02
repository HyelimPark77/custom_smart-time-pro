package com.sma.smartv3.biz.p605ai;

import com.android.mltcode.paycertificationapi.I000IiI1O;
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
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AIError copy$default(AIError aIError, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIError.message;
        }
        if ((i & 2) != 0) {
            str2 = aIError.type;
        }
        if ((i & 4) != 0) {
            str3 = aIError.param;
        }
        if ((i & 8) != 0) {
            str4 = aIError.code;
        }
        return aIError.copy(str, str2, str3, str4);
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
    public final AIError copy(@aa1 String message, @aa1 String type, @aa1 String param, @aa1 String code) {
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(param, "param");
        Intrinsics.X0O(code, "code");
        return new AIError(message, type, param, code);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIError)) {
            return false;
        }
        AIError aIError = (AIError) obj;
        return Intrinsics.XOO0ii0(this.message, aIError.message) && Intrinsics.XOO0ii0(this.type, aIError.type) && Intrinsics.XOO0ii0(this.param, aIError.param) && Intrinsics.XOO0ii0(this.code, aIError.code);
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

    public final void setCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.code = str;
    }

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setParam(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.param = str;
    }

    public final void setType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.type = str;
    }

    @aa1
    public String toString() {
        return "AIError(message=" + this.message + ", type=" + this.type + ", param=" + this.param + ", code=" + this.code + I000IiI1O.C2156iO.f1007iO;
    }

    public AIError(@aa1 String message, @aa1 String type, @aa1 String param, @aa1 String code) {
        Intrinsics.X0O(message, "message");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(param, "param");
        Intrinsics.X0O(code, "code");
        this.message = message;
        this.type = type;
        this.param = param;
        this.code = code;
    }

    public /* synthetic */ AIError(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
