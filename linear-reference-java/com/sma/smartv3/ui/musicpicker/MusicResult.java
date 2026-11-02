package com.sma.smartv3.ui.musicpicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.fw0;

/* JADX INFO: loaded from: classes19.dex */
public class MusicResult implements Parcelable {
    public static final Parcelable.Creator<MusicResult> CREATOR = null;
    public String I1;
    public long IO;
    public int Ii1iii0;
    public int O001I;
    public String X0i1O;
    public int X11iII1O1;
    public String X1IX;
    public int XXO;
    public long XXX11i;
    public String iIXi1iiXI;
    public String iX1O1;
    public boolean iXiX011;
    public String iXiiiO;
    public String iiiO;

    public class OXO1 implements Parcelable.Creator<MusicResult> {
        public OXO1() {
        }

        public MusicResult OXO1(Parcel in) {
            return new MusicResult(in);
        }

        public MusicResult[] XIi00iiXO(int size) {
            return new MusicResult[size];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MusicResult createFromParcel(Parcel in) {
            return OXO1(in);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ MusicResult[] newArray(int size) {
            return XIi00iiXO(size);
        }
    }

    static {
        CREATOR = new OXO1();
    }

    public MusicResult(fw0 music) {
        this.Ii1iii0 = 0;
        this.IO = music.OIX0iXi();
        this.I1 = music.getTitle();
        this.iX1O1 = music.XIi00iiXO();
        this.X11iII1O1 = music.IO();
        this.XXX11i = music.O10IXXX0X();
        this.X1IX = music.IiI10X();
        this.X0i1O = music.I1XOi1();
        this.iIXi1iiXI = music.I0IIOi();
        this.O001I = music.XXI();
        this.XXO = music.OIi0();
        this.iXiiiO = music.XOO0ii0();
        this.Ii1iii0 = music.X1ii();
        this.iiiO = music.X0O();
    }

    public int I0IIOi() {
        return this.X11iII1O1;
    }

    public long I0iXXO() {
        return this.XXX11i;
    }

    public void I1(boolean selected) {
        this.iXiX011 = selected;
    }

    public void I1XOi1(String album) {
        this.iX1O1 = album;
    }

    public void II1Xi0(String uri) {
        this.iiiO = uri;
    }

    public void IIX1OXO(String artist) {
        this.X1IX = artist;
    }

    public int IO() {
        return this.O001I;
    }

    public String IiI10X() {
        return this.iIXi1iiXI;
    }

    public String O00() {
        return this.iXiiiO;
    }

    public String O10IXXX0X() {
        return this.X0i1O;
    }

    public void OII(int local) {
        this.O001I = local;
    }

    public int OIX0iXi() {
        return this.Ii1iii0;
    }

    public long OIi0() {
        return this.IO;
    }

    public void OX(int position) {
        this.Ii1iii0 = position;
    }

    public void OiIIX101O(int duration) {
        this.X11iII1O1 = duration;
    }

    public void X01IiOiIi(String title) {
        this.I1 = title;
    }

    public boolean X0O() {
        return this.iXiX011;
    }

    public String X1ii() {
        return this.iiiO;
    }

    public String XO0O10() {
        return this.X1IX;
    }

    public int XOO0ii0() {
        return this.XXO;
    }

    public void XX0(int download) {
        this.XXO = download;
    }

    public String XXI() {
        return this.I1;
    }

    public void XiOIO(String auth) {
        this.iXiiiO = auth;
    }

    public void XiOIii1(long id) {
        this.IO = id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void i010I(String url) {
        this.X0i1O = url;
    }

    public void iIiiO(String coverUrl) {
        this.iIXi1iiXI = coverUrl;
    }

    public String iO() {
        return this.iX1O1;
    }

    public void iOOX010X(long size) {
        this.XXX11i = size;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.IO);
        dest.writeString(this.I1);
        dest.writeString(this.iX1O1);
        dest.writeInt(this.X11iII1O1);
        dest.writeLong(this.XXX11i);
        dest.writeString(this.X1IX);
        dest.writeString(this.X0i1O);
        dest.writeString(this.iIXi1iiXI);
        dest.writeInt(this.O001I);
        dest.writeInt(this.XXO);
        dest.writeString(this.iXiiiO);
        dest.writeInt(this.Ii1iii0);
        dest.writeString(this.iiiO);
    }

    public MusicResult(Parcel in) {
        this.Ii1iii0 = 0;
        this.IO = in.readLong();
        this.I1 = in.readString();
        this.iX1O1 = in.readString();
        this.X11iII1O1 = in.readInt();
        this.XXX11i = in.readLong();
        this.X1IX = in.readString();
        this.X0i1O = in.readString();
        this.iIXi1iiXI = in.readString();
        this.O001I = in.readInt();
        this.XXO = in.readInt();
        this.iXiiiO = in.readString();
        this.Ii1iii0 = in.readInt();
        this.iiiO = in.readString();
    }
}
