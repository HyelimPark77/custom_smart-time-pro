package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.szabh.smable3.entity.BleEarphoneInfo;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
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
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BleEarphoneInfo copy$default(BleEarphoneInfo bleEarphoneInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleEarphoneInfo.mBleAddress;
        }
        if ((i & 2) != 0) {
            str2 = bleEarphoneInfo.mFirmwareVersion;
        }
        if ((i & 4) != 0) {
            str3 = bleEarphoneInfo.mBleName;
        }
        if ((i & 8) != 0) {
            str4 = bleEarphoneInfo.mFirmwareFlag;
        }
        return bleEarphoneInfo.copy(str, str2, str3, str4);
    }

    private final String toVersion(byte[] bArr, CharSequence charSequence) {
        return ArraysKt___ArraysKt.i0I(bArr, charSequence, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii0X1ii0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleEarphoneInfo.toVersion$lambda$0(((Byte) obj).byteValue());
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
    public final BleEarphoneInfo copy(@aa1 String mBleAddress, @aa1 String mFirmwareVersion, @aa1 String mBleName, @aa1 String mFirmwareFlag) {
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        return new BleEarphoneInfo(mBleAddress, mFirmwareVersion, mBleName, mFirmwareFlag);
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
        this.mFirmwareVersion = toVersion(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR);
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEarphoneInfo)) {
            return false;
        }
        BleEarphoneInfo bleEarphoneInfo = (BleEarphoneInfo) obj;
        return Intrinsics.XOO0ii0(this.mBleAddress, bleEarphoneInfo.mBleAddress) && Intrinsics.XOO0ii0(this.mFirmwareVersion, bleEarphoneInfo.mFirmwareVersion) && Intrinsics.XOO0ii0(this.mBleName, bleEarphoneInfo.mBleName) && Intrinsics.XOO0ii0(this.mFirmwareFlag, bleEarphoneInfo.mFirmwareFlag);
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

    public final void setMBleAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleAddress = str;
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

    @aa1
    public String toString() {
        return "BleEarphoneInfo(mBleName='" + this.mBleName + "', mBleAddress='" + this.mBleAddress + "', mFirmwareVersion='" + this.mFirmwareVersion + "', mFirmwareFlag='" + this.mFirmwareFlag + "')";
    }

    public BleEarphoneInfo(@aa1 String mBleAddress, @aa1 String mFirmwareVersion, @aa1 String mBleName, @aa1 String mFirmwareFlag) {
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mFirmwareVersion, "mFirmwareVersion");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        this.mBleAddress = mBleAddress;
        this.mFirmwareVersion = mFirmwareVersion;
        this.mBleName = mBleName;
        this.mFirmwareFlag = mFirmwareFlag;
    }

    public /* synthetic */ BleEarphoneInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0.0.0" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
