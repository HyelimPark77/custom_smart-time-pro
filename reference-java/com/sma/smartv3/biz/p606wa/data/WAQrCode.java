package com.sma.smartv3.biz.p606wa.data;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WAQrCode copy$default(WAQrCode wAQrCode, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wAQrCode.status;
        }
        if ((i & 2) != 0) {
            str2 = wAQrCode.qrcode;
        }
        if ((i & 4) != 0) {
            str3 = wAQrCode.version;
        }
        if ((i & 8) != 0) {
            str4 = wAQrCode.full;
        }
        if ((i & 16) != 0) {
            str5 = wAQrCode.response;
        }
        if ((i & 32) != 0) {
            str6 = wAQrCode.message;
        }
        String str7 = str5;
        String str8 = str6;
        return wAQrCode.copy(str, str2, str3, str4, str7, str8);
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
    public final WAQrCode copy(@aa1 String status, @aa1 String qrcode, @aa1 String version, @aa1 String full, @aa1 String response, @aa1 String message) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(qrcode, "qrcode");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(full, "full");
        Intrinsics.X0O(response, "response");
        Intrinsics.X0O(message, "message");
        return new WAQrCode(status, qrcode, version, full, response, message);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WAQrCode)) {
            return false;
        }
        WAQrCode wAQrCode = (WAQrCode) obj;
        return Intrinsics.XOO0ii0(this.status, wAQrCode.status) && Intrinsics.XOO0ii0(this.qrcode, wAQrCode.qrcode) && Intrinsics.XOO0ii0(this.version, wAQrCode.version) && Intrinsics.XOO0ii0(this.full, wAQrCode.full) && Intrinsics.XOO0ii0(this.response, wAQrCode.response) && Intrinsics.XOO0ii0(this.message, wAQrCode.message);
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

    public final void setFull(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.full = str;
    }

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setQrcode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.qrcode = str;
    }

    public final void setResponse(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.response = str;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    public final void setVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.version = str;
    }

    @aa1
    public String toString() {
        return "WAQrCode(status=" + this.status + ", qrcode=" + this.qrcode + ", version=" + this.version + ", full=" + this.full + ", response=" + this.response + ", message=" + this.message + I000IiI1O.C2156iO.f1007iO;
    }

    public WAQrCode(@aa1 String status, @aa1 String qrcode, @aa1 String version, @aa1 String full, @aa1 String response, @aa1 String message) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(qrcode, "qrcode");
        Intrinsics.X0O(version, "version");
        Intrinsics.X0O(full, "full");
        Intrinsics.X0O(response, "response");
        Intrinsics.X0O(message, "message");
        this.status = status;
        this.qrcode = qrcode;
        this.version = version;
        this.full = full;
        this.response = response;
        this.message = message;
    }

    public /* synthetic */ WAQrCode(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
