package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.szabh.smable3.entity.BleDeviceInfo2;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
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
        this(null, null, null, null, null, 0, null, null, null, null, null, null, bo0.f5772iO, null);
    }

    public static /* synthetic */ BleDeviceInfo2 copy$default(BleDeviceInfo2 bleDeviceInfo2, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleDeviceInfo2.mBleAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = bleDeviceInfo2.mClassicAddress;
        }
        if ((i2 & 4) != 0) {
            str3 = bleDeviceInfo2.mFirmwareVersion;
        }
        if ((i2 & 8) != 0) {
            str4 = bleDeviceInfo2.mUiVersion;
        }
        if ((i2 & 16) != 0) {
            str5 = bleDeviceInfo2.mLanguageVersion;
        }
        if ((i2 & 32) != 0) {
            i = bleDeviceInfo2.mLanguageCode;
        }
        if ((i2 & 64) != 0) {
            str6 = bleDeviceInfo2.mBleName;
        }
        if ((i2 & 128) != 0) {
            str7 = bleDeviceInfo2.mPlatform;
        }
        if ((i2 & 256) != 0) {
            str8 = bleDeviceInfo2.mPrototype;
        }
        if ((i2 & 512) != 0) {
            str9 = bleDeviceInfo2.mFirmwareFlag;
        }
        if ((i2 & 1024) != 0) {
            str10 = bleDeviceInfo2.mFullVersion;
        }
        if ((i2 & 2048) != 0) {
            str11 = bleDeviceInfo2.mExtraInfo;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        int i3 = i;
        return bleDeviceInfo2.copy(str, str2, str3, str4, str18, i3, str16, str17, str14, str15, str12, str13);
    }

    private final String toVersion(byte[] bArr, CharSequence charSequence) {
        return ArraysKt___ArraysKt.i0I(bArr, charSequence, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.X1IXXOOO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleDeviceInfo2.toVersion$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toVersion$lambda$0(byte b) {
        int i = b & 255;
        return i > 9 ? "0" : String.valueOf(i);
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
    public final BleDeviceInfo2 copy(@aa1 String mBleAddress, @aa1 String mClassicAddress, @aa1 String mFirmwareVersion, @aa1 String mUiVersion, @aa1 String mLanguageVersion, int i, @aa1 String mBleName, @aa1 String mPlatform, @aa1 String mPrototype, @aa1 String mFirmwareFlag, @aa1 String mFullVersion, @aa1 String mExtraInfo) {
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mClassicAddress, "mClassicAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mUiVersion, "mUiVersion");
        Intrinsics.X0O(mLanguageVersion, "mLanguageVersion");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mPlatform, "mPlatform");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mFullVersion, "mFullVersion");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        return new BleDeviceInfo2(mBleAddress, mClassicAddress, mFirmwareVersion, mUiVersion, mLanguageVersion, i, mBleName, mPlatform, mPrototype, mFirmwareFlag, mFullVersion, mExtraInfo);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        String stringUtil$default = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale locale = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale, "getDefault(...)");
        String upperCase = stringUtil$default.toUpperCase(locale);
        Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
        this.mBleAddress = upperCase;
        String stringUtil$default2 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale2, "getDefault(...)");
        String upperCase2 = stringUtil$default2.toUpperCase(locale2);
        Intrinsics.O10IXXX0X(upperCase2, "toUpperCase(...)");
        this.mClassicAddress = upperCase2;
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceInfo2)) {
            return false;
        }
        BleDeviceInfo2 bleDeviceInfo2 = (BleDeviceInfo2) obj;
        return Intrinsics.XOO0ii0(this.mBleAddress, bleDeviceInfo2.mBleAddress) && Intrinsics.XOO0ii0(this.mClassicAddress, bleDeviceInfo2.mClassicAddress) && Intrinsics.XOO0ii0(this.mFirmwareVersion, bleDeviceInfo2.mFirmwareVersion) && Intrinsics.XOO0ii0(this.mUiVersion, bleDeviceInfo2.mUiVersion) && Intrinsics.XOO0ii0(this.mLanguageVersion, bleDeviceInfo2.mLanguageVersion) && this.mLanguageCode == bleDeviceInfo2.mLanguageCode && Intrinsics.XOO0ii0(this.mBleName, bleDeviceInfo2.mBleName) && Intrinsics.XOO0ii0(this.mPlatform, bleDeviceInfo2.mPlatform) && Intrinsics.XOO0ii0(this.mPrototype, bleDeviceInfo2.mPrototype) && Intrinsics.XOO0ii0(this.mFirmwareFlag, bleDeviceInfo2.mFirmwareFlag) && Intrinsics.XOO0ii0(this.mFullVersion, bleDeviceInfo2.mFullVersion) && Intrinsics.XOO0ii0(this.mExtraInfo, bleDeviceInfo2.mExtraInfo);
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

    public final void setMBleAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleAddress = str;
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    public final void setMClassicAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mClassicAddress = str;
    }

    public final void setMExtraInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mExtraInfo = str;
    }

    public final void setMFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareFlag = str;
    }

    public final void setMFirmwareVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareVersion = str;
    }

    public final void setMFullVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFullVersion = str;
    }

    public final void setMLanguageCode(int i) {
        this.mLanguageCode = i;
    }

    public final void setMLanguageVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLanguageVersion = str;
    }

    public final void setMPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPlatform = str;
    }

    public final void setMPrototype(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPrototype = str;
    }

    public final void setMUiVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUiVersion = str;
    }

    @aa1
    public String toString() {
        return "BleDeviceInfo2(mBleName='" + this.mBleName + "', mBleAddress='" + this.mBleAddress + "', mClassicAddress='" + this.mClassicAddress + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mUiVersion='" + this.mUiVersion + "', mLanguageVersion='" + this.mLanguageVersion + "', mLanguageCode='" + this.mLanguageCode + "', mPlatform='" + this.mPlatform + "', mPrototype='" + this.mPrototype + "', mFirmwareFlag='" + this.mFirmwareFlag + "', mFullVersion='" + this.mFullVersion + "', mExtraInfo='" + this.mExtraInfo + "')";
    }

    public BleDeviceInfo2(@aa1 String mBleAddress, @aa1 String mClassicAddress, @aa1 String mFirmwareVersion, @aa1 String mUiVersion, @aa1 String mLanguageVersion, int i, @aa1 String mBleName, @aa1 String mPlatform, @aa1 String mPrototype, @aa1 String mFirmwareFlag, @aa1 String mFullVersion, @aa1 String mExtraInfo) {
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mClassicAddress, "mClassicAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mUiVersion, "mUiVersion");
        Intrinsics.X0O(mLanguageVersion, "mLanguageVersion");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mPlatform, "mPlatform");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mFullVersion, "mFullVersion");
        Intrinsics.X0O(mExtraInfo, "mExtraInfo");
        this.mBleAddress = mBleAddress;
        this.mClassicAddress = mClassicAddress;
        this.mFirmwareVersion = mFirmwareVersion;
        this.mUiVersion = mUiVersion;
        this.mLanguageVersion = mLanguageVersion;
        this.mLanguageCode = i;
        this.mBleName = mBleName;
        this.mPlatform = mPlatform;
        this.mPrototype = mPrototype;
        this.mFirmwareFlag = mFirmwareFlag;
        this.mFullVersion = mFullVersion;
        this.mExtraInfo = mExtraInfo;
    }

    public /* synthetic */ BleDeviceInfo2(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "0.0.0" : str3, (i2 & 8) != 0 ? "0.0.0" : str4, (i2 & 16) == 0 ? str5 : "0.0.0", (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11);
    }
}
