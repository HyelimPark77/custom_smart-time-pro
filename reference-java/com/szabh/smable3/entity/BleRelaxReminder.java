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
@SourceDebugExtension({"SMAP\nBleRelaxReminder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleRelaxReminder.kt\ncom/szabh/smable3/entity/BleRelaxReminder\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,28:1\n222#2,4:29\n*S KotlinDebug\n*F\n+ 1 BleRelaxReminder.kt\ncom/szabh/smable3/entity/BleRelaxReminder\n*L\n21#1:29,4\n*E\n"})
public final class BleRelaxReminder extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 8;

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
    public BleRelaxReminder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleRelaxReminder copy$default(BleRelaxReminder bleRelaxReminder, BleTimeRange bleTimeRange, int i, Object obj) {
        if ((i & 1) != 0) {
            bleTimeRange = bleRelaxReminder.mBleTimeRange;
        }
        return bleRelaxReminder.copy(bleTimeRange);
    }

    @aa1
    public final BleTimeRange component1() {
        return this.mBleTimeRange;
    }

    @aa1
    public final BleRelaxReminder copy(@aa1 BleTimeRange mBleTimeRange) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        return new BleRelaxReminder(mBleTimeRange);
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
        return (obj instanceof BleRelaxReminder) && Intrinsics.XOO0ii0(this.mBleTimeRange, ((BleRelaxReminder) obj).mBleTimeRange);
    }

    @aa1
    public final BleTimeRange getMBleTimeRange() {
        return this.mBleTimeRange;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
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
        return "BleRelaxReminder(mBleTimeRange=" + this.mBleTimeRange + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRelaxReminder(@aa1 BleTimeRange mBleTimeRange) {
        Intrinsics.X0O(mBleTimeRange, "mBleTimeRange");
        this.mBleTimeRange = mBleTimeRange;
    }

    public /* synthetic */ BleRelaxReminder(BleTimeRange bleTimeRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BleTimeRange(0, 0, 0, 0, 0, 31, null) : bleTimeRange);
    }
}
