package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BleGameSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 9;
    private int mEnabled;
    private int mEndHour1;
    private int mEndHour2;
    private int mEndMinute1;
    private int mEndMinute2;
    private int mStartHour1;
    private int mStartHour2;
    private int mStartMinute1;
    private int mStartMinute2;

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

    public BleGameSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, 511, null);
    }

    public static /* synthetic */ BleGameSettings copy$default(BleGameSettings r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r0.mStartHour1;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.mStartMinute1;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r0.mEndHour1;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r0.mEndMinute1;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r0.mStartHour2;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r0.mStartMinute2;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r0.mEndHour2;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r0.mEndMinute2;
    L29:
        int r12 = r8;
        int r13 = r9;
        int r14 = r6;
        int r15 = r7;
        int r16 = r4;
        int r17 = r5;
        int r18 = r3;
        int r19 = r1;
        return r0.copy(r19, r2, r18, r16, r17, r14, r15, r12, r13);
    }

    public final int component1() {
        return this.mEnabled;
    }

    public final int component2() {
        return this.mStartHour1;
    }

    public final int component3() {
        return this.mStartMinute1;
    }

    public final int component4() {
        return this.mEndHour1;
    }

    public final int component5() {
        return this.mEndMinute1;
    }

    public final int component6() {
        return this.mStartHour2;
    }

    public final int component7() {
        return this.mStartMinute2;
    }

    public final int component8() {
        return this.mEndHour2;
    }

    public final int component9() {
        return this.mEndMinute2;
    }

    @aa1
    public final BleGameSettings copy(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19) {
        return new BleGameSettings(r11, r12, r13, r14, r15, r16, r17, r18, r19);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(this.mStartHour1);
        writeInt8(this.mStartMinute1);
        writeInt8(this.mEndHour1);
        writeInt8(this.mEndMinute1);
        writeInt8(this.mStartHour2);
        writeInt8(this.mStartMinute2);
        writeInt8(this.mEndHour2);
        writeInt8(this.mEndMinute2);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGameSettings) == true) goto L8;
        return false;
    L8:
        BleGameSettings r6 = (BleGameSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (this.mStartHour1 == r6.mStartHour1) goto L15;
        return false;
    L15:
        if (this.mStartMinute1 == r6.mStartMinute1) goto L18;
        return false;
    L18:
        if (this.mEndHour1 == r6.mEndHour1) goto L21;
        return false;
    L21:
        if (this.mEndMinute1 == r6.mEndMinute1) goto L24;
        return false;
    L24:
        if (this.mStartHour2 == r6.mStartHour2) goto L27;
        return false;
    L27:
        if (this.mStartMinute2 == r6.mStartMinute2) goto L30;
        return false;
    L30:
        if (this.mEndHour2 == r6.mEndHour2) goto L33;
        return false;
    L33:
        if (this.mEndMinute2 == r6.mEndMinute2) goto L35;
        return false;
    L35:
        return true;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    public final int getMEndHour1() {
        return this.mEndHour1;
    }

    public final int getMEndHour2() {
        return this.mEndHour2;
    }

    public final int getMEndMinute1() {
        return this.mEndMinute1;
    }

    public final int getMEndMinute2() {
        return this.mEndMinute2;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 9;
    }

    public final int getMStartHour1() {
        return this.mStartHour1;
    }

    public final int getMStartHour2() {
        return this.mStartHour2;
    }

    public final int getMStartMinute1() {
        return this.mStartMinute1;
    }

    public final int getMStartMinute2() {
        return this.mStartMinute2;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.mEnabled) * 31) + Integer.hashCode(this.mStartHour1)) * 31) + Integer.hashCode(this.mStartMinute1)) * 31) + Integer.hashCode(this.mEndHour1)) * 31) + Integer.hashCode(this.mEndMinute1)) * 31) + Integer.hashCode(this.mStartHour2)) * 31) + Integer.hashCode(this.mStartMinute2)) * 31) + Integer.hashCode(this.mEndHour2)) * 31) + Integer.hashCode(this.mEndMinute2);
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMEndHour1(int r1) {
        this.mEndHour1 = r1;
    }

    public final void setMEndHour2(int r1) {
        this.mEndHour2 = r1;
    }

    public final void setMEndMinute1(int r1) {
        this.mEndMinute1 = r1;
    }

    public final void setMEndMinute2(int r1) {
        this.mEndMinute2 = r1;
    }

    public final void setMStartHour1(int r1) {
        this.mStartHour1 = r1;
    }

    public final void setMStartHour2(int r1) {
        this.mStartHour2 = r1;
    }

    public final void setMStartMinute1(int r1) {
        this.mStartMinute1 = r1;
    }

    public final void setMStartMinute2(int r1) {
        this.mStartMinute2 = r1;
    }

    @aa1
    public String toString() {
        return "BleGameSettings(mEnabled=" + this.mEnabled + ", mStartHour1=" + this.mStartHour1 + ", mStartMinute1=" + this.mStartMinute1 + ", mEndHour1=" + this.mEndHour1 + ", mEndMinute1=" + this.mEndMinute1 + ", mStartHour2=" + this.mStartHour2 + ", mStartMinute2=" + this.mStartMinute2 + ", mEndHour2=" + this.mEndHour2 + ", mEndMinute2=" + this.mEndMinute2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGameSettings(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        this.mEnabled = r1;
        this.mStartHour1 = r2;
        this.mStartMinute1 = r3;
        this.mEndHour1 = r4;
        this.mEndMinute1 = r5;
        this.mStartHour2 = r6;
        this.mStartMinute2 = r7;
        this.mEndHour2 = r8;
        this.mEndMinute2 = r9;
    }

    public /* synthetic */ BleGameSettings(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r11 & 256) == 0) goto L30;
        int r13 = 0;
    L29:
        int r14 = r9;
        int r15 = r8;
        int r16 = r7;
        int r17 = r6;
        int r18 = r5;
        int r19 = r4;
        this(r2, r3, r19, r18, r17, r16, r15, r14, r13);
        return;
    L30:
        r13 = r10;
        goto L29
    }
}
