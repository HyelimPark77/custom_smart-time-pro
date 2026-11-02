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
    public static final Companion Companion = new Companion(null);

    @aa1
    private static final int[] DEFAULT_EQ_FREQS = {31, 63, 125, 250, 500, 1000, 2000, 4000, 8000, 16000};
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final int[] getDEFAULT_EQ_FREQS() {
            return BleEarphoneSoundEffectsSettings.DEFAULT_EQ_FREQS;
        }

        private Companion() {
        }
    }

    public BleEarphoneSoundEffectsSettings() {
        this(0, 0, null, null, 0, 31, null);
    }

    public static /* synthetic */ BleEarphoneSoundEffectsSettings copy$default(BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings, int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleEarphoneSoundEffectsSettings.mMode;
        }
        if ((i4 & 2) != 0) {
            i2 = bleEarphoneSoundEffectsSettings.mDynamic;
        }
        if ((i4 & 4) != 0) {
            bArr = bleEarphoneSoundEffectsSettings.mValue;
        }
        if ((i4 & 8) != 0) {
            iArr = bleEarphoneSoundEffectsSettings.mFreqs;
        }
        if ((i4 & 16) != 0) {
            i3 = bleEarphoneSoundEffectsSettings.mCount;
        }
        int i5 = i3;
        byte[] bArr2 = bArr;
        return bleEarphoneSoundEffectsSettings.copy(i, i2, bArr2, iArr, i5);
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
    public final BleEarphoneSoundEffectsSettings copy(int i, int i2, @aa1 byte[] mValue, @aa1 int[] mFreqs, int i3) {
        Intrinsics.X0O(mValue, "mValue");
        Intrinsics.X0O(mFreqs, "mFreqs");
        return new BleEarphoneSoundEffectsSettings(i, i2, mValue, mFreqs, i3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mMode = readInt8();
        this.mDynamic = readInt8();
        this.mValue = readBytes(10);
        int length = this.mFreqs.length;
        for (int i = 0; i < length; i++) {
            int[] iArr = this.mFreqs;
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            iArr[i] = readInt16(LITTLE_ENDIAN);
        }
        this.mCount = BleReadable.readUInt16$default(this, null, 1, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mMode);
        writeInt8(this.mDynamic);
        BleWritable.writeBytes$default(this, this.mValue, null, 2, null);
        for (int i : this.mFreqs) {
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            writeInt16(i, LITTLE_ENDIAN);
        }
        int i2 = this.mCount;
        ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleEarphoneSoundEffectsSettings)) {
            return false;
        }
        BleEarphoneSoundEffectsSettings bleEarphoneSoundEffectsSettings = (BleEarphoneSoundEffectsSettings) obj;
        return this.mMode == bleEarphoneSoundEffectsSettings.mMode && this.mDynamic == bleEarphoneSoundEffectsSettings.mDynamic && Intrinsics.XOO0ii0(this.mValue, bleEarphoneSoundEffectsSettings.mValue) && Intrinsics.XOO0ii0(this.mFreqs, bleEarphoneSoundEffectsSettings.mFreqs) && this.mCount == bleEarphoneSoundEffectsSettings.mCount;
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

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMDynamic(int i) {
        this.mDynamic = i;
    }

    public final void setMFreqs(@aa1 int[] iArr) {
        Intrinsics.X0O(iArr, "<set-?>");
        this.mFreqs = iArr;
    }

    public final void setMMode(int i) {
        this.mMode = i;
    }

    public final void setMValue(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mValue = bArr;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleEarphoneSoundEffectsSettings(mMode=");
        sb.append(this.mMode);
        sb.append(", mDynamic=");
        sb.append(this.mDynamic);
        sb.append(", mValue=");
        String string = Arrays.toString(this.mValue);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        sb.append(string);
        sb.append(", mFreqs=");
        String string2 = Arrays.toString(this.mFreqs);
        Intrinsics.O10IXXX0X(string2, "toString(...)");
        sb.append(string2);
        sb.append(", mCount=");
        sb.append(this.mCount);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleEarphoneSoundEffectsSettings(int i, int i2, @aa1 byte[] mValue, @aa1 int[] mFreqs, int i3) {
        Intrinsics.X0O(mValue, "mValue");
        Intrinsics.X0O(mFreqs, "mFreqs");
        this.mMode = i;
        this.mDynamic = i2;
        this.mValue = mValue;
        this.mFreqs = mFreqs;
        this.mCount = i3;
    }

    public /* synthetic */ BleEarphoneSoundEffectsSettings(int i, int i2, byte[] bArr, int[] iArr, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? new byte[10] : bArr, (i4 & 8) != 0 ? DEFAULT_EQ_FREQS : iArr, (i4 & 16) != 0 ? 10 : i3);
    }
}
