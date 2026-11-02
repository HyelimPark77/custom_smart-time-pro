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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 10;
    private int isActivate;

    @aa1
    private byte[] mAddress;
    private int mWechatPayVersion;

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

    public BleWechatPaySettings() {
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleWechatPaySettings copy$default(BleWechatPaySettings r0, int r1, int r2, byte[] r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mWechatPayVersion;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.isActivate;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mAddress;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleWechatPaySettings copy(int r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r4, "mAddress");
        return new BleWechatPaySettings(r2, r3, r4);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleWechatPaySettings) == true) goto L8;
        return false;
    L8:
        BleWechatPaySettings r6 = (BleWechatPaySettings) r5;
        if (this.mWechatPayVersion == r6.mWechatPayVersion) goto L12;
        return false;
    L12:
        if (this.isActivate == r6.isActivate) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mAddress, r6.mAddress) == true) goto L17;
        return false;
    L17:
        return true;
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

    public final void setActivate(int r1) {
        this.isActivate = r1;
    }

    public final void setMAddress(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAddress = r2;
    }

    public final void setMWechatPayVersion(int r1) {
        this.mWechatPayVersion = r1;
    }

    @aa1
    public String toString() {
        return "BleWechatPaySettings(mWechatPayVersion=" + this.mWechatPayVersion + ", isActivate=" + this.isActivate + ", mAddress=" + Arrays.toString(this.mAddress) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleWechatPaySettings(int r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r4, "mAddress");
        this.mWechatPayVersion = r2;
        this.isActivate = r3;
        this.mAddress = r4;
    }

    public /* synthetic */ BleWechatPaySettings(int r2, int r3, byte[] r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = new byte[6];
    L11:
        this(r2, r3, r4);
    }
}
