package com.sma.smartv3.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CustomLatLng implements Parcelable {

    @aa1
    public static final CREATOR CREATOR = null;
    private int altitude;
    private int color;
    private double latitude;
    private double longitude;
    private long time;

    public static final class CREATOR implements Parcelable.Creator<CustomLatLng> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker r1) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomLatLng createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ CustomLatLng[] newArray(int r1) {
            return newArray(r1);
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public CustomLatLng createFromParcel(@aa1 Parcel r2) {
            Intrinsics.X0O(r2, "parcel");
            return new CustomLatLng(r2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public CustomLatLng[] newArray(int r1) {
            return new CustomLatLng[r1];
        }
    }

    static {
        CREATOR = new CREATOR(null);
    }

    public CustomLatLng(double r1, double r3, long r5, int r7, int r8) {
        this.latitude = r1;
        this.longitude = r3;
        this.time = r5;
        this.altitude = r7;
        this.color = r8;
    }

    public static /* synthetic */ CustomLatLng copy$default(CustomLatLng r9, double r10, double r12, long r14, int r16, int r17, int r18, Object r19) {
        if ((r18 & 1) == 0) goto L5;
        r10 = r9.latitude;
    L5:
        double r1 = r10;
        if ((r18 & 2) == 0) goto L8;
        r12 = r9.longitude;
    L8:
        double r3 = r12;
        if ((r18 & 4) == 0) goto L11;
        r14 = r9.time;
    L11:
        long r5 = r14;
        if ((r18 & 8) == 0) goto L14;
        int r7 = r9.altitude;
    L16:
        if ((r18 & 16) == 0) goto L19;
        int r8 = r9.color;
    L21:
        return r9.copy(r1, r3, r5, r7, r8);
    L19:
        r8 = r17;
        goto L21
    L14:
        r7 = r16;
        goto L16
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final long component3() {
        return this.time;
    }

    public final int component4() {
        return this.altitude;
    }

    public final int component5() {
        return this.color;
    }

    @aa1
    public final CustomLatLng copy(double r10, double r12, long r14, int r16, int r17) {
        return new CustomLatLng(r10, r12, r14, r16, r17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof CustomLatLng) == true) goto L8;
        return false;
    L8:
        CustomLatLng r9 = (CustomLatLng) r8;
        if (Double.compare(this.latitude, r9.latitude) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.longitude, r9.longitude) == 0) goto L15;
        return false;
    L15:
        if (this.time == r9.time) goto L18;
        return false;
    L18:
        if (this.altitude == r9.altitude) goto L21;
        return false;
    L21:
        if (this.color == r9.color) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final int getColor() {
        return this.color;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.altitude)) * 31) + Integer.hashCode(this.color);
    }

    public final void setAltitude(int r1) {
        this.altitude = r1;
    }

    public final void setColor(int r1) {
        this.color = r1;
    }

    public final void setLatitude(double r1) {
        this.latitude = r1;
    }

    public final void setLongitude(double r1) {
        this.longitude = r1;
    }

    public final void setTime(long r1) {
        this.time = r1;
    }

    @aa1
    public String toString() {
        return "CustomLatLng(latitude=" + this.latitude + ", longitude=" + this.longitude + ", time=" + this.time + ", altitude=" + this.altitude + ", color=" + this.color + I000IiI1O.iO.iO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel r3, int r4) {
        Intrinsics.X0O(r3, "parcel");
        r3.writeDouble(this.latitude);
        r3.writeDouble(this.longitude);
        r3.writeLong(this.time);
        r3.writeInt(this.altitude);
        r3.writeInt(this.color);
    }

    public /* synthetic */ CustomLatLng(double r12, double r14, long r16, int r18, int r19, int r20, DefaultConstructorMarker r21) {
        if ((r20 & 4) == 0) goto L5;
        long r7 = 0;
    L7:
        if ((r20 & 8) == 0) goto L9;
        int r9 = 0;
    L11:
        if ((r20 & 16) == 0) goto L14;
        int r10 = 0;
    L15:
        this(r12, r14, r7, r9, r10);
        return;
    L14:
        r10 = r19;
        goto L15
    L9:
        r9 = r18;
        goto L11
    L5:
        r7 = r16;
        goto L7
    }

    public CustomLatLng(@aa1 Parcel r11) {
        Intrinsics.X0O(r11, "parcel");
        this(r11.readDouble(), r11.readDouble(), r11.readLong(), r11.readInt(), r11.readInt());
    }
}
