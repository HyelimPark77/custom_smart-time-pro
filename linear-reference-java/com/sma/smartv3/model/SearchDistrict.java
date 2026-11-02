package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchDistrict {

    @aa1
    private final String district;
    private final double latitude;
    private final double longitude;

    @aa1
    private final String name;

    public SearchDistrict() {
        String r1 = null;
        String r2 = null;
        double r3 = 0.0d;
        double r5 = 0.0d;
        this(r1, r2, r3, r5, 15, null);
    }

    public static /* synthetic */ SearchDistrict copy$default(SearchDistrict r0, String r1, String r2, double r3, double r5, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.name;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.district;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.latitude;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r5 = r0.longitude;
    L14:
        double r9 = r5;
        double r6 = r3;
        return r0.copy(r1, r2, r6, r9);
    }

    @aa1
    public final String component1() {
        return this.name;
    }

    @aa1
    public final String component2() {
        return this.district;
    }

    public final double component3() {
        return this.latitude;
    }

    public final double component4() {
        return this.longitude;
    }

    @aa1
    public final SearchDistrict copy(@aa1 String r9, @aa1 String r10, double r11, double r13) {
        Intrinsics.X0O(r9, "name");
        Intrinsics.X0O(r10, "district");
        return new SearchDistrict(r9, r10, r11, r13);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SearchDistrict) == true) goto L8;
        return false;
    L8:
        SearchDistrict r9 = (SearchDistrict) r8;
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.district, r9.district) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.latitude, r9.latitude) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.longitude, r9.longitude) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getDistrict() {
        return this.district;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.district.hashCode()) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.longitude);
    }

    @aa1
    public String toString() {
        return "SearchDistrict(name=" + this.name + ", district=" + this.district + ", latitude=" + this.latitude + ", longitude=" + this.longitude + I000IiI1O.iO.iO;
    }

    public SearchDistrict(@aa1 String r2, @aa1 String r3, double r4, double r6) {
        Intrinsics.X0O(r2, "name");
        Intrinsics.X0O(r3, "district");
        this.name = r2;
        this.district = r3;
        this.latitude = r4;
        this.longitude = r6;
    }

    public /* synthetic */ SearchDistrict(String r3, String r4, double r5, double r7, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = 0.0d;
    L12:
        if ((r9 & 8) == 0) goto L15;
        double r8 = 0.0d;
    L14:
        double r6 = r5;
        this(r3, r4, r6, r8);
        return;
    L15:
        r8 = r7;
        goto L14
    }
}
