package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTimeRange extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;
    private int mEnabled;
    private int mEndHour;
    private int mEndMinute;
    private int mStartHour;
    private int mStartMinute;

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

    public BleTimeRange() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleTimeRange copy$default(BleTimeRange r0, int r1, int r2, int r3, int r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mStartHour;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mStartMinute;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mEndHour;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mEndMinute;
    L17:
        int r8 = r4;
        int r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mStartHour;
    }

    public final int component3() {
        return this.mStartMinute;
    }

    public final int component4() {
        return this.mEndHour;
    }

    public final int component5() {
        return this.mEndMinute;
    }

    @aa1
    public final BleTimeRange copy(int r7, int r8, int r9, int r10, int r11) {
        return new BleTimeRange(r7, r8, r9, r10, r11);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readUInt8();
        this.mStartHour = readUInt8();
        this.mStartMinute = readUInt8();
        this.mEndHour = readUInt8();
        this.mEndMinute = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mStartHour);
        writeInt8(this.mStartMinute);
        writeInt8(this.mEndHour);
        writeInt8(this.mEndMinute);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTimeRange) == true) goto L8;
        return false;
    L8:
        BleTimeRange r6 = (BleTimeRange) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mStartHour == r6.mStartHour) goto L15;
        return false;
    L15:
        if (this.mStartMinute == r6.mStartMinute) goto L18;
        return false;
    L18:
        if (this.mEndHour == r6.mEndHour) goto L21;
        return false;
    L21:
        if (this.mEndMinute == r6.mEndMinute) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMEndHour() {
        return this.mEndHour;
    }

    public final int getMEndMinute() {
        return this.mEndMinute;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 5;
    }

    public final int getMStartHour() {
        return this.mStartHour;
    }

    public final int getMStartMinute() {
        return this.mStartMinute;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mStartHour)) * 31) + Integer.hashCode(this.mStartMinute)) * 31) + Integer.hashCode(this.mEndHour)) * 31) + Integer.hashCode(this.mEndMinute);
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMEndHour(int r1) {
        this.mEndHour = r1;
    }

    public final void setMEndMinute(int r1) {
        this.mEndMinute = r1;
    }

    public final void setMStartHour(int r1) {
        this.mStartHour = r1;
    }

    public final void setMStartMinute(int r1) {
        this.mStartMinute = r1;
    }

    @aa1
    public String toString() {
        return "BleTimeRange(mEnabled=" + this.mEnabled + ", mStartHour=" + this.mStartHour + ", mStartMinute=" + this.mStartMinute + ", mEndHour=" + this.mEndHour + ", mEndMinute=" + this.mEndMinute + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTimeRange(int r1, int r2, int r3, int r4, int r5) {
        this.mEnabled = r1;
        this.mStartHour = r2;
        this.mStartMinute = r3;
        this.mEndHour = r4;
        this.mEndMinute = r5;
    }

    public /* synthetic */ BleTimeRange(int r2, int r3, int r4, int r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 0;
    L17:
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
