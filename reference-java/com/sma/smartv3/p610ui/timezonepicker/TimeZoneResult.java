package com.sma.smartv3.p610ui.timezonepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class TimeZoneResult implements Parcelable {
    public static final Parcelable.Creator<TimeZoneResult> CREATOR = new OXO1();

    /* JADX INFO: renamed from: I1 */
    public String f54815I1;

    /* JADX INFO: renamed from: IO */
    public int f54816IO;
    public boolean X0i1O;
    public String X11iII1O1;
    public String X1IX;
    public String XXX11i;
    public int iIXi1iiXI;
    public String iX1O1;

    public class OXO1 implements Parcelable.Creator<TimeZoneResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public TimeZoneResult createFromParcel(Parcel in) {
            return new TimeZoneResult(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
        public TimeZoneResult[] newArray(int size) {
            return new TimeZoneResult[size];
        }
    }

    public TimeZoneResult(TimeZoneInfo timeZoneInfo) {
        this.f54815I1 = timeZoneInfo.getTimeZoneId();
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
        this.f54815I1 = mTimeZoneId;
    }

    /* JADX INFO: renamed from: IO */
    public boolean m38758IO() {
        return this.X0i1O;
    }

    public String IiI10X() {
        return this.X1IX;
    }

    public String O00() {
        return this.X11iII1O1;
    }

    public void O10IXXX0X(int id) {
        this.f54816IO = id;
    }

    public void OIX0iXi(String mCityName) {
        this.XXX11i = mCityName;
    }

    public String OIi0() {
        return this.f54815I1;
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
        return this.f54816IO;
    }

    public void XXI(String mDisplayName) {
        this.X11iII1O1 = mDisplayName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: iO */
    public String m38759iO() {
        return this.XXX11i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.iX1O1);
        dest.writeString(this.X11iII1O1);
        dest.writeString(this.f54815I1);
        dest.writeString(this.XXX11i);
        dest.writeInt(this.iIXi1iiXI);
    }

    public TimeZoneResult(Parcel in) {
        this.iX1O1 = in.readString();
        this.X11iII1O1 = in.readString();
        this.f54815I1 = in.readString();
        this.XXX11i = in.readString();
        this.iIXi1iiXI = in.readInt();
    }
}
