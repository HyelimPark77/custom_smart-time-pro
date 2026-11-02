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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;

    @aa1
    private BleTimeRange mBleTimeRange;

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
    public BleGestureWake() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleGestureWake copy$default(BleGestureWake r0, BleTimeRange r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mBleTimeRange;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final BleTimeRange component1() {
        return this.mBleTimeRange;
    }

    @aa1
    public final BleGestureWake copy(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        return new BleGestureWake(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange = (BleTimeRange) r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeObject(this.mBleTimeRange);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleGestureWake) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange, ((BleGestureWake) r4).mBleTimeRange) == true) goto L11;
        return false;
    L11:
        return true;
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

    public final void setMBleTimeRange(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange = r2;
    }

    @aa1
    public String toString() {
        return "BleGestureWake(mBleTimeRange=" + this.mBleTimeRange + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGestureWake(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        this.mBleTimeRange = r2;
    }

    public /* synthetic */ BleGestureWake(BleTimeRange r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L5;
        r9 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L5:
        this(r9);
    }
}
