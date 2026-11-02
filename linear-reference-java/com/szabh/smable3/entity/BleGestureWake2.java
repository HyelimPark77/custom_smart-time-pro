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
@SourceDebugExtension({"SMAP\nBleGestureWake2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGestureWake2.kt\ncom/szabh/smable3/entity/BleGestureWake2\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,30:1\n222#2,4:31\n*S KotlinDebug\n*F\n+ 1 BleGestureWake2.kt\ncom/szabh/smable3/entity/BleGestureWake2\n*L\n22#1:31,4\n*E\n"})
public final class BleGestureWake2 extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 8;

    @aa1
    private BleTimeRange mBleTimeRange1;
    private int mEnabled;

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
    public BleGestureWake2() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleGestureWake2 copy$default(BleGestureWake2 r0, int r1, BleTimeRange r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mBleTimeRange1;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final BleTimeRange component2() {
        return this.mBleTimeRange1;
    }

    @aa1
    public final BleGestureWake2 copy(int r2, @aa1 BleTimeRange r3) {
        Intrinsics.X0O(r3, "mBleTimeRange1");
        return new BleGestureWake2(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readUInt8();
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange1 = (BleTimeRange) r0;
        BleReadable.readInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeObject(this.mBleTimeRange1);
        BleWritable.writeInt16$default(this, 0, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGestureWake2) == true) goto L8;
        return false;
    L8:
        BleGestureWake2 r6 = (BleGestureWake2) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange1, r6.mBleTimeRange1) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final BleTimeRange getMBleTimeRange1() {
        return this.mBleTimeRange1;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 8;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mEnabled) * 31) + this.mBleTimeRange1.hashCode();
    }

    public final void setMBleTimeRange1(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange1 = r2;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    @aa1
    public String toString() {
        return "BleGestureWake2(mEnabled=" + this.mEnabled + ", mBleTimeRange1=" + this.mBleTimeRange1 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGestureWake2(int r2, @aa1 BleTimeRange r3) {
        Intrinsics.X0O(r3, "mBleTimeRange1");
        this.mEnabled = r2;
        this.mBleTimeRange1 = r3;
    }

    public /* synthetic */ BleGestureWake2(int r9, BleTimeRange r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L6;
        r9 = 0;
    L6:
        if ((r11 & 2) == 0) goto L8;
        r10 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L8:
        this(r9, r10);
    }
}
