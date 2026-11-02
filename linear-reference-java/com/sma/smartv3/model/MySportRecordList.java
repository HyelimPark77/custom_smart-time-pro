package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MySportRecordList {
    private final int icon;
    private final int iconInt;
    private final long time;

    @aa1
    private final String title;
    private final int value;

    @aa1
    private final String valueStr;
    private final int workoutId;

    public MySportRecordList() {
        int r1 = 0;
        String r2 = null;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        long r6 = 0;
        int r8 = 0;
        this(r1, r2, r3, r4, r5, r6, r8, 127, null);
    }

    public static /* synthetic */ MySportRecordList copy$default(MySportRecordList r0, int r1, String r2, int r3, int r4, String r5, long r6, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.icon;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.title;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r0.workoutId;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r0.value;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r0.valueStr;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r6 = r0.time;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r0.iconInt;
    L23:
        int r11 = r8;
        long r12 = r6;
        int r7 = r4;
        String r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r7, r13, r12, r11);
    }

    public final int component1() {
        return this.icon;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.workoutId;
    }

    public final int component4() {
        return this.value;
    }

    @aa1
    public final String component5() {
        return this.valueStr;
    }

    public final long component6() {
        return this.time;
    }

    public final int component7() {
        return this.iconInt;
    }

    @aa1
    public final MySportRecordList copy(int r11, @aa1 String r12, int r13, int r14, @aa1 String r15, long r16, int r18) {
        Intrinsics.X0O(r12, "title");
        Intrinsics.X0O(r15, "valueStr");
        return new MySportRecordList(r11, r12, r13, r14, r15, r16, r18);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof MySportRecordList) == true) goto L8;
        return false;
    L8:
        MySportRecordList r9 = (MySportRecordList) r8;
        if (this.icon == r9.icon) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.title, r9.title) == true) goto L15;
        return false;
    L15:
        if (this.workoutId == r9.workoutId) goto L18;
        return false;
    L18:
        if (this.value == r9.value) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.valueStr, r9.valueStr) == true) goto L24;
        return false;
    L24:
        if (this.time == r9.time) goto L27;
        return false;
    L27:
        if (this.iconInt == r9.iconInt) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconInt() {
        return this.iconInt;
    }

    public final long getTime() {
        return this.time;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    @aa1
    public final String getValueStr() {
        return this.valueStr;
    }

    public final int getWorkoutId() {
        return this.workoutId;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.icon) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.workoutId)) * 31) + Integer.hashCode(this.value)) * 31) + this.valueStr.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.iconInt);
    }

    @aa1
    public String toString() {
        return "MySportRecordList(icon=" + this.icon + ", title=" + this.title + ", workoutId=" + this.workoutId + ", value=" + this.value + ", valueStr=" + this.valueStr + ", time=" + this.time + ", iconInt=" + this.iconInt + I000IiI1O.iO.iO;
    }

    public MySportRecordList(int r2, @aa1 String r3, int r4, int r5, @aa1 String r6, long r7, int r9) {
        Intrinsics.X0O(r3, "title");
        Intrinsics.X0O(r6, "valueStr");
        this.icon = r2;
        this.title = r3;
        this.workoutId = r4;
        this.value = r5;
        this.valueStr = r6;
        this.time = r7;
        this.iconInt = r9;
    }

    public /* synthetic */ MySportRecordList(int r3, String r4, int r5, int r6, String r7, long r8, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = -1;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        int r13 = 0;
    L23:
        long r9 = r8;
        String r14 = r7;
        int r15 = r6;
        int r16 = r5;
        this(r3, r4, r16, r15, r14, r9, r13);
        return;
    L24:
        r13 = r10;
        goto L23
    }
}
