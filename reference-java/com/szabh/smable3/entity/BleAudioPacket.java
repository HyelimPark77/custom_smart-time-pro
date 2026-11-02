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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 40;

    @aa1
    private byte[] mData;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleAudioPacket() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleAudioPacket copy$default(BleAudioPacket bleAudioPacket, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = bleAudioPacket.mData;
        }
        return bleAudioPacket.copy(bArr);
    }

    @aa1
    public final byte[] component1() {
        return this.mData;
    }

    @aa1
    public final BleAudioPacket copy(@aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        return new BleAudioPacket(mData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        readInt8();
        readInt8();
        this.mData = readBytes(readInt8());
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleAudioPacket) && Intrinsics.XOO0ii0(this.mData, ((BleAudioPacket) obj).mData);
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    public int hashCode() {
        return Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mData = bArr;
    }

    @aa1
    public String toString() {
        return "BleAudioPacket(mData=" + ByteArrayExtKt.getMHexString(this.mData) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAudioPacket(@aa1 byte[] mData) {
        Intrinsics.X0O(mData, "mData");
        this.mData = mData;
    }

    public /* synthetic */ BleAudioPacket(byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new byte[0] : bArr);
    }
}
