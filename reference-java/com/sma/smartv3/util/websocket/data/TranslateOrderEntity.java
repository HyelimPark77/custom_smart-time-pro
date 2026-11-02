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
public final class TranslateOrderEntity {

    @tb1
    private final List<TranslateOrderItemEntity> content;

    @tb1
    private final Boolean empty;

    @tb1
    private final Boolean first;

    @tb1
    private final Boolean last;

    @tb1
    private final Integer number;

    @tb1
    private final Integer numberOfElements;

    @tb1
    private final Pageable pageable;

    @tb1
    private final Integer size;

    @tb1
    private final List<SortX> sort;

    @tb1
    private final Integer totalElements;
    private final int totalPages;

    public TranslateOrderEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 0, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslateOrderEntity copy$default(TranslateOrderEntity translateOrderEntity, List list, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Pageable pageable, Integer num3, List list2, Integer num4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = translateOrderEntity.content;
        }
        if ((i2 & 2) != 0) {
            bool = translateOrderEntity.empty;
        }
        if ((i2 & 4) != 0) {
            bool2 = translateOrderEntity.first;
        }
        if ((i2 & 8) != 0) {
            bool3 = translateOrderEntity.last;
        }
        if ((i2 & 16) != 0) {
            num = translateOrderEntity.number;
        }
        if ((i2 & 32) != 0) {
            num2 = translateOrderEntity.numberOfElements;
        }
        if ((i2 & 64) != 0) {
            pageable = translateOrderEntity.pageable;
        }
        if ((i2 & 128) != 0) {
            num3 = translateOrderEntity.size;
        }
        if ((i2 & 256) != 0) {
            list2 = translateOrderEntity.sort;
        }
        if ((i2 & 512) != 0) {
            num4 = translateOrderEntity.totalElements;
        }
        if ((i2 & 1024) != 0) {
            i = translateOrderEntity.totalPages;
        }
        Integer num5 = num4;
        int i3 = i;
        Integer num6 = num3;
        List list3 = list2;
        Integer num7 = num2;
        Pageable pageable2 = pageable;
        Integer num8 = num;
        Boolean bool4 = bool2;
        return translateOrderEntity.copy(list, bool, bool4, bool3, num8, num7, pageable2, num6, list3, num5, i3);
    }

    @tb1
    public final List<TranslateOrderItemEntity> component1() {
        return this.content;
    }

    @tb1
    public final Integer component10() {
        return this.totalElements;
    }

    public final int component11() {
        return this.totalPages;
    }

    @tb1
    public final Boolean component2() {
        return this.empty;
    }

    @tb1
    public final Boolean component3() {
        return this.first;
    }

    @tb1
    public final Boolean component4() {
        return this.last;
    }

    @tb1
    public final Integer component5() {
        return this.number;
    }

    @tb1
    public final Integer component6() {
        return this.numberOfElements;
    }

    @tb1
    public final Pageable component7() {
        return this.pageable;
    }

    @tb1
    public final Integer component8() {
        return this.size;
    }

    @tb1
    public final List<SortX> component9() {
        return this.sort;
    }

    @aa1
    public final TranslateOrderEntity copy(@tb1 List<TranslateOrderItemEntity> list, @tb1 Boolean bool, @tb1 Boolean bool2, @tb1 Boolean bool3, @tb1 Integer num, @tb1 Integer num2, @tb1 Pageable pageable, @tb1 Integer num3, @tb1 List<SortX> list2, @tb1 Integer num4, int i) {
        return new TranslateOrderEntity(list, bool, bool2, bool3, num, num2, pageable, num3, list2, num4, i);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateOrderEntity)) {
            return false;
        }
        TranslateOrderEntity translateOrderEntity = (TranslateOrderEntity) obj;
        return Intrinsics.XOO0ii0(this.content, translateOrderEntity.content) && Intrinsics.XOO0ii0(this.empty, translateOrderEntity.empty) && Intrinsics.XOO0ii0(this.first, translateOrderEntity.first) && Intrinsics.XOO0ii0(this.last, translateOrderEntity.last) && Intrinsics.XOO0ii0(this.number, translateOrderEntity.number) && Intrinsics.XOO0ii0(this.numberOfElements, translateOrderEntity.numberOfElements) && Intrinsics.XOO0ii0(this.pageable, translateOrderEntity.pageable) && Intrinsics.XOO0ii0(this.size, translateOrderEntity.size) && Intrinsics.XOO0ii0(this.sort, translateOrderEntity.sort) && Intrinsics.XOO0ii0(this.totalElements, translateOrderEntity.totalElements) && this.totalPages == translateOrderEntity.totalPages;
    }

    @tb1
    public final List<TranslateOrderItemEntity> getContent() {
        return this.content;
    }

    @tb1
    public final Boolean getEmpty() {
        return this.empty;
    }

    @tb1
    public final Boolean getFirst() {
        return this.first;
    }

    @tb1
    public final Boolean getLast() {
        return this.last;
    }

    @tb1
    public final Integer getNumber() {
        return this.number;
    }

    @tb1
    public final Integer getNumberOfElements() {
        return this.numberOfElements;
    }

    @tb1
    public final Pageable getPageable() {
        return this.pageable;
    }

    @tb1
    public final Integer getSize() {
        return this.size;
    }

    @tb1
    public final List<SortX> getSort() {
        return this.sort;
    }

    @tb1
    public final Integer getTotalElements() {
        return this.totalElements;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        List<TranslateOrderItemEntity> list = this.content;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.empty;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.first;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.last;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.number;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.numberOfElements;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Pageable pageable = this.pageable;
        int iHashCode7 = (iHashCode6 + (pageable == null ? 0 : pageable.hashCode())) * 31;
        Integer num3 = this.size;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<SortX> list2 = this.sort;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num4 = this.totalElements;
        return ((iHashCode9 + (num4 != null ? num4.hashCode() : 0)) * 31) + Integer.hashCode(this.totalPages);
    }

    @aa1
    public String toString() {
        return "TranslateOrderEntity(content=" + this.content + ", empty=" + this.empty + ", first=" + this.first + ", last=" + this.last + ", number=" + this.number + ", numberOfElements=" + this.numberOfElements + ", pageable=" + this.pageable + ", size=" + this.size + ", sort=" + this.sort + ", totalElements=" + this.totalElements + ", totalPages=" + this.totalPages + I000IiI1O.C2156iO.f1007iO;
    }

    public TranslateOrderEntity(@tb1 List<TranslateOrderItemEntity> list, @tb1 Boolean bool, @tb1 Boolean bool2, @tb1 Boolean bool3, @tb1 Integer num, @tb1 Integer num2, @tb1 Pageable pageable, @tb1 Integer num3, @tb1 List<SortX> list2, @tb1 Integer num4, int i) {
        this.content = list;
        this.empty = bool;
        this.first = bool2;
        this.last = bool3;
        this.number = num;
        this.numberOfElements = num2;
        this.pageable = pageable;
        this.size = num3;
        this.sort = list2;
        this.totalElements = num4;
        this.totalPages = i;
    }

    public /* synthetic */ TranslateOrderEntity(List list, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Pageable pageable, Integer num3, List list2, Integer num4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : pageable, (i2 & 128) != 0 ? null : num3, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : num4, (i2 & 1024) != 0 ? 1 : i);
    }
}
