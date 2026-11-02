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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleTestInfoSet() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleTestInfoSet copy$default(BleTestInfoSet r0, String r1, String r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mWifiName;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mWifiPassword;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mTestMode;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleTestInfoSet copy(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "mWifiName");
        Intrinsics.X0O(r3, "mWifiPassword");
        return new BleTestInfoSet(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
    L3:
        char r1 = readUInt8();
        if (r0 != 1) goto L6;
        this.mWifiName = readString(r1, Charsets.IiI10X);
    L13:
        r0 = readUInt8();
        if (r0 > 0) goto L3;
        return;
    L6:
        if (r0 != 2) goto L8;
        this.mWifiPassword = readString(r1, Charsets.IiI10X);
        goto L13
    L8:
        if (r0 != 3) goto L13;
        this.mTestMode = readInt8();
        goto L13
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        if (this.mWifiName.length() <= 0) goto L6;
        writeInt8(1);
        byte[] r0 = this.mWifiName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        writeInt8(r0.length);
        writeString(this.mWifiName, Charsets.IiI10X);
    L6:
        if (this.mWifiPassword.length() <= 0) goto L9;
        writeInt8(2);
        byte[] r1 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        writeInt8(r1.length);
        writeString(this.mWifiPassword, Charsets.IiI10X);
    L9:
        if (this.mTestMode == 0) goto L12;
        writeInt8(3);
        writeInt8(1);
        writeInt8(this.mTestMode);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTestInfoSet) == true) goto L8;
        return false;
    L8:
        BleTestInfoSet r6 = (BleTestInfoSet) r5;
        if (Intrinsics.XOO0ii0(this.mWifiName, r6.mWifiName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWifiPassword, r6.mWifiPassword) == true) goto L15;
        return false;
    L15:
        if (this.mTestMode == r6.mTestMode) goto L17;
        return false;
    L17:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        if (this.mWifiName.length() <= 0) goto L5;
        byte[] r0 = this.mWifiName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        int r2 = 2 + r0.length;
    L7:
        if (this.mWifiPassword.length() <= 0) goto L10;
        byte[] r1 = this.mWifiPassword.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r1, "getBytes(...)");
        r2 = (r2 + 2) + r1.length;
    L10:
        if (this.mTestMode != 0) goto L12;
        return r2;
    L12:
        return r2 + 3;
    L5:
        r2 = 0;
        goto L7
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

    public final void setMTestMode(int r1) {
        this.mTestMode = r1;
    }

    public final void setMWifiName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiName = r2;
    }

    public final void setMWifiPassword(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWifiPassword = r2;
    }

    @aa1
    public String toString() {
        return "BleTestInfoSet(mWifiName=" + this.mWifiName + ", mWifiPassword=" + this.mWifiPassword + ", mTestMode=" + this.mTestMode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTestInfoSet(@aa1 String r2, @aa1 String r3, int r4) {
        Intrinsics.X0O(r2, "mWifiName");
        Intrinsics.X0O(r3, "mWifiPassword");
        this.mWifiName = r2;
        this.mWifiPassword = r3;
        this.mTestMode = r4;
    }

    public /* synthetic */ BleTestInfoSet(String r2, String r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
