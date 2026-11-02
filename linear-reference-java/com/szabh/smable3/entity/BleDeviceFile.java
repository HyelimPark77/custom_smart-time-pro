package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleDeviceFile extends BleReadable {
    public static final int AUDIO = 0;
    public static final int BIN = 2;
    public static final int BMP = 3;

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_AUDIO = 0;
    public static final int TYPE_BIN = 1;
    public static final int TYPE_IMG = 2;
    public static final int TYPE_INFO = 3;
    public static final int WAV = 1;

    @aa1
    private byte[] mFileContent;
    private int mFileFormat;
    private int mFileSize;
    private int mFileType;
    private int mIndex;
    private int mOffsetValue;
    private int mTime;

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

    public BleDeviceFile() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        byte[] r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    public static /* synthetic */ BleDeviceFile copy$default(BleDeviceFile r0, int r1, int r2, int r3, int r4, int r5, int r6, byte[] r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.mFileType;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.mTime;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.mIndex;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.mFileFormat;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.mFileSize;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.mOffsetValue;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.mFileContent;
    L23:
        int r10 = r6;
        byte[] r11 = r7;
        int r12 = r4;
        int r13 = r5;
        int r14 = r3;
        int r15 = r1;
        return r0.copy(r15, r2, r14, r12, r13, r10, r11);
    }

    public final int component1() {
        return this.mFileType;
    }

    public final int component2() {
        return this.mTime;
    }

    public final int component3() {
        return this.mIndex;
    }

    public final int component4() {
        return this.mFileFormat;
    }

    public final int component5() {
        return this.mFileSize;
    }

    public final int component6() {
        return this.mOffsetValue;
    }

    @aa1
    public final byte[] component7() {
        return this.mFileContent;
    }

    @aa1
    public final BleDeviceFile copy(int r10, int r11, int r12, int r13, int r14, int r15, @aa1 byte[] r16) {
        Intrinsics.X0O(r16, "mFileContent");
        return new BleDeviceFile(r10, r11, r12, r13, r14, r15, r16);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mFileType = readInt8();
        this.mTime = BleReadable.readInt32$default(this, null, 1, null);
        this.mIndex = BleReadable.readInt32$default(this, null, 1, null);
        this.mFileFormat = readInt8();
        this.mFileSize = BleReadable.readInt32$default(this, null, 1, null);
        this.mOffsetValue = BleReadable.readInt32$default(this, null, 1, null);
        byte[] r0 = getMBytes();
        Intrinsics.XXI(r0);
        if (r0.length <= 18) goto L6;
        byte[] r1 = getMBytes();
        Intrinsics.XXI(r1);
        this.mFileContent = readBytes(r1.length - 18);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleDeviceFile) == true) goto L8;
        return false;
    L8:
        BleDeviceFile r6 = (BleDeviceFile) r5;
        if (this.mFileType == r6.mFileType) goto L12;
        return false;
    L12:
        if (this.mTime == r6.mTime) goto L15;
        return false;
    L15:
        if (this.mIndex == r6.mIndex) goto L18;
        return false;
    L18:
        if (this.mFileFormat == r6.mFileFormat) goto L21;
        return false;
    L21:
        if (this.mFileSize == r6.mFileSize) goto L24;
        return false;
    L24:
        if (this.mOffsetValue == r6.mOffsetValue) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mFileContent, r6.mFileContent) == true) goto L29;
        return false;
    L29:
        return true;
    }

    @aa1
    public final byte[] getMFileContent() {
        return this.mFileContent;
    }

    public final int getMFileFormat() {
        return this.mFileFormat;
    }

    public final int getMFileSize() {
        return this.mFileSize;
    }

    public final int getMFileType() {
        return this.mFileType;
    }

    public final int getMIndex() {
        return this.mIndex;
    }

    public final int getMOffsetValue() {
        return this.mOffsetValue;
    }

    public final int getMTime() {
        return this.mTime;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.mFileType) * 31) + Integer.hashCode(this.mTime)) * 31) + Integer.hashCode(this.mIndex)) * 31) + Integer.hashCode(this.mFileFormat)) * 31) + Integer.hashCode(this.mFileSize)) * 31) + Integer.hashCode(this.mOffsetValue)) * 31) + Arrays.hashCode(this.mFileContent);
    }

    public final void setMFileContent(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileContent = r2;
    }

    public final void setMFileFormat(int r1) {
        this.mFileFormat = r1;
    }

    public final void setMFileSize(int r1) {
        this.mFileSize = r1;
    }

    public final void setMFileType(int r1) {
        this.mFileType = r1;
    }

    public final void setMIndex(int r1) {
        this.mIndex = r1;
    }

    public final void setMOffsetValue(int r1) {
        this.mOffsetValue = r1;
    }

    public final void setMTime(int r1) {
        this.mTime = r1;
    }

    @aa1
    public String toString() {
        return "BleDeviceFile(mFileType=" + this.mFileType + ", mTime=" + this.mTime + ", mIndex=" + this.mIndex + ", mFileFormat=" + this.mFileFormat + ", mFileSize=" + this.mFileSize + ", mOffsetValue=" + this.mOffsetValue + ", mFileContent=" + Arrays.toString(this.mFileContent) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceFile(int r2, int r3, int r4, int r5, int r6, int r7, @aa1 byte[] r8) {
        Intrinsics.X0O(r8, "mFileContent");
        this.mFileType = r2;
        this.mTime = r3;
        this.mIndex = r4;
        this.mFileFormat = r5;
        this.mFileSize = r6;
        this.mOffsetValue = r7;
        this.mFileContent = r8;
    }

    public /* synthetic */ BleDeviceFile(int r2, int r3, int r4, int r5, int r6, int r7, byte[] r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = new byte[0];
    L23:
        byte[] r11 = r8;
        int r12 = r7;
        int r13 = r6;
        int r14 = r5;
        int r15 = r4;
        this(r2, r3, r15, r14, r13, r12, r11);
    }
}
