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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mPpg;

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

    public BleHRRaw() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public static /* synthetic */ BleHRRaw copy$default(BleHRRaw r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mPpg;
    L6:
        return r0.copy(r1);
    }

    public final int component1() {
        return this.mPpg;
    }

    @aa1
    public final BleHRRaw copy(int r2) {
        return new BleHRRaw(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mPpg = readInt32(r0);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleHRRaw) == true) goto L9;
        return false;
    L9:
        if (this.mPpg == ((BleHRRaw) r4).mPpg) goto L11;
        return false;
    L11:
        return true;
    }

    public final int getMPpg() {
        return this.mPpg;
    }

    public int hashCode() {
        return Integer.hashCode(this.mPpg);
    }

    public final void setMPpg(int r1) {
        this.mPpg = r1;
    }

    @aa1
    public String toString() {
        return "BleHRRaw(mPpg=" + this.mPpg + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHRRaw(int r1) {
        this.mPpg = r1;
    }

    public /* synthetic */ BleHRRaw(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }
}
