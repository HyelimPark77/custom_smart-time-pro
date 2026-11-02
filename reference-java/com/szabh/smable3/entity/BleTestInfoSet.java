package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTestInfoSet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TEST_MODE_AGING = 3;
    public static final int TEST_MODE_ENTER_DUT = 5;
    public static final int TEST_MODE_EXIT_DUT = 6;
    public static final int TEST_MODE_GC613S = 1;
    public static final int TEST_MODE_HORN = 4;
    public static final int TEST_MODE_IPC = 2;
    public static final int TYPE_TEST_MODE = 3;
    public static final int TYPE_WIFI_NAME = 1;
    public static final int TYPE_WIFI_PASSWORD = 2;
    private int mTestMode;

    @aa1
    private String mWifiName;

    @aa1
    private String mWifiPassword;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleTestInfoSet() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ BleTestInfoSet copy$default(BleTestInfoSet bleTestInfoSet, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleTestInfoSet.mWifiName;
        }
        if ((i2 & 2) != 0) {
            str2 = bleTestInfoSet.mWifiPassword;
        }
        if ((i2 & 4) != 0) {
            i = bleTestInfoSet.mTestMode;
        }
        return bleTestInfoSet.copy(str, str2, i);
    }

    @aa1
    public final String component1() {
        return this.mWifiName;
    }

    @aa1
    public final String component2() {
        return this.mWifiPassword;
    }

    public final int component3() {
        return this.mTestMode;
    }

    @aa1
    public final BleTestInfoSet copy(@aa1 String mWifiName, @aa1 String mWifiPassword, int i) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        return new BleTestInfoSet(mWifiName, mWifiPassword, i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        do {
            char uInt9 = readUInt8();
            if (uInt8 == 1) {
                this.mWifiName = readString(uInt9, Charsets.IiI10X);
            } else if (uInt8 == 2) {
                this.mWifiPassword = readString(uInt9, Charsets.IiI10X);
            } else if (uInt8 == 3) {
                this.mTestMode = readInt8();
            }
            uInt8 = readUInt8();
        } while (uInt8 > 0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        if (this.mWifiName.length() > 0) {
            writeInt8(1);
            byte[] bytes = this.mWifiName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            writeInt8(bytes.length);
            writeString(this.mWifiName, Charsets.IiI10X);
        }
        if (this.mWifiPassword.length() > 0) {
            writeInt8(2);
            byte[] bytes2 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            writeInt8(bytes2.length);
            writeString(this.mWifiPassword, Charsets.IiI10X);
        }
        if (this.mTestMode != 0) {
            writeInt8(3);
            writeInt8(1);
            writeInt8(this.mTestMode);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTestInfoSet)) {
            return false;
        }
        BleTestInfoSet bleTestInfoSet = (BleTestInfoSet) obj;
        return Intrinsics.XOO0ii0(this.mWifiName, bleTestInfoSet.mWifiName) && Intrinsics.XOO0ii0(this.mWifiPassword, bleTestInfoSet.mWifiPassword) && this.mTestMode == bleTestInfoSet.mTestMode;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        int length;
        if (this.mWifiName.length() > 0) {
            byte[] bytes = this.mWifiName.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
            length = 2 + bytes.length;
        } else {
            length = 0;
        }
        if (this.mWifiPassword.length() > 0) {
            byte[] bytes2 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
            Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
            length = length + 2 + bytes2.length;
        }
        return this.mTestMode != 0 ? length + 3 : length;
    }

    public final int getMTestMode() {
        return this.mTestMode;
    }

    @aa1
    public final String getMWifiName() {
        return this.mWifiName;
    }

    @aa1
    public final String getMWifiPassword() {
        return this.mWifiPassword;
    }

    public int hashCode() {
        return (((this.mWifiName.hashCode() * 31) + this.mWifiPassword.hashCode()) * 31) + Integer.hashCode(this.mTestMode);
    }

    public final void setMTestMode(int i) {
        this.mTestMode = i;
    }

    public final void setMWifiName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiName = str;
    }

    public final void setMWifiPassword(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWifiPassword = str;
    }

    @aa1
    public String toString() {
        return "BleTestInfoSet(mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mTestMode=" + this.mTestMode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestInfoSet(@aa1 String mWifiName, @aa1 String mWifiPassword, int i) {
        Intrinsics.X0O(mWifiName, "mWifiName");
        Intrinsics.X0O(mWifiPassword, "mWifiPassword");
        this.mWifiName = mWifiName;
        this.mWifiPassword = mWifiPassword;
        this.mTestMode = i;
    }

    public /* synthetic */ BleTestInfoSet(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
