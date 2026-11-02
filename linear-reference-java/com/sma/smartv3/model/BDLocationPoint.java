package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BDLocationPoint {

    @aa1
    private String coord_type_input;
    private int direction;

    @aa1
    private String entity_name;
    private double height;
    private double latitude;
    private long loc_time;
    private double longitude;
    private double radius;
    private double speed;

    public BDLocationPoint() {
        this.entity_name = "";
        this.coord_type_input = "wgs84";
    }

    @aa1
    public final String getCoord_type_input() {
        return this.coord_type_input;
    }

    public final int getDirection() {
        return this.direction;
    }

    @aa1
    public final String getEntity_name() {
        return this.entity_name;
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

    public final void setCoord_type_input(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.coord_type_input = r2;
    }

    public final void setDirection(int r1) {
        this.direction = r1;
    }

    public final void setEntity_name(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.entity_name = r2;
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
        return "BDLocationPoint(entity_name='" + this.entity_name + "', loc_time=" + this.loc_time + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", coord_type_input='" + this.coord_type_input + "', speed=" + this.speed + ", direction=" + this.direction + ", height=" + this.height + ", radius=" + this.radius + I000IiI1O.iO.iO;
    }
}
