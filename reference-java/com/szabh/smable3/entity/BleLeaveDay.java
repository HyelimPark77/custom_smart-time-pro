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
@SourceDebugExtension({"SMAP\nBleAICoachPlanV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,327:1\n222#2,4:328\n*S KotlinDebug\n*F\n+ 1 BleAICoachPlanV2.kt\ncom/szabh/smable3/entity/BleLeaveDay\n*L\n217#1:328,4\n*E\n"})
public final class BleLeaveDay extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int LEAVE_CANCELLATION = 0;
    public static final int LEAVE_REQUEST = 1;
    private long mLeaveDayV2;
    private int type;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleLeaveDay() {
        this(0, 0L, 3, null);
    }

    public static /* synthetic */ BleLeaveDay copy$default(BleLeaveDay bleLeaveDay, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleLeaveDay.type;
        }
        if ((i2 & 2) != 0) {
            j = bleLeaveDay.mLeaveDayV2;
        }
        return bleLeaveDay.copy(i, j);
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.mLeaveDayV2;
    }

    @aa1
    public final BleLeaveDay copy(int i, long j) {
        return new BleLeaveDay(i, j);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.type = readInt8();
        BleTime.Companion companion = BleTime.Companion;
        BleReadable bleReadable = (BleReadable) BleTime.class.newInstance();
        bleReadable.setMBytes(readBytes(6));
        bleReadable.decode();
        Intrinsics.XXI(bleReadable);
        this.mLeaveDayV2 = companion.timeInMillis((BleTime) bleReadable);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.type);
        writeObject(BleTime.Companion.ofLocal(this.mLeaveDayV2));
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLeaveDay)) {
            return false;
        }
        BleLeaveDay bleLeaveDay = (BleLeaveDay) obj;
        return this.type == bleLeaveDay.type && this.mLeaveDayV2 == bleLeaveDay.mLeaveDayV2;
    }

    public final long getMLeaveDayV2() {
        return this.mLeaveDayV2;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 7;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Long.hashCode(this.mLeaveDayV2);
    }

    public final void setMLeaveDayV2(long j) {
        this.mLeaveDayV2 = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @aa1
    public String toString() {
        return "BleLeaveDay(type=" + this.type + ", mLeaveDayV2=" + this.mLeaveDayV2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLeaveDay(int i, long j) {
        this.type = i;
        this.mLeaveDayV2 = j;
    }

    public /* synthetic */ BleLeaveDay(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j);
    }
}
