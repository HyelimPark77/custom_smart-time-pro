package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Points {

    @aa1
    private String create_time;
    private int direction;
    private double height;
    private double latitude;
    private long loc_time;
    private double longitude;
    private double radius;
    private double speed;

    public Points() {
        this.create_time = "";
    }

    @aa1
    public final String getCreate_time() {
        return this.create_time;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final double getHeight() {
        return this.height;
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

    public final double getRadius() {
        return this.radius;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final void setCreate_time(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.create_time = r2;
    }

    public final void setDirection(int r1) {
        this.direction = r1;
    }

    public final void setHeight(double r1) {
        this.height = r1;
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

    public final void setRadius(double r1) {
        this.radius = r1;
    }

    public final void setSpeed(double r1) {
        this.speed = r1;
    }

    @aa1
    public String toString() {
        return "Points(longitude=" + this.longitude + ", latitude=" + this.latitude + ", loc_time=" + this.loc_time + ", create_time='" + this.create_time + "', direction=" + this.direction + ", height=" + this.height + ", radius=" + this.radius + ", speed=" + this.speed + I000IiI1O.iO.iO;
    }
}
