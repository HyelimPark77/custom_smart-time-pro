package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.BaiDu;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMMeasurementData extends JsonFieldContainer {
    private boolean completed_progress;

    @aa1
    private String created_at;

    @aa1
    private String end_time;
    private boolean fasting;
    private double lower_bound;

    @aa1
    private String measurement_id;

    @aa1
    private String model_no;

    @aa1
    private String start_time;
    private double upper_bound;

    @aa1
    private String user_id;
    private boolean within_2hrs_meal;

    public BGEMMeasurementData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        double r6 = 0.0d;
        double r8 = 0.0d;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = false;
        String r13 = null;
        this(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, 2047, null);
    }

    public static /* synthetic */ BGEMMeasurementData copy$default(BGEMMeasurementData r12, String r13, String r14, String r15, String r16, String r17, double r18, double r20, boolean r22, boolean r23, boolean r24, String r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.measurement_id;
    L6:
        if ((r26 & 2) == 0) goto L8;
        String r1 = r12.user_id;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r2 = r12.start_time;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r3 = r12.end_time;
    L18:
        if ((r26 & 16) == 0) goto L20;
        String r4 = r12.model_no;
    L22:
        if ((r26 & 32) == 0) goto L24;
        double r5 = r12.lower_bound;
    L26:
        if ((r26 & 64) == 0) goto L28;
        double r7 = r12.upper_bound;
    L30:
        if ((r26 & 128) == 0) goto L32;
        boolean r9 = r12.fasting;
    L34:
        if ((r26 & 256) == 0) goto L36;
        boolean r10 = r12.within_2hrs_meal;
    L38:
        if ((r26 & 512) == 0) goto L40;
        boolean r11 = r12.completed_progress;
    L42:
        if ((r26 & 1024) == 0) goto L45;
        String r28 = r12.created_at;
    L47:
        return r12.copy(r13, r1, r2, r3, r4, r5, r7, r9, r10, r11, r28);
    L45:
        r28 = r25;
        goto L47
    L40:
        r11 = r24;
        goto L42
    L36:
        r10 = r23;
        goto L38
    L32:
        r9 = r22;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }

    @aa1
    public final String component1() {
        return this.measurement_id;
    }

    public final boolean component10() {
        return this.completed_progress;
    }

    @aa1
    public final String component11() {
        return this.created_at;
    }

    @aa1
    public final String component2() {
        return this.user_id;
    }

    @aa1
    public final String component3() {
        return this.start_time;
    }

    @aa1
    public final String component4() {
        return this.end_time;
    }

    @aa1
    public final String component5() {
        return this.model_no;
    }

    public final double component6() {
        return this.lower_bound;
    }

    public final double component7() {
        return this.upper_bound;
    }

    public final boolean component8() {
        return this.fasting;
    }

    public final boolean component9() {
        return this.within_2hrs_meal;
    }

    @aa1
    public final BGEMMeasurementData copy(@aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, double r21, double r23, boolean r25, boolean r26, boolean r27, @aa1 String r28) {
        Intrinsics.X0O(r16, "measurement_id");
        Intrinsics.X0O(r17, "user_id");
        Intrinsics.X0O(r18, BaiDu.START_TIME);
        Intrinsics.X0O(r19, "end_time");
        Intrinsics.X0O(r20, "model_no");
        Intrinsics.X0O(r28, "created_at");
        return new BGEMMeasurementData(r16, r17, r18, r19, r20, r21, r23, r25, r26, r27, r28);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BGEMMeasurementData) == true) goto L8;
        return false;
    L8:
        BGEMMeasurementData r9 = (BGEMMeasurementData) r8;
        if (Intrinsics.XOO0ii0(this.measurement_id, r9.measurement_id) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.user_id, r9.user_id) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.start_time, r9.start_time) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.end_time, r9.end_time) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.model_no, r9.model_no) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.lower_bound, r9.lower_bound) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.upper_bound, r9.upper_bound) == 0) goto L30;
        return false;
    L30:
        if (this.fasting == r9.fasting) goto L33;
        return false;
    L33:
        if (this.within_2hrs_meal == r9.within_2hrs_meal) goto L36;
        return false;
    L36:
        if (this.completed_progress == r9.completed_progress) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.created_at, r9.created_at) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final boolean getCompleted_progress() {
        return this.completed_progress;
    }

    @aa1
    public final String getCreated_at() {
        return this.created_at;
    }

    @aa1
    public final String getEnd_time() {
        return this.end_time;
    }

    public final boolean getFasting() {
        return this.fasting;
    }

    public final double getLower_bound() {
        return this.lower_bound;
    }

    @aa1
    public final String getMeasurement_id() {
        return this.measurement_id;
    }

    @aa1
    public final String getModel_no() {
        return this.model_no;
    }

    @aa1
    public final String getStart_time() {
        return this.start_time;
    }

    public final double getUpper_bound() {
        return this.upper_bound;
    }

    @aa1
    public final String getUser_id() {
        return this.user_id;
    }

    public final boolean getWithin_2hrs_meal() {
        return this.within_2hrs_meal;
    }

    public int hashCode() {
        return (((((((((((((((((((this.measurement_id.hashCode() * 31) + this.user_id.hashCode()) * 31) + this.start_time.hashCode()) * 31) + this.end_time.hashCode()) * 31) + this.model_no.hashCode()) * 31) + Double.hashCode(this.lower_bound)) * 31) + Double.hashCode(this.upper_bound)) * 31) + Boolean.hashCode(this.fasting)) * 31) + Boolean.hashCode(this.within_2hrs_meal)) * 31) + Boolean.hashCode(this.completed_progress)) * 31) + this.created_at.hashCode();
    }

    public final void setCompleted_progress(boolean r1) {
        this.completed_progress = r1;
    }

    public final void setCreated_at(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.created_at = r2;
    }

    public final void setEnd_time(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.end_time = r2;
    }

    public final void setFasting(boolean r1) {
        this.fasting = r1;
    }

    public final void setLower_bound(double r1) {
        this.lower_bound = r1;
    }

    public final void setMeasurement_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.measurement_id = r2;
    }

    public final void setModel_no(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.model_no = r2;
    }

    public final void setStart_time(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.start_time = r2;
    }

    public final void setUpper_bound(double r1) {
        this.upper_bound = r1;
    }

    public final void setUser_id(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.user_id = r2;
    }

    public final void setWithin_2hrs_meal(boolean r1) {
        this.within_2hrs_meal = r1;
    }

    @aa1
    public String toString() {
        return "BGEMMeasurementData(measurement_id=" + this.measurement_id + ", user_id=" + this.user_id + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", model_no=" + this.model_no + ", lower_bound=" + this.lower_bound + ", upper_bound=" + this.upper_bound + ", fasting=" + this.fasting + ", within_2hrs_meal=" + this.within_2hrs_meal + ", completed_progress=" + this.completed_progress + ", created_at=" + this.created_at + I000IiI1O.iO.iO;
    }

    public BGEMMeasurementData(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, double r7, double r9, boolean r11, boolean r12, boolean r13, @aa1 String r14) {
        Intrinsics.X0O(r2, "measurement_id");
        Intrinsics.X0O(r3, "user_id");
        Intrinsics.X0O(r4, BaiDu.START_TIME);
        Intrinsics.X0O(r5, "end_time");
        Intrinsics.X0O(r6, "model_no");
        Intrinsics.X0O(r14, "created_at");
        this.measurement_id = r2;
        this.user_id = r3;
        this.start_time = r4;
        this.end_time = r5;
        this.model_no = r6;
        this.lower_bound = r7;
        this.upper_bound = r9;
        this.fasting = r11;
        this.within_2hrs_meal = r12;
        this.completed_progress = r13;
        this.created_at = r14;
    }

    public /* synthetic */ BGEMMeasurementData(String r16, String r17, String r18, String r19, String r20, double r21, double r23, boolean r25, boolean r26, boolean r27, String r28, int r29, DefaultConstructorMarker r30) {
        if ((r29 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r29 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r29 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r29 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r29 & 16) == 0) goto L21;
        String r6 = "";
    L22:
        double r8 = 0.0d;
        if ((r29 & 32) == 0) goto L25;
        double r10 = 0.0d;
    L27:
        if ((r29 & 64) != 0) goto L30;
        r8 = r23;
    L30:
        boolean r12 = false;
        if ((r29 & 128) == 0) goto L33;
        boolean r7 = false;
    L35:
        if ((r29 & 256) == 0) goto L37;
        boolean r13 = false;
    L39:
        if ((r29 & 512) != 0) goto L43;
        r12 = r27;
    L43:
        if ((r29 & 1024) == 0) goto L46;
        String r210 = "";
    L47:
        this(r1, r3, r4, r5, r6, r10, r8, r7, r13, r12, r210);
        return;
    L46:
        r210 = r28;
        goto L47
    L37:
        r13 = r26;
        goto L39
    L33:
        r7 = r25;
        goto L35
    L25:
        r10 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L22
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
