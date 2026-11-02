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

    public ResponseData(@aa1 String answer, @aa1 String part, int i, @aa1 String role) {
        Intrinsics.X0O(answer, "answer");
        Intrinsics.X0O(part, "part");
        Intrinsics.X0O(role, "role");
        this.answer = answer;
        this.part = part;
        this.index = i;
        this.role = role;
    }

    public static /* synthetic */ ResponseData copy$default(ResponseData responseData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = responseData.answer;
        }
        if ((i2 & 2) != 0) {
            str2 = responseData.part;
        }
        if ((i2 & 4) != 0) {
            i = responseData.index;
        }
        if ((i2 & 8) != 0) {
            str3 = responseData.role;
        }
        return responseData.copy(str, str2, i, str3);
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
    public final ResponseData copy(@aa1 String answer, @aa1 String part, int i, @aa1 String role) {
        Intrinsics.X0O(answer, "answer");
        Intrinsics.X0O(part, "part");
        Intrinsics.X0O(role, "role");
        return new ResponseData(answer, part, i, role);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseData)) {
            return false;
        }
        ResponseData responseData = (ResponseData) obj;
        return Intrinsics.XOO0ii0(this.answer, responseData.answer) && Intrinsics.XOO0ii0(this.part, responseData.part) && this.index == responseData.index && Intrinsics.XOO0ii0(this.role, responseData.role);
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
        return "ResponseData(answer=" + this.answer + ", part=" + this.part + ", index=" + this.index + ", role=" + this.role + I000IiI1O.C2156iO.f1007iO;
    }
}
