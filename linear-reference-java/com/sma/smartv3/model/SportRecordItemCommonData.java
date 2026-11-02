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

    public SportRecordItemCommonData(@aa1 String r2, int r3, int r4, int r5, @aa1 List<? extends SportRecordItemData> r6, int r7, @aa1 String r8, int r9, int r10, int r11, int r12, int r13, @aa1 String r14, float r15, int r16) {
        Intrinsics.X0O(r2, "sportStartTime");
        Intrinsics.X0O(r6, "contentList");
        Intrinsics.X0O(r8, "sportTimeStr");
        Intrinsics.X0O(r14, "mPlatform");
        this.sportStartTime = r2;
        this.workoutImg = r3;
        this.workoutModeName = r4;
        this.gpsState = r5;
        this.contentList = r6;
        this.spanCount = r7;
        this.sportTimeStr = r8;
        this.mDistance = r9;
        this.mPace = r10;
        this.mCalorie = r11;
        this.mDuration = r12;
        this.mMode = r13;
        this.mPlatform = r14;
        this.mAvgSpeed = r15;
        this.mSpeed = r16;
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

    public final void setContentList(@aa1 List<? extends SportRecordItemData> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.contentList = r2;
    }

    public final void setGpsState(int r1) {
        this.gpsState = r1;
    }

    public final void setMAvgSpeed(float r1) {
        this.mAvgSpeed = r1;
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMDistance(int r1) {
        this.mDistance = r1;
    }

    public final void setMDuration(int r1) {
        this.mDuration = r1;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMPace(int r1) {
        this.mPace = r1;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMSpeed(int r1) {
        this.mSpeed = r1;
    }

    public final void setSpanCount(int r1) {
        this.spanCount = r1;
    }

    public final void setSportStartTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportStartTime = r2;
    }

    public final void setSportTimeStr(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportTimeStr = r2;
    }

    public final void setWorkoutImg(int r1) {
        this.workoutImg = r1;
    }

    public final void setWorkoutModeName(int r1) {
        this.workoutModeName = r1;
    }

    @aa1
    public String toString() {
        return "SportRecordItemCommonData(sportStartTime='" + this.sportStartTime + "', workoutImg=" + this.workoutImg + ", workoutModeName=" + this.workoutModeName + ", gpsState=" + this.gpsState + ", contentList=" + this.contentList + ", spanCount=" + this.spanCount + ", sportTimeStr='" + this.sportTimeStr + "', mDistance=" + this.mDistance + ", mPace=" + this.mPace + ", mCalorie=" + this.mCalorie + ", mDuration=" + this.mDuration + ", mMode=" + this.mMode + ", mPlatform='" + this.mPlatform + "', mAvgSpeed=" + this.mAvgSpeed + ", mSpeed=" + this.mSpeed + I000IiI1O.iO.iO;
    }

    public /* synthetic */ SportRecordItemCommonData(String r20, int r21, int r22, int r23, List r24, int r25, String r26, int r27, int r28, int r29, int r30, int r31, String r32, float r33, int r34, int r35, DefaultConstructorMarker r36) {
        if ((r35 & 64) == 0) goto L5;
        String r10 = "";
    L7:
        if ((r35 & 128) == 0) goto L9;
        int r11 = 0;
    L11:
        if ((r35 & 256) == 0) goto L13;
        int r12 = 0;
    L15:
        if ((r35 & 512) == 0) goto L17;
        int r13 = 0;
    L19:
        if ((r35 & 1024) == 0) goto L21;
        int r14 = 0;
    L23:
        if ((r35 & 2048) == 0) goto L25;
        int r15 = 0;
    L27:
        if ((r35 & 4096) == 0) goto L29;
        String r16 = "";
    L31:
        if ((r35 & 8192) == 0) goto L33;
        float r17 = 0.0f;
    L35:
        if ((r35 & 16384) == 0) goto L37;
        int r18 = 0;
    L38:
        this(r20, r21, r22, r23, r24, r25, r10, r11, r12, r13, r14, r15, r16, r17, r18);
        return;
    L37:
        r18 = r34;
        goto L38
    L33:
        r17 = r33;
        goto L35
    L29:
        r16 = r32;
        goto L31
    L25:
        r15 = r31;
        goto L27
    L21:
        r14 = r30;
        goto L23
    L17:
        r13 = r29;
        goto L19
    L13:
        r12 = r28;
        goto L15
    L9:
        r11 = r27;
        goto L11
    L5:
        r10 = r26;
        goto L7
    }
}
