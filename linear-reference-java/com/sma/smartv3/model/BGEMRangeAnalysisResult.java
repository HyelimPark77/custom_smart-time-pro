package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.BloodGlucose2;
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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMRangeAnalysisResult copy$default(BGEMRangeAnalysisResult r0, BGEMRiskData r1, BGEMMeasurementData r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.riskData;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.measurementData;
    L9:
        return r0.copy(r1, r2);
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
    public final BGEMRangeAnalysisResult copy(@tb1 BGEMRiskData r2, @tb1 BGEMMeasurementData r3) {
        return new BGEMRangeAnalysisResult(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMRangeAnalysisResult) == true) goto L8;
        return false;
    L8:
        BGEMRangeAnalysisResult r6 = (BGEMRangeAnalysisResult) r5;
        if (Intrinsics.XOO0ii0(this.riskData, r6.riskData) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.measurementData, r6.measurementData) == true) goto L14;
        return false;
    L14:
        return true;
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
        BGEMRiskData r0 = this.riskData;
        int r1 = 0;
        if (r0 != null) goto L5;
        int r2 = 0;
    L6:
        int r3 = r2 * 31;
        BGEMMeasurementData r4 = this.measurementData;
        if (r4 == null) goto L11;
        r1 = r4.hashCode();
    L11:
        return r3 + r1;
    L5:
        r2 = r0.hashCode();
        goto L6
    }

    public final void setMeasurementData(@tb1 BGEMMeasurementData r1) {
        this.measurementData = r1;
    }

    public final void setRiskData(@tb1 BGEMRiskData r1) {
        this.riskData = r1;
    }

    @tb1
    public final BloodGlucose2 toBloodGlucose2() {
        if (this.measurementData != null) goto L5;
        return null;
    L5:
        if (this.riskData == null) goto L15;
        SimpleDateFormat r2 = O0X11OiO.IO0iXO0O();     // Catch: Exception -> L8
        BGEMMeasurementData r3 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r3);     // Catch: Exception -> L8
        long r5 = r2.parse(r3.getEnd_time()).getTime();     // Catch: Exception -> L8
        BGEMMeasurementData r4 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r4);     // Catch: Exception -> L8
        String r7 = r4.getMeasurement_id();     // Catch: Exception -> L8
        BGEMMeasurementData r6 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r6);     // Catch: Exception -> L8
        String r8 = r6.getUser_id();     // Catch: Exception -> L8
        BGEMMeasurementData r9 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r9);     // Catch: Exception -> L8
        String r10 = r9.getStart_time();     // Catch: Exception -> L8
        BGEMMeasurementData r11 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r11);     // Catch: Exception -> L8
        String r12 = r11.getEnd_time();     // Catch: Exception -> L8
        BGEMMeasurementData r13 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r13);     // Catch: Exception -> L8
        String r14 = r13.getModel_no();     // Catch: Exception -> L8
        BGEMMeasurementData r15 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r15);     // Catch: Exception -> L8
        double r16 = r15.getLower_bound();     // Catch: Exception -> L8
        BGEMMeasurementData r17 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r17);     // Catch: Exception -> L8
        double r18 = r17.getUpper_bound();     // Catch: Exception -> L8
        BGEMMeasurementData r19 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r19);     // Catch: Exception -> L8
        int r110 = OiOX0i.iO(r19.getFasting());     // Catch: Exception -> L8
        BGEMMeasurementData r20 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r20);     // Catch: Exception -> L8
        int r111 = OiOX0i.iO(r20.getWithin_2hrs_meal());     // Catch: Exception -> L8
        BGEMMeasurementData r21 = this.measurementData;     // Catch: Exception -> L8
        Intrinsics.XXI(r21);     // Catch: Exception -> L8
        int r112 = OiOX0i.iO(r21.getCompleted_progress());     // Catch: Exception -> L8
        BGEMRiskData r22 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r22);     // Catch: Exception -> L8
        String r23 = r22.getRisk_code();     // Catch: Exception -> L8
        BGEMRiskData r24 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r24);     // Catch: Exception -> L8
        String r25 = r24.getInsights();     // Catch: Exception -> L8
        Gson r26 = new Gson();     // Catch: Exception -> L8
        BGEMRiskData r27 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r27);     // Catch: Exception -> L8
        String r28 = r26.toJson(r27.getTips());     // Catch: Exception -> L8
        Intrinsics.O10IXXX0X(r28, "toJson(...)");     // Catch: Exception -> L8
        Gson r29 = new Gson();     // Catch: Exception -> L8
        BGEMRiskData r30 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r30);     // Catch: Exception -> L8
        String r31 = r29.toJson(r30.getLocale_insights());     // Catch: Exception -> L8
        Intrinsics.O10IXXX0X(r31, "toJson(...)");     // Catch: Exception -> L8
        Gson r32 = new Gson();     // Catch: Exception -> L8
        BGEMRiskData r33 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r33);     // Catch: Exception -> L8
        String r34 = r32.toJson(r33.getLocale_tips());     // Catch: Exception -> L8
        Intrinsics.O10IXXX0X(r34, "toJson(...)");     // Catch: Exception -> L8
        BGEMRiskData r0 = this.riskData;     // Catch: Exception -> L8
        Intrinsics.XXI(r0);     // Catch: Exception -> L8
        return new BloodGlucose2(0, r5, r7, r8, r10, r12, r14, r16, r18, r110, r111, r112, r0.getCurrent_level(), r23, r25, r28, r31, r34, 0, 0, 786433, null);
    L8:
        e = move-exception;
        e.printStackTrace();
        return null;
    L15:
        return null;
    }

    @aa1
    public String toString() {
        return "BGEMRangeAnalysisResult(riskData=" + this.riskData + ", measurementData=" + this.measurementData + I000IiI1O.iO.iO;
    }

    public BGEMRangeAnalysisResult(@tb1 BGEMRiskData r1, @tb1 BGEMMeasurementData r2) {
        this.riskData = r1;
        this.measurementData = r2;
    }

    public /* synthetic */ BGEMRangeAnalysisResult(BGEMRiskData r2, BGEMMeasurementData r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
