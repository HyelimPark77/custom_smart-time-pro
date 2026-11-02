package com.sma.smartv3.biz.wa.data;

import androidx.autofill.HintConstants;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.OiXX1X0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAUserInfo extends JsonFieldContainer implements Serializable {

    @aa1
    private final String id;

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
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, 255, null);
    }

    public static /* synthetic */ WAUserInfo copy$default(WAUserInfo r0, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.ref;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.refTTL;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.platform;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.smbTos;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.pushname;
    L21:
        if ((r9 & 64) == 0) goto L24;
        r7 = r0.stale;
    L24:
        if ((r9 & 128) == 0) goto L26;
        r8 = r0.phoneNumber;
    L26:
        String r11 = r7;
        String r12 = r8;
        String r13 = r5;
        String r14 = r6;
        String r15 = r3;
        String r16 = r4;
        return r0.copy(r1, r2, r15, r16, r13, r14, r11, r12);
    }

    @aa1
    public final String component1() {
        return this.id;
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
    public final WAUserInfo copy(@aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18) {
        Intrinsics.X0O(r11, "id");
        Intrinsics.X0O(r12, OiXX1X0.I1);
        Intrinsics.X0O(r13, "refTTL");
        Intrinsics.X0O(r14, "platform");
        Intrinsics.X0O(r15, "smbTos");
        Intrinsics.X0O(r16, "pushname");
        Intrinsics.X0O(r17, "stale");
        Intrinsics.X0O(r18, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        return new WAUserInfo(r11, r12, r13, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WAUserInfo) == true) goto L8;
        return false;
    L8:
        WAUserInfo r6 = (WAUserInfo) r5;
        if (Intrinsics.XOO0ii0(this.id, r6.id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.ref, r6.ref) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.refTTL, r6.refTTL) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.platform, r6.platform) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.smbTos, r6.smbTos) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.pushname, r6.pushname) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.stale, r6.stale) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.phoneNumber, r6.phoneNumber) == true) goto L32;
        return false;
    L32:
        return true;
    }

    @aa1
    public final String getId() {
        return this.id;
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
        return (((((((((((((this.id.hashCode() * 31) + this.ref.hashCode()) * 31) + this.refTTL.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.smbTos.hashCode()) * 31) + this.pushname.hashCode()) * 31) + this.stale.hashCode()) * 31) + this.phoneNumber.hashCode();
    }

    @aa1
    public String toString() {
        return "WAUserInfo(id=" + this.id + ", ref=" + this.ref + ", refTTL=" + this.refTTL + ", platform=" + this.platform + ", smbTos=" + this.smbTos + ", pushname=" + this.pushname + ", stale=" + this.stale + ", phoneNumber=" + this.phoneNumber + I000IiI1O.iO.iO;
    }

    public WAUserInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r2, "id");
        Intrinsics.X0O(r3, OiXX1X0.I1);
        Intrinsics.X0O(r4, "refTTL");
        Intrinsics.X0O(r5, "platform");
        Intrinsics.X0O(r6, "smbTos");
        Intrinsics.X0O(r7, "pushname");
        Intrinsics.X0O(r8, "stale");
        Intrinsics.X0O(r9, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        this.id = r2;
        this.ref = r3;
        this.refTTL = r4;
        this.platform = r5;
        this.smbTos = r6;
        this.pushname = r7;
        this.stale = r8;
        this.phoneNumber = r9;
    }

    public /* synthetic */ WAUserInfo(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r12 = "";
    L26:
        String r13 = r8;
        String r14 = r7;
        String r15 = r6;
        String r16 = r5;
        String r17 = r4;
        String r18 = r3;
        this(r2, r18, r17, r16, r15, r14, r13, r12);
        return;
    L27:
        r12 = r9;
        goto L26
    }
}
