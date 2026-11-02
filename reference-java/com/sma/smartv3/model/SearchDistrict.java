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
        this(null, null, 0.0d, 0.0d, 15, null);
    }

    public static /* synthetic */ SearchDistrict copy$default(SearchDistrict searchDistrict, String str, String str2, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchDistrict.name;
        }
        if ((i & 2) != 0) {
            str2 = searchDistrict.district;
        }
        if ((i & 4) != 0) {
            d = searchDistrict.latitude;
        }
        if ((i & 8) != 0) {
            d2 = searchDistrict.longitude;
        }
        double d3 = d2;
        return searchDistrict.copy(str, str2, d, d3);
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
    public final SearchDistrict copy(@aa1 String name, @aa1 String district, double d, double d2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(district, "district");
        return new SearchDistrict(name, district, d, d2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDistrict)) {
            return false;
        }
        SearchDistrict searchDistrict = (SearchDistrict) obj;
        return Intrinsics.XOO0ii0(this.name, searchDistrict.name) && Intrinsics.XOO0ii0(this.district, searchDistrict.district) && Double.compare(this.latitude, searchDistrict.latitude) == 0 && Double.compare(this.longitude, searchDistrict.longitude) == 0;
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
        return "SearchDistrict(name=" + this.name + ", district=" + this.district + ", latitude=" + this.latitude + ", longitude=" + this.longitude + I000IiI1O.C2156iO.f1007iO;
    }

    public SearchDistrict(@aa1 String name, @aa1 String district, double d, double d2) {
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(district, "district");
        this.name = name;
        this.district = district;
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ SearchDistrict(String str, String str2, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? 0.0d : d2);
    }
}
