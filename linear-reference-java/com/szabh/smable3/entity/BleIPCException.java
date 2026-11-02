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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleIPCException() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleIPCException copy$default(BleIPCException r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mCode;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mSubCode;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleIPCException copy(int r2, int r3, int r4) {
        return new BleIPCException(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        this.mCode = readInt8();
        this.mSubCode = readInt8();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleIPCException) == true) goto L8;
        return false;
    L8:
        BleIPCException r6 = (BleIPCException) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (this.mCode == r6.mCode) goto L15;
        return false;
    L15:
        if (this.mSubCode == r6.mSubCode) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMCode(int r1) {
        this.mCode = r1;
    }

    public final void setMSubCode(int r1) {
        this.mSubCode = r1;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleIPCException(mType=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mType)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mCode=");
        String r3 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        r0.append(r3);
        r0.append(", mSubCode=");
        String r4 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mSubCode)}, 1));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        r0.append(r4);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleIPCException(int r1, int r2, int r3) {
        this.mType = r1;
        this.mCode = r2;
        this.mSubCode = r3;
    }

    public /* synthetic */ BleIPCException(int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
