package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class SortX {

    @tb1
    private final Boolean ascending;

    @tb1
    private final Boolean descending;

    @tb1
    private final String direction;

    @tb1
    private final Boolean ignoreCase;

    @tb1
    private final String nullHandling;

    @tb1
    private final String property;

    public SortX() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SortX copy$default(SortX sortX, Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sortX.ascending;
        }
        if ((i & 2) != 0) {
            bool2 = sortX.descending;
        }
        if ((i & 4) != 0) {
            str = sortX.direction;
        }
        if ((i & 8) != 0) {
            bool3 = sortX.ignoreCase;
        }
        if ((i & 16) != 0) {
            str2 = sortX.nullHandling;
        }
        if ((i & 32) != 0) {
            str3 = sortX.property;
        }
        String str4 = str2;
        String str5 = str3;
        return sortX.copy(bool, bool2, str, bool3, str4, str5);
    }

    @tb1
    public final Boolean component1() {
        return this.ascending;
    }

    @tb1
    public final Boolean component2() {
        return this.descending;
    }

    @tb1
    public final String component3() {
        return this.direction;
    }

    @tb1
    public final Boolean component4() {
        return this.ignoreCase;
    }

    @tb1
    public final String component5() {
        return this.nullHandling;
    }

    @tb1
    public final String component6() {
        return this.property;
    }

    @aa1
    public final SortX copy(@tb1 Boolean bool, @tb1 Boolean bool2, @tb1 String str, @tb1 Boolean bool3, @tb1 String str2, @tb1 String str3) {
        return new SortX(bool, bool2, str, bool3, str2, str3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortX)) {
            return false;
        }
        SortX sortX = (SortX) obj;
        return Intrinsics.XOO0ii0(this.ascending, sortX.ascending) && Intrinsics.XOO0ii0(this.descending, sortX.descending) && Intrinsics.XOO0ii0(this.direction, sortX.direction) && Intrinsics.XOO0ii0(this.ignoreCase, sortX.ignoreCase) && Intrinsics.XOO0ii0(this.nullHandling, sortX.nullHandling) && Intrinsics.XOO0ii0(this.property, sortX.property);
    }

    @tb1
    public final Boolean getAscending() {
        return this.ascending;
    }

    @tb1
    public final Boolean getDescending() {
        return this.descending;
    }

    @tb1
    public final String getDirection() {
        return this.direction;
    }

    @tb1
    public final Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    @tb1
    public final String getNullHandling() {
        return this.nullHandling;
    }

    @tb1
    public final String getProperty() {
        return this.property;
    }

    public int hashCode() {
        Boolean bool = this.ascending;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.descending;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.direction;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.ignoreCase;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.nullHandling;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.property;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @aa1
    public String toString() {
        return "SortX(ascending=" + this.ascending + ", descending=" + this.descending + ", direction=" + this.direction + ", ignoreCase=" + this.ignoreCase + ", nullHandling=" + this.nullHandling + ", property=" + this.property + I000IiI1O.C2156iO.f1007iO;
    }

    public SortX(@tb1 Boolean bool, @tb1 Boolean bool2, @tb1 String str, @tb1 Boolean bool3, @tb1 String str2, @tb1 String str3) {
        this.ascending = bool;
        this.descending = bool2;
        this.direction = str;
        this.ignoreCase = bool3;
        this.nullHandling = str2;
        this.property = str3;
    }

    public /* synthetic */ SortX(Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
