package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleFactoryTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,353:1\n222#2,4:354\n222#2,4:358\n222#2,4:362\n222#2,4:366\n*S KotlinDebug\n*F\n+ 1 BleFactoryTest.kt\ncom/szabh/smable3/entity/BleTestSupportData\n*L\n238#1:354,4\n239#1:358,4\n241#1:362,4\n245#1:366,4\n*E\n"})
public final class BleTestSupportData extends BleReadable {
    private int mBatteryPower;
    private int mBioDiffValue;
    private int mBioMaxValue;

    @aa1
    private String mBleName;

    @aa1
    private String mFirmwareFlag;

    @aa1
    private String mFirmwareVersion;
    private int mFlash;
    private int mGoMoreInfo;

    @tb1
    private BleGsensorData mGsensor;

    @aa1
    private BleHardwareInfo mHardwareInfo;
    private int mHardwareInfoLength;
    private int mRSSI;
    private int mSaiweiInfo;
    private int mSupportBIO;
    private int mSupportBIOCheck;
    private int mSupportGeoSensor;
    private int mSupportKeyCount;
    private int mSupportMIC;
    private int mSupportSD;
    private int mSupportSpeaker;
    private int mSupportTuya;

    @aa1
    private String mUIVersion;
    private int mVoltage;

    public BleTestSupportData() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        String r12 = null;
        int r13 = 0;
        BleGsensorData r14 = null;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        BleHardwareInfo r18 = null;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, 8388607, null);
    }

    public static /* synthetic */ BleTestSupportData copy$default(BleTestSupportData r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, String r26, String r27, String r28, String r29, int r30, BleGsensorData r31, int r32, int r33, int r34, BleHardwareInfo r35, int r36, int r37, int r38, int r39, int r40, int r41, Object r42) {
        if ((r41 & 1) == 0) goto L5;
        int r2 = r17.mSupportKeyCount;
    L7:
        if ((r41 & 2) == 0) goto L9;
        int r3 = r17.mSupportMIC;
    L11:
        if ((r41 & 4) == 0) goto L13;
        int r4 = r17.mSupportSpeaker;
    L15:
        if ((r41 & 8) == 0) goto L17;
        int r5 = r17.mSupportBIO;
    L19:
        if ((r41 & 16) == 0) goto L21;
        int r6 = r17.mSupportBIOCheck;
    L23:
        if ((r41 & 32) == 0) goto L25;
        int r7 = r17.mSupportSD;
    L27:
        if ((r41 & 64) == 0) goto L29;
        int r8 = r17.mSupportGeoSensor;
    L31:
        if ((r41 & 128) == 0) goto L33;
        int r9 = r17.mSupportTuya;
    L35:
        if ((r41 & 256) == 0) goto L37;
        String r10 = r17.mBleName;
    L39:
        if ((r41 & 512) == 0) goto L41;
        String r11 = r17.mFirmwareFlag;
    L43:
        if ((r41 & 1024) == 0) goto L45;
        String r12 = r17.mFirmwareVersion;
    L47:
        if ((r41 & 2048) == 0) goto L49;
        String r13 = r17.mUIVersion;
    L51:
        if ((r41 & 4096) == 0) goto L53;
        int r14 = r17.mBatteryPower;
    L55:
        if ((r41 & 8192) == 0) goto L57;
        BleGsensorData r15 = r17.mGsensor;
    L58:
        int r110 = r2;
        if ((r41 & 16384) == 0) goto L61;
        int r16 = r17.mFlash;
    L63:
        if ((r41 & 32768) == 0) goto L65;
        int r1 = r17.mRSSI;
    L66:
        int r111 = r1;
        if ((r41 & 65536) == 0) goto L69;
        int r43 = r17.mHardwareInfoLength;
    L70:
        int r210 = r43;
        if ((r41 & 131072) == 0) goto L73;
        BleHardwareInfo r44 = r17.mHardwareInfo;
    L74:
        BleHardwareInfo r211 = r44;
        if ((r41 & 262144) == 0) goto L77;
        int r45 = r17.mGoMoreInfo;
    L78:
        int r212 = r45;
        if ((r41 & 524288) == 0) goto L81;
        int r46 = r17.mVoltage;
    L82:
        int r213 = r46;
        if ((r41 & 1048576) == 0) goto L85;
        int r47 = r17.mBioMaxValue;
    L86:
        int r214 = r47;
        if ((r41 & 2097152) == 0) goto L89;
        int r48 = r17.mBioDiffValue;
    L91:
        if ((r41 & 4194304) == 0) goto L94;
        int r215 = r48;
        int r49 = r215;
        int r410 = r17.mSaiweiInfo;
    L96:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r214, r49, r410);
    L94:
        r410 = r40;
        r49 = r48;
        goto L96
    L89:
        r48 = r39;
        goto L91
    L85:
        r47 = r38;
        goto L86
    L81:
        r46 = r37;
        goto L82
    L77:
        r45 = r36;
        goto L78
    L73:
        r44 = r35;
        goto L74
    L69:
        r43 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.mSupportKeyCount;
    }

    @aa1
    public final String component10() {
        return this.mFirmwareFlag;
    }

    @aa1
    public final String component11() {
        return this.mFirmwareVersion;
    }

    @aa1
    public final String component12() {
        return this.mUIVersion;
    }

    public final int component13() {
        return this.mBatteryPower;
    }

    @tb1
    public final BleGsensorData component14() {
        return this.mGsensor;
    }

    public final int component15() {
        return this.mFlash;
    }

    public final int component16() {
        return this.mRSSI;
    }

    public final int component17() {
        return this.mHardwareInfoLength;
    }

    @aa1
    public final BleHardwareInfo component18() {
        return this.mHardwareInfo;
    }

    public final int component19() {
        return this.mGoMoreInfo;
    }

    public final int component2() {
        return this.mSupportMIC;
    }

    public final int component20() {
        return this.mVoltage;
    }

    public final int component21() {
        return this.mBioMaxValue;
    }

    public final int component22() {
        return this.mBioDiffValue;
    }

    public final int component23() {
        return this.mSaiweiInfo;
    }

    public final int component3() {
        return this.mSupportSpeaker;
    }

    public final int component4() {
        return this.mSupportBIO;
    }

    public final int component5() {
        return this.mSupportBIOCheck;
    }

    public final int component6() {
        return this.mSupportSD;
    }

    public final int component7() {
        return this.mSupportGeoSensor;
    }

    public final int component8() {
        return this.mSupportTuya;
    }

    @aa1
    public final String component9() {
        return this.mBleName;
    }

    @aa1
    public final BleTestSupportData copy(int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, @aa1 String r34, @aa1 String r35, @aa1 String r36, @aa1 String r37, int r38, @tb1 BleGsensorData r39, int r40, int r41, int r42, @aa1 BleHardwareInfo r43, int r44, int r45, int r46, int r47, int r48) {
        Intrinsics.X0O(r34, "mBleName");
        Intrinsics.X0O(r35, "mFirmwareFlag");
        Intrinsics.X0O(r36, "mFirmwareVersion");
        Intrinsics.X0O(r37, "mUIVersion");
        Intrinsics.X0O(r43, "mHardwareInfo");
        return new BleTestSupportData(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mSupportKeyCount = readInt8();
        this.mSupportMIC = readInt8();
        this.mSupportSpeaker = readInt8();
        this.mSupportBIO = readInt8();
        this.mSupportBIOCheck = readInt8();
        this.mSupportSD = readInt8();
        this.mSupportGeoSensor = readInt8();
        this.mSupportTuya = readInt8();
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        BleReadable r0 = (BleReadable) BleVersion2.class.newInstance();
        r0.setMBytes(readBytes(3));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mFirmwareVersion = ((BleVersion2) r0).getMVersion();
        BleReadable r1 = (BleReadable) BleVersion.class.newInstance();
        r1.setMBytes(readBytes(3));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mUIVersion = ((BleVersion) r1).getMVersion();
        this.mBatteryPower = readInt8();
        BleReadable r2 = (BleReadable) BleGsensorData.class.newInstance();
        r2.setMBytes(readBytes(7));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mGsensor = (BleGsensorData) r2;
        this.mFlash = readInt8();
        this.mRSSI = readInt8();
        char r3 = BleReadable.readUInt16$default(this, null, 1, null);
        this.mHardwareInfoLength = r3;
        BleReadable r4 = (BleReadable) BleHardwareInfo.class.newInstance();
        r4.setMBytes(readBytes(r3));
        r4.decode();
        Intrinsics.XXI(r4);
        this.mHardwareInfo = (BleHardwareInfo) r4;
        this.mGoMoreInfo = readInt8();
        this.mVoltage = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioMaxValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioDiffValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mSaiweiInfo = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTestSupportData) == true) goto L8;
        return false;
    L8:
        BleTestSupportData r6 = (BleTestSupportData) r5;
        if (this.mSupportKeyCount == r6.mSupportKeyCount) goto L12;
        return false;
    L12:
        if (this.mSupportMIC == r6.mSupportMIC) goto L15;
        return false;
    L15:
        if (this.mSupportSpeaker == r6.mSupportSpeaker) goto L18;
        return false;
    L18:
        if (this.mSupportBIO == r6.mSupportBIO) goto L21;
        return false;
    L21:
        if (this.mSupportBIOCheck == r6.mSupportBIOCheck) goto L24;
        return false;
    L24:
        if (this.mSupportSD == r6.mSupportSD) goto L27;
        return false;
    L27:
        if (this.mSupportGeoSensor == r6.mSupportGeoSensor) goto L30;
        return false;
    L30:
        if (this.mSupportTuya == r6.mSupportTuya) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mBleName, r6.mBleName) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r6.mFirmwareFlag) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.XOO0ii0(this.mFirmwareVersion, r6.mFirmwareVersion) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mUIVersion, r6.mUIVersion) == true) goto L45;
        return false;
    L45:
        if (this.mBatteryPower == r6.mBatteryPower) goto L48;
        return false;
    L48:
        if (Intrinsics.XOO0ii0(this.mGsensor, r6.mGsensor) == true) goto L51;
        return false;
    L51:
        if (this.mFlash == r6.mFlash) goto L54;
        return false;
    L54:
        if (this.mRSSI == r6.mRSSI) goto L57;
        return false;
    L57:
        if (this.mHardwareInfoLength == r6.mHardwareInfoLength) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mHardwareInfo, r6.mHardwareInfo) == true) goto L63;
        return false;
    L63:
        if (this.mGoMoreInfo == r6.mGoMoreInfo) goto L66;
        return false;
    L66:
        if (this.mVoltage == r6.mVoltage) goto L69;
        return false;
    L69:
        if (this.mBioMaxValue == r6.mBioMaxValue) goto L72;
        return false;
    L72:
        if (this.mBioDiffValue == r6.mBioDiffValue) goto L75;
        return false;
    L75:
        if (this.mSaiweiInfo == r6.mSaiweiInfo) goto L77;
        return false;
    L77:
        return true;
    }

    public final int getMBatteryPower() {
        return this.mBatteryPower;
    }

    public final int getMBioDiffValue() {
        return this.mBioDiffValue;
    }

    public final int getMBioMaxValue() {
        return this.mBioMaxValue;
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

    public final int getMFlash() {
        return this.mFlash;
    }

    public final int getMGoMoreInfo() {
        return this.mGoMoreInfo;
    }

    @tb1
    public final BleGsensorData getMGsensor() {
        return this.mGsensor;
    }

    @aa1
    public final BleHardwareInfo getMHardwareInfo() {
        return this.mHardwareInfo;
    }

    public final int getMHardwareInfoLength() {
        return this.mHardwareInfoLength;
    }

    public final int getMRSSI() {
        return this.mRSSI;
    }

    public final int getMSaiweiInfo() {
        return this.mSaiweiInfo;
    }

    public final int getMSupportBIO() {
        return this.mSupportBIO;
    }

    public final int getMSupportBIOCheck() {
        return this.mSupportBIOCheck;
    }

    public final int getMSupportGeoSensor() {
        return this.mSupportGeoSensor;
    }

    public final int getMSupportKeyCount() {
        return this.mSupportKeyCount;
    }

    public final int getMSupportMIC() {
        return this.mSupportMIC;
    }

    public final int getMSupportSD() {
        return this.mSupportSD;
    }

    public final int getMSupportSpeaker() {
        return this.mSupportSpeaker;
    }

    public final int getMSupportTuya() {
        return this.mSupportTuya;
    }

    @aa1
    public final String getMUIVersion() {
        return this.mUIVersion;
    }

    public final int getMVoltage() {
        return this.mVoltage;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((Integer.hashCode(this.mSupportKeyCount) * 31) + Integer.hashCode(this.mSupportMIC)) * 31) + Integer.hashCode(this.mSupportSpeaker)) * 31) + Integer.hashCode(this.mSupportBIO)) * 31) + Integer.hashCode(this.mSupportBIOCheck)) * 31) + Integer.hashCode(this.mSupportSD)) * 31) + Integer.hashCode(this.mSupportGeoSensor)) * 31) + Integer.hashCode(this.mSupportTuya)) * 31) + this.mBleName.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mFirmwareVersion.hashCode()) * 31) + this.mUIVersion.hashCode()) * 31) + Integer.hashCode(this.mBatteryPower)) * 31;
        BleGsensorData r1 = this.mGsensor;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return ((((((((((((((((((r0 + r2) * 31) + Integer.hashCode(this.mFlash)) * 31) + Integer.hashCode(this.mRSSI)) * 31) + Integer.hashCode(this.mHardwareInfoLength)) * 31) + this.mHardwareInfo.hashCode()) * 31) + Integer.hashCode(this.mGoMoreInfo)) * 31) + Integer.hashCode(this.mVoltage)) * 31) + Integer.hashCode(this.mBioMaxValue)) * 31) + Integer.hashCode(this.mBioDiffValue)) * 31) + Integer.hashCode(this.mSaiweiInfo);
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final void setMBatteryPower(int r1) {
        this.mBatteryPower = r1;
    }

    public final void setMBioDiffValue(int r1) {
        this.mBioDiffValue = r1;
    }

    public final void setMBioMaxValue(int r1) {
        this.mBioMaxValue = r1;
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

    public final void setMFlash(int r1) {
        this.mFlash = r1;
    }

    public final void setMGoMoreInfo(int r1) {
        this.mGoMoreInfo = r1;
    }

    public final void setMGsensor(@tb1 BleGsensorData r1) {
        this.mGsensor = r1;
    }

    public final void setMHardwareInfo(@aa1 BleHardwareInfo r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mHardwareInfo = r2;
    }

    public final void setMHardwareInfoLength(int r1) {
        this.mHardwareInfoLength = r1;
    }

    public final void setMRSSI(int r1) {
        this.mRSSI = r1;
    }

    public final void setMSaiweiInfo(int r1) {
        this.mSaiweiInfo = r1;
    }

    public final void setMSupportBIO(int r1) {
        this.mSupportBIO = r1;
    }

    public final void setMSupportBIOCheck(int r1) {
        this.mSupportBIOCheck = r1;
    }

    public final void setMSupportGeoSensor(int r1) {
        this.mSupportGeoSensor = r1;
    }

    public final void setMSupportKeyCount(int r1) {
        this.mSupportKeyCount = r1;
    }

    public final void setMSupportMIC(int r1) {
        this.mSupportMIC = r1;
    }

    public final void setMSupportSD(int r1) {
        this.mSupportSD = r1;
    }

    public final void setMSupportSpeaker(int r1) {
        this.mSupportSpeaker = r1;
    }

    public final void setMSupportTuya(int r1) {
        this.mSupportTuya = r1;
    }

    public final void setMUIVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUIVersion = r2;
    }

    public final void setMVoltage(int r1) {
        this.mVoltage = r1;
    }

    @aa1
    public String toString() {
        return "BleTestSupportData(mSupportKeyCount=" + this.mSupportKeyCount + ", mSupportMIC=" + this.mSupportMIC + ", mSupportSpeaker=" + this.mSupportSpeaker + ", mSupportBIO=" + this.mSupportBIO + ", mSupportBIOCheck=" + this.mSupportBIOCheck + ", mSupportSD=" + this.mSupportSD + ", mSupportGeoSensor=" + this.mSupportGeoSensor + ", mSupportTuya=" + this.mSupportTuya + ", mBleName='" + this.mBleName + "', mFirmwareFlag='" + this.mFirmwareFlag + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mUIVersion='" + this.mUIVersion + "', mBatteryPower=" + this.mBatteryPower + ", GSensor --> " + this.mGsensor + ", mFlash=" + this.mFlash + ", mRSSI=" + this.mRSSI + ", mHardwareInfoLength=" + this.mHardwareInfoLength + ", mHardwareInfo=" + this.mHardwareInfo + ", mGoMoreInfo=" + this.mGoMoreInfo + ", mVoltage=" + this.mVoltage + ", mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + ", mSaiweiInfo=" + this.mSaiweiInfo + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestSupportData(int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, @aa1 String r13, @aa1 String r14, @aa1 String r15, @aa1 String r16, int r17, @tb1 BleGsensorData r18, int r19, int r20, int r21, @aa1 BleHardwareInfo r22, int r23, int r24, int r25, int r26, int r27) {
        Intrinsics.X0O(r13, "mBleName");
        Intrinsics.X0O(r14, "mFirmwareFlag");
        Intrinsics.X0O(r15, "mFirmwareVersion");
        Intrinsics.X0O(r16, "mUIVersion");
        Intrinsics.X0O(r22, "mHardwareInfo");
        this.mSupportKeyCount = r5;
        this.mSupportMIC = r6;
        this.mSupportSpeaker = r7;
        this.mSupportBIO = r8;
        this.mSupportBIOCheck = r9;
        this.mSupportSD = r10;
        this.mSupportGeoSensor = r11;
        this.mSupportTuya = r12;
        this.mBleName = r13;
        this.mFirmwareFlag = r14;
        this.mFirmwareVersion = r15;
        this.mUIVersion = r16;
        this.mBatteryPower = r17;
        this.mGsensor = r18;
        this.mFlash = r19;
        this.mRSSI = r20;
        this.mHardwareInfoLength = r21;
        this.mHardwareInfo = r22;
        this.mGoMoreInfo = r23;
        this.mVoltage = r24;
        this.mBioMaxValue = r25;
        this.mBioDiffValue = r26;
        this.mSaiweiInfo = r27;
    }

    public /* synthetic */ BleTestSupportData(int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, String r30, String r31, String r32, String r33, int r34, BleGsensorData r35, int r36, int r37, int r38, BleHardwareInfo r39, int r40, int r41, int r42, int r43, int r44, int r45, DefaultConstructorMarker r46) {
        if ((r45 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r45 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r45 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r45 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r45 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r45 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r45 & 64) == 0) goto L29;
        int r8 = 0;
    L31:
        if ((r45 & 128) == 0) goto L33;
        int r9 = 0;
    L34:
        String r11 = "";
        if ((r45 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r45 & 512) == 0) goto L41;
        String r12 = "";
    L43:
        if ((r45 & 1024) == 0) goto L45;
        String r13 = "";
    L47:
        if ((r45 & 2048) != 0) goto L51;
        r11 = r33;
    L51:
        if ((r45 & 4096) == 0) goto L53;
        int r14 = -1;
    L55:
        if ((r45 & 8192) == 0) goto L57;
        BleGsensorData r2 = null;
    L59:
        if ((r45 & 16384) == 0) goto L61;
        int r15 = -1;
    L63:
        if ((r45 & 32768) == 0) goto L65;
        int r16 = -1;
    L67:
        if ((r45 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r45 & 131072) == 0) goto L73;
        BleHardwareInfo r0 = new BleHardwareInfo(null, 1, null);
    L75:
        if ((r45 & 262144) == 0) goto L77;
        int r18 = 0;
    L79:
        if ((r45 & 524288) == 0) goto L81;
        int r19 = 0;
    L83:
        if ((r45 & 1048576) == 0) goto L85;
        int r110 = 0;
    L87:
        if ((r45 & 2097152) == 0) goto L89;
        int r111 = 0;
    L91:
        if ((r45 & 4194304) == 0) goto L94;
        int r47 = 0;
    L95:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r11, r14, r2, r15, r16, r17, r0, r18, r19, r110, r111, r47);
        return;
    L94:
        r47 = r44;
        goto L95
    L89:
        r111 = r43;
        goto L91
    L85:
        r110 = r42;
        goto L87
    L81:
        r19 = r41;
        goto L83
    L77:
        r18 = r40;
        goto L79
    L73:
        r0 = r39;
        goto L75
    L69:
        r17 = r38;
        goto L71
    L65:
        r16 = r37;
        goto L67
    L61:
        r15 = r36;
        goto L63
    L57:
        r2 = r35;
        goto L59
    L53:
        r14 = r34;
        goto L55
    L45:
        r13 = r32;
        goto L47
    L41:
        r12 = r31;
        goto L43
    L37:
        r10 = r30;
        goto L39
    L33:
        r9 = r29;
        goto L34
    L29:
        r8 = r28;
        goto L31
    L25:
        r7 = r27;
        goto L27
    L21:
        r6 = r26;
        goto L23
    L17:
        r5 = r25;
        goto L19
    L13:
        r4 = r24;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }
}
