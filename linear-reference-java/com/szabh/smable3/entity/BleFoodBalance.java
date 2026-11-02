package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleFoodBalance extends BleReadable {
    public static final int AMOUNT_A_LITTLE = 1;
    public static final int AMOUNT_A_LOT = 3;
    public static final int AMOUNT_NONE = 0;
    public static final int AMOUNT_NORMAL = 2;
    public static final int CATEGORY_BREAKFAST = 0;
    public static final int CATEGORY_DINNER = 2;
    public static final int CATEGORY_LUNCH = 1;
    public static final int CATEGORY_SNACK = 3;

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mFishAmount;
    private int mLiquorAmount;
    private int mMealCategoryFlag;
    private int mMeatAmount;
    private int mRiceAmount;
    private int mTime;
    private int mVegetableAmount;

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

    public BleFoodBalance() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleFoodBalance copy$default(BleFoodBalance r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mMealCategoryFlag;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mRiceAmount;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mFishAmount;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mMeatAmount;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mVegetableAmount;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mLiquorAmount;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mMealCategoryFlag;
    }

    public final int component3() {
        return this.mRiceAmount;
    }

    public final int component4() {
        return this.mFishAmount;
    }

    public final int component5() {
        return this.mMeatAmount;
    }

    public final int component6() {
        return this.mVegetableAmount;
    }

    public final int component7() {
        return this.mLiquorAmount;
    }

    @aa1
    public final BleFoodBalance copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleFoodBalance(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mMealCategoryFlag = readInt8();
        this.mRiceAmount = readInt8();
        this.mFishAmount = readInt8();
        this.mMeatAmount = readInt8();
        this.mVegetableAmount = readInt8();
        this.mLiquorAmount = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleFoodBalance) == true) goto L8;
        return false;
    L8:
        BleFoodBalance r6 = (BleFoodBalance) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mMealCategoryFlag == r6.mMealCategoryFlag) goto L15;
        return false;
    L15:
        if (this.mRiceAmount == r6.mRiceAmount) goto L18;
        return false;
    L18:
        if (this.mFishAmount == r6.mFishAmount) goto L21;
        return false;
    L21:
        if (this.mMeatAmount == r6.mMeatAmount) goto L24;
        return false;
    L24:
        if (this.mVegetableAmount == r6.mVegetableAmount) goto L27;
        return false;
    L27:
        if (this.mLiquorAmount == r6.mLiquorAmount) goto L29;
        return false;
    L29:
        return true;
    }

    public final int getMFishAmount() {
        return this.mFishAmount;
    }

    public final int getMLiquorAmount() {
        return this.mLiquorAmount;
    }

    public final int getMMealCategoryFlag() {
        return this.mMealCategoryFlag;
    }

    public final int getMMeatAmount() {
        return this.mMeatAmount;
    }

    public final int getMRiceAmount() {
        return this.mRiceAmount;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMVegetableAmount() {
        return this.mVegetableAmount;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mMealCategoryFlag)) * 31) + Integer.hashCode(this.mRiceAmount)) * 31) + Integer.hashCode(this.mFishAmount)) * 31) + Integer.hashCode(this.mMeatAmount)) * 31) + Integer.hashCode(this.mVegetableAmount)) * 31) + Integer.hashCode(this.mLiquorAmount);
    }

    public final void setMFishAmount(int r1) {
        this.mFishAmount = r1;
    }

    public final void setMLiquorAmount(int r1) {
        this.mLiquorAmount = r1;
    }

    public final void setMMealCategoryFlag(int r1) {
        this.mMealCategoryFlag = r1;
    }

    public final void setMMeatAmount(int r1) {
        this.mMeatAmount = r1;
    }

    public final void setMRiceAmount(int r1) {
        this.mRiceAmount = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMVegetableAmount(int r1) {
        this.mVegetableAmount = r1;
    }

    @aa1
    public String toString() {
        return "BleFoodBalance(mTime=" + this.mTime + ", mMealCategoryFlag=" + this.mMealCategoryFlag + ", mRiceAmount=" + this.mRiceAmount + ", mFishAmount=" + this.mFishAmount + ", mMeatAmount=" + this.mMeatAmount + ", mVegetableAmount=" + this.mVegetableAmount + ", mLiquorAmount=" + this.mLiquorAmount + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleFoodBalance(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mTime = r1;
        this.mMealCategoryFlag = r2;
        this.mRiceAmount = r3;
        this.mFishAmount = r4;
        this.mMeatAmount = r5;
        this.mVegetableAmount = r6;
        this.mLiquorAmount = r7;
    }

    public /* synthetic */ BleFoodBalance(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
