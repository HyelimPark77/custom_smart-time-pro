package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBleAddress extends BleReadable {

    @aa1
    private String mAddress;

    /* JADX WARN: Multi-variable type inference failed */
    public BleBleAddress() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleBleAddress copy$default(BleBleAddress bleBleAddress, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleBleAddress.mAddress;
        }
        return bleBleAddress.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mAddress;
    }

    @aa1
    public final BleBleAddress copy(@aa1 String mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        return new BleBleAddress(mAddress);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() != null) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            if (mBytes.length < 6) {
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%02X:%02X:%02X:%02X:%02X:%02X", Arrays.copyOf(new Object[]{Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8())}, 6));
            Intrinsics.O10IXXX0X(str, "format(...)");
            this.mAddress = str;
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleBleAddress) && Intrinsics.XOO0ii0(this.mAddress, ((BleBleAddress) obj).mAddress);
    }

    @aa1
    public final String getMAddress() {
        return this.mAddress;
    }

    public int hashCode() {
        return this.mAddress.hashCode();
    }

    public final void setMAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAddress = str;
    }

    @aa1
    public String toString() {
        return "BleBleAddress(mAddress=" + this.mAddress + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBleAddress(@aa1 String mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        this.mAddress = mAddress;
    }

    public /* synthetic */ BleBleAddress(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
