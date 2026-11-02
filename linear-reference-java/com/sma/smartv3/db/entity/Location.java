package com.sma.smartv3.db.entity;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleLocation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class Location {

    @ColumnInfo
    private int mActivityMode;

    @ColumnInfo
    private int mAltitude;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsBaiDuSync;

    @ColumnInfo
    private int mIsSync;

    @ColumnInfo
    private float mLatitude;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private float mLongitude;

    @ColumnInfo
    private int mSource;

    @ColumnInfo
    private long mTime;

    public Location() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        float r7 = 0.0f;
        float r8 = 0.0f;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, 1023, null);
    }

    public static /* synthetic */ Location copy$default(Location r0, int r1, long r2, String r4, int r5, int r6, float r7, float r8, int r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = r0.mActivityMode;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = r0.mAltitude;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = r0.mLongitude;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = r0.mLatitude;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = r0.mSource;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = r0.mIsSync;
    L30:
        if ((r12 & 512) == 0) goto L32;
        r11 = r0.mIsBaiDuSync;
    L32:
        int r14 = r10;
        int r15 = r11;
        float r16 = r8;
        int r17 = r9;
        int r18 = r6;
        float r19 = r7;
        long r20 = r2;
        int r3 = r1;
        return r0.copy(r3, r20, r4, r5, r18, r19, r16, r17, r14, r15);
    }

    public final int component1() {
        return this.mId;
    }

    public final int component10() {
        return this.mIsBaiDuSync;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mActivityMode;
    }

    public final int component5() {
        return this.mAltitude;
    }

    public final float component6() {
        return this.mLongitude;
    }

    public final float component7() {
        return this.mLatitude;
    }

    public final int component8() {
        return this.mSource;
    }

    public final int component9() {
        return this.mIsSync;
    }

    @aa1
    public final Location copy(int r14, long r15, @aa1 String r17, int r18, int r19, float r20, float r21, int r22, int r23, int r24) {
        Intrinsics.X0O(r17, "mLocalTime");
        return new Location(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Location) == true) goto L8;
        return false;
    L8:
        Location r9 = (Location) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mActivityMode == r9.mActivityMode) goto L21;
        return false;
    L21:
        if (this.mAltitude == r9.mAltitude) goto L24;
        return false;
    L24:
        if (Float.compare(this.mLongitude, r9.mLongitude) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.mLatitude, r9.mLatitude) == 0) goto L30;
        return false;
    L30:
        if (this.mSource == r9.mSource) goto L33;
        return false;
    L33:
        if (this.mIsSync == r9.mIsSync) goto L36;
        return false;
    L36:
        if (this.mIsBaiDuSync == r9.mIsBaiDuSync) goto L38;
        return false;
    L38:
        return true;
    }

    public final int getMActivityMode() {
        return this.mActivityMode;
    }

    public final int getMAltitude() {
        return this.mAltitude;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsBaiDuSync() {
        return this.mIsBaiDuSync;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    public final float getMLatitude() {
        return this.mLatitude;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final float getMLongitude() {
        return this.mLongitude;
    }

    public final int getMSource() {
        return this.mSource;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mActivityMode)) * 31) + Integer.hashCode(this.mAltitude)) * 31) + Float.hashCode(this.mLongitude)) * 31) + Float.hashCode(this.mLatitude)) * 31) + Integer.hashCode(this.mSource)) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsBaiDuSync);
    }

    public final void setMActivityMode(int r1) {
        this.mActivityMode = r1;
    }

    public final void setMAltitude(int r1) {
        this.mAltitude = r1;
    }

    public final void setMIsBaiDuSync(int r1) {
        this.mIsBaiDuSync = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLatitude(float r1) {
        this.mLatitude = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMLongitude(float r1) {
        this.mLongitude = r1;
    }

    public final void setMSource(int r1) {
        this.mSource = r1;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "Location(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mActivityMode=" + this.mActivityMode + ", mAltitude=" + this.mAltitude + ", mLongitude=" + this.mLongitude + ", mLatitude=" + this.mLatitude + ", mSource=" + this.mSource + ", mIsSync=" + this.mIsSync + ", mIsBaiDuSync=" + this.mIsBaiDuSync + I000IiI1O.iO.iO;
    }

    public Location(int r2, long r3, @aa1 String r5, int r6, int r7, float r8, float r9, int r10, int r11, int r12) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mActivityMode = r6;
        this.mAltitude = r7;
        this.mLongitude = r8;
        this.mLatitude = r9;
        this.mSource = r10;
        this.mIsSync = r11;
        this.mIsBaiDuSync = r12;
    }

    public /* synthetic */ Location(int r3, long r4, String r6, int r7, int r8, float r9, float r10, int r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r6 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r7 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r8 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r9 = 0.0f;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r10 = 0.0f;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r11 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r12 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        int r16 = 0;
    L32:
        int r17 = r12;
        int r18 = r11;
        float r19 = r10;
        float r110 = r9;
        int r20 = r8;
        this(r3, r4, r6, r7, r20, r110, r19, r18, r17, r16);
        return;
    L33:
        r16 = r13;
        goto L32
    }

    public Location(@aa1 BleLocation r19, long r20) {
        Intrinsics.X0O(r19, "bleLocation");
        int r5 = 0;
        String r8 = null;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        this(r5, (((long) (r19.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r20, r8, r19.getMActivityMode(), r19.getMAltitude(), r19.getMLongitude(), r19.getMLatitude(), r13, r14, r15, TypedValues.Custom.TYPE_FLOAT, null);
    }
}
