package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAudioPacket extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 40;

    @aa1
    private byte[] mData;

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
    public BleAudioPacket() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleAudioPacket copy$default(BleAudioPacket r0, byte[] r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mData;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final byte[] component1() {
        return this.mData;
    }

    @aa1
    public final BleAudioPacket copy(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mData");
        return new BleAudioPacket(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        readInt8();
        readInt8();
        this.mData = readBytes(readInt8());
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleAudioPacket) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mData, ((BleAudioPacket) r4).mData) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    @aa1
    public String toString() {
        return "BleAudioPacket(mData=" + ByteArrayExtKt.getMHexString(this.mData) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAudioPacket(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "mData");
        this.mData = r2;
    }

    public /* synthetic */ BleAudioPacket(byte[] r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new byte[0];
    L5:
        this(r1);
    }
}
