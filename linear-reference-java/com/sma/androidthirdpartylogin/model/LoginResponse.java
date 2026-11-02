package com.sma.androidthirdpartylogin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LoginResponse implements Parcelable {

    @aa1
    public static final OXO1 CREATOR = null;

    @aa1
    public String I1;

    @aa1
    public String IO;

    @aa1
    public String X0i1O;

    @aa1
    public String X11iII1O1;

    @aa1
    public String X1IX;

    @aa1
    public String XXX11i;

    @aa1
    public String iIXi1iiXI;

    @aa1
    public String iX1O1;

    @aa1
    public String iXiX011;

    public static final class OXO1 implements Parcelable.Creator<LoginResponse> {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public LoginResponse OXO1(@aa1 Parcel r2) {
            Intrinsics.X0O(r2, "parcel");
            return new LoginResponse(r2);
        }

        @aa1
        public LoginResponse[] XIi00iiXO(int r1) {
            return new LoginResponse[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LoginResponse createFromParcel(Parcel r1) {
            return OXO1(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LoginResponse[] newArray(int r1) {
            return XIi00iiXO(r1);
        }

        public OXO1() {
        }
    }

    static {
        CREATOR = new OXO1(null);
    }

    public LoginResponse() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    @aa1
    public final String I0IIOi() {
        return this.IO;
    }

    public final void I0iXXO(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.iX1O1 = r2;
    }

    public final void I1XOi1(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.IO = r2;
    }

    public final void IIX1OXO(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.X11iII1O1 = r2;
    }

    @aa1
    public final String IO() {
        return this.iIXi1iiXI;
    }

    @aa1
    public final String IiI10X() {
        return this.X0i1O;
    }

    @aa1
    public final String O00() {
        return this.XXX11i;
    }

    public final void O10IXXX0X(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.X0i1O = r2;
    }

    @aa1
    public final String OIX0iXi() {
        return this.iXiX011;
    }

    @aa1
    public final String OIi0() {
        return this.X11iII1O1;
    }

    public final void X0O(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.I1 = r2;
    }

    public final void X1ii(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XXX11i = r2;
    }

    @aa1
    public final String XO0O10() {
        return this.X1IX;
    }

    @aa1
    public final String XOO0ii0() {
        return this.I1;
    }

    public final void XXI(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.X1IX = r2;
    }

    public final void XiOIO(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.iIXi1iiXI = r2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void iIiiO(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.iXiX011 = r2;
    }

    @aa1
    public final String iO() {
        return this.iX1O1;
    }

    @aa1
    public String toString() {
        return "LoginResponse(platform='" + this.IO + "', openID='" + this.I1 + "', accessToken='" + this.iX1O1 + "'), unionId='" + this.iIXi1iiXI + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel r1, int r2) {
        Intrinsics.X0O(r1, "parcel");
        r1.writeString(this.IO);
        r1.writeString(this.I1);
        r1.writeString(this.iX1O1);
        r1.writeString(this.X0i1O);
        r1.writeString(this.iIXi1iiXI);
    }

    public LoginResponse(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r2, "platform");
        Intrinsics.X0O(r3, "openID");
        Intrinsics.X0O(r4, "accessToken");
        Intrinsics.X0O(r5, "refreshToken");
        Intrinsics.X0O(r6, "email");
        Intrinsics.X0O(r7, "displayName");
        Intrinsics.X0O(r8, "extInfo");
        Intrinsics.X0O(r9, "unionId");
        Intrinsics.X0O(r10, "wxCode");
        this.IO = r2;
        this.I1 = r3;
        this.iX1O1 = r4;
        this.X11iII1O1 = r5;
        this.XXX11i = r6;
        this.X1IX = r7;
        this.X0i1O = r8;
        this.iIXi1iiXI = r9;
        this.iXiX011 = r10;
    }

    public /* synthetic */ LoginResponse(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r13 = "";
    L29:
        String r14 = r9;
        String r15 = r8;
        String r16 = r7;
        String r17 = r6;
        String r18 = r5;
        String r19 = r4;
        String r20 = r3;
        this(r2, r20, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }

    public LoginResponse(@aa1 Parcel r14) {
        Intrinsics.X0O(r14, "parcel");
        String r2 = r14.readString();
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type kotlin.String");
        String r3 = r14.readString();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.String");
        String r4 = r14.readString();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type kotlin.String");
        String r8 = r14.readString();
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type kotlin.String");
        String r9 = r14.readString();
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type kotlin.String");
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r10 = null;
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, 312, null);
    }
}
