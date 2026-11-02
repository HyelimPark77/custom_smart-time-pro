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
    public static final Companion Companion = new Companion(null);
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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleDeviceFile() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    public static /* synthetic */ BleDeviceFile copy$default(BleDeviceFile bleDeviceFile, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = bleDeviceFile.mFileType;
        }
        if ((i7 & 2) != 0) {
            i2 = bleDeviceFile.mTime;
        }
        if ((i7 & 4) != 0) {
            i3 = bleDeviceFile.mIndex;
        }
        if ((i7 & 8) != 0) {
            i4 = bleDeviceFile.mFileFormat;
        }
        if ((i7 & 16) != 0) {
            i5 = bleDeviceFile.mFileSize;
        }
        if ((i7 & 32) != 0) {
            i6 = bleDeviceFile.mOffsetValue;
        }
        if ((i7 & 64) != 0) {
            bArr = bleDeviceFile.mFileContent;
        }
        int i8 = i6;
        byte[] bArr2 = bArr;
        int i9 = i5;
        int i10 = i3;
        return bleDeviceFile.copy(i, i2, i10, i4, i9, i8, bArr2);
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
    public final BleDeviceFile copy(int i, int i2, int i3, int i4, int i5, int i6, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        return new BleDeviceFile(i, i2, i3, i4, i5, i6, mFileContent);
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
        byte[] mBytes = getMBytes();
        Intrinsics.XXI(mBytes);
        if (mBytes.length > 18) {
            byte[] mBytes2 = getMBytes();
            Intrinsics.XXI(mBytes2);
            this.mFileContent = readBytes(mBytes2.length - 18);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceFile)) {
            return false;
        }
        BleDeviceFile bleDeviceFile = (BleDeviceFile) obj;
        return this.mFileType == bleDeviceFile.mFileType && this.mTime == bleDeviceFile.mTime && this.mIndex == bleDeviceFile.mIndex && this.mFileFormat == bleDeviceFile.mFileFormat && this.mFileSize == bleDeviceFile.mFileSize && this.mOffsetValue == bleDeviceFile.mOffsetValue && Intrinsics.XOO0ii0(this.mFileContent, bleDeviceFile.mFileContent);
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

    public final void setMFileContent(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mFileContent = bArr;
    }

    public final void setMFileFormat(int i) {
        this.mFileFormat = i;
    }

    public final void setMFileSize(int i) {
        this.mFileSize = i;
    }

    public final void setMFileType(int i) {
        this.mFileType = i;
    }

    public final void setMIndex(int i) {
        this.mIndex = i;
    }

    public final void setMOffsetValue(int i) {
        this.mOffsetValue = i;
    }

    public final void setMTime(int i) {
        this.mTime = i;
    }

    @aa1
    public String toString() {
        return "BleDeviceFile(mFileType=" + this.mFileType + ", mTime=" + this.mTime + ", mIndex=" + this.mIndex + ", mFileFormat=" + this.mFileFormat + ", mFileSize=" + this.mFileSize + ", mOffsetValue=" + this.mOffsetValue + ", mFileContent=" + Arrays.toString(this.mFileContent) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleDeviceFile(int i, int i2, int i3, int i4, int i5, int i6, @aa1 byte[] mFileContent) {
        Intrinsics.X0O(mFileContent, "mFileContent");
        this.mFileType = i;
        this.mTime = i2;
        this.mIndex = i3;
        this.mFileFormat = i4;
        this.mFileSize = i5;
        this.mOffsetValue = i6;
        this.mFileContent = mFileContent;
    }

    public /* synthetic */ BleDeviceFile(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? new byte[0] : bArr);
    }
}
