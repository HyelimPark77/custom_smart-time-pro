package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ BGEMRiskData copy$default(BGEMRiskData bGEMRiskData, int i, String str, String str2, String[] strArr, Object obj, Object obj2, String str3, String str4, String str5, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            i = bGEMRiskData.current_level;
        }
        if ((i2 & 2) != 0) {
            str = bGEMRiskData.risk_code;
        }
        if ((i2 & 4) != 0) {
            str2 = bGEMRiskData.insights;
        }
        if ((i2 & 8) != 0) {
            strArr = bGEMRiskData.tips;
        }
        if ((i2 & 16) != 0) {
            obj = bGEMRiskData.locale_insights;
        }
        if ((i2 & 32) != 0) {
            obj2 = bGEMRiskData.locale_tips;
        }
        if ((i2 & 64) != 0) {
            str3 = bGEMRiskData.measurement_id;
        }
        if ((i2 & 128) != 0) {
            str4 = bGEMRiskData.start_time;
        }
        if ((i2 & 256) != 0) {
            str5 = bGEMRiskData.end_time;
        }
        String str6 = str4;
        String str7 = str5;
        Object obj4 = obj2;
        String str8 = str3;
        Object obj5 = obj;
        String str9 = str2;
        return bGEMRiskData.copy(i, str, str9, strArr, obj5, obj4, str8, str6, str7);
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
    public final BGEMRiskData copy(int i, @aa1 String risk_code, @aa1 String insights, @aa1 String[] tips, @aa1 Object locale_insights, @aa1 Object locale_tips, @aa1 String measurement_id, @aa1 String start_time, @aa1 String end_time) {
        Intrinsics.X0O(risk_code, "risk_code");
        Intrinsics.X0O(insights, "insights");
        Intrinsics.X0O(tips, "tips");
        Intrinsics.X0O(locale_insights, "locale_insights");
        Intrinsics.X0O(locale_tips, "locale_tips");
        Intrinsics.X0O(measurement_id, "measurement_id");
        Intrinsics.X0O(start_time, "start_time");
        Intrinsics.X0O(end_time, "end_time");
        return new BGEMRiskData(i, risk_code, insights, tips, locale_insights, locale_tips, measurement_id, start_time, end_time);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMRiskData)) {
            return false;
        }
        BGEMRiskData bGEMRiskData = (BGEMRiskData) obj;
        return this.current_level == bGEMRiskData.current_level && Intrinsics.XOO0ii0(this.risk_code, bGEMRiskData.risk_code) && Intrinsics.XOO0ii0(this.insights, bGEMRiskData.insights) && Intrinsics.XOO0ii0(this.tips, bGEMRiskData.tips) && Intrinsics.XOO0ii0(this.locale_insights, bGEMRiskData.locale_insights) && Intrinsics.XOO0ii0(this.locale_tips, bGEMRiskData.locale_tips) && Intrinsics.XOO0ii0(this.measurement_id, bGEMRiskData.measurement_id) && Intrinsics.XOO0ii0(this.start_time, bGEMRiskData.start_time) && Intrinsics.XOO0ii0(this.end_time, bGEMRiskData.end_time);
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

    public final void setCurrent_level(int i) {
        this.current_level = i;
    }

    public final void setEnd_time(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.end_time = str;
    }

    public final void setInsights(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.insights = str;
    }

    public final void setLocale_insights(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.locale_insights = obj;
    }

    public final void setLocale_tips(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.locale_tips = obj;
    }

    public final void setMeasurement_id(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.measurement_id = str;
    }

    public final void setRisk_code(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.risk_code = str;
    }

    public final void setStart_time(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.start_time = str;
    }

    public final void setTips(@aa1 String[] strArr) {
        Intrinsics.X0O(strArr, "<set-?>");
        this.tips = strArr;
    }

    @aa1
    public String toString() {
        return "BGEMRiskData(current_level=" + this.current_level + ", risk_code=" + this.risk_code + ", insights=" + this.insights + ", tips=" + Arrays.toString(this.tips) + ", locale_insights=" + this.locale_insights + ", locale_tips=" + this.locale_tips + ", measurement_id=" + this.measurement_id + ", start_time=" + this.start_time + ", end_time=" + this.end_time + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMRiskData(int i, @aa1 String risk_code, @aa1 String insights, @aa1 String[] tips, @aa1 Object locale_insights, @aa1 Object locale_tips, @aa1 String measurement_id, @aa1 String start_time, @aa1 String end_time) {
        Intrinsics.X0O(risk_code, "risk_code");
        Intrinsics.X0O(insights, "insights");
        Intrinsics.X0O(tips, "tips");
        Intrinsics.X0O(locale_insights, "locale_insights");
        Intrinsics.X0O(locale_tips, "locale_tips");
        Intrinsics.X0O(measurement_id, "measurement_id");
        Intrinsics.X0O(start_time, "start_time");
        Intrinsics.X0O(end_time, "end_time");
        this.current_level = i;
        this.risk_code = risk_code;
        this.insights = insights;
        this.tips = tips;
        this.locale_insights = locale_insights;
        this.locale_tips = locale_tips;
        this.measurement_id = measurement_id;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public /* synthetic */ BGEMRiskData(int i, String str, String str2, String[] strArr, Object obj, Object obj2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? new String[0] : strArr, (i2 & 16) != 0 ? new Object() : obj, (i2 & 32) != 0 ? new Object() : obj2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? "" : str5);
    }
}
