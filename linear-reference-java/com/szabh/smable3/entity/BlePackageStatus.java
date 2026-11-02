package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BlePackageStatus extends BleReadable {

    @aa1
    private byte[] mData;
    private int mFontPackageStatus;
    private int mLanguagePackageStatus;
    private int mUIPackageStatus;

    public BlePackageStatus() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BlePackageStatus copy$default(BlePackageStatus r0, int r1, int r2, int r3, byte[] r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mFontPackageStatus;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mUIPackageStatus;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mLanguagePackageStatus;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mData;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mFontPackageStatus;
    }

    public final int component2() {
        return this.mUIPackageStatus;
    }

    public final int component3() {
        return this.mLanguagePackageStatus;
    }

    @aa1
    public final byte[] component4() {
        return this.mData;
    }

    @aa1
    public final BlePackageStatus copy(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mData");
        return new BlePackageStatus(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFontPackageStatus = readInt8();
        this.mUIPackageStatus = readInt8();
        this.mLanguagePackageStatus = readInt8();
        readInt8();
        BleReadable.readInt32$default(this, null, 1, null);
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length <= 8) goto L6;
        byte[] r1 = getMBytes();
        Intrinsics.XXI(r1);
        this.mData = readBytes(r1.length - 8);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BlePackageStatus) == true) goto L8;
        return false;
    L8:
        BlePackageStatus r6 = (BlePackageStatus) r5;
        if (this.mFontPackageStatus == r6.mFontPackageStatus) goto L12;
        return false;
    L12:
        if (this.mUIPackageStatus == r6.mUIPackageStatus) goto L15;
        return false;
    L15:
        if (this.mLanguagePackageStatus == r6.mLanguagePackageStatus) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mData, r6.mData) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @aa1
    public final byte[] getMData() {
        return this.mData;
    }

    public final int getMFontPackageStatus() {
        return this.mFontPackageStatus;
    }

    public final int getMLanguagePackageStatus() {
        return this.mLanguagePackageStatus;
    }

    public final int getMUIPackageStatus() {
        return this.mUIPackageStatus;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mFontPackageStatus) * 31) + Integer.hashCode(this.mUIPackageStatus)) * 31) + Integer.hashCode(this.mLanguagePackageStatus)) * 31) + Arrays.hashCode(this.mData);
    }

    public final void setMData(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mData = r2;
    }

    public final void setMFontPackageStatus(int r1) {
        this.mFontPackageStatus = r1;
    }

    public final void setMLanguagePackageStatus(int r1) {
        this.mLanguagePackageStatus = r1;
    }

    public final void setMUIPackageStatus(int r1) {
        this.mUIPackageStatus = r1;
    }

    @aa1
    public String toString() {
        return "BlePackageStatus(mFontPackageStatus=" + this.mFontPackageStatus + ", mUIPackageStatus=" + this.mUIPackageStatus + ", mLanguagePackageStatus=" + this.mLanguagePackageStatus + ", mData=" + ByteArrayExtKt.getMHexString(this.mData) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePackageStatus(int r2, int r3, int r4, @aa1 byte[] r5) {
        Intrinsics.X0O(r5, "mData");
        this.mFontPackageStatus = r2;
        this.mUIPackageStatus = r3;
        this.mLanguagePackageStatus = r4;
        this.mData = r5;
    }

    public /* synthetic */ BlePackageStatus(int r2, int r3, int r4, byte[] r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = new byte[0];
    L14:
        this(r2, r3, r4, r5);
    }
}
