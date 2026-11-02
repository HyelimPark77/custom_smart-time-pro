package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSedentarinessSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;
    private int mEnabled;
    private int mEndHour;
    private int mEndMinute;
    private int mInterval;
    private int mRepeat;
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

    public BleSedentarinessSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleSedentarinessSettings copy$default(BleSedentarinessSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mRepeat;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mStartHour;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mStartMinute;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mEndHour;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mEndMinute;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mInterval;
    L23:
        int r10 = r6;
        int r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mRepeat;
    }

    public final int component3() {
        return this.mStartHour;
    }

    public final int component4() {
        return this.mStartMinute;
    }

    public final int component5() {
        return this.mEndHour;
    }

    public final int component6() {
        return this.mEndMinute;
    }

    public final int component7() {
        return this.mInterval;
    }

    @aa1
    public final BleSedentarinessSettings copy(int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        return new BleSedentarinessSettings(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readIntN(1);
        this.mRepeat = readIntN(7);
        this.mStartHour = readUInt8();
        this.mStartMinute = readUInt8();
        this.mEndHour = readUInt8();
        this.mEndMinute = readUInt8();
        this.mInterval = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeIntN(this.mEnabled, 1);
        writeIntN(this.mRepeat, 7);
        writeInt8(this.mStartHour);
        writeInt8(this.mStartMinute);
        writeInt8(this.mEndHour);
        writeInt8(this.mEndMinute);
        writeInt8(this.mInterval);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSedentarinessSettings) == true) goto L8;
        return false;
    L8:
        BleSedentarinessSettings r6 = (BleSedentarinessSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mRepeat == r6.mRepeat) goto L15;
        return false;
    L15:
        if (this.mStartHour == r6.mStartHour) goto L18;
        return false;
    L18:
        if (this.mStartMinute == r6.mStartMinute) goto L21;
        return false;
    L21:
        if (this.mEndHour == r6.mEndHour) goto L24;
        return false;
    L24:
        if (this.mEndMinute == r6.mEndMinute) goto L27;
        return false;
    L27:
        if (this.mInterval == r6.mInterval) goto L29;
        return false;
    L29:
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

    public final int getMInterval() {
        return this.mInterval;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 6;
    }

    public final int getMRepeat() {
        return this.mRepeat;
    }

    public final int getMStartHour() {
        return this.mStartHour;
    }

    public final int getMStartMinute() {
        return this.mStartMinute;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mRepeat)) * 31) + Integer.hashCode(this.mStartHour)) * 31) + Integer.hashCode(this.mStartMinute)) * 31) + Integer.hashCode(this.mEndHour)) * 31) + Integer.hashCode(this.mEndMinute)) * 31) + Integer.hashCode(this.mInterval);
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

    public final void setMInterval(int r1) {
        this.mInterval = r1;
    }

    public final void setMRepeat(int r1) {
        this.mRepeat = r1;
    }

    public final void setMStartHour(int r1) {
        this.mStartHour = r1;
    }

    public final void setMStartMinute(int r1) {
        this.mStartMinute = r1;
    }

    @aa1
    public String toString() {
        return "BleSedentarinessSettings(mEnabled=" + this.mEnabled + ", mRepeat=" + this.mRepeat + ", mStartHour=" + this.mStartHour + ", mStartMinute=" + this.mStartMinute + ", mEndHour=" + this.mEndHour + ", mEndMinute=" + this.mEndMinute + ", mInterval=" + this.mInterval + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSedentarinessSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        this.mEnabled = r1;
        this.mRepeat = r2;
        this.mStartHour = r3;
        this.mStartMinute = r4;
        this.mEndHour = r5;
        this.mEndMinute = r6;
        this.mInterval = r7;
    }

    public /* synthetic */ BleSedentarinessSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L24;
        int r11 = 0;
    L23:
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
        return;
    L24:
        r11 = r8;
        goto L23
    }
}
