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
        this(0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 8388607, null);
    }

    public static /* synthetic */ BleTestSupportData copy$default(BleTestSupportData bleTestSupportData, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, BleGsensorData bleGsensorData, int i10, int i11, int i12, BleHardwareInfo bleHardwareInfo, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        int i19;
        int i20;
        int i21 = (i18 & 1) != 0 ? bleTestSupportData.mSupportKeyCount : i;
        int i22 = (i18 & 2) != 0 ? bleTestSupportData.mSupportMIC : i2;
        int i23 = (i18 & 4) != 0 ? bleTestSupportData.mSupportSpeaker : i3;
        int i24 = (i18 & 8) != 0 ? bleTestSupportData.mSupportBIO : i4;
        int i25 = (i18 & 16) != 0 ? bleTestSupportData.mSupportBIOCheck : i5;
        int i26 = (i18 & 32) != 0 ? bleTestSupportData.mSupportSD : i6;
        int i27 = (i18 & 64) != 0 ? bleTestSupportData.mSupportGeoSensor : i7;
        int i28 = (i18 & 128) != 0 ? bleTestSupportData.mSupportTuya : i8;
        String str5 = (i18 & 256) != 0 ? bleTestSupportData.mBleName : str;
        String str6 = (i18 & 512) != 0 ? bleTestSupportData.mFirmwareFlag : str2;
        String str7 = (i18 & 1024) != 0 ? bleTestSupportData.mFirmwareVersion : str3;
        String str8 = (i18 & 2048) != 0 ? bleTestSupportData.mUIVersion : str4;
        int i29 = (i18 & 4096) != 0 ? bleTestSupportData.mBatteryPower : i9;
        BleGsensorData bleGsensorData2 = (i18 & 8192) != 0 ? bleTestSupportData.mGsensor : bleGsensorData;
        int i30 = i21;
        int i31 = (i18 & 16384) != 0 ? bleTestSupportData.mFlash : i10;
        int i32 = (i18 & 32768) != 0 ? bleTestSupportData.mRSSI : i11;
        int i33 = (i18 & 65536) != 0 ? bleTestSupportData.mHardwareInfoLength : i12;
        BleHardwareInfo bleHardwareInfo2 = (i18 & 131072) != 0 ? bleTestSupportData.mHardwareInfo : bleHardwareInfo;
        int i34 = (i18 & 262144) != 0 ? bleTestSupportData.mGoMoreInfo : i13;
        int i35 = (i18 & 524288) != 0 ? bleTestSupportData.mVoltage : i14;
        int i36 = (i18 & 1048576) != 0 ? bleTestSupportData.mBioMaxValue : i15;
        int i37 = (i18 & 2097152) != 0 ? bleTestSupportData.mBioDiffValue : i16;
        if ((i18 & 4194304) != 0) {
            i20 = i37;
            i19 = bleTestSupportData.mSaiweiInfo;
        } else {
            i19 = i17;
            i20 = i37;
        }
        return bleTestSupportData.copy(i30, i22, i23, i24, i25, i26, i27, i28, str5, str6, str7, str8, i29, bleGsensorData2, i31, i32, i33, bleHardwareInfo2, i34, i35, i36, i20, i19);
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
    public final BleTestSupportData copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 String mBleName, @aa1 String mFirmwareFlag, @aa1 String mFirmwareVersion, @aa1 String mUIVersion, int i9, @tb1 BleGsensorData bleGsensorData, int i10, int i11, int i12, @aa1 BleHardwareInfo mHardwareInfo, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mUIVersion, "mUIVersion");
        Intrinsics.X0O(mHardwareInfo, "mHardwareInfo");
        return new BleTestSupportData(i, i2, i3, i4, i5, i6, i7, i8, mBleName, mFirmwareFlag, mFirmwareVersion, mUIVersion, i9, bleGsensorData, i10, i11, i12, mHardwareInfo, i13, i14, i15, i16, i17);
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
        BleReadable bleReadable = (BleReadable) BleVersion2.class.newInstance();
        bleReadable.setMBytes(readBytes(3));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mFirmwareVersion = ((BleVersion2) bleReadable).getMVersion();
        BleReadable bleReadable2 = (BleReadable) BleVersion.class.newInstance();
        bleReadable2.setMBytes(readBytes(3));
        bleReadable2.decode();
        Intrinsics.XXI(bleReadable2);
        this.mUIVersion = ((BleVersion) bleReadable2).getMVersion();
        this.mBatteryPower = readInt8();
        BleReadable bleReadable3 = (BleReadable) BleGsensorData.class.newInstance();
        bleReadable3.setMBytes(readBytes(7));
        bleReadable3.decode();
        Intrinsics.XXI(bleReadable3);
        this.mGsensor = (BleGsensorData) bleReadable3;
        this.mFlash = readInt8();
        this.mRSSI = readInt8();
        char uInt16$default = BleReadable.readUInt16$default(this, null, 1, null);
        this.mHardwareInfoLength = uInt16$default;
        BleReadable bleReadable4 = (BleReadable) BleHardwareInfo.class.newInstance();
        bleReadable4.setMBytes(readBytes(uInt16$default));
        bleReadable4.decode();
        Intrinsics.XXI(bleReadable4);
        this.mHardwareInfo = (BleHardwareInfo) bleReadable4;
        this.mGoMoreInfo = readInt8();
        this.mVoltage = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioMaxValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mBioDiffValue = BleReadable.readUInt16$default(this, null, 1, null);
        this.mSaiweiInfo = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTestSupportData)) {
            return false;
        }
        BleTestSupportData bleTestSupportData = (BleTestSupportData) obj;
        return this.mSupportKeyCount == bleTestSupportData.mSupportKeyCount && this.mSupportMIC == bleTestSupportData.mSupportMIC && this.mSupportSpeaker == bleTestSupportData.mSupportSpeaker && this.mSupportBIO == bleTestSupportData.mSupportBIO && this.mSupportBIOCheck == bleTestSupportData.mSupportBIOCheck && this.mSupportSD == bleTestSupportData.mSupportSD && this.mSupportGeoSensor == bleTestSupportData.mSupportGeoSensor && this.mSupportTuya == bleTestSupportData.mSupportTuya && Intrinsics.XOO0ii0(this.mBleName, bleTestSupportData.mBleName) && Intrinsics.XOO0ii0(this.mFirmwareFlag, bleTestSupportData.mFirmwareFlag) && Intrinsics.XOO0ii0(this.mFirmwareVersion, bleTestSupportData.mFirmwareVersion) && Intrinsics.XOO0ii0(this.mUIVersion, bleTestSupportData.mUIVersion) && this.mBatteryPower == bleTestSupportData.mBatteryPower && Intrinsics.XOO0ii0(this.mGsensor, bleTestSupportData.mGsensor) && this.mFlash == bleTestSupportData.mFlash && this.mRSSI == bleTestSupportData.mRSSI && this.mHardwareInfoLength == bleTestSupportData.mHardwareInfoLength && Intrinsics.XOO0ii0(this.mHardwareInfo, bleTestSupportData.mHardwareInfo) && this.mGoMoreInfo == bleTestSupportData.mGoMoreInfo && this.mVoltage == bleTestSupportData.mVoltage && this.mBioMaxValue == bleTestSupportData.mBioMaxValue && this.mBioDiffValue == bleTestSupportData.mBioDiffValue && this.mSaiweiInfo == bleTestSupportData.mSaiweiInfo;
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
        int iHashCode = ((((((((((((((((((((((((Integer.hashCode(this.mSupportKeyCount) * 31) + Integer.hashCode(this.mSupportMIC)) * 31) + Integer.hashCode(this.mSupportSpeaker)) * 31) + Integer.hashCode(this.mSupportBIO)) * 31) + Integer.hashCode(this.mSupportBIOCheck)) * 31) + Integer.hashCode(this.mSupportSD)) * 31) + Integer.hashCode(this.mSupportGeoSensor)) * 31) + Integer.hashCode(this.mSupportTuya)) * 31) + this.mBleName.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + this.mFirmwareVersion.hashCode()) * 31) + this.mUIVersion.hashCode()) * 31) + Integer.hashCode(this.mBatteryPower)) * 31;
        BleGsensorData bleGsensorData = this.mGsensor;
        return ((((((((((((((((((iHashCode + (bleGsensorData == null ? 0 : bleGsensorData.hashCode())) * 31) + Integer.hashCode(this.mFlash)) * 31) + Integer.hashCode(this.mRSSI)) * 31) + Integer.hashCode(this.mHardwareInfoLength)) * 31) + this.mHardwareInfo.hashCode()) * 31) + Integer.hashCode(this.mGoMoreInfo)) * 31) + Integer.hashCode(this.mVoltage)) * 31) + Integer.hashCode(this.mBioMaxValue)) * 31) + Integer.hashCode(this.mBioDiffValue)) * 31) + Integer.hashCode(this.mSaiweiInfo);
    }

    public final void setMBatteryPower(int i) {
        this.mBatteryPower = i;
    }

    public final void setMBioDiffValue(int i) {
        this.mBioDiffValue = i;
    }

    public final void setMBioMaxValue(int i) {
        this.mBioMaxValue = i;
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    public final void setMFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareFlag = str;
    }

    public final void setMFirmwareVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareVersion = str;
    }

    public final void setMFlash(int i) {
        this.mFlash = i;
    }

    public final void setMGoMoreInfo(int i) {
        this.mGoMoreInfo = i;
    }

    public final void setMGsensor(@tb1 BleGsensorData bleGsensorData) {
        this.mGsensor = bleGsensorData;
    }

    public final void setMHardwareInfo(@aa1 BleHardwareInfo bleHardwareInfo) {
        Intrinsics.X0O(bleHardwareInfo, "<set-?>");
        this.mHardwareInfo = bleHardwareInfo;
    }

    public final void setMHardwareInfoLength(int i) {
        this.mHardwareInfoLength = i;
    }

    public final void setMRSSI(int i) {
        this.mRSSI = i;
    }

    public final void setMSaiweiInfo(int i) {
        this.mSaiweiInfo = i;
    }

    public final void setMSupportBIO(int i) {
        this.mSupportBIO = i;
    }

    public final void setMSupportBIOCheck(int i) {
        this.mSupportBIOCheck = i;
    }

    public final void setMSupportGeoSensor(int i) {
        this.mSupportGeoSensor = i;
    }

    public final void setMSupportKeyCount(int i) {
        this.mSupportKeyCount = i;
    }

    public final void setMSupportMIC(int i) {
        this.mSupportMIC = i;
    }

    public final void setMSupportSD(int i) {
        this.mSupportSD = i;
    }

    public final void setMSupportSpeaker(int i) {
        this.mSupportSpeaker = i;
    }

    public final void setMSupportTuya(int i) {
        this.mSupportTuya = i;
    }

    public final void setMUIVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUIVersion = str;
    }

    public final void setMVoltage(int i) {
        this.mVoltage = i;
    }

    @aa1
    public String toString() {
        return "BleTestSupportData(mSupportKeyCount=" + this.mSupportKeyCount + ", mSupportMIC=" + this.mSupportMIC + ", mSupportSpeaker=" + this.mSupportSpeaker + ", mSupportBIO=" + this.mSupportBIO + ", mSupportBIOCheck=" + this.mSupportBIOCheck + ", mSupportSD=" + this.mSupportSD + ", mSupportGeoSensor=" + this.mSupportGeoSensor + ", mSupportTuya=" + this.mSupportTuya + ", mBleName='" + this.mBleName + "', mFirmwareFlag='" + this.mFirmwareFlag + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mUIVersion='" + this.mUIVersion + "', mBatteryPower=" + this.mBatteryPower + ", GSensor --> " + this.mGsensor + ", mFlash=" + this.mFlash + ", mRSSI=" + this.mRSSI + ", mHardwareInfoLength=" + this.mHardwareInfoLength + ", mHardwareInfo=" + this.mHardwareInfo + ", mGoMoreInfo=" + this.mGoMoreInfo + ", mVoltage=" + this.mVoltage + ", mBioMaxValue=" + this.mBioMaxValue + ", mBioDiffValue=" + this.mBioDiffValue + ", mSaiweiInfo=" + this.mSaiweiInfo + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestSupportData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, @aa1 String mBleName, @aa1 String mFirmwareFlag, @aa1 String mFirmwareVersion, @aa1 String mUIVersion, int i9, @tb1 BleGsensorData bleGsensorData, int i10, int i11, int i12, @aa1 BleHardwareInfo mHardwareInfo, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mUIVersion, "mUIVersion");
        Intrinsics.X0O(mHardwareInfo, "mHardwareInfo");
        this.mSupportKeyCount = i;
        this.mSupportMIC = i2;
        this.mSupportSpeaker = i3;
        this.mSupportBIO = i4;
        this.mSupportBIOCheck = i5;
        this.mSupportSD = i6;
        this.mSupportGeoSensor = i7;
        this.mSupportTuya = i8;
        this.mBleName = mBleName;
        this.mFirmwareFlag = mFirmwareFlag;
        this.mFirmwareVersion = mFirmwareVersion;
        this.mUIVersion = mUIVersion;
        this.mBatteryPower = i9;
        this.mGsensor = bleGsensorData;
        this.mFlash = i10;
        this.mRSSI = i11;
        this.mHardwareInfoLength = i12;
        this.mHardwareInfo = mHardwareInfo;
        this.mGoMoreInfo = i13;
        this.mVoltage = i14;
        this.mBioMaxValue = i15;
        this.mBioDiffValue = i16;
        this.mSaiweiInfo = i17;
    }

    public /* synthetic */ BleTestSupportData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, int i9, BleGsensorData bleGsensorData, int i10, int i11, int i12, BleHardwareInfo bleHardwareInfo, int i13, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? 0 : i, (i18 & 2) != 0 ? 0 : i2, (i18 & 4) != 0 ? 0 : i3, (i18 & 8) != 0 ? 0 : i4, (i18 & 16) != 0 ? 0 : i5, (i18 & 32) != 0 ? 0 : i6, (i18 & 64) != 0 ? 0 : i7, (i18 & 128) != 0 ? 0 : i8, (i18 & 256) != 0 ? "" : str, (i18 & 512) != 0 ? "" : str2, (i18 & 1024) != 0 ? "" : str3, (i18 & 2048) == 0 ? str4 : "", (i18 & 4096) != 0 ? -1 : i9, (i18 & 8192) != 0 ? null : bleGsensorData, (i18 & 16384) != 0 ? -1 : i10, (i18 & 32768) != 0 ? -1 : i11, (i18 & 65536) != 0 ? 0 : i12, (i18 & 131072) != 0 ? new BleHardwareInfo(null, 1, null) : bleHardwareInfo, (i18 & 262144) != 0 ? 0 : i13, (i18 & 524288) != 0 ? 0 : i14, (i18 & 1048576) != 0 ? 0 : i15, (i18 & 2097152) != 0 ? 0 : i16, (i18 & 4194304) != 0 ? 0 : i17);
    }
}
