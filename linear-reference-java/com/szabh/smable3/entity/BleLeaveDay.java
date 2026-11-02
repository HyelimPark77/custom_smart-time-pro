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
    public static final Companion Companion = null;
    public static final int LEAVE_CANCELLATION = 0;
    public static final int LEAVE_REQUEST = 1;
    private long mLeaveDayV2;
    private int type;

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

    public BleLeaveDay() {
        int r1 = 0;
        long r2 = 0;
        this(r1, r2, 3, null);
    }

    public static /* synthetic */ BleLeaveDay copy$default(BleLeaveDay r0, int r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mLeaveDayV2;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.type;
    }

    public final long component2() {
        return this.mLeaveDayV2;
    }

    @aa1
    public final BleLeaveDay copy(int r2, long r3) {
        return new BleLeaveDay(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.type = readInt8();
        BleTime.Companion r0 = BleTime.Companion;
        BleReadable r1 = (BleReadable) BleTime.class.newInstance();
        r1.setMBytes(readBytes(6));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mLeaveDayV2 = r0.timeInMillis((BleTime) r1);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.type);
        writeObject(BleTime.Companion.ofLocal(this.mLeaveDayV2));
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleLeaveDay) == true) goto L8;
        return false;
    L8:
        BleLeaveDay r9 = (BleLeaveDay) r8;
        if (this.type == r9.type) goto L12;
        return false;
    L12:
        if (this.mLeaveDayV2 == r9.mLeaveDayV2) goto L14;
        return false;
    L14:
        return true;
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

    public final void setMLeaveDayV2(long r1) {
        this.mLeaveDayV2 = r1;
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    @aa1
    public String toString() {
        return "BleLeaveDay(type=" + this.type + ", mLeaveDayV2=" + this.mLeaveDayV2 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLeaveDay(int r1, long r2) {
        this.type = r1;
        this.mLeaveDayV2 = r2;
    }

    public /* synthetic */ BleLeaveDay(int r1, long r2, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
