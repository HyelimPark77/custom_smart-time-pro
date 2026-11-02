package com.sma.smartv3.biz.p606wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAUserInfo extends JsonFieldContainer implements Serializable {

    /* JADX INFO: renamed from: id */
    @aa1
    private final String f50955id;

    @aa1
    private final String phoneNumber;

    @aa1
    private final String platform;

    @aa1
    private final String pushname;

    @aa1
    private final String ref;

    @aa1
    private final String refTTL;

    @aa1
    private final String smbTos;

    @aa1
    private final String stale;

    public WAUserInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ WAUserInfo copy$default(WAUserInfo wAUserInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wAUserInfo.f50955id;
        }
        if ((i & 2) != 0) {
            str2 = wAUserInfo.ref;
        }
        if ((i & 4) != 0) {
            str3 = wAUserInfo.refTTL;
        }
        if ((i & 8) != 0) {
            str4 = wAUserInfo.platform;
        }
        if ((i & 16) != 0) {
            str5 = wAUserInfo.smbTos;
        }
        if ((i & 32) != 0) {
            str6 = wAUserInfo.pushname;
        }
        if ((i & 64) != 0) {
            str7 = wAUserInfo.stale;
        }
        if ((i & 128) != 0) {
            str8 = wAUserInfo.phoneNumber;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return wAUserInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @aa1
    public final String component1() {
        return this.f50955id;
    }

    @aa1
    public final String component2() {
        return this.ref;
    }

    @aa1
    public final String component3() {
        return this.refTTL;
    }

    @aa1
    public final String component4() {
        return this.platform;
    }

    @aa1
    public final String component5() {
        return this.smbTos;
    }

    @aa1
    public final String component6() {
        return this.pushname;
    }

    @aa1
    public final String component7() {
        return this.stale;
    }

    @aa1
    public final String component8() {
        return this.phoneNumber;
    }

    @aa1
    public final WAUserInfo copy(@aa1 String id, @aa1 String ref, @aa1 String refTTL, @aa1 String platform, @aa1 String smbTos, @aa1 String pushname, @aa1 String stale, @aa1 String phoneNumber) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(ref, "ref");
        Intrinsics.X0O(refTTL, "refTTL");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(smbTos, "smbTos");
        Intrinsics.X0O(pushname, "pushname");
        Intrinsics.X0O(stale, "stale");
        Intrinsics.X0O(phoneNumber, "phoneNumber");
        return new WAUserInfo(id, ref, refTTL, platform, smbTos, pushname, stale, phoneNumber);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAUserInfo)) {
            return false;
        }
        WAUserInfo wAUserInfo = (WAUserInfo) obj;
        return Intrinsics.XOO0ii0(this.f50955id, wAUserInfo.f50955id) && Intrinsics.XOO0ii0(this.ref, wAUserInfo.ref) && Intrinsics.XOO0ii0(this.refTTL, wAUserInfo.refTTL) && Intrinsics.XOO0ii0(this.platform, wAUserInfo.platform) && Intrinsics.XOO0ii0(this.smbTos, wAUserInfo.smbTos) && Intrinsics.XOO0ii0(this.pushname, wAUserInfo.pushname) && Intrinsics.XOO0ii0(this.stale, wAUserInfo.stale) && Intrinsics.XOO0ii0(this.phoneNumber, wAUserInfo.phoneNumber);
    }

    @aa1
    public final String getId() {
        return this.f50955id;
    }

    @aa1
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @aa1
    public final String getPlatform() {
        return this.platform;
    }

    @aa1
    public final String getPushname() {
        return this.pushname;
    }

    @aa1
    public final String getRef() {
        return this.ref;
    }

    @aa1
    public final String getRefTTL() {
        return this.refTTL;
    }

    @aa1
    public final String getSmbTos() {
        return this.smbTos;
    }

    @aa1
    public final String getStale() {
        return this.stale;
    }

    public int hashCode() {
        return (((((((((((((this.f50955id.hashCode() * 31) + this.ref.hashCode()) * 31) + this.refTTL.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.smbTos.hashCode()) * 31) + this.pushname.hashCode()) * 31) + this.stale.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    @aa1
    public String toString() {
        return "WAUserInfo(id=" + this.f50955id + ", ref=" + this.ref + ", refTTL=" + this.refTTL + ", platform=" + this.platform + ", smbTos=" + this.smbTos + ", pushname=" + this.pushname + ", stale=" + this.stale + ", phoneNumber=" + this.phoneNumber + I000IiI1O.C2156iO.f1007iO;
    }

    public WAUserInfo(@aa1 String id, @aa1 String ref, @aa1 String refTTL, @aa1 String platform, @aa1 String smbTos, @aa1 String pushname, @aa1 String stale, @aa1 String phoneNumber) {
        Intrinsics.X0O(id, "id");
        Intrinsics.X0O(ref, "ref");
        Intrinsics.X0O(refTTL, "refTTL");
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(smbTos, "smbTos");
        Intrinsics.X0O(pushname, "pushname");
        Intrinsics.X0O(stale, "stale");
        Intrinsics.X0O(phoneNumber, "phoneNumber");
        this.f50955id = id;
        this.ref = ref;
        this.refTTL = refTTL;
        this.platform = platform;
        this.smbTos = smbTos;
        this.pushname = pushname;
        this.stale = stale;
        this.phoneNumber = phoneNumber;
    }

    public /* synthetic */ WAUserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
    }
}
