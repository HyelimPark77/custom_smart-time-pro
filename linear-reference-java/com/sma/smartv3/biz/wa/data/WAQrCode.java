package com.sma.smartv3.biz.wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.ironsource.Ne;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WAQrCode extends JsonFieldContainer implements Serializable {

    @aa1
    private String full;

    @aa1
    private String message;

    @aa1
    private String qrcode;

    @aa1
    private String response;

    @aa1
    private String status;

    @aa1
    private String version;

    public WAQrCode() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ WAQrCode copy$default(WAQrCode r0, String r1, String r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.status;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.qrcode;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.version;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.full;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.response;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.message;
    L20:
        String r9 = r5;
        String r10 = r6;
        String r11 = r3;
        String r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    @aa1
    public final String component1() {
        return this.status;
    }

    @aa1
    public final String component2() {
        return this.qrcode;
    }

    @aa1
    public final String component3() {
        return this.version;
    }

    @aa1
    public final String component4() {
        return this.full;
    }

    @aa1
    public final String component5() {
        return this.response;
    }

    @aa1
    public final String component6() {
        return this.message;
    }

    @aa1
    public final WAQrCode copy(@aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r9, "status");
        Intrinsics.X0O(r10, "qrcode");
        Intrinsics.X0O(r11, "version");
        Intrinsics.X0O(r12, "full");
        Intrinsics.X0O(r13, Ne.n);
        Intrinsics.X0O(r14, "message");
        return new WAQrCode(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WAQrCode) == true) goto L8;
        return false;
    L8:
        WAQrCode r6 = (WAQrCode) r5;
        if (Intrinsics.XOO0ii0(this.status, r6.status) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.qrcode, r6.qrcode) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.version, r6.version) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.full, r6.full) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.response, r6.response) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.message, r6.message) == true) goto L26;
        return false;
    L26:
        return true;
    }

    @aa1
    public final String getFull() {
        return this.full;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    @aa1
    public final String getQrcode() {
        return this.qrcode;
    }

    @aa1
    public final String getResponse() {
        return this.response;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    @aa1
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((this.status.hashCode() * 31) + this.qrcode.hashCode()) * 31) + this.version.hashCode()) * 31) + this.full.hashCode()) * 31) + this.response.hashCode()) * 31) + this.message.hashCode();
    }

    public final void setFull(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.full = r2;
    }

    public final void setMessage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.message = r2;
    }

    public final void setQrcode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.qrcode = r2;
    }

    public final void setResponse(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.response = r2;
    }

    public final void setStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    public final void setVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.version = r2;
    }

    @aa1
    public String toString() {
        return "WAQrCode(status=" + this.status + ", qrcode=" + this.qrcode + ", version=" + this.version + ", full=" + this.full + ", response=" + this.response + ", message=" + this.message + I000IiI1O.iO.iO;
    }

    public WAQrCode(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r2, "status");
        Intrinsics.X0O(r3, "qrcode");
        Intrinsics.X0O(r4, "version");
        Intrinsics.X0O(r5, "full");
        Intrinsics.X0O(r6, Ne.n);
        Intrinsics.X0O(r7, "message");
        this.status = r2;
        this.qrcode = r3;
        this.version = r4;
        this.full = r5;
        this.response = r6;
        this.message = r7;
    }

    public /* synthetic */ WAQrCode(String r2, String r3, String r4, String r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r8 & 32) == 0) goto L21;
        String r10 = "";
    L20:
        String r11 = r6;
        String r12 = r5;
        String r13 = r4;
        String r14 = r3;
        this(r2, r14, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
