package com.sma.smartv3.ui.timezonepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneResult implements Parcelable {
    public static final Parcelable.Creator<TimeZoneResult> CREATOR = null;
    public String I1;
    public int IO;
    public boolean X0i1O;
    public String X11iII1O1;
    public String X1IX;
    public String XXX11i;
    public int iIXi1iiXI;
    public String iX1O1;

    public class OXO1 implements Parcelable.Creator<TimeZoneResult> {
        public OXO1() {
        }

        public TimeZoneResult OXO1(Parcel in) {
            return new TimeZoneResult(in);
        }

        public TimeZoneResult[] XIi00iiXO(int size) {
            return new TimeZoneResult[size];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeZoneResult createFromParcel(Parcel in) {
            return OXO1(in);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeZoneResult[] newArray(int size) {
            return XIi00iiXO(size);
        }
    }

    static {
        CREATOR = new OXO1();
    }

    public TimeZoneResult(TimeZoneInfo timeZoneInfo) {
        this.I1 = timeZoneInfo.getTimeZoneId();
        this.iX1O1 = timeZoneInfo.getCountry();
        this.X11iII1O1 = timeZoneInfo.getDisplayName();
        this.XXX11i = timeZoneInfo.getCityName();
        this.iIXi1iiXI = timeZoneInfo.getRawoffset();
        this.X1IX = timeZoneInfo.getEnCityName();
    }

    public int I0IIOi() {
        return this.iIXi1iiXI;
    }

    public void I0iXXO(String mCountry) {
        this.iX1O1 = mCountry;
    }

    public void I1XOi1(int mRawoffset) {
        this.iIXi1iiXI = mRawoffset;
    }

    public void IIX1OXO(String mTimeZoneId) {
        this.I1 = mTimeZoneId;
    }

    public boolean IO() {
        return this.X0i1O;
    }

    public String IiI10X() {
        return this.X1IX;
    }

    public String O00() {
        return this.X11iII1O1;
    }

    public void O10IXXX0X(int id) {
        this.IO = id;
    }

    public void OIX0iXi(String mCityName) {
        this.XXX11i = mCityName;
    }

    public String OIi0() {
        return this.I1;
    }

    public void X0O(boolean local) {
        this.X0i1O = local;
    }

    public void X1ii(String mEnCityName) {
        this.X1IX = mEnCityName;
    }

    public String XO0O10() {
        return this.iX1O1;
    }

    public int XOO0ii0() {
        return this.IO;
    }

    public void XXI(String mDisplayName) {
        this.X11iII1O1 = mDisplayName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String iO() {
        return this.XXX11i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.iX1O1);
        dest.writeString(this.X11iII1O1);
        dest.writeString(this.I1);
        dest.writeString(this.XXX11i);
        dest.writeInt(this.iIXi1iiXI);
    }

    public TimeZoneResult(Parcel in) {
        this.iX1O1 = in.readString();
        this.X11iII1O1 = in.readString();
        this.I1 = in.readString();
        this.XXX11i = in.readString();
        this.iIXi1iiXI = in.readInt();
    }
}
