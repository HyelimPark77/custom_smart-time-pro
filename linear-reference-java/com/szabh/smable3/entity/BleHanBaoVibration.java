package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHanBaoVibration extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mBOValue;
    private int mIsSnore;
    private int mTime;
    private int mVibration;

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

    public BleHanBaoVibration() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleHanBaoVibration copy$default(BleHanBaoVibration r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mVibration;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mBOValue;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mIsSnore;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mVibration;
    }

    public final int component3() {
        return this.mBOValue;
    }

    public final int component4() {
        return this.mIsSnore;
    }

    @aa1
    public final BleHanBaoVibration copy(int r2, int r3, int r4, int r5) {
        return new BleHanBaoVibration(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = (int) BleReadable.readUInt32$default(this, null, 1, null);
        this.mVibration = readUInt8();
        this.mBOValue = readUInt8();
        this.mIsSnore = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHanBaoVibration) == true) goto L8;
        return false;
    L8:
        BleHanBaoVibration r6 = (BleHanBaoVibration) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mVibration == r6.mVibration) goto L15;
        return false;
    L15:
        if (this.mBOValue == r6.mBOValue) goto L18;
        return false;
    L18:
        if (this.mIsSnore == r6.mIsSnore) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMBOValue() {
        return this.mBOValue;
    }

    public final int getMIsSnore() {
        return this.mIsSnore;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mVibration)) * 31) + Integer.hashCode(this.mBOValue)) * 31) + Integer.hashCode(this.mIsSnore);
    }

    public final void setMBOValue(int r1) {
        this.mBOValue = r1;
    }

    public final void setMIsSnore(int r1) {
        this.mIsSnore = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleHanBaoVibration(mTime=" + this.mTime + ", mVibration=" + this.mVibration + ", mBOValue=" + this.mBOValue + ", mIsSnore=" + this.mIsSnore + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHanBaoVibration(int r1, int r2, int r3, int r4) {
        this.mTime = r1;
        this.mVibration = r2;
        this.mBOValue = r3;
        this.mIsSnore = r4;
    }

    public /* synthetic */ BleHanBaoVibration(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
