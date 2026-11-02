package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTestKeyData extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleTestKeyData() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleTestKeyData copy$default(BleTestKeyData bleTestKeyData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleTestKeyData.mType;
        }
        return bleTestKeyData.copy(i);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final BleTestKeyData copy(int i) {
        return new BleTestKeyData(i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleTestKeyData) && this.mType == ((BleTestKeyData) obj).mType;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return Integer.hashCode(this.mType);
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleTestKeyData(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestKeyData(int i) {
        this.mType = i;
    }

    public /* synthetic */ BleTestKeyData(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
