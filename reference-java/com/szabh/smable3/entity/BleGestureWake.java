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
@SourceDebugExtension({"SMAP\nBleGestureWake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,25:1\n222#2,4:26\n*S KotlinDebug\n*F\n+ 1 BleGestureWake.kt\ncom/szabh/smable3/entity/BleGestureWake\n*L\n18#1:26,4\n*E\n"})
public final class BleGestureWake extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 5;

    @aa1
    private BleTimeRange mBleTimeRange;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleGestureWake() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleGestureWake copy$default(BleGestureWake bleGestureWake, BleTimeRange bleTimeRange, int i, Object obj) {
        if ((i & 1) != 0) {
            bleTimeRange = bleGestureWake.mBleTimeRange;
        }
        return bleGestureWake.copy(bleTimeRange);
    }

    @aa1
    public final BleTimeRange component1() {
        return this.mBleTimeRange;
    }

    @aa1
    public final BleGestureWake copy(@aa1 BleTimeRange mBleTimeRange) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        return new BleGestureWake(mBleTimeRange);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable bleReadable = (BleReadable) BleTimeRange.class.newInstance();
        bleReadable.setMBytes(readBytes(5));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mBleTimeRange = (BleTimeRange) bleReadable;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mBleTimeRange);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleGestureWake) && Intrinsics.XOO0ii0(this.mBleTimeRange, ((BleGestureWake) obj).mBleTimeRange);
    }

    @aa1
    public final BleTimeRange getMBleTimeRange() {
        return this.mBleTimeRange;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 5;
    }

    public int hashCode() {
        return this.mBleTimeRange.hashCode();
    }

    public final void setMBleTimeRange(@aa1 BleTimeRange bleTimeRange) {
        Intrinsics.X0O(bleTimeRange, "<set-?>");
        this.mBleTimeRange = bleTimeRange;
    }

    @aa1
    public String toString() {
        return "BleGestureWake(mBleTimeRange=" + this.mBleTimeRange + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGestureWake(@aa1 BleTimeRange mBleTimeRange) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        this.mBleTimeRange = mBleTimeRange;
    }

    public /* synthetic */ BleGestureWake(BleTimeRange bleTimeRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange);
    }
}
