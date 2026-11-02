package com.sma.androidthirdpartylogin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LoginResponse implements Parcelable {

    @aa1
    public static final OXO1 CREATOR = new OXO1(null);

    /* JADX INFO: renamed from: I1 */
    @aa1
    public String f47785I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public String f47786IO;

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
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @aa1
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public LoginResponse createFromParcel(@aa1 Parcel parcel) {
            Intrinsics.X0O(parcel, "parcel");
            return new LoginResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @aa1
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public LoginResponse[] newArray(int i) {
            return new LoginResponse[i];
        }

        public OXO1() {
        }
    }

    public LoginResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @aa1
    public final String I0IIOi() {
        return this.f47786IO;
    }

    public final void I0iXXO(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.iX1O1 = str;
    }

    public final void I1XOi1(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f47786IO = str;
    }

    public final void IIX1OXO(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.X11iII1O1 = str;
    }

    @aa1
    /* JADX INFO: renamed from: IO */
    public final String m38063IO() {
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

    public final void O10IXXX0X(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.X0i1O = str;
    }

    @aa1
    public final String OIX0iXi() {
        return this.iXiX011;
    }

    @aa1
    public final String OIi0() {
        return this.X11iII1O1;
    }

    public final void X0O(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f47785I1 = str;
    }

    public final void X1ii(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.XXX11i = str;
    }

    @aa1
    public final String XO0O10() {
        return this.X1IX;
    }

    @aa1
    public final String XOO0ii0() {
        return this.f47785I1;
    }

    public final void XXI(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.X1IX = str;
    }

    public final void XiOIO(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.iIXi1iiXI = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void iIiiO(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.iXiX011 = str;
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public final String m38064iO() {
        return this.iX1O1;
    }

    @aa1
    public String toString() {
        return "LoginResponse(platform='" + this.f47786IO + "', openID='" + this.f47785I1 + "', accessToken='" + this.iX1O1 + "'), unionId='" + this.iIXi1iiXI + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel parcel, int i) {
        Intrinsics.X0O(parcel, "parcel");
        parcel.writeString(this.f47786IO);
        parcel.writeString(this.f47785I1);
        parcel.writeString(this.iX1O1);
        parcel.writeString(this.X0i1O);
        parcel.writeString(this.iIXi1iiXI);
    }

    public LoginResponse(@aa1 String platform, @aa1 String openID, @aa1 String accessToken, @aa1 String refreshToken, @aa1 String email, @aa1 String displayName, @aa1 String extInfo, @aa1 String unionId, @aa1 String wxCode) {
        Intrinsics.X0O(platform, "platform");
        Intrinsics.X0O(openID, "openID");
        Intrinsics.X0O(accessToken, "accessToken");
        Intrinsics.X0O(refreshToken, "refreshToken");
        Intrinsics.X0O(email, "email");
        Intrinsics.X0O(displayName, "displayName");
        Intrinsics.X0O(extInfo, "extInfo");
        Intrinsics.X0O(unionId, "unionId");
        Intrinsics.X0O(wxCode, "wxCode");
        this.f47786IO = platform;
        this.f47785I1 = openID;
        this.iX1O1 = accessToken;
        this.X11iII1O1 = refreshToken;
        this.XXX11i = email;
        this.X1IX = displayName;
        this.X0i1O = extInfo;
        this.iIXi1iiXI = unionId;
        this.iXiX011 = wxCode;
    }

    public /* synthetic */ LoginResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LoginResponse(@aa1 Parcel parcel) {
        Intrinsics.X0O(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.X1ii(string, "null cannot be cast to non-null type kotlin.String");
        String string2 = parcel.readString();
        Intrinsics.X1ii(string2, "null cannot be cast to non-null type kotlin.String");
        String string3 = parcel.readString();
        Intrinsics.X1ii(string3, "null cannot be cast to non-null type kotlin.String");
        String string4 = parcel.readString();
        Intrinsics.X1ii(string4, "null cannot be cast to non-null type kotlin.String");
        String string5 = parcel.readString();
        Intrinsics.X1ii(string5, "null cannot be cast to non-null type kotlin.String");
        this(string, string2, string3, null, null, null, string4, string5, null, 312, null);
    }
}
