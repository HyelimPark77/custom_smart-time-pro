package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BDFindLocationResponse {
    private double distance;

    @aa1
    private Point end_point;

    @aa1
    private String message;

    @aa1
    private ArrayList<Points> points;
    private int size;

    @aa1
    private Point start_point;
    private int status;
    private double toll_distance;
    private int total;

    public BDFindLocationResponse() {
        this.message = "";
        this.start_point = new Point();
        this.end_point = new Point();
        this.points = new ArrayList();
    }

    public final double getDistance() {
        return this.distance;
    }

    @aa1
    public final Point getEnd_point() {
        return this.end_point;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    @aa1
    public final ArrayList<Points> getPoints() {
        return this.points;
    }

    public final int getSize() {
        return this.size;
    }

    @aa1
    public final Point getStart_point() {
        return this.start_point;
    }

    public final int getStatus() {
        return this.status;
    }

    public final double getToll_distance() {
        return this.toll_distance;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setDistance(double r1) {
        this.distance = r1;
    }

    public final void setEnd_point(@aa1 Point r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.end_point = r2;
    }

    public final void setMessage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.message = r2;
    }

    public final void setPoints(@aa1 ArrayList<Points> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.points = r2;
    }

    public final void setSize(int r1) {
        this.size = r1;
    }

    public final void setStart_point(@aa1 Point r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.start_point = r2;
    }

    public final void setStatus(int r1) {
        this.status = r1;
    }

    public final void setToll_distance(double r1) {
        this.toll_distance = r1;
    }

    public final void setTotal(int r1) {
        this.total = r1;
    }

    @aa1
    public String toString() {
        return "BDFindLocationResponse(status=" + this.status + ", message='" + this.message + "', total=" + this.total + ", size=" + this.size + ", distance=" + this.distance + ", toll_distance=" + this.toll_distance + ", start_point=" + this.start_point + ", end_point=" + this.end_point + ", points=" + this.points + I000IiI1O.iO.iO;
    }
}
