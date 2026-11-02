package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class BlePrayerTimes extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 14;
    private int mAsrHour;
    private int mAsrMinite;
    private int mDhuhrHour;
    private int mDhuhrMinite;
    private int mFajrHour;
    private int mFajrMinite;
    private int mIshaHour;
    private int mIshaMinite;
    private int mMaghribHour;
    private int mMaghribMinite;
    private int mSunriseHour;
    private int mSunriseMinite;

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

    public BlePrayerTimes() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, bo0.iO, null);
    }

    public static /* synthetic */ BlePrayerTimes copy$default(BlePrayerTimes r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.mFajrHour;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.mFajrMinite;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.mSunriseHour;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.mSunriseMinite;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.mDhuhrHour;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.mDhuhrMinite;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.mAsrHour;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.mAsrMinite;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.mMaghribHour;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.mMaghribMinite;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.mIshaHour;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.mIshaMinite;
    L38:
        int r15 = r11;
        int r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        int r20 = r5;
        int r21 = r6;
        int r22 = r3;
        int r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    public final int component1() {
        return this.mFajrHour;
    }

    public final int component10() {
        return this.mMaghribMinite;
    }

    public final int component11() {
        return this.mIshaHour;
    }

    public final int component12() {
        return this.mIshaMinite;
    }

    public final int component2() {
        return this.mFajrMinite;
    }

    public final int component3() {
        return this.mSunriseHour;
    }

    public final int component4() {
        return this.mSunriseMinite;
    }

    public final int component5() {
        return this.mDhuhrHour;
    }

    public final int component6() {
        return this.mDhuhrMinite;
    }

    public final int component7() {
        return this.mAsrHour;
    }

    public final int component8() {
        return this.mAsrMinite;
    }

    public final int component9() {
        return this.mMaghribHour;
    }

    @aa1
    public final BlePrayerTimes copy(int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25) {
        return new BlePrayerTimes(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFajrHour = readInt8();
        this.mFajrMinite = readInt8();
        this.mSunriseHour = readInt8();
        this.mSunriseMinite = readInt8();
        this.mDhuhrHour = readInt8();
        this.mDhuhrMinite = readInt8();
        this.mAsrHour = readInt8();
        this.mAsrMinite = readInt8();
        this.mMaghribHour = readInt8();
        this.mMaghribMinite = readInt8();
        this.mIshaHour = readInt8();
        this.mIshaMinite = readInt8();
        BleReadable.readInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mFajrHour);
        writeInt8(this.mFajrMinite);
        writeInt8(this.mSunriseHour);
        writeInt8(this.mSunriseMinite);
        writeInt8(this.mDhuhrHour);
        writeInt8(this.mDhuhrMinite);
        writeInt8(this.mAsrHour);
        writeInt8(this.mAsrMinite);
        writeInt8(this.mMaghribHour);
        writeInt8(this.mMaghribMinite);
        writeInt8(this.mIshaHour);
        writeInt8(this.mIshaMinite);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BlePrayerTimes) == true) goto L8;
        return false;
    L8:
        BlePrayerTimes r6 = (BlePrayerTimes) r5;
        if (this.mFajrHour == r6.mFajrHour) goto L12;
        return false;
    L12:
        if (this.mFajrMinite == r6.mFajrMinite) goto L15;
        return false;
    L15:
        if (this.mSunriseHour == r6.mSunriseHour) goto L18;
        return false;
    L18:
        if (this.mSunriseMinite == r6.mSunriseMinite) goto L21;
        return false;
    L21:
        if (this.mDhuhrHour == r6.mDhuhrHour) goto L24;
        return false;
    L24:
        if (this.mDhuhrMinite == r6.mDhuhrMinite) goto L27;
        return false;
    L27:
        if (this.mAsrHour == r6.mAsrHour) goto L30;
        return false;
    L30:
        if (this.mAsrMinite == r6.mAsrMinite) goto L33;
        return false;
    L33:
        if (this.mMaghribHour == r6.mMaghribHour) goto L36;
        return false;
    L36:
        if (this.mMaghribMinite == r6.mMaghribMinite) goto L39;
        return false;
    L39:
        if (this.mIshaHour == r6.mIshaHour) goto L42;
        return false;
    L42:
        if (this.mIshaMinite == r6.mIshaMinite) goto L44;
        return false;
    L44:
        return true;
    }

    public final int getMAsrHour() {
        return this.mAsrHour;
    }

    public final int getMAsrMinite() {
        return this.mAsrMinite;
    }

    public final int getMDhuhrHour() {
        return this.mDhuhrHour;
    }

    public final int getMDhuhrMinite() {
        return this.mDhuhrMinite;
    }

    public final int getMFajrHour() {
        return this.mFajrHour;
    }

    public final int getMFajrMinite() {
        return this.mFajrMinite;
    }

    public final int getMIshaHour() {
        return this.mIshaHour;
    }

    public final int getMIshaMinite() {
        return this.mIshaMinite;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 14;
    }

    public final int getMMaghribHour() {
        return this.mMaghribHour;
    }

    public final int getMMaghribMinite() {
        return this.mMaghribMinite;
    }

    public final int getMSunriseHour() {
        return this.mSunriseHour;
    }

    public final int getMSunriseMinite() {
        return this.mSunriseMinite;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.mFajrHour) * 31) + Integer.hashCode(this.mFajrMinite)) * 31) + Integer.hashCode(this.mSunriseHour)) * 31) + Integer.hashCode(this.mSunriseMinite)) * 31) + Integer.hashCode(this.mDhuhrHour)) * 31) + Integer.hashCode(this.mDhuhrMinite)) * 31) + Integer.hashCode(this.mAsrHour)) * 31) + Integer.hashCode(this.mAsrMinite)) * 31) + Integer.hashCode(this.mMaghribHour)) * 31) + Integer.hashCode(this.mMaghribMinite)) * 31) + Integer.hashCode(this.mIshaHour)) * 31) + Integer.hashCode(this.mIshaMinite);
    }

    public final void setMAsrHour(int r1) {
        this.mAsrHour = r1;
    }

    public final void setMAsrMinite(int r1) {
        this.mAsrMinite = r1;
    }

    public final void setMDhuhrHour(int r1) {
        this.mDhuhrHour = r1;
    }

    public final void setMDhuhrMinite(int r1) {
        this.mDhuhrMinite = r1;
    }

    public final void setMFajrHour(int r1) {
        this.mFajrHour = r1;
    }

    public final void setMFajrMinite(int r1) {
        this.mFajrMinite = r1;
    }

    public final void setMIshaHour(int r1) {
        this.mIshaHour = r1;
    }

    public final void setMIshaMinite(int r1) {
        this.mIshaMinite = r1;
    }

    public final void setMMaghribHour(int r1) {
        this.mMaghribHour = r1;
    }

    public final void setMMaghribMinite(int r1) {
        this.mMaghribMinite = r1;
    }

    public final void setMSunriseHour(int r1) {
        this.mSunriseHour = r1;
    }

    public final void setMSunriseMinite(int r1) {
        this.mSunriseMinite = r1;
    }

    @aa1
    public String toString() {
        return "BlePrayerTimes(mFajrHour=" + this.mFajrHour + ", mFajrMinite=" + this.mFajrMinite + ", mSunriseHour=" + this.mSunriseHour + ", mSunriseMinite=" + this.mSunriseMinite + ", mDhuhrHour=" + this.mDhuhrHour + ", mDhuhrMinite=" + this.mDhuhrMinite + ", mAsrHour=" + this.mAsrHour + ", mAsrMinite=" + this.mAsrMinite + ", mMaghribHour=" + this.mMaghribHour + ", mMaghribMinite=" + this.mMaghribMinite + ", mIshaHour=" + this.mIshaHour + ", mIshaMinite=" + this.mIshaMinite + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BlePrayerTimes(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        this.mFajrHour = r1;
        this.mFajrMinite = r2;
        this.mSunriseHour = r3;
        this.mSunriseMinite = r4;
        this.mDhuhrHour = r5;
        this.mDhuhrMinite = r6;
        this.mAsrHour = r7;
        this.mAsrMinite = r8;
        this.mMaghribHour = r9;
        this.mMaghribMinite = r10;
        this.mIshaHour = r11;
        this.mIshaMinite = r12;
    }

    public /* synthetic */ BlePrayerTimes(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = 0;
    L36:
        if ((r14 & 2048) == 0) goto L39;
        int r16 = 0;
    L38:
        int r17 = r12;
        int r18 = r11;
        int r19 = r10;
        int r110 = r9;
        int r20 = r8;
        int r21 = r7;
        int r22 = r6;
        int r23 = r5;
        int r24 = r4;
        this(r2, r3, r24, r23, r22, r21, r20, r110, r19, r18, r17, r16);
        return;
    L39:
        r16 = r13;
        goto L38
    }
}
