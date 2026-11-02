package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class Point {
    private double latitude;
    private long loc_time;
    private double longitude;

    public Point() {
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final long getLoc_time() {
        return this.loc_time;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(double r1) {
        this.latitude = r1;
    }

    public final void setLoc_time(long r1) {
        this.loc_time = r1;
    }

    public final void setLongitude(double r1) {
        this.longitude = r1;
    }

    @aa1
    public String toString() {
        return "Point(longitude=" + this.longitude + ", latitude=" + this.latitude + ", loc_time=" + this.loc_time + I000IiI1O.iO.iO;
    }
}
