package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ii0X1ii0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleEarphoneInfo extends BleReadable {

    @aa1
    private String mBleAddress;

    @aa1
    private String mBleName;

    @aa1
    private String mFirmwareFlag;

    @aa1
    private String mFirmwareVersion;

    public BleEarphoneInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return toVersion$lambda$0(r0);
    }

    public static /* synthetic */ BleEarphoneInfo copy$default(BleEarphoneInfo r0, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mBleAddress;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mFirmwareVersion;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mBleName;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mFirmwareFlag;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    private final String toVersion(byte[] r10, CharSequence r11) {
        return ArraysKt___ArraysKt.i0I(r10, r11, null, null, 0, null, new ii0X1ii0(), 30, null);
    }

    private static final CharSequence toVersion$lambda$0(byte r1) {
        int r2 = r1 & 255;
        if (r2 <= 9) goto L7;
        return "0";
    L7:
        return String.valueOf(r2);
    }

    @aa1
    public final String component1() {
        return this.mBleAddress;
    }

    @aa1
    public final String component2() {
        return this.mFirmwareVersion;
    }

    @aa1
    public final String component3() {
        return this.mBleName;
    }

    @aa1
    public final String component4() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final BleEarphoneInfo copy(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "mBleAddress");
        Intrinsics.X0O(r3, "mFirmwareVersion");
        Intrinsics.X0O(r4, "mBleName");
        Intrinsics.X0O(r5, "mFirmwareFlag");
        return new BleEarphoneInfo(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        String r3 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale r4 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r4, "getDefault(...)");
        String r5 = r3.toUpperCase(r4);
        Intrinsics.O10IXXX0X(r5, "toUpperCase(...)");
        this.mBleAddress = r5;
        this.mFirmwareVersion = toVersion(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR);
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleEarphoneInfo) == true) goto L8;
        return false;
    L8:
        BleEarphoneInfo r6 = (BleEarphoneInfo) r5;
        if (Intrinsics.XOO0ii0(this.mBleAddress, r6.mBleAddress) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mFirmwareVersion, r6.mFirmwareVersion) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mBleName, r6.mBleName) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r6.mFirmwareFlag) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final String getMBleAddress() {
        return this.mBleAddress;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String getMFirmwareVersion() {
        return this.mFirmwareVersion;
    }

    public int hashCode() {
        return (((((this.mBleAddress.hashCode() * 31) + this.mFirmwareVersion.hashCode()) * 31) + this.mBleName.hashCode()) * 31) + this.mFirmwareFlag.hashCode();
    }

    public final void setMBleAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleAddress = r2;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareVersion = r2;
    }

    @aa1
    public String toString() {
        return "BleEarphoneInfo(mBleName='" + this.mBleName + "', mBleAddress='" + this.mBleAddress + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mFirmwareFlag='" + this.mFirmwareFlag + "')";
    }

    public BleEarphoneInfo(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "mBleAddress");
        Intrinsics.X0O(r3, "mFirmwareVersion");
        Intrinsics.X0O(r4, "mBleName");
        Intrinsics.X0O(r5, "mFirmwareFlag");
        this.mBleAddress = r2;
        this.mFirmwareVersion = r3;
        this.mBleName = r4;
        this.mFirmwareFlag = r5;
    }

    public /* synthetic */ BleEarphoneInfo(String r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "0.0.0";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
