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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;

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
    public BleRelaxReminder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleRelaxReminder copy$default(BleRelaxReminder r0, BleTimeRange r1, int r2, Object r3) {
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
    public final BleRelaxReminder copy(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        return new BleRelaxReminder(r2);
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
        if ((r4 instanceof BleRelaxReminder) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange, ((BleRelaxReminder) r4).mBleTimeRange) == true) goto L11;
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
        return 8;
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
        return "BleRelaxReminder(mBleTimeRange=" + this.mBleTimeRange + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRelaxReminder(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "mBleTimeRange");
        this.mBleTimeRange = r2;
    }

    public /* synthetic */ BleRelaxReminder(BleTimeRange r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L5;
        r9 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L5:
        this(r9);
    }
}
