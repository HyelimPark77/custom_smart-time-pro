package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAlipayBindInfo extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int RESULT_COMMUNICATE_FAILED = 2;
    public static final int RESULT_COMMUNICATE_TIMEOUT = 3;
    public static final int RESULT_CONNECT_FAILED = 1;
    public static final int RESULT_OTHER = 4;
    public static final int RESULT_SUCCESS = 0;
    private int mResult;
    private int mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleAlipayBindInfo() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleAlipayBindInfo copy$default(BleAlipayBindInfo bleAlipayBindInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleAlipayBindInfo.mTime;
        }
        if ((i3 & 2) != 0) {
            i2 = bleAlipayBindInfo.mResult;
        }
        return bleAlipayBindInfo.copy(i, i2);
    }

    public final int component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mResult;
    }

    @aa1
    public final BleAlipayBindInfo copy(int i, int i2) {
        return new BleAlipayBindInfo(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mResult = readUInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleAlipayBindInfo)) {
            return false;
        }
        BleAlipayBindInfo bleAlipayBindInfo = (BleAlipayBindInfo) obj;
        return this.mTime == bleAlipayBindInfo.mTime && this.mResult == bleAlipayBindInfo.mResult;
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

    public final void setMResult(int i) {
        this.mResult = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleAlipayBindInfo(mTime=" + this.mTime + ", mResult=" + this.mResult + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAlipayBindInfo(int i, int i2) {
        this.mTime = i;
        this.mResult = i2;
    }

    public /* synthetic */ BleAlipayBindInfo(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
