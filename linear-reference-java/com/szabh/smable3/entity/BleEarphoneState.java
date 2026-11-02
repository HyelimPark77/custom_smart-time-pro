package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEarphoneState extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int STATE_CHARGE_CONNECTED = 1;
    public static final int STATE_CHARGING = 0;
    public static final int STATE_PHONE_CONNECTED = 2;
    public static final int STATE_SHUTDOWN = 3;
    private int mLeftState;
    private int mRightState;

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

    public BleEarphoneState() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleEarphoneState copy$default(BleEarphoneState r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mLeftState;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mRightState;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mLeftState;
    }

    public final int component2() {
        return this.mRightState;
    }

    @aa1
    public final BleEarphoneState copy(int r2, int r3) {
        return new BleEarphoneState(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mLeftState = readInt8();
        this.mRightState = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleEarphoneState) == true) goto L8;
        return false;
    L8:
        BleEarphoneState r6 = (BleEarphoneState) r5;
        if (this.mLeftState == r6.mLeftState) goto L12;
        return false;
    L12:
        if (this.mRightState == r6.mRightState) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMLeftState(int r1) {
        this.mLeftState = r1;
    }

    public final void setMRightState(int r1) {
        this.mRightState = r1;
    }

    @aa1
    public String toString() {
        return "BleEarphoneState(mLeftState=" + this.mLeftState + ", mRightState=" + this.mRightState + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleEarphoneState(int r1, int r2) {
        this.mLeftState = r1;
        this.mRightState = r2;
    }

    public /* synthetic */ BleEarphoneState(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
