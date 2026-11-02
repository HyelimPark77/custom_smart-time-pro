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
public final class BleIPCException extends BleReadable {
    public static final int CODE_BATTERY_LOW = 19;
    public static final int CODE_BUSY_CLEAR_SD = 8;
    public static final int CODE_BUSY_EXPORT = 4;
    public static final int CODE_BUSY_OTA = 5;
    public static final int CODE_BUSY_PHOTO = 1;
    public static final int CODE_BUSY_PREVIEW = 7;
    public static final int CODE_BUSY_RECORD = 2;
    public static final int CODE_BUSY_UBOOT_OTA = 6;
    public static final int CODE_BUSY_VISION = 3;
    public static final int CODE_CHARGING_NOT_OPERATE = 21;
    public static final int CODE_GENERAL_ERROR = 33;
    public static final int CODE_MEMORY_LOW = 17;
    public static final int CODE_NO_TF_CARD = 23;
    public static final int CODE_OPERATION_FAILED = 18;
    public static final int CODE_OTHER_ERROR = 32;
    public static final int CODE_RECORD_TIME_TOO_SHORT = 22;
    public static final int CODE_TIMEOUT = 20;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;
    public static final int TYPE_CLEAR_SD = 8;
    public static final int TYPE_EXPORT = 4;
    public static final int TYPE_OTA = 5;
    public static final int TYPE_PHOTO = 1;
    public static final int TYPE_PREVIEW = 7;
    public static final int TYPE_RECORD = 2;
    public static final int TYPE_RECORD_AUDIO = 10;
    public static final int TYPE_UBOOT_OTA = 6;
    public static final int TYPE_VISION = 3;
    public static final int TYPE_VOICE = 11;
    private int mCode;
    private int mSubCode;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleIPCException() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ BleIPCException copy$default(BleIPCException bleIPCException, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleIPCException.mType;
        }
        if ((i4 & 2) != 0) {
            i2 = bleIPCException.mCode;
        }
        if ((i4 & 4) != 0) {
            i3 = bleIPCException.mSubCode;
        }
        return bleIPCException.copy(i, i2, i3);
    }

    public final int component1() {
        return this.mType;
    }

    public final int component2() {
        return this.mCode;
    }

    public final int component3() {
        return this.mSubCode;
    }

    @aa1
    public final BleIPCException copy(int i, int i2, int i3) {
        return new BleIPCException(i, i2, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mCode = readInt8();
        this.mSubCode = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleIPCException)) {
            return false;
        }
        BleIPCException bleIPCException = (BleIPCException) obj;
        return this.mType == bleIPCException.mType && this.mCode == bleIPCException.mCode && this.mSubCode == bleIPCException.mSubCode;
    }

    public final int getMCode() {
        return this.mCode;
    }

    public final int getMSubCode() {
        return this.mSubCode;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mType) * 31) + Integer.hashCode(this.mCode)) * 31) + Integer.hashCode(this.mSubCode);
    }

    public final void setMCode(int i) {
        this.mCode = i;
    }

    public final void setMSubCode(int i) {
        this.mSubCode = i;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleIPCException(mType=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mType)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", mCode=");
        String str2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        sb.append(str2);
        sb.append(", mSubCode=");
        String str3 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mSubCode)}, 1));
        Intrinsics.O10IXXX0X(str3, "format(...)");
        sb.append(str3);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleIPCException(int i, int i2, int i3) {
        this.mType = i;
        this.mCode = i2;
        this.mSubCode = i3;
    }

    public /* synthetic */ BleIPCException(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
