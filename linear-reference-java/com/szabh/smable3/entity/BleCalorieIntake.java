package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCalorieIntake extends BleReadable {
    public static final int CATEGORY_BREAKFAST = 0;
    public static final int CATEGORY_DINNER = 2;
    public static final int CATEGORY_LUNCH = 1;
    public static final int CATEGORY_SNACK = 3;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mCalorie;
    private int mMealCategoryFlag;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleCalorieIntake() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleCalorieIntake copy$default(BleCalorieIntake r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mMealCategoryFlag;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mCalorie;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMealCategoryFlag;
    }

    public final int component3() {
        return this.mCalorie;
    }

    @aa1
    public final BleCalorieIntake copy(int r2, int r3, int r4) {
        return new BleCalorieIntake(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMealCategoryFlag = readInt8();
        this.mCalorie = BleReadable.readInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleCalorieIntake) == true) goto L8;
        return false;
    L8:
        BleCalorieIntake r6 = (BleCalorieIntake) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mMealCategoryFlag == r6.mMealCategoryFlag) goto L15;
        return false;
    L15:
        if (this.mCalorie == r6.mCalorie) goto L17;
        return false;
    L17:
        return true;
    }

    public final int getMCalorie() {
        return this.mCalorie;
    }

    public final int getMMealCategoryFlag() {
        return this.mMealCategoryFlag;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMealCategoryFlag)) * 31) + Integer.hashCode(this.mCalorie);
    }

    public final void setMCalorie(int r1) {
        this.mCalorie = r1;
    }

    public final void setMMealCategoryFlag(int r1) {
        this.mMealCategoryFlag = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleCalorieIntake(mTime=" + this.mTime + ", mMealCategoryFlag=" + this.mMealCategoryFlag + ", mCalorie=" + this.mCalorie + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCalorieIntake(int r1, int r2, int r3) {
        this.mTime = r1;
        this.mMealCategoryFlag = r2;
        this.mCalorie = r3;
    }

    public /* synthetic */ BleCalorieIntake(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
