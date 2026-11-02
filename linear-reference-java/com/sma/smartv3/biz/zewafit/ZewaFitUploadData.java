package com.sma.smartv3.biz.zewafit;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ZewaFitUploadData {

    @aa1
    private String b;

    @aa1
    private String di;

    @aa1
    private String dm;

    @aa1
    private String mAwakeSleepTime;

    @aa1
    private String mCalorie;

    @aa1
    private String mDate;

    @aa1
    private String mDeepSleepTime;

    @aa1
    private String mDistance;

    @aa1
    private String mLatestBloodOxygen;

    @aa1
    private String mLatestHeartRate;

    @aa1
    private String mLatestHrv;

    @aa1
    private String mLatestStress;

    @aa1
    private String mLatestTemperature;

    @aa1
    private String mLightSleepTime;

    @aa1
    private String mMaxBloodOxygen;

    @aa1
    private String mMaxHeartRate;

    @aa1
    private String mMaxHrv;

    @aa1
    private String mMaxStress;

    @aa1
    private String mMaxTemperature;

    @aa1
    private String mMinBloodOxygen;

    @aa1
    private String mMinHeartRate;

    @aa1
    private String mMinHrv;

    @aa1
    private String mMinStress;

    @aa1
    private String mMinTemperature;

    @aa1
    private String mStep;

    @aa1
    private String mTime;

    public ZewaFitUploadData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        String r17 = null;
        String r18 = null;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, 67108863, null);
    }

    public static /* synthetic */ ZewaFitUploadData copy$default(ZewaFitUploadData r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, int r44, Object r45) {
        if ((r44 & 1) == 0) goto L5;
        String r2 = r17.b;
    L7:
        if ((r44 & 2) == 0) goto L9;
        String r3 = r17.dm;
    L11:
        if ((r44 & 4) == 0) goto L13;
        String r4 = r17.di;
    L15:
        if ((r44 & 8) == 0) goto L17;
        String r5 = r17.mTime;
    L19:
        if ((r44 & 16) == 0) goto L21;
        String r6 = r17.mDate;
    L23:
        if ((r44 & 32) == 0) goto L25;
        String r7 = r17.mStep;
    L27:
        if ((r44 & 64) == 0) goto L29;
        String r8 = r17.mCalorie;
    L31:
        if ((r44 & 128) == 0) goto L33;
        String r9 = r17.mDistance;
    L35:
        if ((r44 & 256) == 0) goto L37;
        String r10 = r17.mMaxHeartRate;
    L39:
        if ((r44 & 512) == 0) goto L41;
        String r11 = r17.mLatestHeartRate;
    L43:
        if ((r44 & 1024) == 0) goto L45;
        String r12 = r17.mMinHeartRate;
    L47:
        if ((r44 & 2048) == 0) goto L49;
        String r13 = r17.mDeepSleepTime;
    L51:
        if ((r44 & 4096) == 0) goto L53;
        String r14 = r17.mLightSleepTime;
    L55:
        if ((r44 & 8192) == 0) goto L57;
        String r15 = r17.mAwakeSleepTime;
    L58:
        String r110 = r2;
        if ((r44 & 16384) == 0) goto L61;
        String r16 = r17.mMaxTemperature;
    L63:
        if ((r44 & 32768) == 0) goto L65;
        String r1 = r17.mLatestTemperature;
    L66:
        String r111 = r1;
        if ((r44 & 65536) == 0) goto L69;
        String r46 = r17.mMinTemperature;
    L70:
        String r210 = r46;
        if ((r44 & 131072) == 0) goto L73;
        String r47 = r17.mMaxBloodOxygen;
    L74:
        String r211 = r47;
        if ((r44 & 262144) == 0) goto L77;
        String r48 = r17.mLatestBloodOxygen;
    L78:
        String r212 = r48;
        if ((r44 & 524288) == 0) goto L81;
        String r49 = r17.mMinBloodOxygen;
    L82:
        String r213 = r49;
        if ((r44 & 1048576) == 0) goto L85;
        String r50 = r17.mMaxHrv;
    L86:
        String r214 = r50;
        if ((r44 & 2097152) == 0) goto L89;
        String r51 = r17.mLatestHrv;
    L90:
        String r215 = r51;
        if ((r44 & 4194304) == 0) goto L93;
        String r52 = r17.mMinHrv;
    L94:
        String r216 = r52;
        if ((r44 & 8388608) == 0) goto L97;
        String r53 = r17.mMaxStress;
    L98:
        String r217 = r53;
        if ((r44 & 16777216) == 0) goto L101;
        String r54 = r17.mLatestStress;
    L103:
        if ((r44 & 33554432) == 0) goto L106;
        String r218 = r54;
        String r410 = r218;
        String r411 = r17.mMinStress;
    L108:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r215, r216, r217, r410, r411);
    L106:
        r411 = r43;
        r410 = r54;
        goto L108
    L101:
        r54 = r42;
        goto L103
    L97:
        r53 = r41;
        goto L98
    L93:
        r52 = r40;
        goto L94
    L89:
        r51 = r39;
        goto L90
    L85:
        r50 = r38;
        goto L86
    L81:
        r49 = r37;
        goto L82
    L77:
        r48 = r36;
        goto L78
    L73:
        r47 = r35;
        goto L74
    L69:
        r46 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    @aa1
    public final String component1() {
        return this.b;
    }

    @aa1
    public final String component10() {
        return this.mLatestHeartRate;
    }

    @aa1
    public final String component11() {
        return this.mMinHeartRate;
    }

    @aa1
    public final String component12() {
        return this.mDeepSleepTime;
    }

    @aa1
    public final String component13() {
        return this.mLightSleepTime;
    }

    @aa1
    public final String component14() {
        return this.mAwakeSleepTime;
    }

    @aa1
    public final String component15() {
        return this.mMaxTemperature;
    }

    @aa1
    public final String component16() {
        return this.mLatestTemperature;
    }

    @aa1
    public final String component17() {
        return this.mMinTemperature;
    }

    @aa1
    public final String component18() {
        return this.mMaxBloodOxygen;
    }

    @aa1
    public final String component19() {
        return this.mLatestBloodOxygen;
    }

    @aa1
    public final String component2() {
        return this.dm;
    }

    @aa1
    public final String component20() {
        return this.mMinBloodOxygen;
    }

    @aa1
    public final String component21() {
        return this.mMaxHrv;
    }

    @aa1
    public final String component22() {
        return this.mLatestHrv;
    }

    @aa1
    public final String component23() {
        return this.mMinHrv;
    }

    @aa1
    public final String component24() {
        return this.mMaxStress;
    }

    @aa1
    public final String component25() {
        return this.mLatestStress;
    }

    @aa1
    public final String component26() {
        return this.mMinStress;
    }

    @aa1
    public final String component3() {
        return this.di;
    }

    @aa1
    public final String component4() {
        return this.mTime;
    }

    @aa1
    public final String component5() {
        return this.mDate;
    }

    @aa1
    public final String component6() {
        return this.mStep;
    }

    @aa1
    public final String component7() {
        return this.mCalorie;
    }

    @aa1
    public final String component8() {
        return this.mDistance;
    }

    @aa1
    public final String component9() {
        return this.mMaxHeartRate;
    }

    @aa1
    public final ZewaFitUploadData copy(@aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, @aa1 String r37, @aa1 String r38, @aa1 String r39, @aa1 String r40, @aa1 String r41, @aa1 String r42, @aa1 String r43, @aa1 String r44, @aa1 String r45, @aa1 String r46, @aa1 String r47, @aa1 String r48, @aa1 String r49, @aa1 String r50, @aa1 String r51, @aa1 String r52, @aa1 String r53, @aa1 String r54) {
        Intrinsics.X0O(r29, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        Intrinsics.X0O(r30, ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER);
        Intrinsics.X0O(r31, ApsMetricsDataMap.APSMETRICS_FIELD_DEVICEINFO);
        Intrinsics.X0O(r32, "mTime");
        Intrinsics.X0O(r33, "mDate");
        Intrinsics.X0O(r34, "mStep");
        Intrinsics.X0O(r35, "mCalorie");
        Intrinsics.X0O(r36, "mDistance");
        Intrinsics.X0O(r37, "mMaxHeartRate");
        Intrinsics.X0O(r38, "mLatestHeartRate");
        Intrinsics.X0O(r39, "mMinHeartRate");
        Intrinsics.X0O(r40, "mDeepSleepTime");
        Intrinsics.X0O(r41, "mLightSleepTime");
        Intrinsics.X0O(r42, "mAwakeSleepTime");
        Intrinsics.X0O(r43, "mMaxTemperature");
        Intrinsics.X0O(r44, "mLatestTemperature");
        Intrinsics.X0O(r45, "mMinTemperature");
        Intrinsics.X0O(r46, "mMaxBloodOxygen");
        Intrinsics.X0O(r47, "mLatestBloodOxygen");
        Intrinsics.X0O(r48, "mMinBloodOxygen");
        Intrinsics.X0O(r49, "mMaxHrv");
        Intrinsics.X0O(r50, "mLatestHrv");
        Intrinsics.X0O(r51, "mMinHrv");
        Intrinsics.X0O(r52, "mMaxStress");
        Intrinsics.X0O(r53, "mLatestStress");
        Intrinsics.X0O(r54, "mMinStress");
        return new ZewaFitUploadData(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ZewaFitUploadData) == true) goto L8;
        return false;
    L8:
        ZewaFitUploadData r6 = (ZewaFitUploadData) r5;
        if (Intrinsics.XOO0ii0(this.b, r6.b) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.dm, r6.dm) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.di, r6.di) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mTime, r6.mTime) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mDate, r6.mDate) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mStep, r6.mStep) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mCalorie, r6.mCalorie) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mDistance, r6.mDistance) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mMaxHeartRate, r6.mMaxHeartRate) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mLatestHeartRate, r6.mLatestHeartRate) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mMinHeartRate, r6.mMinHeartRate) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mDeepSleepTime, r6.mDeepSleepTime) == true) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mLightSleepTime, r6.mLightSleepTime) == true) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mAwakeSleepTime, r6.mAwakeSleepTime) == true) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.mMaxTemperature, r6.mMaxTemperature) == true) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.mLatestTemperature, r6.mLatestTemperature) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.mMinTemperature, r6.mMinTemperature) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mMaxBloodOxygen, r6.mMaxBloodOxygen) == true) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.mLatestBloodOxygen, r6.mLatestBloodOxygen) == true) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.mMinBloodOxygen, r6.mMinBloodOxygen) == true) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.mMaxHrv, r6.mMaxHrv) == true) goto L72;
        return false;
    L72:
        if (Intrinsics.XOO0ii0(this.mLatestHrv, r6.mLatestHrv) == true) goto L75;
        return false;
    L75:
        if (Intrinsics.XOO0ii0(this.mMinHrv, r6.mMinHrv) == true) goto L78;
        return false;
    L78:
        if (Intrinsics.XOO0ii0(this.mMaxStress, r6.mMaxStress) == true) goto L81;
        return false;
    L81:
        if (Intrinsics.XOO0ii0(this.mLatestStress, r6.mLatestStress) == true) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.mMinStress, r6.mMinStress) == true) goto L86;
        return false;
    L86:
        return true;
    }

    @aa1
    public final String getB() {
        return this.b;
    }

    @aa1
    public final String getDi() {
        return this.di;
    }

    @aa1
    public final String getDm() {
        return this.dm;
    }

    @aa1
    public final String getMAwakeSleepTime() {
        return this.mAwakeSleepTime;
    }

    @aa1
    public final String getMCalorie() {
        return this.mCalorie;
    }

    @aa1
    public final String getMDate() {
        return this.mDate;
    }

    @aa1
    public final String getMDeepSleepTime() {
        return this.mDeepSleepTime;
    }

    @aa1
    public final String getMDistance() {
        return this.mDistance;
    }

    @aa1
    public final String getMLatestBloodOxygen() {
        return this.mLatestBloodOxygen;
    }

    @aa1
    public final String getMLatestHeartRate() {
        return this.mLatestHeartRate;
    }

    @aa1
    public final String getMLatestHrv() {
        return this.mLatestHrv;
    }

    @aa1
    public final String getMLatestStress() {
        return this.mLatestStress;
    }

    @aa1
    public final String getMLatestTemperature() {
        return this.mLatestTemperature;
    }

    @aa1
    public final String getMLightSleepTime() {
        return this.mLightSleepTime;
    }

    @aa1
    public final String getMMaxBloodOxygen() {
        return this.mMaxBloodOxygen;
    }

    @aa1
    public final String getMMaxHeartRate() {
        return this.mMaxHeartRate;
    }

    @aa1
    public final String getMMaxHrv() {
        return this.mMaxHrv;
    }

    @aa1
    public final String getMMaxStress() {
        return this.mMaxStress;
    }

    @aa1
    public final String getMMaxTemperature() {
        return this.mMaxTemperature;
    }

    @aa1
    public final String getMMinBloodOxygen() {
        return this.mMinBloodOxygen;
    }

    @aa1
    public final String getMMinHeartRate() {
        return this.mMinHeartRate;
    }

    @aa1
    public final String getMMinHrv() {
        return this.mMinHrv;
    }

    @aa1
    public final String getMMinStress() {
        return this.mMinStress;
    }

    @aa1
    public final String getMMinTemperature() {
        return this.mMinTemperature;
    }

    @aa1
    public final String getMStep() {
        return this.mStep;
    }

    @aa1
    public final String getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.b.hashCode() * 31) + this.dm.hashCode()) * 31) + this.di.hashCode()) * 31) + this.mTime.hashCode()) * 31) + this.mDate.hashCode()) * 31) + this.mStep.hashCode()) * 31) + this.mCalorie.hashCode()) * 31) + this.mDistance.hashCode()) * 31) + this.mMaxHeartRate.hashCode()) * 31) + this.mLatestHeartRate.hashCode()) * 31) + this.mMinHeartRate.hashCode()) * 31) + this.mDeepSleepTime.hashCode()) * 31) + this.mLightSleepTime.hashCode()) * 31) + this.mAwakeSleepTime.hashCode()) * 31) + this.mMaxTemperature.hashCode()) * 31) + this.mLatestTemperature.hashCode()) * 31) + this.mMinTemperature.hashCode()) * 31) + this.mMaxBloodOxygen.hashCode()) * 31) + this.mLatestBloodOxygen.hashCode()) * 31) + this.mMinBloodOxygen.hashCode()) * 31) + this.mMaxHrv.hashCode()) * 31) + this.mLatestHrv.hashCode()) * 31) + this.mMinHrv.hashCode()) * 31) + this.mMaxStress.hashCode()) * 31) + this.mLatestStress.hashCode()) * 31) + this.mMinStress.hashCode();
    }

    public final void setB(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.b = r2;
    }

    public final void setDi(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.di = r2;
    }

    public final void setDm(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.dm = r2;
    }

    public final void setMAwakeSleepTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAwakeSleepTime = r2;
    }

    public final void setMCalorie(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCalorie = r2;
    }

    public final void setMDate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDate = r2;
    }

    public final void setMDeepSleepTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeepSleepTime = r2;
    }

    public final void setMDistance(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDistance = r2;
    }

    public final void setMLatestBloodOxygen(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLatestBloodOxygen = r2;
    }

    public final void setMLatestHeartRate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLatestHeartRate = r2;
    }

    public final void setMLatestHrv(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLatestHrv = r2;
    }

    public final void setMLatestStress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLatestStress = r2;
    }

    public final void setMLatestTemperature(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLatestTemperature = r2;
    }

    public final void setMLightSleepTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLightSleepTime = r2;
    }

    public final void setMMaxBloodOxygen(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaxBloodOxygen = r2;
    }

    public final void setMMaxHeartRate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaxHeartRate = r2;
    }

    public final void setMMaxHrv(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaxHrv = r2;
    }

    public final void setMMaxStress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaxStress = r2;
    }

    public final void setMMaxTemperature(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMaxTemperature = r2;
    }

    public final void setMMinBloodOxygen(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMinBloodOxygen = r2;
    }

    public final void setMMinHeartRate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMinHeartRate = r2;
    }

    public final void setMMinHrv(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMinHrv = r2;
    }

    public final void setMMinStress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMinStress = r2;
    }

    public final void setMMinTemperature(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMinTemperature = r2;
    }

    public final void setMStep(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mStep = r2;
    }

    public final void setMTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTime = r2;
    }

    @aa1
    public String toString() {
        return "ZewaFitUploadData(b=" + this.b + ", dm=" + this.dm + ", di=" + this.di + ", mTime=" + this.mTime + ", mDate=" + this.mDate + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + ", mMaxHeartRate=" + this.mMaxHeartRate + ", mLatestHeartRate=" + this.mLatestHeartRate + ", mMinHeartRate=" + this.mMinHeartRate + ", mDeepSleepTime=" + this.mDeepSleepTime + ", mLightSleepTime=" + this.mLightSleepTime + ", mAwakeSleepTime=" + this.mAwakeSleepTime + ", mMaxTemperature=" + this.mMaxTemperature + ", mLatestTemperature=" + this.mLatestTemperature + ", mMinTemperature=" + this.mMinTemperature + ", mMaxBloodOxygen=" + this.mMaxBloodOxygen + ", mLatestBloodOxygen=" + this.mLatestBloodOxygen + ", mMinBloodOxygen=" + this.mMinBloodOxygen + ", mMaxHrv=" + this.mMaxHrv + ", mLatestHrv=" + this.mLatestHrv + ", mMinHrv=" + this.mMinHrv + ", mMaxStress=" + this.mMaxStress + ", mLatestStress=" + this.mLatestStress + ", mMinStress=" + this.mMinStress + I000IiI1O.iO.iO;
    }

    public ZewaFitUploadData(@aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26, @aa1 String r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, @aa1 String r37, @aa1 String r38, @aa1 String r39, @aa1 String r40, @aa1 String r41, @aa1 String r42) {
        Intrinsics.X0O(r17, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
        Intrinsics.X0O(r18, ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER);
        Intrinsics.X0O(r19, ApsMetricsDataMap.APSMETRICS_FIELD_DEVICEINFO);
        Intrinsics.X0O(r20, "mTime");
        Intrinsics.X0O(r21, "mDate");
        Intrinsics.X0O(r22, "mStep");
        Intrinsics.X0O(r23, "mCalorie");
        Intrinsics.X0O(r24, "mDistance");
        Intrinsics.X0O(r25, "mMaxHeartRate");
        Intrinsics.X0O(r26, "mLatestHeartRate");
        Intrinsics.X0O(r27, "mMinHeartRate");
        Intrinsics.X0O(r28, "mDeepSleepTime");
        Intrinsics.X0O(r29, "mLightSleepTime");
        Intrinsics.X0O(r30, "mAwakeSleepTime");
        Intrinsics.X0O(r31, "mMaxTemperature");
        Intrinsics.X0O(r32, "mLatestTemperature");
        Intrinsics.X0O(r33, "mMinTemperature");
        Intrinsics.X0O(r34, "mMaxBloodOxygen");
        Intrinsics.X0O(r35, "mLatestBloodOxygen");
        Intrinsics.X0O(r36, "mMinBloodOxygen");
        Intrinsics.X0O(r37, "mMaxHrv");
        Intrinsics.X0O(r38, "mLatestHrv");
        Intrinsics.X0O(r39, "mMinHrv");
        Intrinsics.X0O(r40, "mMaxStress");
        Intrinsics.X0O(r41, "mLatestStress");
        Intrinsics.X0O(r42, "mMinStress");
        this.b = r17;
        this.dm = r18;
        this.di = r19;
        this.mTime = r20;
        this.mDate = r21;
        this.mStep = r22;
        this.mCalorie = r23;
        this.mDistance = r24;
        this.mMaxHeartRate = r25;
        this.mLatestHeartRate = r26;
        this.mMinHeartRate = r27;
        this.mDeepSleepTime = r28;
        this.mLightSleepTime = r29;
        this.mAwakeSleepTime = r30;
        this.mMaxTemperature = r31;
        this.mLatestTemperature = r32;
        this.mMinTemperature = r33;
        this.mMaxBloodOxygen = r34;
        this.mLatestBloodOxygen = r35;
        this.mMinBloodOxygen = r36;
        this.mMaxHrv = r37;
        this.mLatestHrv = r38;
        this.mMinHrv = r39;
        this.mMaxStress = r40;
        this.mLatestStress = r41;
        this.mMinStress = r42;
    }

    public /* synthetic */ ZewaFitUploadData(String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, String r44, String r45, String r46, String r47, String r48, String r49, String r50, String r51, String r52, String r53, int r54, DefaultConstructorMarker r55) {
        String r2 = "";
        if ((r54 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r54 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r54 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r54 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r54 & 16) != 0) goto L23;
        r2 = r32;
    L23:
        if ((r54 & 32) == 0) goto L25;
        String r6 = "0";
    L27:
        if ((r54 & 64) == 0) goto L29;
        String r8 = "0";
    L31:
        if ((r54 & 128) == 0) goto L33;
        String r9 = "0";
    L35:
        if ((r54 & 256) == 0) goto L37;
        String r10 = "0";
    L39:
        if ((r54 & 512) == 0) goto L41;
        String r11 = "0";
    L43:
        if ((r54 & 1024) == 0) goto L45;
        String r12 = "0";
    L47:
        if ((r54 & 2048) == 0) goto L49;
        String r13 = "0";
    L51:
        if ((r54 & 4096) == 0) goto L53;
        String r14 = "0";
    L55:
        if ((r54 & 8192) == 0) goto L57;
        String r15 = "0";
    L58:
        String r210 = r1;
        if ((r54 & 16384) == 0) goto L61;
        String r7 = "0";
    L63:
        if ((r54 & 32768) == 0) goto L65;
        String r16 = "0";
    L67:
        if ((r54 & 65536) == 0) goto L69;
        String r17 = "0";
    L71:
        if ((r54 & 131072) == 0) goto L73;
        String r18 = "0";
    L75:
        if ((r54 & 262144) == 0) goto L77;
        String r19 = "0";
    L79:
        if ((r54 & 524288) == 0) goto L81;
        String r20 = "0";
    L83:
        if ((r54 & 1048576) == 0) goto L85;
        String r21 = "0";
    L87:
        if ((r54 & 2097152) == 0) goto L89;
        String r22 = "0";
    L91:
        if ((r54 & 4194304) == 0) goto L93;
        String r23 = "0";
    L95:
        if ((r54 & 8388608) == 0) goto L97;
        String r24 = "0";
    L99:
        if ((r54 & 16777216) == 0) goto L101;
        String r25 = "0";
    L103:
        if ((r54 & 33554432) == 0) goto L106;
        String r56 = "0";
    L107:
        this(r210, r3, r4, r5, r2, r6, r8, r9, r10, r11, r12, r13, r14, r15, r7, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r56);
        return;
    L106:
        r56 = r53;
        goto L107
    L101:
        r25 = r52;
        goto L103
    L97:
        r24 = r51;
        goto L99
    L93:
        r23 = r50;
        goto L95
    L89:
        r22 = r49;
        goto L91
    L85:
        r21 = r48;
        goto L87
    L81:
        r20 = r47;
        goto L83
    L77:
        r19 = r46;
        goto L79
    L73:
        r18 = r45;
        goto L75
    L69:
        r17 = r44;
        goto L71
    L65:
        r16 = r43;
        goto L67
    L61:
        r7 = r42;
        goto L63
    L57:
        r15 = r41;
        goto L58
    L53:
        r14 = r40;
        goto L55
    L49:
        r13 = r39;
        goto L51
    L45:
        r12 = r38;
        goto L47
    L41:
        r11 = r37;
        goto L43
    L37:
        r10 = r36;
        goto L39
    L33:
        r9 = r35;
        goto L35
    L29:
        r8 = r34;
        goto L31
    L25:
        r6 = r33;
        goto L27
    L17:
        r5 = r31;
        goto L19
    L13:
        r4 = r30;
        goto L15
    L9:
        r3 = r29;
        goto L11
    L5:
        r1 = r28;
        goto L7
    }
}
