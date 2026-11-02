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
public final class BleWechatPaySettings extends BleWritable {
    public static final int ADDRESS_LENGTH = 6;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 10;
    private int isActivate;

    @aa1
    private byte[] mAddress;
    private int mWechatPayVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleWechatPaySettings() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ BleWechatPaySettings copy$default(BleWechatPaySettings bleWechatPaySettings, int i, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleWechatPaySettings.mWechatPayVersion;
        }
        if ((i3 & 2) != 0) {
            i2 = bleWechatPaySettings.isActivate;
        }
        if ((i3 & 4) != 0) {
            bArr = bleWechatPaySettings.mAddress;
        }
        return bleWechatPaySettings.copy(i, i2, bArr);
    }

    public final int component1() {
        return this.mWechatPayVersion;
    }

    public final int component2() {
        return this.isActivate;
    }

    @aa1
    public final byte[] component3() {
        return this.mAddress;
    }

    @aa1
    public final BleWechatPaySettings copy(int i, int i2, @aa1 byte[] mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        return new BleWechatPaySettings(i, i2, mAddress);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mWechatPayVersion = readUInt8();
        this.isActivate = readUInt8();
        this.mAddress = readBytes(6);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mWechatPayVersion);
        writeInt8(this.isActivate);
        BleWritable.writeBytes$default(this, ArraysKt___ArraysKt.O0OOOO(this.mAddress), null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleWechatPaySettings)) {
            return false;
        }
        BleWechatPaySettings bleWechatPaySettings = (BleWechatPaySettings) obj;
        return this.mWechatPayVersion == bleWechatPaySettings.mWechatPayVersion && this.isActivate == bleWechatPaySettings.isActivate && Intrinsics.XOO0ii0(this.mAddress, bleWechatPaySettings.mAddress);
    }

    @aa1
    public final byte[] getMAddress() {
        return this.mAddress;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 10;
    }

    public final int getMWechatPayVersion() {
        return this.mWechatPayVersion;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mWechatPayVersion) * 31) + Integer.hashCode(this.isActivate)) * 31) + Arrays.hashCode(this.mAddress);
    }

    public final int isActivate() {
        return this.isActivate;
    }

    public final void setActivate(int i) {
        this.isActivate = i;
    }

    public final void setMAddress(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mAddress = bArr;
    }

    public final void setMWechatPayVersion(int i) {
        this.mWechatPayVersion = i;
    }

    @aa1
    public String toString() {
        return "BleWechatPaySettings(mWechatPayVersion=" + this.mWechatPayVersion + ", isActivate=" + this.isActivate + ", mAddress=" + Arrays.toString(this.mAddress) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWechatPaySettings(int i, int i2, @aa1 byte[] mAddress) {
        Intrinsics.X0O(mAddress, "mAddress");
        this.mWechatPayVersion = i;
        this.isActivate = i2;
        this.mAddress = mAddress;
    }

    public /* synthetic */ BleWechatPaySettings(int i, int i2, byte[] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new byte[6] : bArr);
    }
}
