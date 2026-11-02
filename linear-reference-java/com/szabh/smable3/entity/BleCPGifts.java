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
    public static final Companion Companion = null;
    public static final int NAME_MAX_LENGTH = 18;
    private int mGiftsId;

    @aa1
    private String mGiftsName;
    private int mGiftsType;

    @aa1
    private byte[][] mImageBuffers;
    private long mTime;

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

    public BleCPGifts() {
        long r1 = 0;
        int r3 = 0;
        int r4 = 0;
        String r5 = null;
        byte[][] r6 = null;
        this(r1, r3, r4, r5, r6, 31, null);
    }

    public static /* synthetic */ BleCPGifts copy$default(BleCPGifts r7, long r8, int r10, int r11, String r12, byte[][] r13, int r14, Object r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = r7.mTime;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        r10 = r7.mGiftsType;
    L8:
        int r3 = r10;
        if ((r14 & 4) == 0) goto L11;
        r11 = r7.mGiftsId;
    L11:
        int r4 = r11;
        if ((r14 & 8) == 0) goto L14;
        r12 = r7.mGiftsName;
    L14:
        String r5 = r12;
        if ((r14 & 16) == 0) goto L18;
        r13 = r7.mImageBuffers;
    L18:
        return r7.copy(r1, r3, r4, r5, r13);
    }

    private final int getImageBufferSize() {
        byte[][] r0 = this.mImageBuffers;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2].length;
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
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
    public final BleCPGifts copy(long r9, int r11, int r12, @aa1 String r13, @aa1 byte[][] r14) {
        Intrinsics.X0O(r13, "mGiftsName");
        Intrinsics.X0O(r14, "mImageBuffers");
        return new BleCPGifts(r9, r11, r12, r13, r14);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mTime = readInt64(r0);
        this.mGiftsType = readInt8();
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mGiftsId = readInt16(r0);
        readBytes(8);
        byte r1 = readInt8();
        if (r1 <= 0) goto L5;
        this.mGiftsName = BleReadable.readString$default(this, r1, null, 2, null);
    L5:
        byte r2 = readInt8();
        if (r2 <= 0) goto L17;
        ArrayList r3 = new ArrayList(r2);
        int r4 = 0;
    L8:
        if (r4 >= r2) goto L10;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r5, "LITTLE_ENDIAN");
        r3.add(Integer.valueOf(readInt32(r5)));
        r4 = r4 + 1;
        goto L8
    L10:
        ArrayList r6 = new ArrayList(r2);
        int r7 = 0;
    L11:
        if (r7 >= r2) goto L13;
        r6.add(readBytes(((Number) r3.get(r7)).intValue()));
        r7 = r7 + 1;
        goto L11
    L13:
        this.mImageBuffers = (byte[][]) r6.toArray(new byte[0][]);
        return;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        long r0 = this.mTime;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeLong(r0, r2);
        writeInt8(this.mGiftsType);
        int r1 = this.mGiftsId;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        writeInt16(r1, r2);
        BleWritable.writeBytes$default(this, new byte[8], null, 2, null);
        byte[] r3 = this.mGiftsName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        int r7 = Math.min(r3.length, 18);
        writeInt8(r7);
        if (r7 <= 0) goto L5;
        BleCPGifts r5 = this;
        BleWritable.writeStringWithMax$default(r5, this.mGiftsName, r7, null, 4, null);
    L6:
        writeInt8(r5.mImageBuffers.length);
        byte[][] r4 = r5.mImageBuffers;
        int r6 = 0;
        if (r4.length != 0) goto L9;
        boolean r8 = true;
    L10:
        if (r8 == true) goto L17;
        int r9 = r4.length;
        ArrayList r10 = new ArrayList(r9);
        int r11 = 0;
    L12:
        if (r11 >= r9) goto L14;
        int r12 = r5.mImageBuffers[r11].length;
        ByteOrder r13 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r13, "LITTLE_ENDIAN");
        writeInt32(r12, r13);
        r10.add(Unit.OXO1);
        r11 = r11 + 1;
        goto L12
    L14:
        byte[][] r14 = r5.mImageBuffers;
        int r15 = r14.length;
    L15:
        if (r6 >= r15) goto L20;
        BleWritable.writeBytes$default(this, r14[r6], null, 2, null);
        r6 = r6 + 1;
        goto L15
    L20:
        return;
    L17:
        return;
    L9:
        r8 = false;
        goto L10
    L5:
        r5 = this;
        goto L6
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleCPGifts) == true) goto L8;
        return false;
    L8:
        BleCPGifts r9 = (BleCPGifts) r8;
        if (this.mTime == r9.mTime) goto L12;
        return false;
    L12:
        if (this.mGiftsType == r9.mGiftsType) goto L15;
        return false;
    L15:
        if (this.mGiftsId == r9.mGiftsId) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mGiftsName, r9.mGiftsName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mImageBuffers, r9.mImageBuffers) == true) goto L23;
        return false;
    L23:
        return true;
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
        byte[] r0 = this.mGiftsName.getBytes(Charsets.XIi00iiXO);
        Intrinsics.O10IXXX0X(r0, "getBytes(...)");
        return ((Math.min(r0.length, 18) + 21) + (this.mImageBuffers.length * 4)) + getImageBufferSize();
    }

    public final long getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.mTime) * 31) + Integer.hashCode(this.mGiftsType)) * 31) + Integer.hashCode(this.mGiftsId)) * 31) + this.mGiftsName.hashCode()) * 31) + Arrays.hashCode(this.mImageBuffers);
    }

    public final void setMGiftsId(int r1) {
        this.mGiftsId = r1;
    }

    public final void setMGiftsName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mGiftsName = r2;
    }

    public final void setMGiftsType(int r1) {
        this.mGiftsType = r1;
    }

    public final void setMImageBuffers(@aa1 byte[][] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageBuffers = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleCPGifts(mTime=" + this.mTime + ", mGiftsId=" + this.mGiftsId + ", mGiftsName='" + this.mGiftsName + "', mImageBuffers=" + this.mImageBuffers.length + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCPGifts(long r2, int r4, int r5, @aa1 String r6, @aa1 byte[][] r7) {
        Intrinsics.X0O(r6, "mGiftsName");
        Intrinsics.X0O(r7, "mImageBuffers");
        this.mTime = r2;
        this.mGiftsType = r4;
        this.mGiftsId = r5;
        this.mGiftsName = r6;
        this.mImageBuffers = r7;
    }

    public /* synthetic */ BleCPGifts(long r8, int r10, int r11, String r12, byte[][] r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L5;
        r8 = 0;
    L5:
        long r1 = r8;
        if ((r14 & 2) == 0) goto L8;
        int r3 = 0;
    L10:
        if ((r14 & 4) == 0) goto L12;
        int r4 = 0;
    L14:
        if ((r14 & 8) == 0) goto L16;
        r12 = "";
    L16:
        String r5 = r12;
        if ((r14 & 16) == 0) goto L19;
        r13 = new byte[0][];
    L19:
        this(r1, r3, r4, r5, r13);
        return;
    L12:
        r4 = r11;
        goto L14
    L8:
        r3 = r10;
        goto L10
    }
}
