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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 16;

    @aa1
    private BleTimeRange mBleTimeRange1;

    @aa1
    private BleTimeRange mBleTimeRange2;

    @aa1
    private BleTimeRange mBleTimeRange3;
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

    public BleDoubleScreenSettings() {
        int r1 = 0;
        BleTimeRange r2 = null;
        BleTimeRange r3 = null;
        BleTimeRange r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleDoubleScreenSettings copy$default(BleDoubleScreenSettings r0, int r1, BleTimeRange r2, BleTimeRange r3, BleTimeRange r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mBleTimeRange1;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mBleTimeRange2;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mBleTimeRange3;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleDoubleScreenSettings copy(int r2, @aa1 BleTimeRange r3, @aa1 BleTimeRange r4, @aa1 BleTimeRange r5) {
        Intrinsics.X0O(r3, "mBleTimeRange1");
        Intrinsics.X0O(r4, "mBleTimeRange2");
        Intrinsics.X0O(r5, "mBleTimeRange3");
        return new BleDoubleScreenSettings(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readUInt8();
        BleReadable r1 = (BleReadable) BleTimeRange.class.newInstance();
        r1.setMBytes(readBytes(5));
        r1.decode();
        Intrinsics.XXI(r1);
        this.mBleTimeRange1 = (BleTimeRange) r1;
        BleReadable r2 = (BleReadable) BleTimeRange.class.newInstance();
        r2.setMBytes(readBytes(5));
        r2.decode();
        Intrinsics.XXI(r2);
        this.mBleTimeRange2 = (BleTimeRange) r2;
        BleReadable r0 = (BleReadable) BleTimeRange.class.newInstance();
        r0.setMBytes(readBytes(5));
        r0.decode();
        Intrinsics.XXI(r0);
        this.mBleTimeRange3 = (BleTimeRange) r0;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeObject(this.mBleTimeRange1);
        writeObject(this.mBleTimeRange2);
        writeObject(this.mBleTimeRange3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDoubleScreenSettings) == true) goto L8;
        return false;
    L8:
        BleDoubleScreenSettings r6 = (BleDoubleScreenSettings) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange1, r6.mBleTimeRange1) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange2, r6.mBleTimeRange2) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mBleTimeRange3, r6.mBleTimeRange3) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMBleTimeRange1(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange1 = r2;
    }

    public final void setMBleTimeRange2(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange2 = r2;
    }

    public final void setMBleTimeRange3(@aa1 BleTimeRange r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleTimeRange3 = r2;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    @aa1
    public String toString() {
        return "BleDoubleScreenSettings(mEnabled=" + this.mEnabled + ", mBleTimeRange1=" + this.mBleTimeRange1 + ", mBleTimeRange2=" + this.mBleTimeRange2 + ", mBleTimeRange3=" + this.mBleTimeRange3 + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDoubleScreenSettings(int r2, @aa1 BleTimeRange r3, @aa1 BleTimeRange r4, @aa1 BleTimeRange r5) {
        Intrinsics.X0O(r3, "mBleTimeRange1");
        Intrinsics.X0O(r4, "mBleTimeRange2");
        Intrinsics.X0O(r5, "mBleTimeRange3");
        this.mEnabled = r2;
        this.mBleTimeRange1 = r3;
        this.mBleTimeRange2 = r4;
        this.mBleTimeRange3 = r5;
    }

    public /* synthetic */ BleDoubleScreenSettings(int r9, BleTimeRange r10, BleTimeRange r11, BleTimeRange r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L6;
        r9 = 0;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r10 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L9:
        if ((r13 & 4) == 0) goto L12;
        r11 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L12:
        if ((r13 & 8) == 0) goto L14;
        r12 = new BleTimeRange(0, 0, 0, 0, 0, 31, null);
    L14:
        this(r9, r10, r11, r12);
    }
}
