package com.sma.smartv3.biz.wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAProfile extends JsonFieldContainer implements Serializable {

    @aa1
    private String mapper;

    @tb1
    private WAUserInfo response;

    @aa1
    private String status;

    public WAProfile() {
        String r1 = null;
        WAUserInfo r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ WAProfile copy$default(WAProfile r0, String r1, WAUserInfo r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.status;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.response;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mapper;
    L12:
        return r0.copy(r1, r2, r3);
    }

    @aa1
    public final String component1() {
        return this.status;
    }

    @tb1
    public final WAUserInfo component2() {
        return this.response;
    }

    @aa1
    public final String component3() {
        return this.mapper;
    }

    @aa1
    public final WAProfile copy(@aa1 String r2, @tb1 WAUserInfo r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "status");
        Intrinsics.X0O(r4, "mapper");
        return new WAProfile(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WAProfile) == true) goto L8;
        return false;
    L8:
        WAProfile r6 = (WAProfile) r5;
        if (Intrinsics.XOO0ii0(this.status, r6.status) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.response, r6.response) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mapper, r6.mapper) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getMapper() {
        return this.mapper;
    }

    @tb1
    public final WAUserInfo getResponse() {
        return this.response;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int r0 = this.status.hashCode() * 31;
        WAUserInfo r1 = this.response;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((r0 + r2) * 31) + this.mapper.hashCode();
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setMapper(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mapper = r2;
    }

    public final void setResponse(@tb1 WAUserInfo r1) {
        this.response = r1;
    }

    public final void setStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    @aa1
    public String toString() {
        return "WAProfile(status=" + this.status + ", response=" + this.response + ", mapper=" + this.mapper + I000IiI1O.iO.iO;
    }

    public WAProfile(@aa1 String r2, @tb1 WAUserInfo r3, @aa1 String r4) {
        Intrinsics.X0O(r2, "status");
        Intrinsics.X0O(r4, "mapper");
        this.status = r2;
        this.response = r3;
        this.mapper = r4;
    }

    public /* synthetic */ WAProfile(String r2, WAUserInfo r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
