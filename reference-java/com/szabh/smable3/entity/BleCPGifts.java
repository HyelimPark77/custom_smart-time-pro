package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleCPGifts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n13805#2,2:88\n13805#2,2:90\n37#3,2:92\n*S KotlinDebug\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n*L\n26#1:88,2\n50#1:90,2\n75#1:92,2\n*E\n"})
public final class BleCPGifts extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int NAME_MAX_LENGTH = 18;
    private int mGiftsId;

    @aa1
    private String mGiftsName;
    private int mGiftsType;

    @aa1
    private byte[][] mImageBuffers;
    private long mTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleCPGifts() {
        this(0L, 0, 0, null, null, 31, null);
    }

    public static /* synthetic */ BleCPGifts copy$default(BleCPGifts bleCPGifts, long j, int i, int i2, String str, byte[][] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = bleCPGifts.mTime;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = bleCPGifts.mGiftsType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = bleCPGifts.mGiftsId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = bleCPGifts.mGiftsName;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            bArr = bleCPGifts.mImageBuffers;
        }
        return bleCPGifts.copy(j2, i4, i5, str2, bArr);
    }

    private final int getImageBufferSize() {
        int length = 0;
        for (byte[] bArr : this.mImageBuffers) {
            length += bArr.length;
        }
        return length;
    }

    public final long component1() {
        return this.mTime;
    }

    public final int component2() {
        return this.mGiftsType;
    }

    public final int component3() {
        return this.mGiftsId;
    }

    @aa1
    public final String component4() {
        return this.mGiftsName;
    }

    @aa1
    public final byte[][] component5() {
        return this.mImageBuffers;
    }

    @aa1
    public final BleCPGifts copy(long j, int i, int i2, @aa1 String mGiftsName, @aa1 byte[][] mImageBuffers) {
        Intrinsics.X0O(mGiftsName, "mGiftsName");
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        return new BleCPGifts(j, i, i2, mGiftsName, mImageBuffers);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mTime = readInt64(LITTLE_ENDIAN);
        this.mGiftsType = readInt8();
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mGiftsId = readInt16(LITTLE_ENDIAN);
        readBytes(8);
        byte int8 = readInt8();
        if (int8 > 0) {
            this.mGiftsName = BleReadable.readString$default(this, int8, null, 2, null);
        }
        byte int9 = readInt8();
        if (int9 > 0) {
            ArrayList arrayList = new ArrayList(int9);
            for (int i = 0; i < int9; i++) {
                ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
                arrayList.add(Integer.valueOf(readInt32(LITTLE_ENDIAN2)));
            }
            ArrayList arrayList2 = new ArrayList(int9);
            for (int i2 = 0; i2 < int9; i2++) {
                arrayList2.add(readBytes(((Number) arrayList.get(i2)).intValue()));
            }
            this.mImageBuffers = (byte[][]) arrayList2.toArray(new byte[0][]);
        }
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        BleCPGifts bleCPGifts;
        super.encode();
        long j = this.mTime;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeLong(j, LITTLE_ENDIAN);
        writeInt8(this.mGiftsType);
        int i = this.mGiftsId;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[8], null, 2, null);
        byte[] bytes = this.mGiftsName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int iMin = Math.min(bytes.length, 18);
        writeInt8(iMin);
        if (iMin > 0) {
            bleCPGifts = this;
            BleWritable.writeStringWithMax$default(bleCPGifts, this.mGiftsName, iMin, null, 4, null);
        } else {
            bleCPGifts = this;
        }
        writeInt8(bleCPGifts.mImageBuffers.length);
        byte[][] bArr = bleCPGifts.mImageBuffers;
        if (bArr.length == 0) {
            return;
        }
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            int length2 = bleCPGifts.mImageBuffers[i2].length;
            ByteOrder LITTLE_ENDIAN2 = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
            writeInt32(length2, LITTLE_ENDIAN2);
            arrayList.add(Unit.OXO1);
        }
        for (byte[] bArr2 : bleCPGifts.mImageBuffers) {
            BleWritable.writeBytes$default(this, bArr2, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleCPGifts)) {
            return false;
        }
        BleCPGifts bleCPGifts = (BleCPGifts) obj;
        return this.mTime == bleCPGifts.mTime && this.mGiftsType == bleCPGifts.mGiftsType && this.mGiftsId == bleCPGifts.mGiftsId && Intrinsics.XOO0ii0(this.mGiftsName, bleCPGifts.mGiftsName) && Intrinsics.XOO0ii0(this.mImageBuffers, bleCPGifts.mImageBuffers);
    }

    public final int getMGiftsId() {
        return this.mGiftsId;
    }

    @aa1
    public final String getMGiftsName() {
        return this.mGiftsName;
    }

    public final int getMGiftsType() {
        return this.mGiftsType;
    }

    @aa1
    public final byte[][] getMImageBuffers() {
        return this.mImageBuffers;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        byte[] bytes = this.mGiftsName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        return Math.min(bytes.length, 18) + 21 + (this.mImageBuffers.length * 4) + getImageBufferSize();
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mGiftsType)) * 31) + Integer.hashCode(this.mGiftsId)) * 31) + this.mGiftsName.hashCode()) * 31) + Arrays.hashCode(this.mImageBuffers);
    }

    public final void setMGiftsId(int i) {
        this.mGiftsId = i;
    }

    public final void setMGiftsName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mGiftsName = str;
    }

    public final void setMGiftsType(int i) {
        this.mGiftsType = i;
    }

    public final void setMImageBuffers(@aa1 byte[][] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageBuffers = bArr;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    @aa1
    public String toString() {
        return "BleCPGifts(mTime=" + this.mTime + ", mGiftsId=" + this.mGiftsId + ", mGiftsName='" + this.mGiftsName + "', mImageBuffers=" + this.mImageBuffers.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPGifts(long j, int i, int i2, @aa1 String mGiftsName, @aa1 byte[][] mImageBuffers) {
        Intrinsics.X0O(mGiftsName, "mGiftsName");
        Intrinsics.X0O(mImageBuffers, "mImageBuffers");
        this.mTime = j;
        this.mGiftsType = i;
        this.mGiftsId = i2;
        this.mGiftsName = mGiftsName;
        this.mImageBuffers = mImageBuffers;
    }

    public /* synthetic */ BleCPGifts(long j, int i, int i2, String str, byte[][] bArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? new byte[0][] : bArr);
    }
}
