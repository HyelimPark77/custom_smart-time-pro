package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SportRecordItemCommonData {

    @aa1
    private List<? extends SportRecordItemData> contentList;
    private int gpsState;
    private float mAvgSpeed;
    private int mCalorie;
    private int mDistance;
    private int mDuration;
    private int mMode;
    private int mPace;

    @aa1
    private String mPlatform;
    private int mSpeed;
    private int spanCount;

    @aa1
    private String sportStartTime;

    @aa1
    private String sportTimeStr;
    private int workoutImg;
    private int workoutModeName;

    public SportRecordItemCommonData(@aa1 String sportStartTime, int i, int i2, int i3, @aa1 List<? extends SportRecordItemData> contentList, int i4, @aa1 String sportTimeStr, int i5, int i6, int i7, int i8, int i9, @aa1 String mPlatform, float f, int i10) {
        Intrinsics.X0O(sportStartTime, "sportStartTime");
        Intrinsics.X0O(contentList, "contentList");
        Intrinsics.X0O(sportTimeStr, "sportTimeStr");
        Intrinsics.X0O(mPlatform, "mPlatform");
        this.sportStartTime = sportStartTime;
        this.workoutImg = i;
        this.workoutModeName = i2;
        this.gpsState = i3;
        this.contentList = contentList;
        this.spanCount = i4;
        this.sportTimeStr = sportTimeStr;
        this.mDistance = i5;
        this.mPace = i6;
        this.mCalorie = i7;
        this.mDuration = i8;
        this.mMode = i9;
        this.mPlatform = mPlatform;
        this.mAvgSpeed = f;
        this.mSpeed = i10;
    }

    @aa1
    public final List<SportRecordItemData> getContentList() {
        return this.contentList;
    }

    public final int getGpsState() {
        return this.gpsState;
    }

    public final float getMAvgSpeed() {
        return this.mAvgSpeed;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMDistance() {
        return this.mDistance;
    }

    public final int getMDuration() {
        return this.mDuration;
    }

    public final int getMMode() {
        return this.mMode;
    }

    public final int getMPace() {
        return this.mPace;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    public final int getMSpeed() {
        return this.mSpeed;
    }

    public final int getSpanCount() {
        return this.spanCount;
    }

    @aa1
    public final String getSportStartTime() {
        return this.sportStartTime;
    }

    @aa1
    public final String getSportTimeStr() {
        return this.sportTimeStr;
    }

    public final int getWorkoutImg() {
        return this.workoutImg;
    }

    public final int getWorkoutModeName() {
        return this.workoutModeName;
    }

    public final void setContentList(@aa1 List<? extends SportRecordItemData> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.contentList = list;
    }

    public final void setGpsState(int i) {
        this.gpsState = i;
    }

    public final void setMAvgSpeed(float f) {
        this.mAvgSpeed = f;
    }

    public final void setMCalorie(int i) {
        this.mCalorie = i;
    }

    public final void setMDistance(int i) {
        this.mDistance = i;
    }

    public final void setMDuration(int i) {
        this.mDuration = i;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMPace(int i) {
        this.mPace = i;
    }

    public final void setMPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPlatform = str;
    }

    public final void setMSpeed(int i) {
        this.mSpeed = i;
    }

    public final void setSpanCount(int i) {
        this.spanCount = i;
    }

    public final void setSportStartTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sportStartTime = str;
    }

    public final void setSportTimeStr(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.sportTimeStr = str;
    }

    public final void setWorkoutImg(int i) {
        this.workoutImg = i;
    }

    public final void setWorkoutModeName(int i) {
        this.workoutModeName = i;
    }

    @aa1
    public String toString() {
        return "SportRecordItemCommonData(sportStartTime='" + this.sportStartTime + "', workoutImg=" + this.workoutImg + ", workoutModeName=" + this.workoutModeName + ", gpsState=" + this.gpsState + ", contentList=" + this.contentList + ", spanCount=" + this.spanCount + ", sportTimeStr='" + this.sportTimeStr + "', mDistance=" + this.mDistance + ", mPace=" + this.mPace + ", mCalorie=" + this.mCalorie + ", mDuration=" + this.mDuration + ", mMode=" + this.mMode + ", mPlatform='" + this.mPlatform + "', mAvgSpeed=" + this.mAvgSpeed + ", mSpeed=" + this.mSpeed + I000IiI1O.C2156iO.f1007iO;
    }

    public /* synthetic */ SportRecordItemCommonData(String str, int i, int i2, int i3, List list, int i4, String str2, int i5, int i6, int i7, int i8, int i9, String str3, float f, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, list, i4, (i11 & 64) != 0 ? "" : str2, (i11 & 128) != 0 ? 0 : i5, (i11 & 256) != 0 ? 0 : i6, (i11 & 512) != 0 ? 0 : i7, (i11 & 1024) != 0 ? 0 : i8, (i11 & 2048) != 0 ? 0 : i9, (i11 & 4096) != 0 ? "" : str3, (i11 & 8192) != 0 ? 0.0f : f, (i11 & 16384) != 0 ? 0 : i10);
    }
}
