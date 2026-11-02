package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMRangeAnalysisResult extends JsonFieldContainer {

    @tb1
    private BGEMMeasurementData measurementData;

    @tb1
    private BGEMRiskData riskData;

    /* JADX WARN: Multi-variable type inference failed */
    public BGEMRangeAnalysisResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMRangeAnalysisResult copy$default(BGEMRangeAnalysisResult bGEMRangeAnalysisResult, BGEMRiskData bGEMRiskData, BGEMMeasurementData bGEMMeasurementData, int i, Object obj) {
        if ((i & 1) != 0) {
            bGEMRiskData = bGEMRangeAnalysisResult.riskData;
        }
        if ((i & 2) != 0) {
            bGEMMeasurementData = bGEMRangeAnalysisResult.measurementData;
        }
        return bGEMRangeAnalysisResult.copy(bGEMRiskData, bGEMMeasurementData);
    }

    @tb1
    public final BGEMRiskData component1() {
        return this.riskData;
    }

    @tb1
    public final BGEMMeasurementData component2() {
        return this.measurementData;
    }

    @aa1
    public final BGEMRangeAnalysisResult copy(@tb1 BGEMRiskData bGEMRiskData, @tb1 BGEMMeasurementData bGEMMeasurementData) {
        return new BGEMRangeAnalysisResult(bGEMRiskData, bGEMMeasurementData);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMRangeAnalysisResult)) {
            return false;
        }
        BGEMRangeAnalysisResult bGEMRangeAnalysisResult = (BGEMRangeAnalysisResult) obj;
        return Intrinsics.XOO0ii0(this.riskData, bGEMRangeAnalysisResult.riskData) && Intrinsics.XOO0ii0(this.measurementData, bGEMRangeAnalysisResult.measurementData);
    }

    @tb1
    public final BGEMMeasurementData getMeasurementData() {
        return this.measurementData;
    }

    @tb1
    public final BGEMRiskData getRiskData() {
        return this.riskData;
    }

    public int hashCode() {
        BGEMRiskData bGEMRiskData = this.riskData;
        int iHashCode = (bGEMRiskData == null ? 0 : bGEMRiskData.hashCode()) * 31;
        BGEMMeasurementData bGEMMeasurementData = this.measurementData;
        return iHashCode + (bGEMMeasurementData != null ? bGEMMeasurementData.hashCode() : 0);
    }

    public final void setMeasurementData(@tb1 BGEMMeasurementData bGEMMeasurementData) {
        this.measurementData = bGEMMeasurementData;
    }

    public final void setRiskData(@tb1 BGEMRiskData bGEMRiskData) {
        this.riskData = bGEMRiskData;
    }

    @tb1
    public final BloodGlucose2 toBloodGlucose2() {
        if (this.measurementData == null || this.riskData == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormatIO0iXO0O = O0X11OiO.IO0iXO0O();
            BGEMMeasurementData bGEMMeasurementData = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData);
            long time = simpleDateFormatIO0iXO0O.parse(bGEMMeasurementData.getEnd_time()).getTime();
            BGEMMeasurementData bGEMMeasurementData2 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData2);
            String measurement_id = bGEMMeasurementData2.getMeasurement_id();
            BGEMMeasurementData bGEMMeasurementData3 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData3);
            String user_id = bGEMMeasurementData3.getUser_id();
            BGEMMeasurementData bGEMMeasurementData4 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData4);
            String start_time = bGEMMeasurementData4.getStart_time();
            BGEMMeasurementData bGEMMeasurementData5 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData5);
            String end_time = bGEMMeasurementData5.getEnd_time();
            BGEMMeasurementData bGEMMeasurementData6 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData6);
            String model_no = bGEMMeasurementData6.getModel_no();
            BGEMMeasurementData bGEMMeasurementData7 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData7);
            double lower_bound = bGEMMeasurementData7.getLower_bound();
            BGEMMeasurementData bGEMMeasurementData8 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData8);
            double upper_bound = bGEMMeasurementData8.getUpper_bound();
            BGEMMeasurementData bGEMMeasurementData9 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData9);
            int iM1037iO = OiOX0i.m1037iO(bGEMMeasurementData9.getFasting());
            BGEMMeasurementData bGEMMeasurementData10 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData10);
            int iM1037iO2 = OiOX0i.m1037iO(bGEMMeasurementData10.getWithin_2hrs_meal());
            BGEMMeasurementData bGEMMeasurementData11 = this.measurementData;
            Intrinsics.XXI(bGEMMeasurementData11);
            int iM1037iO3 = OiOX0i.m1037iO(bGEMMeasurementData11.getCompleted_progress());
            BGEMRiskData bGEMRiskData = this.riskData;
            Intrinsics.XXI(bGEMRiskData);
            String risk_code = bGEMRiskData.getRisk_code();
            BGEMRiskData bGEMRiskData2 = this.riskData;
            Intrinsics.XXI(bGEMRiskData2);
            String insights = bGEMRiskData2.getInsights();
            Gson gson = new Gson();
            BGEMRiskData bGEMRiskData3 = this.riskData;
            Intrinsics.XXI(bGEMRiskData3);
            String json = gson.toJson(bGEMRiskData3.getTips());
            Intrinsics.O10IXXX0X(json, "toJson(...)");
            Gson gson2 = new Gson();
            BGEMRiskData bGEMRiskData4 = this.riskData;
            Intrinsics.XXI(bGEMRiskData4);
            String json2 = gson2.toJson(bGEMRiskData4.getLocale_insights());
            Intrinsics.O10IXXX0X(json2, "toJson(...)");
            Gson gson3 = new Gson();
            BGEMRiskData bGEMRiskData5 = this.riskData;
            Intrinsics.XXI(bGEMRiskData5);
            String json3 = gson3.toJson(bGEMRiskData5.getLocale_tips());
            Intrinsics.O10IXXX0X(json3, "toJson(...)");
            BGEMRiskData bGEMRiskData6 = this.riskData;
            Intrinsics.XXI(bGEMRiskData6);
            return new BloodGlucose2(0, time, measurement_id, user_id, start_time, end_time, model_no, lower_bound, upper_bound, iM1037iO, iM1037iO2, iM1037iO3, bGEMRiskData6.getCurrent_level(), risk_code, insights, json, json2, json3, 0, 0, 786433, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @aa1
    public String toString() {
        return "BGEMRangeAnalysisResult(riskData=" + this.riskData + ", measurementData=" + this.measurementData + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMRangeAnalysisResult(@tb1 BGEMRiskData bGEMRiskData, @tb1 BGEMMeasurementData bGEMMeasurementData) {
        this.riskData = bGEMRiskData;
        this.measurementData = bGEMMeasurementData;
    }

    public /* synthetic */ BGEMRangeAnalysisResult(BGEMRiskData bGEMRiskData, BGEMMeasurementData bGEMMeasurementData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bGEMRiskData, (i & 2) != 0 ? null : bGEMMeasurementData);
    }
}
