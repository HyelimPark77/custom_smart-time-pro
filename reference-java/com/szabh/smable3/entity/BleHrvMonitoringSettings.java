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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 6;

    @aa1
    private BleTimeRange mBleTimeRange;
    private int mInterval;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleHrvMonitoringSettings() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleHrvMonitoringSettings copy$default(BleHrvMonitoringSettings bleHrvMonitoringSettings, BleTimeRange bleTimeRange, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bleTimeRange = bleHrvMonitoringSettings.mBleTimeRange;
        }
        if ((i2 & 2) != 0) {
            i = bleHrvMonitoringSettings.mInterval;
        }
        return bleHrvMonitoringSettings.copy(bleTimeRange, i);
    }

    @aa1
    public final BleTimeRange component1() {
        return this.mBleTimeRange;
    }

    public final int component2() {
        return this.mInterval;
    }

    @aa1
    public final BleHrvMonitoringSettings copy(@aa1 BleTimeRange mBleTimeRange, int i) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        return new BleHrvMonitoringSettings(mBleTimeRange, i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable bleReadable = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable.setMBytes(readBytes(5));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mBleTimeRange = (BleTimeRange) bleReadable;
        this.mInterval = readUInt8();
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mBleTimeRange);
        writeInt8(Math.max(this.mInterval, 1));
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHrvMonitoringSettings)) {
            return false;
        }
        BleHrvMonitoringSettings bleHrvMonitoringSettings = (BleHrvMonitoringSettings) obj;
        return Intrinsics.XOO0ii0(this.mBleTimeRange, bleHrvMonitoringSettings.mBleTimeRange) && this.mInterval == bleHrvMonitoringSettings.mInterval;
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

    public final void setMBleTimeRange(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange = bleTimeRange;
    }

    public final void setMInterval(int i) {
        this.mInterval = i;
    }

    @aa1
    public String toString() {
        return "BleHrvMonitoringSettings(mBleTimeRange=" + this.mBleTimeRange + ", mInterval=" + this.mInterval + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHrvMonitoringSettings(@aa1 BleTimeRange mBleTimeRange, int i) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        this.mBleTimeRange = mBleTimeRange;
        this.mInterval = i;
    }

    public /* synthetic */ BleHrvMonitoringSettings(BleTimeRange bleTimeRange, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange, (i2 & 2) != 0 ? 60 : i);
    }
}
