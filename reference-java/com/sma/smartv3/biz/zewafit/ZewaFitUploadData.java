package com.sma.smartv3.biz.zewafit;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ZewaFitUploadData {

    /* JADX INFO: renamed from: b */
    @aa1
    private String f50961b;

    /* JADX INFO: renamed from: di */
    @aa1
    private String f50962di;

    /* JADX INFO: renamed from: dm */
    @aa1
    private String f50963dm;

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
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public static /* synthetic */ ZewaFitUploadData copy$default(ZewaFitUploadData zewaFitUploadData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, Object obj) {
        String str27;
        String str28;
        String str29 = (i & 1) != 0 ? zewaFitUploadData.f50961b : str;
        String str30 = (i & 2) != 0 ? zewaFitUploadData.f50963dm : str2;
        String str31 = (i & 4) != 0 ? zewaFitUploadData.f50962di : str3;
        String str32 = (i & 8) != 0 ? zewaFitUploadData.mTime : str4;
        String str33 = (i & 16) != 0 ? zewaFitUploadData.mDate : str5;
        String str34 = (i & 32) != 0 ? zewaFitUploadData.mStep : str6;
        String str35 = (i & 64) != 0 ? zewaFitUploadData.mCalorie : str7;
        String str36 = (i & 128) != 0 ? zewaFitUploadData.mDistance : str8;
        String str37 = (i & 256) != 0 ? zewaFitUploadData.mMaxHeartRate : str9;
        String str38 = (i & 512) != 0 ? zewaFitUploadData.mLatestHeartRate : str10;
        String str39 = (i & 1024) != 0 ? zewaFitUploadData.mMinHeartRate : str11;
        String str40 = (i & 2048) != 0 ? zewaFitUploadData.mDeepSleepTime : str12;
        String str41 = (i & 4096) != 0 ? zewaFitUploadData.mLightSleepTime : str13;
        String str42 = (i & 8192) != 0 ? zewaFitUploadData.mAwakeSleepTime : str14;
        String str43 = str29;
        String str44 = (i & 16384) != 0 ? zewaFitUploadData.mMaxTemperature : str15;
        String str45 = (i & 32768) != 0 ? zewaFitUploadData.mLatestTemperature : str16;
        String str46 = (i & 65536) != 0 ? zewaFitUploadData.mMinTemperature : str17;
        String str47 = (i & 131072) != 0 ? zewaFitUploadData.mMaxBloodOxygen : str18;
        String str48 = (i & 262144) != 0 ? zewaFitUploadData.mLatestBloodOxygen : str19;
        String str49 = (i & 524288) != 0 ? zewaFitUploadData.mMinBloodOxygen : str20;
        String str50 = (i & 1048576) != 0 ? zewaFitUploadData.mMaxHrv : str21;
        String str51 = (i & 2097152) != 0 ? zewaFitUploadData.mLatestHrv : str22;
        String str52 = (i & 4194304) != 0 ? zewaFitUploadData.mMinHrv : str23;
        String str53 = (i & 8388608) != 0 ? zewaFitUploadData.mMaxStress : str24;
        String str54 = (i & 16777216) != 0 ? zewaFitUploadData.mLatestStress : str25;
        if ((i & 33554432) != 0) {
            str28 = str54;
            str27 = zewaFitUploadData.mMinStress;
        } else {
            str27 = str26;
            str28 = str54;
        }
        return zewaFitUploadData.copy(str43, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str28, str27);
    }

    @aa1
    public final String component1() {
        return this.f50961b;
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
        return this.f50963dm;
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
        return this.f50962di;
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
    public final ZewaFitUploadData copy(@aa1 String b, @aa1 String dm, @aa1 String di, @aa1 String mTime, @aa1 String mDate, @aa1 String mStep, @aa1 String mCalorie, @aa1 String mDistance, @aa1 String mMaxHeartRate, @aa1 String mLatestHeartRate, @aa1 String mMinHeartRate, @aa1 String mDeepSleepTime, @aa1 String mLightSleepTime, @aa1 String mAwakeSleepTime, @aa1 String mMaxTemperature, @aa1 String mLatestTemperature, @aa1 String mMinTemperature, @aa1 String mMaxBloodOxygen, @aa1 String mLatestBloodOxygen, @aa1 String mMinBloodOxygen, @aa1 String mMaxHrv, @aa1 String mLatestHrv, @aa1 String mMinHrv, @aa1 String mMaxStress, @aa1 String mLatestStress, @aa1 String mMinStress) {
        Intrinsics.X0O(b, "b");
        Intrinsics.X0O(dm, "dm");
        Intrinsics.X0O(di, "di");
        Intrinsics.X0O(mTime, "mTime");
        Intrinsics.X0O(mDate, "mDate");
        Intrinsics.X0O(mStep, "mStep");
        Intrinsics.X0O(mCalorie, "mCalorie");
        Intrinsics.X0O(mDistance, "mDistance");
        Intrinsics.X0O(mMaxHeartRate, "mMaxHeartRate");
        Intrinsics.X0O(mLatestHeartRate, "mLatestHeartRate");
        Intrinsics.X0O(mMinHeartRate, "mMinHeartRate");
        Intrinsics.X0O(mDeepSleepTime, "mDeepSleepTime");
        Intrinsics.X0O(mLightSleepTime, "mLightSleepTime");
        Intrinsics.X0O(mAwakeSleepTime, "mAwakeSleepTime");
        Intrinsics.X0O(mMaxTemperature, "mMaxTemperature");
        Intrinsics.X0O(mLatestTemperature, "mLatestTemperature");
        Intrinsics.X0O(mMinTemperature, "mMinTemperature");
        Intrinsics.X0O(mMaxBloodOxygen, "mMaxBloodOxygen");
        Intrinsics.X0O(mLatestBloodOxygen, "mLatestBloodOxygen");
        Intrinsics.X0O(mMinBloodOxygen, "mMinBloodOxygen");
        Intrinsics.X0O(mMaxHrv, "mMaxHrv");
        Intrinsics.X0O(mLatestHrv, "mLatestHrv");
        Intrinsics.X0O(mMinHrv, "mMinHrv");
        Intrinsics.X0O(mMaxStress, "mMaxStress");
        Intrinsics.X0O(mLatestStress, "mLatestStress");
        Intrinsics.X0O(mMinStress, "mMinStress");
        return new ZewaFitUploadData(b, dm, di, mTime, mDate, mStep, mCalorie, mDistance, mMaxHeartRate, mLatestHeartRate, mMinHeartRate, mDeepSleepTime, mLightSleepTime, mAwakeSleepTime, mMaxTemperature, mLatestTemperature, mMinTemperature, mMaxBloodOxygen, mLatestBloodOxygen, mMinBloodOxygen, mMaxHrv, mLatestHrv, mMinHrv, mMaxStress, mLatestStress, mMinStress);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZewaFitUploadData)) {
            return false;
        }
        ZewaFitUploadData zewaFitUploadData = (ZewaFitUploadData) obj;
        return Intrinsics.XOO0ii0(this.f50961b, zewaFitUploadData.f50961b) && Intrinsics.XOO0ii0(this.f50963dm, zewaFitUploadData.f50963dm) && Intrinsics.XOO0ii0(this.f50962di, zewaFitUploadData.f50962di) && Intrinsics.XOO0ii0(this.mTime, zewaFitUploadData.mTime) && Intrinsics.XOO0ii0(this.mDate, zewaFitUploadData.mDate) && Intrinsics.XOO0ii0(this.mStep, zewaFitUploadData.mStep) && Intrinsics.XOO0ii0(this.mCalorie, zewaFitUploadData.mCalorie) && Intrinsics.XOO0ii0(this.mDistance, zewaFitUploadData.mDistance) && Intrinsics.XOO0ii0(this.mMaxHeartRate, zewaFitUploadData.mMaxHeartRate) && Intrinsics.XOO0ii0(this.mLatestHeartRate, zewaFitUploadData.mLatestHeartRate) && Intrinsics.XOO0ii0(this.mMinHeartRate, zewaFitUploadData.mMinHeartRate) && Intrinsics.XOO0ii0(this.mDeepSleepTime, zewaFitUploadData.mDeepSleepTime) && Intrinsics.XOO0ii0(this.mLightSleepTime, zewaFitUploadData.mLightSleepTime) && Intrinsics.XOO0ii0(this.mAwakeSleepTime, zewaFitUploadData.mAwakeSleepTime) && Intrinsics.XOO0ii0(this.mMaxTemperature, zewaFitUploadData.mMaxTemperature) && Intrinsics.XOO0ii0(this.mLatestTemperature, zewaFitUploadData.mLatestTemperature) && Intrinsics.XOO0ii0(this.mMinTemperature, zewaFitUploadData.mMinTemperature) && Intrinsics.XOO0ii0(this.mMaxBloodOxygen, zewaFitUploadData.mMaxBloodOxygen) && Intrinsics.XOO0ii0(this.mLatestBloodOxygen, zewaFitUploadData.mLatestBloodOxygen) && Intrinsics.XOO0ii0(this.mMinBloodOxygen, zewaFitUploadData.mMinBloodOxygen) && Intrinsics.XOO0ii0(this.mMaxHrv, zewaFitUploadData.mMaxHrv) && Intrinsics.XOO0ii0(this.mLatestHrv, zewaFitUploadData.mLatestHrv) && Intrinsics.XOO0ii0(this.mMinHrv, zewaFitUploadData.mMinHrv) && Intrinsics.XOO0ii0(this.mMaxStress, zewaFitUploadData.mMaxStress) && Intrinsics.XOO0ii0(this.mLatestStress, zewaFitUploadData.mLatestStress) && Intrinsics.XOO0ii0(this.mMinStress, zewaFitUploadData.mMinStress);
    }

    @aa1
    public final String getB() {
        return this.f50961b;
    }

    @aa1
    public final String getDi() {
        return this.f50962di;
    }

    @aa1
    public final String getDm() {
        return this.f50963dm;
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
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.f50961b.hashCode() * 31) + this.f50963dm.hashCode()) * 31) + this.f50962di.hashCode()) * 31) + this.mTime.hashCode()) * 31) + this.mDate.hashCode()) * 31) + this.mStep.hashCode()) * 31) + this.mCalorie.hashCode()) * 31) + this.mDistance.hashCode()) * 31) + this.mMaxHeartRate.hashCode()) * 31) + this.mLatestHeartRate.hashCode()) * 31) + this.mMinHeartRate.hashCode()) * 31) + this.mDeepSleepTime.hashCode()) * 31) + this.mLightSleepTime.hashCode()) * 31) + this.mAwakeSleepTime.hashCode()) * 31) + this.mMaxTemperature.hashCode()) * 31) + this.mLatestTemperature.hashCode()) * 31) + this.mMinTemperature.hashCode()) * 31) + this.mMaxBloodOxygen.hashCode()) * 31) + this.mLatestBloodOxygen.hashCode()) * 31) + this.mMinBloodOxygen.hashCode()) * 31) + this.mMaxHrv.hashCode()) * 31) + this.mLatestHrv.hashCode()) * 31) + this.mMinHrv.hashCode()) * 31) + this.mMaxStress.hashCode()) * 31) + this.mLatestStress.hashCode()) * 31) + this.mMinStress.hashCode();
    }

    public final void setB(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50961b = str;
    }

    public final void setDi(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50962di = str;
    }

    public final void setDm(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.f50963dm = str;
    }

    public final void setMAwakeSleepTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAwakeSleepTime = str;
    }

    public final void setMCalorie(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mCalorie = str;
    }

    public final void setMDate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDate = str;
    }

    public final void setMDeepSleepTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDeepSleepTime = str;
    }

    public final void setMDistance(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mDistance = str;
    }

    public final void setMLatestBloodOxygen(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLatestBloodOxygen = str;
    }

    public final void setMLatestHeartRate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLatestHeartRate = str;
    }

    public final void setMLatestHrv(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLatestHrv = str;
    }

    public final void setMLatestStress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLatestStress = str;
    }

    public final void setMLatestTemperature(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLatestTemperature = str;
    }

    public final void setMLightSleepTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLightSleepTime = str;
    }

    public final void setMMaxBloodOxygen(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMaxBloodOxygen = str;
    }

    public final void setMMaxHeartRate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMaxHeartRate = str;
    }

    public final void setMMaxHrv(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMaxHrv = str;
    }

    public final void setMMaxStress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMaxStress = str;
    }

    public final void setMMaxTemperature(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMaxTemperature = str;
    }

    public final void setMMinBloodOxygen(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMinBloodOxygen = str;
    }

    public final void setMMinHeartRate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMinHeartRate = str;
    }

    public final void setMMinHrv(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMinHrv = str;
    }

    public final void setMMinStress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMinStress = str;
    }

    public final void setMMinTemperature(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMinTemperature = str;
    }

    public final void setMStep(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mStep = str;
    }

    public final void setMTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTime = str;
    }

    @aa1
    public String toString() {
        return "ZewaFitUploadData(b=" + this.f50961b + ", dm=" + this.f50963dm + ", di=" + this.f50962di + ", mTime=" + this.mTime + ", mDate=" + this.mDate + ", mStep=" + this.mStep + ", mCalorie=" + this.mCalorie + ", mDistance=" + this.mDistance + ", mMaxHeartRate=" + this.mMaxHeartRate + ", mLatestHeartRate=" + this.mLatestHeartRate + ", mMinHeartRate=" + this.mMinHeartRate + ", mDeepSleepTime=" + this.mDeepSleepTime + ", mLightSleepTime=" + this.mLightSleepTime + ", mAwakeSleepTime=" + this.mAwakeSleepTime + ", mMaxTemperature=" + this.mMaxTemperature + ", mLatestTemperature=" + this.mLatestTemperature + ", mMinTemperature=" + this.mMinTemperature + ", mMaxBloodOxygen=" + this.mMaxBloodOxygen + ", mLatestBloodOxygen=" + this.mLatestBloodOxygen + ", mMinBloodOxygen=" + this.mMinBloodOxygen + ", mMaxHrv=" + this.mMaxHrv + ", mLatestHrv=" + this.mLatestHrv + ", mMinHrv=" + this.mMinHrv + ", mMaxStress=" + this.mMaxStress + ", mLatestStress=" + this.mLatestStress + ", mMinStress=" + this.mMinStress + I000IiI1O.C2156iO.f1007iO;
    }

    public ZewaFitUploadData(@aa1 String b, @aa1 String dm, @aa1 String di, @aa1 String mTime, @aa1 String mDate, @aa1 String mStep, @aa1 String mCalorie, @aa1 String mDistance, @aa1 String mMaxHeartRate, @aa1 String mLatestHeartRate, @aa1 String mMinHeartRate, @aa1 String mDeepSleepTime, @aa1 String mLightSleepTime, @aa1 String mAwakeSleepTime, @aa1 String mMaxTemperature, @aa1 String mLatestTemperature, @aa1 String mMinTemperature, @aa1 String mMaxBloodOxygen, @aa1 String mLatestBloodOxygen, @aa1 String mMinBloodOxygen, @aa1 String mMaxHrv, @aa1 String mLatestHrv, @aa1 String mMinHrv, @aa1 String mMaxStress, @aa1 String mLatestStress, @aa1 String mMinStress) {
        Intrinsics.X0O(b, "b");
        Intrinsics.X0O(dm, "dm");
        Intrinsics.X0O(di, "di");
        Intrinsics.X0O(mTime, "mTime");
        Intrinsics.X0O(mDate, "mDate");
        Intrinsics.X0O(mStep, "mStep");
        Intrinsics.X0O(mCalorie, "mCalorie");
        Intrinsics.X0O(mDistance, "mDistance");
        Intrinsics.X0O(mMaxHeartRate, "mMaxHeartRate");
        Intrinsics.X0O(mLatestHeartRate, "mLatestHeartRate");
        Intrinsics.X0O(mMinHeartRate, "mMinHeartRate");
        Intrinsics.X0O(mDeepSleepTime, "mDeepSleepTime");
        Intrinsics.X0O(mLightSleepTime, "mLightSleepTime");
        Intrinsics.X0O(mAwakeSleepTime, "mAwakeSleepTime");
        Intrinsics.X0O(mMaxTemperature, "mMaxTemperature");
        Intrinsics.X0O(mLatestTemperature, "mLatestTemperature");
        Intrinsics.X0O(mMinTemperature, "mMinTemperature");
        Intrinsics.X0O(mMaxBloodOxygen, "mMaxBloodOxygen");
        Intrinsics.X0O(mLatestBloodOxygen, "mLatestBloodOxygen");
        Intrinsics.X0O(mMinBloodOxygen, "mMinBloodOxygen");
        Intrinsics.X0O(mMaxHrv, "mMaxHrv");
        Intrinsics.X0O(mLatestHrv, "mLatestHrv");
        Intrinsics.X0O(mMinHrv, "mMinHrv");
        Intrinsics.X0O(mMaxStress, "mMaxStress");
        Intrinsics.X0O(mLatestStress, "mLatestStress");
        Intrinsics.X0O(mMinStress, "mMinStress");
        this.f50961b = b;
        this.f50963dm = dm;
        this.f50962di = di;
        this.mTime = mTime;
        this.mDate = mDate;
        this.mStep = mStep;
        this.mCalorie = mCalorie;
        this.mDistance = mDistance;
        this.mMaxHeartRate = mMaxHeartRate;
        this.mLatestHeartRate = mLatestHeartRate;
        this.mMinHeartRate = mMinHeartRate;
        this.mDeepSleepTime = mDeepSleepTime;
        this.mLightSleepTime = mLightSleepTime;
        this.mAwakeSleepTime = mAwakeSleepTime;
        this.mMaxTemperature = mMaxTemperature;
        this.mLatestTemperature = mLatestTemperature;
        this.mMinTemperature = mMinTemperature;
        this.mMaxBloodOxygen = mMaxBloodOxygen;
        this.mLatestBloodOxygen = mLatestBloodOxygen;
        this.mMinBloodOxygen = mMinBloodOxygen;
        this.mMaxHrv = mMaxHrv;
        this.mLatestHrv = mLatestHrv;
        this.mMinHrv = mMinHrv;
        this.mMaxStress = mMaxStress;
        this.mLatestStress = mLatestStress;
        this.mMinStress = mMinStress;
    }

    public /* synthetic */ ZewaFitUploadData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? "0" : str6, (i & 64) != 0 ? "0" : str7, (i & 128) != 0 ? "0" : str8, (i & 256) != 0 ? "0" : str9, (i & 512) != 0 ? "0" : str10, (i & 1024) != 0 ? "0" : str11, (i & 2048) != 0 ? "0" : str12, (i & 4096) != 0 ? "0" : str13, (i & 8192) != 0 ? "0" : str14, (i & 16384) != 0 ? "0" : str15, (i & 32768) != 0 ? "0" : str16, (i & 65536) != 0 ? "0" : str17, (i & 131072) != 0 ? "0" : str18, (i & 262144) != 0 ? "0" : str19, (i & 524288) != 0 ? "0" : str20, (i & 1048576) != 0 ? "0" : str21, (i & 2097152) != 0 ? "0" : str22, (i & 4194304) != 0 ? "0" : str23, (i & 8388608) != 0 ? "0" : str24, (i & 16777216) != 0 ? "0" : str25, (i & 33554432) != 0 ? "0" : str26);
    }
}
