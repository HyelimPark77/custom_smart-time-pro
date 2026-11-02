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
@SourceDebugExtension({"SMAP\nBleDoubleScreenSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDoubleScreenSettings.kt\ncom/szabh/smable3/entity/BleDoubleScreenSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,34:1\n222#2,4:35\n222#2,4:39\n222#2,4:43\n*S KotlinDebug\n*F\n+ 1 BleDoubleScreenSettings.kt\ncom/szabh/smable3/entity/BleDoubleScreenSettings\n*L\n25#1:35,4\n26#1:39,4\n27#1:43,4\n*E\n"})
public final class BleDoubleScreenSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 16;

    @aa1
    private BleTimeRange mBleTimeRange1;

    @aa1
    private BleTimeRange mBleTimeRange2;

    @aa1
    private BleTimeRange mBleTimeRange3;
    private int mEnabled;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleDoubleScreenSettings() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ BleDoubleScreenSettings copy$default(BleDoubleScreenSettings bleDoubleScreenSettings, int i, BleTimeRange bleTimeRange, BleTimeRange bleTimeRange2, BleTimeRange bleTimeRange3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleDoubleScreenSettings.mEnabled;
        }
        if ((i2 & 2) != 0) {
            bleTimeRange = bleDoubleScreenSettings.mBleTimeRange1;
        }
        if ((i2 & 4) != 0) {
            bleTimeRange2 = bleDoubleScreenSettings.mBleTimeRange2;
        }
        if ((i2 & 8) != 0) {
            bleTimeRange3 = bleDoubleScreenSettings.mBleTimeRange3;
        }
        return bleDoubleScreenSettings.copy(i, bleTimeRange, bleTimeRange2, bleTimeRange3);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final BleTimeRange component2() {
        return this.mBleTimeRange1;
    }

    @aa1
    public final BleTimeRange component3() {
        return this.mBleTimeRange2;
    }

    @aa1
    public final BleTimeRange component4() {
        return this.mBleTimeRange3;
    }

    @aa1
    public final BleDoubleScreenSettings copy(int i, @aa1 BleTimeRange mBleTimeRange1, @aa1 BleTimeRange mBleTimeRange2, @aa1 BleTimeRange mBleTimeRange3) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        Intrinsics.X0O(mBleTimeRange2, "mBleTimeRange2");
        Intrinsics.X0O(mBleTimeRange3, "mBleTimeRange3");
        return new BleDoubleScreenSettings(i, mBleTimeRange1, mBleTimeRange2, mBleTimeRange3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readUInt8();
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
        BleReadable bleReadable3 = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable3.setMBytes(readBytes(5));
        bleReadable3.decode();
        Intrinsics.XXI(bleReadable3);
        this.mBleTimeRange3 = (BleTimeRange) bleReadable3;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeObject(this.mBleTimeRange1);
        writeObject(this.mBleTimeRange2);
        writeObject(this.mBleTimeRange3);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDoubleScreenSettings)) {
            return false;
        }
        BleDoubleScreenSettings bleDoubleScreenSettings = (BleDoubleScreenSettings) obj;
        return this.mEnabled == bleDoubleScreenSettings.mEnabled && Intrinsics.XOO0ii0(this.mBleTimeRange1, bleDoubleScreenSettings.mBleTimeRange1) && Intrinsics.XOO0ii0(this.mBleTimeRange2, bleDoubleScreenSettings.mBleTimeRange2) && Intrinsics.XOO0ii0(this.mBleTimeRange3, bleDoubleScreenSettings.mBleTimeRange3);
    }

    @aa1
    public final BleTimeRange getMBleTimeRange1() {
        return this.mBleTimeRange1;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange2() {
        return this.mBleTimeRange2;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange3() {
        return this.mBleTimeRange3;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 16;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mEnabled) * 31) + this.mBleTimeRange1.hashCode()) * 31) + this.mBleTimeRange2.hashCode()) * 31) + this.mBleTimeRange3.hashCode();
    }

    public final void setMBleTimeRange1(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange1 = bleTimeRange;
    }

    public final void setMBleTimeRange2(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange2 = bleTimeRange;
    }

    public final void setMBleTimeRange3(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange3 = bleTimeRange;
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    @aa1
    public String toString() {
        return "BleDoubleScreenSettings(mEnabled=" + this.mEnabled + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mBleTimeRange2=" + this.mBleTimeRange2 + ", mBleTimeRange3=" + this.mBleTimeRange3 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDoubleScreenSettings(int i, @aa1 BleTimeRange mBleTimeRange1, @aa1 BleTimeRange mBleTimeRange2, @aa1 BleTimeRange mBleTimeRange3) {
        Intrinsics.X0O(mBleTimeRange1, "mBleTimeRange1");
        Intrinsics.X0O(mBleTimeRange2, "mBleTimeRange2");
        Intrinsics.X0O(mBleTimeRange3, "mBleTimeRange3");
        this.mEnabled = i;
        this.mBleTimeRange1 = mBleTimeRange1;
        this.mBleTimeRange2 = mBleTimeRange2;
        this.mBleTimeRange3 = mBleTimeRange3;
    }

    public /* synthetic */ BleDoubleScreenSettings(int i, BleTimeRange bleTimeRange, BleTimeRange bleTimeRange2, BleTimeRange bleTimeRange3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange, (i2 & 4) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange2, (i2 & 8) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange3);
    }
}
