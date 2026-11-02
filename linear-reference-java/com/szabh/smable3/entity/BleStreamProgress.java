package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStreamProgress extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 9;
    private int mCompleted;
    private int mErrorCode;
    private int mStatus;
    private int mTotal;

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

    public BleStreamProgress() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleStreamProgress copy$default(BleStreamProgress r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mStatus;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mErrorCode;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mTotal;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mCompleted;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mStatus;
    }

    public final int component2() {
        return this.mErrorCode;
    }

    public final int component3() {
        return this.mTotal;
    }

    public final int component4() {
        return this.mCompleted;
    }

    @aa1
    public final BleStreamProgress copy(int r2, int r3, int r4, int r5) {
        return new BleStreamProgress(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mStatus = readIntN(4);
        this.mErrorCode = readIntN(4);
        this.mTotal = BleReadable.readInt32$default(this, null, 1, null);
        this.mCompleted = BleReadable.readInt32$default(this, null, 1, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleStreamProgress) == true) goto L8;
        return false;
    L8:
        BleStreamProgress r6 = (BleStreamProgress) r5;
        if (this.mStatus == r6.mStatus) goto L12;
        return false;
    L12:
        if (this.mErrorCode == r6.mErrorCode) goto L15;
        return false;
    L15:
        if (this.mTotal == r6.mTotal) goto L18;
        return false;
    L18:
        if (this.mCompleted == r6.mCompleted) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMCompleted() {
        return this.mCompleted;
    }

    public final int getMErrorCode() {
        return this.mErrorCode;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    public final int getMTotal() {
        return this.mTotal;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mStatus) * 31) + Integer.hashCode(this.mErrorCode)) * 31) + Integer.hashCode(this.mTotal)) * 31) + Integer.hashCode(this.mCompleted);
    }

    public final void setMCompleted(int r1) {
        this.mCompleted = r1;
    }

    public final void setMErrorCode(int r1) {
        this.mErrorCode = r1;
    }

    public final void setMStatus(int r1) {
        this.mStatus = r1;
    }

    public final void setMTotal(int r1) {
        this.mTotal = r1;
    }

    @aa1
    public String toString() {
        return "BleStreamProgress(mStatus=" + this.mStatus + ", mErrorCode=" + this.mErrorCode + ", mTotal=" + this.mTotal + ", mCompleted=" + this.mCompleted + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleStreamProgress(int r1, int r2, int r3, int r4) {
        this.mStatus = r1;
        this.mErrorCode = r2;
        this.mTotal = r3;
        this.mCompleted = r4;
    }

    public /* synthetic */ BleStreamProgress(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
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
