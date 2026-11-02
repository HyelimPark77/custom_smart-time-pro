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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;

    @aa1
    private BleTimeRange mBleTimeRange1;

    @aa1
    private BleTimeRange mBleTimeRange2;
    private int mInterval;
    private int mSpo2Threshold;
    private int mVibration;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleHanBaoSettings() {
        this(0, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ BleHanBaoSettings copy$default(BleHanBaoSettings bleHanBaoSettings, int i, int i2, int i3, BleTimeRange bleTimeRange, BleTimeRange bleTimeRange2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleHanBaoSettings.mVibration;
        }
        if ((i4 & 2) != 0) {
            i2 = bleHanBaoSettings.mInterval;
        }
        if ((i4 & 4) != 0) {
            i3 = bleHanBaoSettings.mSpo2Threshold;
        }
        if ((i4 & 8) != 0) {
            bleTimeRange = bleHanBaoSettings.mBleTimeRange1;
        }
        if ((i4 & 16) != 0) {
            bleTimeRange2 = bleHanBaoSettings.mBleTimeRange2;
        }
        BleTimeRange bleTimeRange3 = bleTimeRange2;
        int i5 = i3;
        return bleHanBaoSettings.copy(i, i2, i5, bleTimeRange, bleTimeRange3);
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
    public final BleHanBaoSettings copy(int i, int i2, int i3, @aa1 BleTimeRange mBleTimeRange1, @aa1 BleTimeRange mBleTimeRange2) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        Intrinsics.X0O(mBleTimeRange2, "mBleTimeRange2");
        return new BleHanBaoSettings(i, i2, i3, mBleTimeRange1, mBleTimeRange2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mVibration = readUInt8();
        this.mInterval = readUInt8();
        this.mSpo2Threshold = readUInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        BleReadable bleReadable = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable.setMBytes(readBytes(5));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mBleTimeRange1 = (BleTimeRange) bleReadable;
        BleReadable bleReadable2 = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable2.setMBytes(readBytes(5));
        bleReadable2.decode();
        Intrinsics.XXI(bleReadable2);
        this.mBleTimeRange2 = (BleTimeRange) bleReadable2;
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleHanBaoSettings)) {
            return false;
        }
        BleHanBaoSettings bleHanBaoSettings = (BleHanBaoSettings) obj;
        return this.mVibration == bleHanBaoSettings.mVibration && this.mInterval == bleHanBaoSettings.mInterval && this.mSpo2Threshold == bleHanBaoSettings.mSpo2Threshold && Intrinsics.XOO0ii0(this.mBleTimeRange1, bleHanBaoSettings.mBleTimeRange1) && Intrinsics.XOO0ii0(this.mBleTimeRange2, bleHanBaoSettings.mBleTimeRange2);
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

    public final void setMBleTimeRange1(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange1 = bleTimeRange;
    }

    public final void setMBleTimeRange2(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange2 = bleTimeRange;
    }

    public final void setMInterval(int i) {
        this.mInterval = i;
    }

    public final void setMSpo2Threshold(int i) {
        this.mSpo2Threshold = i;
    }

    public final void setMVibration(int i) {
        this.mVibration = i;
    }

    @aa1
    public String toString() {
        return "BleHanBaoSettings(mVibration=" + this.mVibration + ", mInterval=" + this.mInterval + ", mSpo2Threshold=" + this.mSpo2Threshold + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mBleTimeRange2=" + this.mBleTimeRange2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHanBaoSettings(int i, int i2, int i3, @aa1 BleTimeRange mBleTimeRange1, @aa1 BleTimeRange mBleTimeRange2) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        Intrinsics.X0O(mBleTimeRange2, "mBleTimeRange2");
        this.mVibration = i;
        this.mInterval = i2;
        this.mSpo2Threshold = i3;
        this.mBleTimeRange1 = mBleTimeRange1;
        this.mBleTimeRange2 = mBleTimeRange2;
    }

    public /* synthetic */ BleHanBaoSettings(int i, int i2, int i3, BleTimeRange bleTimeRange, BleTimeRange bleTimeRange2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 93 : i3, (i4 & 8) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange, (i4 & 16) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange2);
    }
}
