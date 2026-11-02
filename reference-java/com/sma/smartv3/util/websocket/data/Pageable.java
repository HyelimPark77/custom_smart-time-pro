package com.sma.smartv3.util.websocket.data;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class Pageable {

    @tb1
    private final Integer offset;

    @tb1
    private final Integer pageNumber;

    @tb1
    private final Integer pageSize;

    @tb1
    private final Boolean paged;

    @tb1
    private final List<SortX> sort;

    @tb1
    private final Boolean unpaged;

    public Pageable() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pageable copy$default(Pageable pageable, Integer num, Integer num2, Integer num3, Boolean bool, List list, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pageable.offset;
        }
        if ((i & 2) != 0) {
            num2 = pageable.pageNumber;
        }
        if ((i & 4) != 0) {
            num3 = pageable.pageSize;
        }
        if ((i & 8) != 0) {
            bool = pageable.paged;
        }
        if ((i & 16) != 0) {
            list = pageable.sort;
        }
        if ((i & 32) != 0) {
            bool2 = pageable.unpaged;
        }
        List list2 = list;
        Boolean bool3 = bool2;
        return pageable.copy(num, num2, num3, bool, list2, bool3);
    }

    @tb1
    public final Integer component1() {
        return this.offset;
    }

    @tb1
    public final Integer component2() {
        return this.pageNumber;
    }

    @tb1
    public final Integer component3() {
        return this.pageSize;
    }

    @tb1
    public final Boolean component4() {
        return this.paged;
    }

    @tb1
    public final List<SortX> component5() {
        return this.sort;
    }

    @tb1
    public final Boolean component6() {
        return this.unpaged;
    }

    @aa1
    public final Pageable copy(@tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Boolean bool, @tb1 List<SortX> list, @tb1 Boolean bool2) {
        return new Pageable(num, num2, num3, bool, list, bool2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pageable)) {
            return false;
        }
        Pageable pageable = (Pageable) obj;
        return Intrinsics.XOO0ii0(this.offset, pageable.offset) && Intrinsics.XOO0ii0(this.pageNumber, pageable.pageNumber) && Intrinsics.XOO0ii0(this.pageSize, pageable.pageSize) && Intrinsics.XOO0ii0(this.paged, pageable.paged) && Intrinsics.XOO0ii0(this.sort, pageable.sort) && Intrinsics.XOO0ii0(this.unpaged, pageable.unpaged);
    }

    @tb1
    public final Integer getOffset() {
        return this.offset;
    }

    @tb1
    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    @tb1
    public final Integer getPageSize() {
        return this.pageSize;
    }

    @tb1
    public final Boolean getPaged() {
        return this.paged;
    }

    @tb1
    public final List<SortX> getSort() {
        return this.sort;
    }

    @tb1
    public final Boolean getUnpaged() {
        return this.unpaged;
    }

    public int hashCode() {
        Integer num = this.offset;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageNumber;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pageSize;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.paged;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SortX> list = this.sort;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.unpaged;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @aa1
    public String toString() {
        return "Pageable(offset=" + this.offset + ", pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ", paged=" + this.paged + ", sort=" + this.sort + ", unpaged=" + this.unpaged + I000IiI1O.C2156iO.f1007iO;
    }

    public Pageable(@tb1 Integer num, @tb1 Integer num2, @tb1 Integer num3, @tb1 Boolean bool, @tb1 List<SortX> list, @tb1 Boolean bool2) {
        this.offset = num;
        this.pageNumber = num2;
        this.pageSize = num3;
        this.paged = bool;
        this.sort = list;
        this.unpaged = bool2;
    }

    public /* synthetic */ Pageable(Integer num, Integer num2, Integer num3, Boolean bool, List list, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : bool2);
    }
}
