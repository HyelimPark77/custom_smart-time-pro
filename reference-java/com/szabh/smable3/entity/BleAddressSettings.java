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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;

    @aa1
    private byte[] mAddress;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleAddressSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleAddressSettings copy$default(BleAddressSettings bleAddressSettings, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = bleAddressSettings.mAddress;
        }
        return bleAddressSettings.copy(bArr);
    }

    @aa1
    public final byte[] component1() {
        return this.mAddress;
    }

    @aa1
    public final BleAddressSettings copy(@aa1 byte[] mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        return new BleAddressSettings(mAddress);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeBytes$default(this, ArraysKt___ArraysKt.O0OOOO(this.mAddress), null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleAddressSettings) && Intrinsics.XOO0ii0(this.mAddress, ((BleAddressSettings) obj).mAddress);
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

    public final void setMAddress(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mAddress = bArr;
    }

    @aa1
    public String toString() {
        return "BleAddressSettings(mAddress=" + Arrays.toString(this.mAddress) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAddressSettings(@aa1 byte[] mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        this.mAddress = mAddress;
    }

    public /* synthetic */ BleAddressSettings(byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new byte[6] : bArr);
    }
}
