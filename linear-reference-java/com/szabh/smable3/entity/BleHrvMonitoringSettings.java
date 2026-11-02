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
@SourceDebugExtension({"SMAP\nBleHrvMonitoringSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHrvMonitoringSettings.kt\ncom/szabh/smable3/entity/BleHrvMonitoringSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,28:1\n222#2,4:29\n*S KotlinDebug\n*F\n+ 1 BleHrvMonitoringSettings.kt\ncom/szabh/smable3/entity/BleHrvMonitoringSettings\n*L\n20#1:29,4\n*E\n"})
public final class BleHrvMonitoringSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 6;

    @aa1
    private BleTimeRange mBleTimeRange;
    private int mInterval;

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
    public BleHrvMonitoringSettings() {
        BleTimeRange r2 = null;
        this(r2, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleHrvMonitoringSettings copy$default(BleHrvMonitoringSettings r0, BleTimeRange r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mBleTimeRange;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mInterval;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final BleTimeRange component1() {
        return this.mBleTimeRange;
    }

    public final int component2() {
        return this.mInterval;
    }

    @aa1
    public final BleHrvMonitoringSettings copy(@aa1 BleTimeRange r2, int r3) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        return new BleHrvMonitoringSettings(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange = (BleTimeRange) r0;
        this.mInterval = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mBleTimeRange);
        writeInt8(Math.max(this.mInterval, 1));
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleHrvMonitoringSettings) == true) goto L8;
        return false;
    L8:
        BleHrvMonitoringSettings r6 = (BleHrvMonitoringSettings) r5;
        if (Intrinsics.XOO0ii0(this.mBleTimeRange, r6.mBleTimeRange) == true) goto L12;
        return false;
    L12:
        if (this.mInterval == r6.mInterval) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange() {
        return this.mBleTimeRange;
    }

    public final int getMInterval() {
        return this.mInterval;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 6;
    }

    public int hashCode() {
        return (this.mBleTimeRange.hashCode() * 31) + Integer.hashCode(this.mInterval);
    }

    public final void setMBleTimeRange(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange = r2;
    }

    public final void setMInterval(int r1) {
        this.mInterval = r1;
    }

    @aa1
    public String toString() {
        return "BleHrvMonitoringSettings(mBleTimeRange=" + this.mBleTimeRange + ", mInterval=" + this.mInterval + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrvMonitoringSettings(@aa1 BleTimeRange r2, int r3) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        this.mBleTimeRange = r2;
        this.mInterval = r3;
    }

    public /* synthetic */ BleHrvMonitoringSettings(BleTimeRange r9, int r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r9 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L6:
        if ((r11 & 2) == 0) goto L8;
        r10 = 60;
    L8:
        this(r9, r10);
    }
}
