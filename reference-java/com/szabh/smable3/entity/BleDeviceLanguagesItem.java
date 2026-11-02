package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceLanguagesItem extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;
    private int mCode;

    @aa1
    private String mVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleDeviceLanguagesItem() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleDeviceLanguagesItem copy$default(BleDeviceLanguagesItem bleDeviceLanguagesItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDeviceLanguagesItem.mCode;
        }
        if ((i2 & 2) != 0) {
            str = bleDeviceLanguagesItem.mVersion;
        }
        return bleDeviceLanguagesItem.copy(i, str);
    }

    public final int component1() {
        return this.mCode;
    }

    @aa1
    public final String component2() {
        return this.mVersion;
    }

    @aa1
    public final BleDeviceLanguagesItem copy(int i, @aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        return new BleDeviceLanguagesItem(i, mVersion);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCode = readInt8();
        byte intN = readIntN(4);
        byte intN2 = readIntN(4);
        StringBuilder sb = new StringBuilder();
        sb.append((int) intN);
        sb.append('.');
        sb.append((int) intN2);
        this.mVersion = sb.toString();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceLanguagesItem)) {
            return false;
        }
        BleDeviceLanguagesItem bleDeviceLanguagesItem = (BleDeviceLanguagesItem) obj;
        return this.mCode == bleDeviceLanguagesItem.mCode && Intrinsics.XOO0ii0(this.mVersion, bleDeviceLanguagesItem.mVersion);
    }

    public final int getMCode() {
        return this.mCode;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mCode) * 31) + this.mVersion.hashCode();
    }

    public final void setMCode(int i) {
        this.mCode = i;
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleDeviceLanguagesItem(mCode=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mVersion=");
        sb.append(this.mVersion);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleDeviceLanguagesItem(int i, @aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        this.mCode = i;
        this.mVersion = mVersion;
    }

    public /* synthetic */ BleDeviceLanguagesItem(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
