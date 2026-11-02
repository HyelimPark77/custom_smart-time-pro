package com.sma.smartv3.biz.p606wa.data;

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
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WAProfile copy$default(WAProfile wAProfile, String str, WAUserInfo wAUserInfo, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wAProfile.status;
        }
        if ((i & 2) != 0) {
            wAUserInfo = wAProfile.response;
        }
        if ((i & 4) != 0) {
            str2 = wAProfile.mapper;
        }
        return wAProfile.copy(str, wAUserInfo, str2);
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
    public final WAProfile copy(@aa1 String status, @tb1 WAUserInfo wAUserInfo, @aa1 String mapper) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(mapper, "mapper");
        return new WAProfile(status, wAUserInfo, mapper);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAProfile)) {
            return false;
        }
        WAProfile wAProfile = (WAProfile) obj;
        return Intrinsics.XOO0ii0(this.status, wAProfile.status) && Intrinsics.XOO0ii0(this.response, wAProfile.response) && Intrinsics.XOO0ii0(this.mapper, wAProfile.mapper);
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
        int iHashCode = this.status.hashCode() * 31;
        WAUserInfo wAUserInfo = this.response;
        return ((iHashCode + (wAUserInfo == null ? 0 : wAUserInfo.hashCode())) * 31) + this.mapper.hashCode();
    }

    public final void setMapper(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mapper = str;
    }

    public final void setResponse(@tb1 WAUserInfo wAUserInfo) {
        this.response = wAUserInfo;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    @aa1
    public String toString() {
        return "WAProfile(status=" + this.status + ", response=" + this.response + ", mapper=" + this.mapper + I000IiI1O.C2156iO.f1007iO;
    }

    public WAProfile(@aa1 String status, @tb1 WAUserInfo wAUserInfo, @aa1 String mapper) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(mapper, "mapper");
        this.status = status;
        this.response = wAUserInfo;
        this.mapper = mapper;
    }

    public /* synthetic */ WAProfile(String str, WAUserInfo wAUserInfo, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : wAUserInfo, (i & 4) != 0 ? "" : str2);
    }
}
