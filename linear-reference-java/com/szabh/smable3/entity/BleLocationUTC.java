package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLocationUTC extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;
    private int mHour;
    private int mMilli;
    private int mMinute;
    private int mSecond;

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

    public BleLocationUTC() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleLocationUTC copy$default(BleLocationUTC r0, int r1, int r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mHour;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mMinute;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mSecond;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mMilli;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.mHour;
    }

    public final int component2() {
        return this.mMinute;
    }

    public final int component3() {
        return this.mSecond;
    }

    public final int component4() {
        return this.mMilli;
    }

    @aa1
    public final BleLocationUTC copy(int r2, int r3, int r4, int r5) {
        return new BleLocationUTC(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mHour = readUInt8();
        this.mMinute = readUInt8();
        this.mSecond = readUInt8();
        skip(8);
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mMilli = readUInt16(r0);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLocationUTC) == true) goto L8;
        return false;
    L8:
        BleLocationUTC r6 = (BleLocationUTC) r5;
        if (this.mHour == r6.mHour) goto L12;
        return false;
    L12:
        if (this.mMinute == r6.mMinute) goto L15;
        return false;
    L15:
        if (this.mSecond == r6.mSecond) goto L18;
        return false;
    L18:
        if (this.mMilli == r6.mMilli) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getMHour() {
        return this.mHour;
    }

    public final int getMMilli() {
        return this.mMilli;
    }

    public final int getMMinute() {
        return this.mMinute;
    }

    public final int getMSecond() {
        return this.mSecond;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mHour) * 31) + Integer.hashCode(this.mMinute)) * 31) + Integer.hashCode(this.mSecond)) * 31) + Integer.hashCode(this.mMilli);
    }

    public final void setMHour(int r1) {
        this.mHour = r1;
    }

    public final void setMMilli(int r1) {
        this.mMilli = r1;
    }

    public final void setMMinute(int r1) {
        this.mMinute = r1;
    }

    public final void setMSecond(int r1) {
        this.mSecond = r1;
    }

    @aa1
    public String toString() {
        return "BleLocationUTC(mHour=" + this.mHour + ", mMinute=" + this.mMinute + ", mSecond=" + this.mSecond + ", mMilli=" + this.mMilli + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLocationUTC(int r1, int r2, int r3, int r4) {
        this.mHour = r1;
        this.mMinute = r2;
        this.mSecond = r3;
        this.mMilli = r4;
    }

    public /* synthetic */ BleLocationUTC(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
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
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
