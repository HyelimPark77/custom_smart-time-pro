package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAlipayBindInfo extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    public static final int RESULT_COMMUNICATE_FAILED = 2;
    public static final int RESULT_COMMUNICATE_TIMEOUT = 3;
    public static final int RESULT_CONNECT_FAILED = 1;
    public static final int RESULT_OTHER = 4;
    public static final int RESULT_SUCCESS = 0;
    private int mResult;
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

    public BleAlipayBindInfo() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleAlipayBindInfo copy$default(BleAlipayBindInfo r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mTime;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mResult;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mResult;
    }

    @aa1
    public final BleAlipayBindInfo copy(int r2, int r3) {
        return new BleAlipayBindInfo(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mResult = readUInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAlipayBindInfo) == true) goto L8;
        return false;
    L8:
        BleAlipayBindInfo r6 = (BleAlipayBindInfo) r5;
        if (this.mTime == r6.mTime) goto L12;
        return false;
    L12:
        if (this.mResult == r6.mResult) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMResult() {
        return this.mResult;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mTime) * 31) + Integer.hashCode(this.mResult);
    }

    public final void setMResult(int r1) {
        this.mResult = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleAlipayBindInfo(mTime=" + this.mTime + ", mResult=" + this.mResult + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAlipayBindInfo(int r1, int r2) {
        this.mTime = r1;
        this.mResult = r2;
    }

    public /* synthetic */ BleAlipayBindInfo(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
