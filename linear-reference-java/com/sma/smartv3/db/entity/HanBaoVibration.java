package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConstsKt;
import com.szabh.smable3.entity.BleHanBaoVibration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class HanBaoVibration {

    @ColumnInfo
    private int mBOValue;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private final int mId;

    @ColumnInfo
    private int mIsSnore;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private long mTime;

    @ColumnInfo
    private int mVibration;

    public HanBaoVibration() {
        int r1 = 0;
        long r2 = 0;
        String r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        this(r1, r2, r4, r5, r6, r7, r8, 127, null);
    }

    public static /* synthetic */ HanBaoVibration copy$default(HanBaoVibration r0, int r1, long r2, String r4, int r5, int r6, int r7, int r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r0.mLocalTime;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r0.mVibration;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r0.mBOValue;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = r0.mIsSnore;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r0.mIsSync;
    L23:
        int r11 = r7;
        int r12 = r8;
        int r13 = r6;
        String r14 = r4;
        long r15 = r2;
        int r3 = r1;
        return r0.copy(r3, r15, r14, r5, r13, r11, r12);
    }

    public final int component1() {
        return this.mId;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    public final int component4() {
        return this.mVibration;
    }

    public final int component5() {
        return this.mBOValue;
    }

    public final int component6() {
        return this.mIsSnore;
    }

    public final int component7() {
        return this.mIsSync;
    }

    @aa1
    public final HanBaoVibration copy(int r11, long r12, @aa1 String r14, int r15, int r16, int r17, int r18) {
        Intrinsics.X0O(r14, "mLocalTime");
        return new HanBaoVibration(r11, r12, r14, r15, r16, r17, r18);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof HanBaoVibration) == true) goto L8;
        return false;
    L8:
        HanBaoVibration r9 = (HanBaoVibration) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (this.mVibration == r9.mVibration) goto L21;
        return false;
    L21:
        if (this.mBOValue == r9.mBOValue) goto L24;
        return false;
    L24:
        if (this.mIsSnore == r9.mIsSnore) goto L27;
        return false;
    L27:
        if (this.mIsSync == r9.mIsSync) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMId() {
        return this.mId;
    }

    public final int getMIsSnore() {
        return this.mIsSnore;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final long getMTime() {
        return this.mTime;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mBOValue)) * 31) + Integer.hashCode(this.mIsSnore)) * 31) + Integer.hashCode(this.mIsSync);
    }

    public final void setMBOValue(int r1) {
        this.mBOValue = r1;
    }

    public final void setMIsSnore(int r1) {
        this.mIsSnore = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "HanBaoVibration(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mVibration=" + this.mVibration + ", mBOValue=" + this.mBOValue + ", mIsSnore=" + this.mIsSnore + ", mIsSync=" + this.mIsSync + I000IiI1O.iO.iO;
    }

    public HanBaoVibration(int r2, long r3, @aa1 String r5, int r6, int r7, int r8, int r9) {
        Intrinsics.X0O(r5, "mLocalTime");
        this.mId = r2;
        this.mTime = r3;
        this.mLocalTime = r5;
        this.mVibration = r6;
        this.mBOValue = r7;
        this.mIsSnore = r8;
        this.mIsSync = r9;
    }

    public /* synthetic */ HanBaoVibration(int r2, long r3, String r5, int r6, int r7, int r8, int r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = 0;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = 0;
    L21:
        if ((r10 & 64) == 0) goto L24;
        int r12 = 0;
    L23:
        int r13 = r8;
        int r14 = r7;
        this(r2, r3, r5, r6, r14, r13, r12);
        return;
    L24:
        r12 = r9;
        goto L23
    }

    public HanBaoVibration(@aa1 BleHanBaoVibration r16, long r17) {
        Intrinsics.X0O(r16, "bleHanBaoVibration");
        int r5 = 0;
        String r8 = null;
        int r12 = 0;
        this(r5, (((long) (r16.getMTime() + BleConstsKt.DATA_EPOCH)) * 1000) - r17, r8, r16.getMVibration(), r16.getMBOValue(), r16.getMIsSnore(), r12, 69, null);
    }
}
