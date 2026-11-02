package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAddressSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;

    @aa1
    private byte[] mAddress;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleAddressSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleAddressSettings copy$default(BleAddressSettings r0, byte[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mAddress;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final byte[] component1() {
        return this.mAddress;
    }

    @aa1
    public final BleAddressSettings copy(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mAddress");
        return new BleAddressSettings(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeBytes$default(this, ArraysKt___ArraysKt.O0OOOO(this.mAddress), null, 2, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleAddressSettings) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mAddress, ((BleAddressSettings) r4).mAddress) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final byte[] getMAddress() {
        return this.mAddress;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 6;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mAddress);
    }

    public final void setMAddress(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAddress = r2;
    }

    @aa1
    public String toString() {
        return "BleAddressSettings(mAddress=" + Arrays.toString(this.mAddress) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAddressSettings(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mAddress");
        this.mAddress = r2;
    }

    public /* synthetic */ BleAddressSettings(byte[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new byte[6];
    L5:
        this(r1);
    }
}
