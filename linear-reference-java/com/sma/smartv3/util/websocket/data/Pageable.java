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
        Integer r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Boolean r4 = null;
        List r5 = null;
        Boolean r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pageable copy$default(Pageable r0, Integer r1, Integer r2, Integer r3, Boolean r4, List r5, Boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.offset;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.pageNumber;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.pageSize;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.paged;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.sort;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.unpaged;
    L20:
        List r9 = r5;
        Boolean r10 = r6;
        Integer r11 = r3;
        Boolean r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final Pageable copy(@tb1 Integer r8, @tb1 Integer r9, @tb1 Integer r10, @tb1 Boolean r11, @tb1 List<SortX> r12, @tb1 Boolean r13) {
        return new Pageable(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Pageable) == true) goto L8;
        return false;
    L8:
        Pageable r6 = (Pageable) r5;
        if (Intrinsics.XOO0ii0(this.offset, r6.offset) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.pageNumber, r6.pageNumber) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.pageSize, r6.pageSize) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.paged, r6.paged) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.sort, r6.sort) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.unpaged, r6.unpaged) == true) goto L26;
        return false;
    L26:
        return true;
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
        Integer r0 = this.offset;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Integer r4 = this.pageNumber;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        Integer r7 = this.pageSize;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Boolean r10 = this.paged;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        List<SortX> r13 = this.sort;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Boolean r16 = this.unpaged;
        if (r16 == null) goto L27;
        r1 = r16.hashCode();
    L27:
        return r15 + r1;
    L21:
        r14 = r13.hashCode();
        goto L22
    L17:
        r11 = r10.hashCode();
        goto L18
    L13:
        r8 = r7.hashCode();
        goto L14
    L9:
        r5 = r4.hashCode();
        goto L10
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    @aa1
    public String toString() {
        return "Pageable(offset=" + this.offset + ", pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ", paged=" + this.paged + ", sort=" + this.sort + ", unpaged=" + this.unpaged + I000IiI1O.iO.iO;
    }

    public Pageable(@tb1 Integer r1, @tb1 Integer r2, @tb1 Integer r3, @tb1 Boolean r4, @tb1 List<SortX> r5, @tb1 Boolean r6) {
        this.offset = r1;
        this.pageNumber = r2;
        this.pageSize = r3;
        this.paged = r4;
        this.sort = r5;
        this.unpaged = r6;
    }

    public /* synthetic */ Pageable(Integer r2, Integer r3, Integer r4, Boolean r5, List r6, Boolean r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        Boolean r10 = null;
    L20:
        List r11 = r6;
        Boolean r12 = r5;
        Integer r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
