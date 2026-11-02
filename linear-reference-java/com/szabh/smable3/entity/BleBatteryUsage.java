package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleBatteryUsage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,66:1\n222#2,4:67\n222#2,4:71\n222#2,4:75\n*S KotlinDebug\n*F\n+ 1 BleBatteryUsage.kt\ncom/szabh/smable3/entity/BleBatteryUsage\n*L\n57#1:67,4\n58#1:71,4\n59#1:75,4\n*E\n"})
public final class BleBatteryUsage extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 52;
    private int mIdleTime;

    @aa1
    private BleVoltageRecord mLastBoot;

    @aa1
    private BleVoltageRecord mLastShutdown;

    @aa1
    private BleVoltageRecord mLastVoltage;
    private int mLcdTime;
    private int mSpkTime;
    private int mSportTime;
    private int mTalkTime;
    private int mTotalTime;
    private int mVibratorTime;

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

    public BleBatteryUsage() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        BleVoltageRecord r8 = null;
        BleVoltageRecord r9 = null;
        BleVoltageRecord r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public static /* synthetic */ BleBatteryUsage copy$default(BleBatteryUsage r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, BleVoltageRecord r8, BleVoltageRecord r9, BleVoltageRecord r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.mTotalTime;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.mLcdTime;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.mTalkTime;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.mSpkTime;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.mSportTime;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.mVibratorTime;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.mIdleTime;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.mLastBoot;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.mLastShutdown;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.mLastVoltage;
    L32:
        BleVoltageRecord r13 = r9;
        BleVoltageRecord r14 = r10;
        int r15 = r7;
        BleVoltageRecord r16 = r8;
        int r17 = r5;
        int r18 = r6;
        int r19 = r3;
        int r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    public final int component1() {
        return this.mTotalTime;
    }

    @aa1
    public final BleVoltageRecord component10() {
        return this.mLastVoltage;
    }

    public final int component2() {
        return this.mLcdTime;
    }

    public final int component3() {
        return this.mTalkTime;
    }

    public final int component4() {
        return this.mSpkTime;
    }

    public final int component5() {
        return this.mSportTime;
    }

    public final int component6() {
        return this.mVibratorTime;
    }

    public final int component7() {
        return this.mIdleTime;
    }

    @aa1
    public final BleVoltageRecord component8() {
        return this.mLastBoot;
    }

    @aa1
    public final BleVoltageRecord component9() {
        return this.mLastShutdown;
    }

    @aa1
    public final BleBatteryUsage copy(int r13, int r14, int r15, int r16, int r17, int r18, int r19, @aa1 BleVoltageRecord r20, @aa1 BleVoltageRecord r21, @aa1 BleVoltageRecord r22) {
        Intrinsics.X0O(r20, "mLastBoot");
        Intrinsics.X0O(r21, "mLastShutdown");
        Intrinsics.X0O(r22, "mLastVoltage");
        return new BleBatteryUsage(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTotalTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mLcdTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTalkTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSpkTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mSportTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mVibratorTime = readInt32(r0);
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mIdleTime = readInt32(r0);
        BleReadable r1 = (BleReadable) BleVoltageRecord.class.newInstance();
        r1.setMBytes(readBytes(8));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mLastBoot = (BleVoltageRecord) r1;
        BleReadable r2 = (BleReadable) BleVoltageRecord.class.newInstance();
        r2.setMBytes(readBytes(8));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mLastShutdown = (BleVoltageRecord) r2;
        BleReadable r3 = (BleReadable) BleVoltageRecord.class.newInstance();
        r3.setMBytes(readBytes(8));
        r3.decode();
        Intrinsics.XXI(r3);
        this.mLastVoltage = (BleVoltageRecord) r3;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleBatteryUsage) == true) goto L8;
        return false;
    L8:
        BleBatteryUsage r6 = (BleBatteryUsage) r5;
        if (this.mTotalTime == r6.mTotalTime) goto L12;
        return false;
    L12:
        if (this.mLcdTime == r6.mLcdTime) goto L15;
        return false;
    L15:
        if (this.mTalkTime == r6.mTalkTime) goto L18;
        return false;
    L18:
        if (this.mSpkTime == r6.mSpkTime) goto L21;
        return false;
    L21:
        if (this.mSportTime == r6.mSportTime) goto L24;
        return false;
    L24:
        if (this.mVibratorTime == r6.mVibratorTime) goto L27;
        return false;
    L27:
        if (this.mIdleTime == r6.mIdleTime) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mLastBoot, r6.mLastBoot) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.XOO0ii0(this.mLastShutdown, r6.mLastShutdown) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mLastVoltage, r6.mLastVoltage) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final int getMIdleTime() {
        return this.mIdleTime;
    }

    @aa1
    public final BleVoltageRecord getMLastBoot() {
        return this.mLastBoot;
    }

    @aa1
    public final BleVoltageRecord getMLastShutdown() {
        return this.mLastShutdown;
    }

    @aa1
    public final BleVoltageRecord getMLastVoltage() {
        return this.mLastVoltage;
    }

    public final int getMLcdTime() {
        return this.mLcdTime;
    }

    public final int getMSpkTime() {
        return this.mSpkTime;
    }

    public final int getMSportTime() {
        return this.mSportTime;
    }

    public final int getMTalkTime() {
        return this.mTalkTime;
    }

    public final int getMTotalTime() {
        return this.mTotalTime;
    }

    public final int getMVibratorTime() {
        return this.mVibratorTime;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.mTotalTime) * 31) + Integer.hashCode(this.mLcdTime)) * 31) + Integer.hashCode(this.mTalkTime)) * 31) + Integer.hashCode(this.mSpkTime)) * 31) + Integer.hashCode(this.mSportTime)) * 31) + Integer.hashCode(this.mVibratorTime)) * 31) + Integer.hashCode(this.mIdleTime)) * 31) + this.mLastBoot.hashCode()) * 31) + this.mLastShutdown.hashCode()) * 31) + this.mLastVoltage.hashCode();
    }

    public final void setMIdleTime(int r1) {
        this.mIdleTime = r1;
    }

    public final void setMLastBoot(@aa1 BleVoltageRecord r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLastBoot = r2;
    }

    public final void setMLastShutdown(@aa1 BleVoltageRecord r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLastShutdown = r2;
    }

    public final void setMLastVoltage(@aa1 BleVoltageRecord r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLastVoltage = r2;
    }

    public final void setMLcdTime(int r1) {
        this.mLcdTime = r1;
    }

    public final void setMSpkTime(int r1) {
        this.mSpkTime = r1;
    }

    public final void setMSportTime(int r1) {
        this.mSportTime = r1;
    }

    public final void setMTalkTime(int r1) {
        this.mTalkTime = r1;
    }

    public final void setMTotalTime(int r1) {
        this.mTotalTime = r1;
    }

    public final void setMVibratorTime(int r1) {
        this.mVibratorTime = r1;
    }

    @aa1
    public String toString() {
        return "BleBatteryUsage(mTotalTime=" + this.mTotalTime + ", mLcdTime=" + this.mLcdTime + ", mTalkTime=" + this.mTalkTime + ", mSpkTime=" + this.mSpkTime + ", mSportTime=" + this.mSportTime + ", mVibratorTime=" + this.mVibratorTime + ", mIdleTime=" + this.mIdleTime + ", mLastBoot=" + this.mLastBoot + ", mLastShutdown=" + this.mLastShutdown + ", mLastVoltage=" + this.mLastVoltage + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBatteryUsage(int r2, int r3, int r4, int r5, int r6, int r7, int r8, @aa1 BleVoltageRecord r9, @aa1 BleVoltageRecord r10, @aa1 BleVoltageRecord r11) {
        Intrinsics.X0O(r9, "mLastBoot");
        Intrinsics.X0O(r10, "mLastShutdown");
        Intrinsics.X0O(r11, "mLastVoltage");
        this.mTotalTime = r2;
        this.mLcdTime = r3;
        this.mTalkTime = r4;
        this.mSpkTime = r5;
        this.mSportTime = r6;
        this.mVibratorTime = r7;
        this.mIdleTime = r8;
        this.mLastBoot = r9;
        this.mLastShutdown = r10;
        this.mLastVoltage = r11;
    }

    public /* synthetic */ BleBatteryUsage(int r21, int r22, int r23, int r24, int r25, int r26, int r27, BleVoltageRecord r28, BleVoltageRecord r29, BleVoltageRecord r30, int r31, DefaultConstructorMarker r32) {
        int r2 = 0;
        if ((r31 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r31 & 2) == 0) goto L9;
        int r3 = 0;
    L11:
        if ((r31 & 4) == 0) goto L13;
        int r4 = 0;
    L15:
        if ((r31 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r31 & 16) == 0) goto L21;
        int r6 = 0;
    L23:
        if ((r31 & 32) == 0) goto L25;
        int r7 = 0;
    L27:
        if ((r31 & 64) != 0) goto L31;
        r2 = r27;
    L31:
        if ((r31 & 128) == 0) goto L33;
        BleVoltageRecord r9 = new BleVoltageRecord(0, 0, 0, 0, 0, 0, 0, 127, null);
    L35:
        if ((r31 & 256) == 0) goto L37;
        BleVoltageRecord r10 = new BleVoltageRecord(0, 0, 0, 0, 0, 0, 0, 127, null);
    L39:
        if ((r31 & 512) == 0) goto L42;
        BleVoltageRecord r33 = new BleVoltageRecord(0, 0, 0, 0, 0, 0, 0, 127, null);
    L43:
        this(r1, r3, r4, r5, r6, r7, r2, r9, r10, r33);
        return;
    L42:
        r33 = r30;
        goto L43
    L37:
        r10 = r29;
        goto L39
    L33:
        r9 = r28;
        goto L35
    L25:
        r7 = r26;
        goto L27
    L21:
        r6 = r25;
        goto L23
    L17:
        r5 = r24;
        goto L19
    L13:
        r4 = r23;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }
}
