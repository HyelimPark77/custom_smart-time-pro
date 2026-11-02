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
        List r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        Boolean r4 = null;
        Integer r5 = null;
        Integer r6 = null;
        Pageable r7 = null;
        Integer r8 = null;
        List r9 = null;
        Integer r10 = null;
        int r11 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslateOrderEntity copy$default(TranslateOrderEntity r0, List r1, Boolean r2, Boolean r3, Boolean r4, Integer r5, Integer r6, Pageable r7, Integer r8, List r9, Integer r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.content;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.empty;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r3 = r0.first;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r4 = r0.last;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r5 = r0.number;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r6 = r0.numberOfElements;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r7 = r0.pageable;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r8 = r0.size;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r9 = r0.sort;
    L30:
        if ((r12 & 512) == 0) goto L33;
        r10 = r0.totalElements;
    L33:
        if ((r12 & 1024) == 0) goto L35;
        r11 = r0.totalPages;
    L35:
        Integer r14 = r10;
        int r15 = r11;
        Integer r16 = r8;
        List r17 = r9;
        Integer r18 = r6;
        Pageable r19 = r7;
        Boolean r20 = r4;
        Integer r21 = r5;
        Boolean r22 = r3;
        List r23 = r1;
        return r0.copy(r23, r2, r22, r20, r21, r18, r19, r16, r17, r14, r15);
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
    public final TranslateOrderEntity copy(@tb1 List<TranslateOrderItemEntity> r13, @tb1 Boolean r14, @tb1 Boolean r15, @tb1 Boolean r16, @tb1 Integer r17, @tb1 Integer r18, @tb1 Pageable r19, @tb1 Integer r20, @tb1 List<SortX> r21, @tb1 Integer r22, int r23) {
        return new TranslateOrderEntity(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TranslateOrderEntity) == true) goto L8;
        return false;
    L8:
        TranslateOrderEntity r6 = (TranslateOrderEntity) r5;
        if (Intrinsics.XOO0ii0(this.content, r6.content) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.empty, r6.empty) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.first, r6.first) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.last, r6.last) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.number, r6.number) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.numberOfElements, r6.numberOfElements) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.pageable, r6.pageable) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.size, r6.size) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.sort, r6.sort) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.totalElements, r6.totalElements) == true) goto L39;
        return false;
    L39:
        if (this.totalPages == r6.totalPages) goto L41;
        return false;
    L41:
        return true;
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
        List<TranslateOrderItemEntity> r0 = this.content;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Boolean r4 = this.empty;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        Boolean r7 = this.first;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Boolean r10 = this.last;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        Integer r13 = this.number;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        Integer r16 = this.numberOfElements;
        if (r16 != null) goto L25;
        int r17 = 0;
    L26:
        int r18 = (r15 + r17) * 31;
        Pageable r19 = this.pageable;
        if (r19 != null) goto L29;
        int r20 = 0;
    L30:
        int r21 = (r18 + r20) * 31;
        Integer r22 = this.size;
        if (r22 != null) goto L33;
        int r23 = 0;
    L34:
        int r24 = (r21 + r23) * 31;
        List<SortX> r25 = this.sort;
        if (r25 != null) goto L37;
        int r26 = 0;
    L38:
        int r27 = (r24 + r26) * 31;
        Integer r28 = this.totalElements;
        if (r28 == null) goto L43;
        r1 = r28.hashCode();
    L43:
        return ((r27 + r1) * 31) + Integer.hashCode(this.totalPages);
    L37:
        r26 = r25.hashCode();
        goto L38
    L33:
        r23 = r22.hashCode();
        goto L34
    L29:
        r20 = r19.hashCode();
        goto L30
    L25:
        r17 = r16.hashCode();
        goto L26
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
        return "TranslateOrderEntity(content=" + this.content + ", empty=" + this.empty + ", first=" + this.first + ", last=" + this.last + ", number=" + this.number + ", numberOfElements=" + this.numberOfElements + ", pageable=" + this.pageable + ", size=" + this.size + ", sort=" + this.sort + ", totalElements=" + this.totalElements + ", totalPages=" + this.totalPages + I000IiI1O.iO.iO;
    }

    public TranslateOrderEntity(@tb1 List<TranslateOrderItemEntity> r1, @tb1 Boolean r2, @tb1 Boolean r3, @tb1 Boolean r4, @tb1 Integer r5, @tb1 Integer r6, @tb1 Pageable r7, @tb1 Integer r8, @tb1 List<SortX> r9, @tb1 Integer r10, int r11) {
        this.content = r1;
        this.empty = r2;
        this.first = r3;
        this.last = r4;
        this.number = r5;
        this.numberOfElements = r6;
        this.pageable = r7;
        this.size = r8;
        this.sort = r9;
        this.totalElements = r10;
        this.totalPages = r11;
    }

    public /* synthetic */ TranslateOrderEntity(List r2, Boolean r3, Boolean r4, Boolean r5, Integer r6, Integer r7, Pageable r8, Integer r9, List r10, Integer r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = 1;
    L35:
        int r15 = r12;
        Integer r16 = r11;
        List r17 = r10;
        Integer r18 = r9;
        Pageable r19 = r8;
        Integer r20 = r7;
        Integer r21 = r6;
        Boolean r22 = r5;
        Boolean r23 = r4;
        this(r2, r3, r23, r22, r21, r20, r19, r18, r17, r16, r15);
    }
}
