package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHRRaw extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mPpg;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHRRaw() {
        this(0, 1, null);
    }

    public static /* synthetic */ BleHRRaw copy$default(BleHRRaw bleHRRaw, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleHRRaw.mPpg;
        }
        return bleHRRaw.copy(i);
    }

    public final int component1() {
        return this.mPpg;
    }

    @aa1
    public final BleHRRaw copy(int i) {
        return new BleHRRaw(i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mPpg = readInt32(LITTLE_ENDIAN);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleHRRaw) && this.mPpg == ((BleHRRaw) obj).mPpg;
    }

    public final int getMPpg() {
        return this.mPpg;
    }

    public int hashCode() {
        return Integer.hashCode(this.mPpg);
    }

    public final void setMPpg(int i) {
        this.mPpg = i;
    }

    @aa1
    public String toString() {
        return "BleHRRaw(mPpg=" + this.mPpg + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHRRaw(int i) {
        this.mPpg = i;
    }

    public /* synthetic */ BleHRRaw(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
