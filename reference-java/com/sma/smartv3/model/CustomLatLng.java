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
    public static final CREATOR CREATOR = new CREATOR(null);
    private int altitude;
    private int color;
    private double latitude;
    private double longitude;
    private long time;

    public static final class CREATOR implements Parcelable.Creator<CustomLatLng> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public CustomLatLng createFromParcel(@aa1 Parcel parcel) {
            Intrinsics.X0O(parcel, "parcel");
            return new CustomLatLng(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @aa1
        public CustomLatLng[] newArray(int i) {
            return new CustomLatLng[i];
        }
    }

    public CustomLatLng(double d, double d2, long j, int i, int i2) {
        this.latitude = d;
        this.longitude = d2;
        this.time = j;
        this.altitude = i;
        this.color = i2;
    }

    public static /* synthetic */ CustomLatLng copy$default(CustomLatLng customLatLng, double d, double d2, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = customLatLng.latitude;
        }
        double d3 = d;
        if ((i3 & 2) != 0) {
            d2 = customLatLng.longitude;
        }
        double d4 = d2;
        if ((i3 & 4) != 0) {
            j = customLatLng.time;
        }
        return customLatLng.copy(d3, d4, j, (i3 & 8) != 0 ? customLatLng.altitude : i, (i3 & 16) != 0 ? customLatLng.color : i2);
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
    public final CustomLatLng copy(double d, double d2, long j, int i, int i2) {
        return new CustomLatLng(d, d2, j, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomLatLng)) {
            return false;
        }
        CustomLatLng customLatLng = (CustomLatLng) obj;
        return Double.compare(this.latitude, customLatLng.latitude) == 0 && Double.compare(this.longitude, customLatLng.longitude) == 0 && this.time == customLatLng.time && this.altitude == customLatLng.altitude && this.color == customLatLng.color;
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

    public final void setAltitude(int i) {
        this.altitude = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @aa1
    public String toString() {
        return "CustomLatLng(latitude=" + this.latitude + ", longitude=" + this.longitude + ", time=" + this.time + ", altitude=" + this.altitude + ", color=" + this.color + I000IiI1O.C2156iO.f1007iO;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@aa1 Parcel parcel, int i) {
        Intrinsics.X0O(parcel, "parcel");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeLong(this.time);
        parcel.writeInt(this.altitude);
        parcel.writeInt(this.color);
    }

    public /* synthetic */ CustomLatLng(double d, double d2, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomLatLng(@aa1 Parcel parcel) {
        this(parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        Intrinsics.X0O(parcel, "parcel");
    }
}
