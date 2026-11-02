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

    public static /* synthetic */ BleBleAddress copy$default(BleBleAddress r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mAddress;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mAddress;
    }

    @aa1
    public final BleBleAddress copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mAddress");
        return new BleBleAddress(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() == null) goto L9;
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length < 6) goto L10;
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("%02X:%02X:%02X:%02X:%02X:%02X", Arrays.copyOf(new Object[]{Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8()), Byte.valueOf(readInt8())}, 6));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        this.mAddress = r2;
        return;
    L10:
        return;
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleBleAddress) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mAddress, ((BleBleAddress) r4).mAddress) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMAddress() {
        return this.mAddress;
    }

    public int hashCode() {
        return this.mAddress.hashCode();
    }

    public final void setMAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAddress = r2;
    }

    @aa1
    public String toString() {
        return "BleBleAddress(mAddress=" + this.mAddress + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBleAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "mAddress");
        this.mAddress = r2;
    }

    public /* synthetic */ BleBleAddress(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
