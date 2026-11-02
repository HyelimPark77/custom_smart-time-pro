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
        Boolean r1 = null;
        Boolean r2 = null;
        String r3 = null;
        Boolean r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ SortX copy$default(SortX r0, Boolean r1, Boolean r2, String r3, Boolean r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.ascending;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.descending;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.direction;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.ignoreCase;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.nullHandling;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.property;
    L20:
        String r9 = r5;
        String r10 = r6;
        String r11 = r3;
        Boolean r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final SortX copy(@tb1 Boolean r8, @tb1 Boolean r9, @tb1 String r10, @tb1 Boolean r11, @tb1 String r12, @tb1 String r13) {
        return new SortX(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SortX) == true) goto L8;
        return false;
    L8:
        SortX r6 = (SortX) r5;
        if (Intrinsics.XOO0ii0(this.ascending, r6.ascending) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.descending, r6.descending) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.direction, r6.direction) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.ignoreCase, r6.ignoreCase) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.nullHandling, r6.nullHandling) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.property, r6.property) == true) goto L26;
        return false;
    L26:
        return true;
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
        Boolean r0 = this.ascending;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        Boolean r4 = this.descending;
        if (r4 != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (r3 + r5) * 31;
        String r7 = this.direction;
        if (r7 != null) goto L13;
        int r8 = 0;
    L14:
        int r9 = (r6 + r8) * 31;
        Boolean r10 = this.ignoreCase;
        if (r10 != null) goto L17;
        int r11 = 0;
    L18:
        int r12 = (r9 + r11) * 31;
        String r13 = this.nullHandling;
        if (r13 != null) goto L21;
        int r14 = 0;
    L22:
        int r15 = (r12 + r14) * 31;
        String r16 = this.property;
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
        return "SortX(ascending=" + this.ascending + ", descending=" + this.descending + ", direction=" + this.direction + ", ignoreCase=" + this.ignoreCase + ", nullHandling=" + this.nullHandling + ", property=" + this.property + I000IiI1O.iO.iO;
    }

    public SortX(@tb1 Boolean r1, @tb1 Boolean r2, @tb1 String r3, @tb1 Boolean r4, @tb1 String r5, @tb1 String r6) {
        this.ascending = r1;
        this.descending = r2;
        this.direction = r3;
        this.ignoreCase = r4;
        this.nullHandling = r5;
        this.property = r6;
    }

    public /* synthetic */ SortX(Boolean r2, Boolean r3, String r4, Boolean r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
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
        String r10 = null;
    L20:
        String r11 = r6;
        Boolean r12 = r5;
        String r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L21:
        r10 = r7;
        goto L20
    }
}
