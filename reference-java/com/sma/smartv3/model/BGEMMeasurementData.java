package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(null, null, null, null, null, 0.0d, 0.0d, false, false, false, null, 2047, null);
    }

    public static /* synthetic */ BGEMMeasurementData copy$default(BGEMMeasurementData bGEMMeasurementData, String str, String str2, String str3, String str4, String str5, double d, double d2, boolean z, boolean z2, boolean z3, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bGEMMeasurementData.measurement_id;
        }
        return bGEMMeasurementData.copy(str, (i & 2) != 0 ? bGEMMeasurementData.user_id : str2, (i & 4) != 0 ? bGEMMeasurementData.start_time : str3, (i & 8) != 0 ? bGEMMeasurementData.end_time : str4, (i & 16) != 0 ? bGEMMeasurementData.model_no : str5, (i & 32) != 0 ? bGEMMeasurementData.lower_bound : d, (i & 64) != 0 ? bGEMMeasurementData.upper_bound : d2, (i & 128) != 0 ? bGEMMeasurementData.fasting : z, (i & 256) != 0 ? bGEMMeasurementData.within_2hrs_meal : z2, (i & 512) != 0 ? bGEMMeasurementData.completed_progress : z3, (i & 1024) != 0 ? bGEMMeasurementData.created_at : str6);
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
    public final BGEMMeasurementData copy(@aa1 String measurement_id, @aa1 String user_id, @aa1 String start_time, @aa1 String end_time, @aa1 String model_no, double d, double d2, boolean z, boolean z2, boolean z3, @aa1 String created_at) {
        Intrinsics.X0O(measurement_id, "measurement_id");
        Intrinsics.X0O(user_id, "user_id");
        Intrinsics.X0O(start_time, "start_time");
        Intrinsics.X0O(end_time, "end_time");
        Intrinsics.X0O(model_no, "model_no");
        Intrinsics.X0O(created_at, "created_at");
        return new BGEMMeasurementData(measurement_id, user_id, start_time, end_time, model_no, d, d2, z, z2, z3, created_at);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMMeasurementData)) {
            return false;
        }
        BGEMMeasurementData bGEMMeasurementData = (BGEMMeasurementData) obj;
        return Intrinsics.XOO0ii0(this.measurement_id, bGEMMeasurementData.measurement_id) && Intrinsics.XOO0ii0(this.user_id, bGEMMeasurementData.user_id) && Intrinsics.XOO0ii0(this.start_time, bGEMMeasurementData.start_time) && Intrinsics.XOO0ii0(this.end_time, bGEMMeasurementData.end_time) && Intrinsics.XOO0ii0(this.model_no, bGEMMeasurementData.model_no) && Double.compare(this.lower_bound, bGEMMeasurementData.lower_bound) == 0 && Double.compare(this.upper_bound, bGEMMeasurementData.upper_bound) == 0 && this.fasting == bGEMMeasurementData.fasting && this.within_2hrs_meal == bGEMMeasurementData.within_2hrs_meal && this.completed_progress == bGEMMeasurementData.completed_progress && Intrinsics.XOO0ii0(this.created_at, bGEMMeasurementData.created_at);
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

    public final void setCompleted_progress(boolean z) {
        this.completed_progress = z;
    }

    public final void setCreated_at(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.created_at = str;
    }

    public final void setEnd_time(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.end_time = str;
    }

    public final void setFasting(boolean z) {
        this.fasting = z;
    }

    public final void setLower_bound(double d) {
        this.lower_bound = d;
    }

    public final void setMeasurement_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.measurement_id = str;
    }

    public final void setModel_no(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.model_no = str;
    }

    public final void setStart_time(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.start_time = str;
    }

    public final void setUpper_bound(double d) {
        this.upper_bound = d;
    }

    public final void setUser_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.user_id = str;
    }

    public final void setWithin_2hrs_meal(boolean z) {
        this.within_2hrs_meal = z;
    }

    @aa1
    public String toString() {
        return "BGEMMeasurementData(measurement_id=" + this.measurement_id + ", user_id=" + this.user_id + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", model_no=" + this.model_no + ", lower_bound=" + this.lower_bound + ", upper_bound=" + this.upper_bound + ", fasting=" + this.fasting + ", within_2hrs_meal=" + this.within_2hrs_meal + ", completed_progress=" + this.completed_progress + ", created_at=" + this.created_at + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMMeasurementData(@aa1 String measurement_id, @aa1 String user_id, @aa1 String start_time, @aa1 String end_time, @aa1 String model_no, double d, double d2, boolean z, boolean z2, boolean z3, @aa1 String created_at) {
        Intrinsics.X0O(measurement_id, "measurement_id");
        Intrinsics.X0O(user_id, "user_id");
        Intrinsics.X0O(start_time, "start_time");
        Intrinsics.X0O(end_time, "end_time");
        Intrinsics.X0O(model_no, "model_no");
        Intrinsics.X0O(created_at, "created_at");
        this.measurement_id = measurement_id;
        this.user_id = user_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.model_no = model_no;
        this.lower_bound = d;
        this.upper_bound = d2;
        this.fasting = z;
        this.within_2hrs_meal = z2;
        this.completed_progress = z3;
        this.created_at = created_at;
    }

    public /* synthetic */ BGEMMeasurementData(String str, String str2, String str3, String str4, String str5, double d, double d2, boolean z, boolean z2, boolean z3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0.0d : d, (i & 64) == 0 ? d2 : 0.0d, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false, (i & 1024) != 0 ? "" : str6);
    }
}
