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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 4;
    private int mCode;

    @aa1
    private String mVersion;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleDeviceLanguagesItem() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleDeviceLanguagesItem copy$default(BleDeviceLanguagesItem r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mCode;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mVersion;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mCode;
    }

    @aa1
    public final String component2() {
        return this.mVersion;
    }

    @aa1
    public final BleDeviceLanguagesItem copy(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mVersion");
        return new BleDeviceLanguagesItem(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mCode = readInt8();
        byte r1 = readIntN(4);
        byte r0 = readIntN(4);
        StringBuilder r2 = new StringBuilder();
        r2.append(r1);
        r2.append('.');
        r2.append(r0);
        this.mVersion = r2.toString();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceLanguagesItem) == true) goto L8;
        return false;
    L8:
        BleDeviceLanguagesItem r6 = (BleDeviceLanguagesItem) r5;
        if (this.mCode == r6.mCode) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mVersion, r6.mVersion) == true) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMCode(int r1) {
        this.mCode = r1;
    }

    public final void setMVersion(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVersion = r2;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleDeviceLanguagesItem(mCode=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%02X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mCode)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", mVersion=");
        r0.append(this.mVersion);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleDeviceLanguagesItem(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mVersion");
        this.mCode = r2;
        this.mVersion = r3;
    }

    public /* synthetic */ BleDeviceLanguagesItem(int r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
