package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTestKeyData extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 2;
    public static final int KEY_DOWN = 3;
    public static final int KEY_HOME = 1;
    public static final int KEY_KNOB_DOWN = 6;
    public static final int KEY_KNOB_UP = 5;
    public static final int KEY_POWER = 0;
    public static final int KEY_UP = 2;
    public static final int KEY_WORKOUT = 4;
    private int mType;

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

    public BleTestKeyData() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleTestKeyData copy$default(BleTestKeyData r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleTestKeyData copy(int r2) {
        return new BleTestKeyData(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleTestKeyData) == true) goto L9;
        return false;
    L9:
        if (this.mType == ((BleTestKeyData) r4).mType) goto L11;
        return false;
    L11:
        return true;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return Integer.hashCode(this.mType);
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleTestKeyData(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestKeyData(int r1) {
        this.mType = r1;
    }

    public /* synthetic */ BleTestKeyData(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
