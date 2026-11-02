package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleEarphoneSoundEffectsSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n13826#2,2:61\n*S KotlinDebug\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n*L\n24#1:61,2\n*E\n"})
public final class BleEarphoneSoundEffectsSettings extends BleWritable {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private static final int[] DEFAULT_EQ_FREQS = null;
    public static final int ITEM_LENGTH = 34;
    public static final int MODE_CLASSICAL = 3;
    public static final int MODE_COUNTRY = 5;
    public static final int MODE_JAZZ = 4;
    public static final int MODE_NORMAL = 0;
    public static final int MODE_POP = 2;
    public static final int MODE_ROCK = 1;
    public static final int MODE_USER = 6;
    private int mCount;
    private int mDynamic;

    @aa1
    private int[] mFreqs;
    private int mMode;

    @aa1
    private byte[] mValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final int[] getDEFAULT_EQ_FREQS() {
            return BleEarphoneSoundEffectsSettings.access$getDEFAULT_EQ_FREQS$cp();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        DEFAULT_EQ_FREQS = new int[]{31, 63, 125, 250, 500, 1000, 2000, 4000, 8000, 16000};
    }

    public BleEarphoneSoundEffectsSettings() {
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        int[] r4 = null;
        int r5 = 0;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static final /* synthetic */ int[] access$getDEFAULT_EQ_FREQS$cp() {
        return DEFAULT_EQ_FREQS;
    }

    public static /* synthetic */ BleEarphoneSoundEffectsSettings copy$default(BleEarphoneSoundEffectsSettings r0, int r1, int r2, byte[] r3, int[] r4, int r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mMode;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mDynamic;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mValue;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mFreqs;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mCount;
    L17:
        int[] r8 = r4;
        int r9 = r5;
        byte[] r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mMode;
    }

    public final int component2() {
        return this.mDynamic;
    }

    @aa1
    public final byte[] component3() {
        return this.mValue;
    }

    @aa1
    public final int[] component4() {
        return this.mFreqs;
    }

    public final int component5() {
        return this.mCount;
    }

    @aa1
    public final BleEarphoneSoundEffectsSettings copy(int r8, int r9, @aa1 byte[] r10, @aa1 int[] r11, int r12) {
        Intrinsics.X0O(r10, "mValue");
        Intrinsics.X0O(r11, "mFreqs");
        return new BleEarphoneSoundEffectsSettings(r8, r9, r10, r11, r12);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        this.mDynamic = readInt8();
        this.mValue = readBytes(10);
        int r0 = this.mFreqs.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        int[] r2 = this.mFreqs;
        ByteOrder r3 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r3, "LITTLE_ENDIAN");
        r2[r1] = readInt16(r3);
        r1 = r1 + 1;
        goto L3
    L5:
        this.mCount = BleReadable.readUInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(this.mDynamic);
        BleWritable.writeBytes$default(this, this.mValue, null, 2, null);
        int[] r0 = this.mFreqs;
        int r1 = r0.length;
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L6;
        int r4 = r0[r2];
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        writeInt16(r4, r5);
        r2 = r2 + 1;
        goto L4
    L6:
        int r3 = this.mCount;
        ByteOrder r6 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r6, "LITTLE_ENDIAN");
        writeInt16(r3, r6);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleEarphoneSoundEffectsSettings) == true) goto L8;
        return false;
    L8:
        BleEarphoneSoundEffectsSettings r6 = (BleEarphoneSoundEffectsSettings) r5;
        if (this.mMode == r6.mMode) goto L12;
        return false;
    L12:
        if (this.mDynamic == r6.mDynamic) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mValue, r6.mValue) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mFreqs, r6.mFreqs) == true) goto L21;
        return false;
    L21:
        if (this.mCount == r6.mCount) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMCount() {
        return this.mCount;
    }

    public final int getMDynamic() {
        return this.mDynamic;
    }

    @aa1
    public final int[] getMFreqs() {
        return this.mFreqs;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 34;
    }

    public final int getMMode() {
        return this.mMode;
    }

    @aa1
    public final byte[] getMValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mMode) * 31) + Integer.hashCode(this.mDynamic)) * 31) + Arrays.hashCode(this.mValue)) * 31) + Arrays.hashCode(this.mFreqs)) * 31) + Integer.hashCode(this.mCount);
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMDynamic(int r1) {
        this.mDynamic = r1;
    }

    public final void setMFreqs(@aa1 int[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFreqs = r2;
    }

    public final void setMMode(int r1) {
        this.mMode = r1;
    }

    public final void setMValue(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mValue = r2;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleEarphoneSoundEffectsSettings(mMode=");
        r0.append(this.mMode);
        r0.append(", mDynamic=");
        r0.append(this.mDynamic);
        r0.append(", mValue=");
        String r1 = Arrays.toString(this.mValue);
        Intrinsics.O10IXXX0X(r1, "toString(...)");
        r0.append(r1);
        r0.append(", mFreqs=");
        String r2 = Arrays.toString(this.mFreqs);
        Intrinsics.O10IXXX0X(r2, "toString(...)");
        r0.append(r2);
        r0.append(", mCount=");
        r0.append(this.mCount);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleEarphoneSoundEffectsSettings(int r2, int r3, @aa1 byte[] r4, @aa1 int[] r5, int r6) {
        Intrinsics.X0O(r4, "mValue");
        Intrinsics.X0O(r5, "mFreqs");
        this.mMode = r2;
        this.mDynamic = r3;
        this.mValue = r4;
        this.mFreqs = r5;
        this.mCount = r6;
    }

    public /* synthetic */ BleEarphoneSoundEffectsSettings(int r2, int r3, byte[] r4, int[] r5, int r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = new byte[10];
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = DEFAULT_EQ_FREQS;
    L15:
        if ((r7 & 16) == 0) goto L18;
        int r9 = 10;
    L17:
        int[] r10 = r5;
        byte[] r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L18:
        r9 = r6;
        goto L17
    }
}
