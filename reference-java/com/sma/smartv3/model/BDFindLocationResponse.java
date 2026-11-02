package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BDFindLocationResponse {
    private double distance;
    private int size;
    private int status;
    private double toll_distance;
    private int total;

    @aa1
    private String message = "";

    @aa1
    private Point start_point = new Point();

    @aa1
    private Point end_point = new Point();

    @aa1
    private ArrayList<Points> points = new ArrayList<>();

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

    public final void setDistance(double d) {
        this.distance = d;
    }

    public final void setEnd_point(@aa1 Point point) {
        Intrinsics.X0O(point, "<set-?>");
        this.end_point = point;
    }

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setPoints(@aa1 ArrayList<Points> arrayList) {
        Intrinsics.X0O(arrayList, "<set-?>");
        this.points = arrayList;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setStart_point(@aa1 Point point) {
        Intrinsics.X0O(point, "<set-?>");
        this.start_point = point;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setToll_distance(double d) {
        this.toll_distance = d;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @aa1
    public String toString() {
        return "BDFindLocationResponse(status=" + this.status + ", message='" + this.message + "', total=" + this.total + ", size=" + this.size + ", distance=" + this.distance + ", toll_distance=" + this.toll_distance + ", start_point=" + this.start_point + ", end_point=" + this.end_point + ", points=" + this.points + I000IiI1O.C2156iO.f1007iO;
    }
}
