package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.X1IXXOOO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceInfo2 extends BleReadable {

    @aa1
    private String mBleAddress;

    @aa1
    private String mBleName;

    @aa1
    private String mClassicAddress;

    @aa1
    private String mExtraInfo;

    @aa1
    private String mFirmwareFlag;

    @aa1
    private String mFirmwareVersion;

    @aa1
    private String mFullVersion;
    private int mLanguageCode;

    @aa1
    private String mLanguageVersion;

    @aa1
    private String mPlatform;

    @aa1
    private String mPrototype;

    @aa1
    private String mUiVersion;

    public BleDeviceInfo2() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        int r6 = 0;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, bo0.iO, null);
    }

    public static /* synthetic */ CharSequence OXO1(byte r0) {
        return toVersion$lambda$0(r0);
    }

    public static /* synthetic */ BleDeviceInfo2 copy$default(BleDeviceInfo2 r0, String r1, String r2, String r3, String r4, String r5, int r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.mBleAddress;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.mClassicAddress;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.mFirmwareVersion;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.mUiVersion;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.mLanguageVersion;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.mLanguageCode;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.mBleName;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.mPlatform;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.mPrototype;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.mFirmwareFlag;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.mFullVersion;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.mExtraInfo;
    L38:
        String r15 = r11;
        String r16 = r12;
        String r17 = r9;
        String r18 = r10;
        String r19 = r7;
        String r110 = r8;
        String r20 = r5;
        int r21 = r6;
        String r22 = r3;
        String r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    private final String toVersion(byte[] r10, CharSequence r11) {
        return ArraysKt___ArraysKt.i0I(r10, r11, null, null, 0, null, new X1IXXOOO(), 30, null);
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
    public final String component10() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String component11() {
        return this.mFullVersion;
    }

    @aa1
    public final String component12() {
        return this.mExtraInfo;
    }

    @aa1
    public final String component2() {
        return this.mClassicAddress;
    }

    @aa1
    public final String component3() {
        return this.mFirmwareVersion;
    }

    @aa1
    public final String component4() {
        return this.mUiVersion;
    }

    @aa1
    public final String component5() {
        return this.mLanguageVersion;
    }

    public final int component6() {
        return this.mLanguageCode;
    }

    @aa1
    public final String component7() {
        return this.mBleName;
    }

    @aa1
    public final String component8() {
        return this.mPlatform;
    }

    @aa1
    public final String component9() {
        return this.mPrototype;
    }

    @aa1
    public final BleDeviceInfo2 copy(@aa1 String r15, @aa1 String r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, int r20, @aa1 String r21, @aa1 String r22, @aa1 String r23, @aa1 String r24, @aa1 String r25, @aa1 String r26) {
        Intrinsics.X0O(r15, "mBleAddress");
        Intrinsics.X0O(r16, "mClassicAddress");
        Intrinsics.X0O(r17, "mFirmwareVersion");
        Intrinsics.X0O(r18, "mUiVersion");
        Intrinsics.X0O(r19, "mLanguageVersion");
        Intrinsics.X0O(r21, "mBleName");
        Intrinsics.X0O(r22, "mPlatform");
        Intrinsics.X0O(r23, "mPrototype");
        Intrinsics.X0O(r24, "mFirmwareFlag");
        Intrinsics.X0O(r25, "mFullVersion");
        Intrinsics.X0O(r26, "mExtraInfo");
        return new BleDeviceInfo2(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
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
        String r6 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale r7 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r7, "getDefault(...)");
        String r8 = r6.toUpperCase(r7);
        Intrinsics.O10IXXX0X(r8, "toUpperCase(...)");
        this.mClassicAddress = r8;
        this.mFirmwareVersion = toVersion(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR);
        this.mUiVersion = toVersion(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR);
        this.mLanguageVersion = toVersion(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR);
        this.mLanguageCode = readUInt8();
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mPlatform = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mPrototype = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFullVersion = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mExtraInfo = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceInfo2) == true) goto L8;
        return false;
    L8:
        BleDeviceInfo2 r6 = (BleDeviceInfo2) r5;
        if (Intrinsics.XOO0ii0(this.mBleAddress, r6.mBleAddress) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mClassicAddress, r6.mClassicAddress) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mFirmwareVersion, r6.mFirmwareVersion) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mUiVersion, r6.mUiVersion) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mLanguageVersion, r6.mLanguageVersion) == true) goto L24;
        return false;
    L24:
        if (this.mLanguageCode == r6.mLanguageCode) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mBleName, r6.mBleName) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mPlatform, r6.mPlatform) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mPrototype, r6.mPrototype) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r6.mFirmwareFlag) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mFullVersion, r6.mFullVersion) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mExtraInfo, r6.mExtraInfo) == true) goto L44;
        return false;
    L44:
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
    public final String getMClassicAddress() {
        return this.mClassicAddress;
    }

    @aa1
    public final String getMExtraInfo() {
        return this.mExtraInfo;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String getMFirmwareVersion() {
        return this.mFirmwareVersion;
    }

    @aa1
    public final String getMFullVersion() {
        return this.mFullVersion;
    }

    public final int getMLanguageCode() {
        return this.mLanguageCode;
    }

    @aa1
    public final String getMLanguageVersion() {
        return this.mLanguageVersion;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    @aa1
    public final String getMPrototype() {
        return this.mPrototype;
    }

    @aa1
    public final String getMUiVersion() {
        return this.mUiVersion;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.mBleAddress.hashCode() * 31) + this.mClassicAddress.hashCode()) * 31) + this.mFirmwareVersion.hashCode()) * 31) + this.mUiVersion.hashCode()) * 31) + this.mLanguageVersion.hashCode()) * 31) + Integer.hashCode(this.mLanguageCode)) * 31) + this.mBleName.hashCode()) * 31) + this.mPlatform.hashCode()) * 31) + this.mPrototype.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mFullVersion.hashCode()) * 31) + this.mExtraInfo.hashCode();
    }

    public final void setMBleAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleAddress = r2;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMClassicAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mClassicAddress = r2;
    }

    public final void setMExtraInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mExtraInfo = r2;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMFirmwareVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareVersion = r2;
    }

    public final void setMFullVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFullVersion = r2;
    }

    public final void setMLanguageCode(int r1) {
        this.mLanguageCode = r1;
    }

    public final void setMLanguageVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLanguageVersion = r2;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMPrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPrototype = r2;
    }

    public final void setMUiVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUiVersion = r2;
    }

    @aa1
    public String toString() {
        return "BleDeviceInfo2(mBleName='" + this.mBleName + "', mBleAddress='" + this.mBleAddress + "', mClassicAddress='" + this.mClassicAddress + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mUiVersion='" + this.mUiVersion + "', mLanguageVersion='" + this.mLanguageVersion + "', mLanguageCode='" + this.mLanguageCode + "', mPlatform='" + this.mPlatform + "', mPrototype='" + this.mPrototype + "', mFirmwareFlag='" + this.mFirmwareFlag + "', mFullVersion='" + this.mFullVersion + "', mExtraInfo='" + this.mExtraInfo + "')";
    }

    public BleDeviceInfo2(@aa1 String r2, @aa1 String r3, @aa1 String r4, @aa1 String r5, @aa1 String r6, int r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13) {
        Intrinsics.X0O(r2, "mBleAddress");
        Intrinsics.X0O(r3, "mClassicAddress");
        Intrinsics.X0O(r4, "mFirmwareVersion");
        Intrinsics.X0O(r5, "mUiVersion");
        Intrinsics.X0O(r6, "mLanguageVersion");
        Intrinsics.X0O(r8, "mBleName");
        Intrinsics.X0O(r9, "mPlatform");
        Intrinsics.X0O(r10, "mPrototype");
        Intrinsics.X0O(r11, "mFirmwareFlag");
        Intrinsics.X0O(r12, "mFullVersion");
        Intrinsics.X0O(r13, "mExtraInfo");
        this.mBleAddress = r2;
        this.mClassicAddress = r3;
        this.mFirmwareVersion = r4;
        this.mUiVersion = r5;
        this.mLanguageVersion = r6;
        this.mLanguageCode = r7;
        this.mBleName = r8;
        this.mPlatform = r9;
        this.mPrototype = r10;
        this.mFirmwareFlag = r11;
        this.mFullVersion = r12;
        this.mExtraInfo = r13;
    }

    public /* synthetic */ BleDeviceInfo2(String r12, String r13, String r14, String r15, String r16, int r17, String r18, String r19, String r20, String r21, String r22, String r23, int r24, DefaultConstructorMarker r25) {
        if ((r24 & 1) == 0) goto L6;
        r12 = "";
    L6:
        if ((r24 & 2) == 0) goto L8;
        r13 = "";
    L8:
        String r3 = "0.0.0";
        if ((r24 & 4) == 0) goto L11;
        String r1 = "0.0.0";
    L13:
        if ((r24 & 8) == 0) goto L15;
        String r4 = "0.0.0";
    L17:
        if ((r24 & 16) != 0) goto L21;
        r3 = r16;
    L21:
        if ((r24 & 32) == 0) goto L23;
        int r5 = 1;
    L25:
        if ((r24 & 64) == 0) goto L27;
        String r6 = "";
    L29:
        if ((r24 & 128) == 0) goto L31;
        String r7 = "";
    L33:
        if ((r24 & 256) == 0) goto L35;
        String r8 = "";
    L37:
        if ((r24 & 512) == 0) goto L39;
        String r9 = "";
    L41:
        if ((r24 & 1024) == 0) goto L43;
        String r10 = "";
    L45:
        if ((r24 & 2048) == 0) goto L48;
        String r26 = "";
    L47:
        String r110 = r13;
        this(r12, r110, r1, r4, r3, r5, r6, r7, r8, r9, r10, r26);
        return;
    L48:
        r26 = r23;
        goto L47
    L43:
        r10 = r22;
        goto L45
    L39:
        r9 = r21;
        goto L41
    L35:
        r8 = r20;
        goto L37
    L31:
        r7 = r19;
        goto L33
    L27:
        r6 = r18;
        goto L29
    L23:
        r5 = r17;
        goto L25
    L15:
        r4 = r15;
        goto L17
    L11:
        r1 = r14;
        goto L13
    }
}
