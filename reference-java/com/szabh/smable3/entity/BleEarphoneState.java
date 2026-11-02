package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEarphoneState extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int STATE_CHARGE_CONNECTED = 1;
    public static final int STATE_CHARGING = 0;
    public static final int STATE_PHONE_CONNECTED = 2;
    public static final int STATE_SHUTDOWN = 3;
    private int mLeftState;
    private int mRightState;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleEarphoneState() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleEarphoneState copy$default(BleEarphoneState bleEarphoneState, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleEarphoneState.mLeftState;
        }
        if ((i3 & 2) != 0) {
            i2 = bleEarphoneState.mRightState;
        }
        return bleEarphoneState.copy(i, i2);
    }

    public final int component1() {
        return this.mLeftState;
    }

    public final int component2() {
        return this.mRightState;
    }

    @aa1
    public final BleEarphoneState copy(int i, int i2) {
        return new BleEarphoneState(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mLeftState = readInt8();
        this.mRightState = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEarphoneState)) {
            return false;
        }
        BleEarphoneState bleEarphoneState = (BleEarphoneState) obj;
        return this.mLeftState == bleEarphoneState.mLeftState && this.mRightState == bleEarphoneState.mRightState;
    }

    public final int getMLeftState() {
        return this.mLeftState;
    }

    public final int getMRightState() {
        return this.mRightState;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mLeftState) * 31) + Integer.hashCode(this.mRightState);
    }

    public final void setMLeftState(int i) {
        this.mLeftState = i;
    }

    public final void setMRightState(int i) {
        this.mRightState = i;
    }

    @aa1
    public String toString() {
        return "BleEarphoneState(mLeftState=" + this.mLeftState + ", mRightState=" + this.mRightState + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphoneState(int i, int i2) {
        this.mLeftState = i;
        this.mRightState = i2;
    }

    public /* synthetic */ BleEarphoneState(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
