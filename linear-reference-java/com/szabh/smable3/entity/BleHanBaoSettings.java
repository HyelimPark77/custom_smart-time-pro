package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleHanBaoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,45:1\n222#2,4:46\n222#2,4:50\n*S KotlinDebug\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n*L\n32#1:46,4\n33#1:50,4\n*E\n"})
public final class BleHanBaoSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;

    @aa1
    private BleTimeRange mBleTimeRange1;

    @aa1
    private BleTimeRange mBleTimeRange2;
    private int mInterval;
    private int mSpo2Threshold;
    private int mVibration;

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

    public BleHanBaoSettings() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        BleTimeRange r4 = null;
        BleTimeRange r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BleHanBaoSettings copy$default(BleHanBaoSettings r0, int r1, int r2, int r3, BleTimeRange r4, BleTimeRange r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mVibration;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mInterval;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mSpo2Threshold;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mBleTimeRange1;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mBleTimeRange2;
    L17:
        BleTimeRange r8 = r4;
        BleTimeRange r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mVibration;
    }

    public final int component2() {
        return this.mInterval;
    }

    public final int component3() {
        return this.mSpo2Threshold;
    }

    @aa1
    public final BleTimeRange component4() {
        return this.mBleTimeRange1;
    }

    @aa1
    public final BleTimeRange component5() {
        return this.mBleTimeRange2;
    }

    @aa1
    public final BleHanBaoSettings copy(int r8, int r9, int r10, @aa1 BleTimeRange r11, @aa1 BleTimeRange r12) {
        Intrinsics.X0O(r11, "mBleTimeRange1");
        Intrinsics.X0O(r12, "mBleTimeRange2");
        return new BleHanBaoSettings(r8, r9, r10, r11, r12);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mVibration = readUInt8();
        this.mInterval = readUInt8();
        this.mSpo2Threshold = readUInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        BleReadable r1 = (BleReadable) BleTimeRange.class.newInstance();
        r1.setMBytes(readBytes(5));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mBleTimeRange1 = (BleTimeRange) r1;
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange2 = (BleTimeRange) r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mVibration);
        writeInt8(this.mInterval);
        writeInt8(this.mSpo2Threshold);
        BleWritable.writeInt24$default(this, 0, null, 2, null);
        writeObject(this.mBleTimeRange1);
        writeObject(this.mBleTimeRange2);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHanBaoSettings) == true) goto L8;
        return false;
    L8:
        BleHanBaoSettings r6 = (BleHanBaoSettings) r5;
        if (this.mVibration == r6.mVibration) goto L12;
        return false;
    L12:
        if (this.mInterval == r6.mInterval) goto L15;
        return false;
    L15:
        if (this.mSpo2Threshold == r6.mSpo2Threshold) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange1, r6.mBleTimeRange1) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange2, r6.mBleTimeRange2) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange1() {
        return this.mBleTimeRange1;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange2() {
        return this.mBleTimeRange2;
    }

    public final int getMInterval() {
        return this.mInterval;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public final int getMSpo2Threshold() {
        return this.mSpo2Threshold;
    }

    public final int getMVibration() {
        return this.mVibration;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mVibration) * 31) + Integer.hashCode(this.mInterval)) * 31) + Integer.hashCode(this.mSpo2Threshold)) * 31) + this.mBleTimeRange1.hashCode()) * 31) + this.mBleTimeRange2.hashCode();
    }

    public final void setMBleTimeRange1(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange1 = r2;
    }

    public final void setMBleTimeRange2(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange2 = r2;
    }

    public final void setMInterval(int r1) {
        this.mInterval = r1;
    }

    public final void setMSpo2Threshold(int r1) {
        this.mSpo2Threshold = r1;
    }

    public final void setMVibration(int r1) {
        this.mVibration = r1;
    }

    @aa1
    public String toString() {
        return "BleHanBaoSettings(mVibration=" + this.mVibration + ", mInterval=" + this.mInterval + ", mSpo2Threshold=" + this.mSpo2Threshold + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mBleTimeRange2=" + this.mBleTimeRange2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHanBaoSettings(int r2, int r3, int r4, @aa1 BleTimeRange r5, @aa1 BleTimeRange r6) {
        Intrinsics.X0O(r5, "mBleTimeRange1");
        Intrinsics.X0O(r6, "mBleTimeRange2");
        this.mVibration = r2;
        this.mInterval = r3;
        this.mSpo2Threshold = r4;
        this.mBleTimeRange1 = r5;
        this.mBleTimeRange2 = r6;
    }

    public /* synthetic */ BleHanBaoSettings(int r9, int r10, int r11, BleTimeRange r12, BleTimeRange r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r9 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r10 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r11 = 93;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r12 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L15:
        if ((r14 & 16) == 0) goto L18;
        BleTimeRange r16 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L17:
        BleTimeRange r17 = r12;
        int r18 = r11;
        this(r9, r10, r18, r17, r16);
        return;
    L18:
        r16 = r13;
        goto L17
    }
}
