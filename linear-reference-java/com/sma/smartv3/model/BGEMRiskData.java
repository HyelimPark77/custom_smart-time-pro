package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.BaiDu;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMRiskData extends JsonFieldContainer {
    private int current_level;

    @aa1
    private String end_time;

    @aa1
    private String insights;

    @aa1
    private Object locale_insights;

    @aa1
    private Object locale_tips;

    @aa1
    private String measurement_id;

    @aa1
    private String risk_code;

    @aa1
    private String start_time;

    @aa1
    private String[] tips;

    public BGEMRiskData() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String[] r4 = null;
        Object r5 = null;
        Object r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BGEMRiskData copy$default(BGEMRiskData r0, int r1, String r2, String r3, String[] r4, Object r5, Object r6, String r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.current_level;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.risk_code;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.insights;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.tips;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.locale_insights;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.locale_tips;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.measurement_id;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.start_time;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.end_time;
    L29:
        String r12 = r8;
        String r13 = r9;
        Object r14 = r6;
        String r15 = r7;
        String[] r16 = r4;
        Object r17 = r5;
        String r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.current_level;
    }

    @aa1
    public final String component2() {
        return this.risk_code;
    }

    @aa1
    public final String component3() {
        return this.insights;
    }

    @aa1
    public final String[] component4() {
        return this.tips;
    }

    @aa1
    public final Object component5() {
        return this.locale_insights;
    }

    @aa1
    public final Object component6() {
        return this.locale_tips;
    }

    @aa1
    public final String component7() {
        return this.measurement_id;
    }

    @aa1
    public final String component8() {
        return this.start_time;
    }

    @aa1
    public final String component9() {
        return this.end_time;
    }

    @aa1
    public final BGEMRiskData copy(int r12, @aa1 String r13, @aa1 String r14, @aa1 String[] r15, @aa1 Object r16, @aa1 Object r17, @aa1 String r18, @aa1 String r19, @aa1 String r20) {
        Intrinsics.X0O(r13, "risk_code");
        Intrinsics.X0O(r14, "insights");
        Intrinsics.X0O(r15, "tips");
        Intrinsics.X0O(r16, "locale_insights");
        Intrinsics.X0O(r17, "locale_tips");
        Intrinsics.X0O(r18, "measurement_id");
        Intrinsics.X0O(r19, BaiDu.START_TIME);
        Intrinsics.X0O(r20, "end_time");
        return new BGEMRiskData(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMRiskData) == true) goto L8;
        return false;
    L8:
        BGEMRiskData r6 = (BGEMRiskData) r5;
        if (this.current_level == r6.current_level) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.risk_code, r6.risk_code) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.insights, r6.insights) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.tips, r6.tips) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.locale_insights, r6.locale_insights) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.locale_tips, r6.locale_tips) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.measurement_id, r6.measurement_id) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.start_time, r6.start_time) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.end_time, r6.end_time) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getCurrent_level() {
        return this.current_level;
    }

    @aa1
    public final String getEnd_time() {
        return this.end_time;
    }

    @aa1
    public final String getInsights() {
        return this.insights;
    }

    @aa1
    public final Object getLocale_insights() {
        return this.locale_insights;
    }

    @aa1
    public final Object getLocale_tips() {
        return this.locale_tips;
    }

    @aa1
    public final String getMeasurement_id() {
        return this.measurement_id;
    }

    @aa1
    public final String getRisk_code() {
        return this.risk_code;
    }

    @aa1
    public final String getStart_time() {
        return this.start_time;
    }

    @aa1
    public final String[] getTips() {
        return this.tips;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.current_level) * 31) + this.risk_code.hashCode()) * 31) + this.insights.hashCode()) * 31) + Arrays.hashCode(this.tips)) * 31) + this.locale_insights.hashCode()) * 31) + this.locale_tips.hashCode()) * 31) + this.measurement_id.hashCode()) * 31) + this.start_time.hashCode()) * 31) + this.end_time.hashCode();
    }

    public final void setCurrent_level(int r1) {
        this.current_level = r1;
    }

    public final void setEnd_time(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.end_time = r2;
    }

    public final void setInsights(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.insights = r2;
    }

    public final void setLocale_insights(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.locale_insights = r2;
    }

    public final void setLocale_tips(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.locale_tips = r2;
    }

    public final void setMeasurement_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.measurement_id = r2;
    }

    public final void setRisk_code(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.risk_code = r2;
    }

    public final void setStart_time(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.start_time = r2;
    }

    public final void setTips(@aa1 String[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.tips = r2;
    }

    @aa1
    public String toString() {
        return "BGEMRiskData(current_level=" + this.current_level + ", risk_code=" + this.risk_code + ", insights=" + this.insights + ", tips=" + Arrays.toString(this.tips) + ", locale_insights=" + this.locale_insights + ", locale_tips=" + this.locale_tips + ", measurement_id=" + this.measurement_id + ", start_time=" + this.start_time + ", end_time=" + this.end_time + I000IiI1O.iO.iO;
    }

    public BGEMRiskData(int r2, @aa1 String r3, @aa1 String r4, @aa1 String[] r5, @aa1 Object r6, @aa1 Object r7, @aa1 String r8, @aa1 String r9, @aa1 String r10) {
        Intrinsics.X0O(r3, "risk_code");
        Intrinsics.X0O(r4, "insights");
        Intrinsics.X0O(r5, "tips");
        Intrinsics.X0O(r6, "locale_insights");
        Intrinsics.X0O(r7, "locale_tips");
        Intrinsics.X0O(r8, "measurement_id");
        Intrinsics.X0O(r9, BaiDu.START_TIME);
        Intrinsics.X0O(r10, "end_time");
        this.current_level = r2;
        this.risk_code = r3;
        this.insights = r4;
        this.tips = r5;
        this.locale_insights = r6;
        this.locale_tips = r7;
        this.measurement_id = r8;
        this.start_time = r9;
        this.end_time = r10;
    }

    public /* synthetic */ BGEMRiskData(int r3, String r4, String r5, String[] r6, Object r7, Object r8, String r9, String r10, String r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = new String[0];
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = new Object();
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = new Object();
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r12 & 256) == 0) goto L30;
        String r14 = "";
    L29:
        String r15 = r10;
        String r16 = r9;
        Object r17 = r8;
        Object r18 = r7;
        String[] r19 = r6;
        String r20 = r5;
        this(r3, r4, r20, r19, r18, r17, r16, r15, r14);
        return;
    L30:
        r14 = r11;
        goto L29
    }
}
