package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TodayData {

    @aa1
    private final String dataType;

    @aa1
    private String mExtraInfo;
    private final int onClickID;

    @aa1
    private final String state;
    private final int stateColor;
    private final long time;

    @aa1
    private final String title;

    @aa1
    private final String value;
    private final float value1;
    private final float value2;

    public TodayData() {
        long r1 = 0;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        String r7 = null;
        int r8 = 0;
        String r9 = null;
        float r10 = 0.0f;
        float r11 = 0.0f;
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    public static /* synthetic */ TodayData copy$default(TodayData r12, long r13, String r15, String r16, String r17, int r18, String r19, int r20, String r21, float r22, float r23, int r24, Object r25) {
        if ((r24 & 1) == 0) goto L5;
        r13 = r12.time;
    L5:
        long r1 = r13;
        if ((r24 & 2) == 0) goto L8;
        r15 = r12.title;
    L8:
        String r3 = r15;
        if ((r24 & 4) == 0) goto L11;
        String r4 = r12.value;
    L13:
        if ((r24 & 8) == 0) goto L15;
        String r5 = r12.state;
    L17:
        if ((r24 & 16) == 0) goto L19;
        int r6 = r12.stateColor;
    L21:
        if ((r24 & 32) == 0) goto L23;
        String r7 = r12.dataType;
    L25:
        if ((r24 & 64) == 0) goto L27;
        int r8 = r12.onClickID;
    L29:
        if ((r24 & 128) == 0) goto L31;
        String r9 = r12.mExtraInfo;
    L33:
        if ((r24 & 256) == 0) goto L35;
        float r10 = r12.value1;
    L37:
        if ((r24 & 512) == 0) goto L40;
        float r11 = r12.value2;
    L42:
        return r12.copy(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11);
    L40:
        r11 = r23;
        goto L42
    L35:
        r10 = r22;
        goto L37
    L31:
        r9 = r21;
        goto L33
    L27:
        r8 = r20;
        goto L29
    L23:
        r7 = r19;
        goto L25
    L19:
        r6 = r18;
        goto L21
    L15:
        r5 = r17;
        goto L17
    L11:
        r4 = r16;
        goto L13
    }

    public final long component1() {
        return this.time;
    }

    public final float component10() {
        return this.value2;
    }

    @aa1
    public final String component2() {
        return this.title;
    }

    @aa1
    public final String component3() {
        return this.value;
    }

    @aa1
    public final String component4() {
        return this.state;
    }

    public final int component5() {
        return this.stateColor;
    }

    @aa1
    public final String component6() {
        return this.dataType;
    }

    public final int component7() {
        return this.onClickID;
    }

    @aa1
    public final String component8() {
        return this.mExtraInfo;
    }

    public final float component9() {
        return this.value1;
    }

    @aa1
    public final TodayData copy(long r14, @aa1 String r16, @aa1 String r17, @aa1 String r18, int r19, @aa1 String r20, int r21, @aa1 String r22, float r23, float r24) {
        Intrinsics.X0O(r16, "title");
        Intrinsics.X0O(r17, "value");
        Intrinsics.X0O(r18, "state");
        Intrinsics.X0O(r20, "dataType");
        Intrinsics.X0O(r22, "mExtraInfo");
        return new TodayData(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TodayData) == true) goto L8;
        return false;
    L8:
        TodayData r9 = (TodayData) r8;
        if (this.time == r9.time) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.title, r9.title) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.value, r9.value) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.state, r9.state) == true) goto L21;
        return false;
    L21:
        if (this.stateColor == r9.stateColor) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.dataType, r9.dataType) == true) goto L27;
        return false;
    L27:
        if (this.onClickID == r9.onClickID) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mExtraInfo, r9.mExtraInfo) == true) goto L33;
        return false;
    L33:
        if (Float.compare(this.value1, r9.value1) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.value2, r9.value2) == 0) goto L38;
        return false;
    L38:
        return true;
    }

    @aa1
    public final String getDataType() {
        return this.dataType;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    public final int getOnClickID() {
        return this.onClickID;
    }

    @aa1
    public final String getState() {
        return this.state;
    }

    public final int getStateColor() {
        return this.stateColor;
    }

    public final long getTime() {
        return this.time;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    @aa1
    public final String getValue() {
        return this.value;
    }

    public final float getValue1() {
        return this.value1;
    }

    public final float getValue2() {
        return this.value2;
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.time) * 31) + this.title.hashCode()) * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Integer.hashCode(this.stateColor)) * 31) + this.dataType.hashCode()) * 31) + Integer.hashCode(this.onClickID)) * 31) + this.mExtraInfo.hashCode()) * 31) + Float.hashCode(this.value1)) * 31) + Float.hashCode(this.value2);
    }

    public final void setMExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExtraInfo = r2;
    }

    @aa1
    public String toString() {
        return "TodayData(time=" + this.time + ", title=" + this.title + ", value=" + this.value + ", state=" + this.state + ", stateColor=" + this.stateColor + ", dataType=" + this.dataType + ", onClickID=" + this.onClickID + ", mExtraInfo=" + this.mExtraInfo + ", value1=" + this.value1 + ", value2=" + this.value2 + I000IiI1O.iO.iO;
    }

    public TodayData(long r2, @aa1 String r4, @aa1 String r5, @aa1 String r6, int r7, @aa1 String r8, int r9, @aa1 String r10, float r11, float r12) {
        Intrinsics.X0O(r4, "title");
        Intrinsics.X0O(r5, "value");
        Intrinsics.X0O(r6, "state");
        Intrinsics.X0O(r8, "dataType");
        Intrinsics.X0O(r10, "mExtraInfo");
        this.time = r2;
        this.title = r4;
        this.value = r5;
        this.state = r6;
        this.stateColor = r7;
        this.dataType = r8;
        this.onClickID = r9;
        this.mExtraInfo = r10;
        this.value1 = r11;
        this.value2 = r12;
    }

    public /* synthetic */ TodayData(long r13, String r15, String r16, String r17, int r18, String r19, int r20, String r21, float r22, float r23, int r24, DefaultConstructorMarker r25) {
        if ((r24 & 1) == 0) goto L5;
        r13 = 0;
    L5:
        long r1 = r13;
        if ((r24 & 2) == 0) goto L8;
        String r3 = "";
    L10:
        if ((r24 & 4) == 0) goto L12;
        String r4 = "";
    L14:
        if ((r24 & 8) == 0) goto L16;
        String r5 = "";
    L18:
        if ((r24 & 16) == 0) goto L20;
        int r6 = 0;
    L22:
        if ((r24 & 32) == 0) goto L24;
        String r7 = "";
    L26:
        if ((r24 & 64) == 0) goto L28;
        int r8 = 0;
    L30:
        if ((r24 & 128) == 0) goto L32;
        String r9 = "";
    L34:
        if ((r24 & 256) == 0) goto L36;
        float r10 = 0.0f;
    L38:
        if ((r24 & 512) == 0) goto L41;
        float r11 = 0.0f;
    L42:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        return;
    L41:
        r11 = r23;
        goto L42
    L36:
        r10 = r22;
        goto L38
    L32:
        r9 = r21;
        goto L34
    L28:
        r8 = r20;
        goto L30
    L24:
        r7 = r19;
        goto L26
    L20:
        r6 = r18;
        goto L22
    L16:
        r5 = r17;
        goto L18
    L12:
        r4 = r16;
        goto L14
    L8:
        r3 = r15;
        goto L10
    }
}
