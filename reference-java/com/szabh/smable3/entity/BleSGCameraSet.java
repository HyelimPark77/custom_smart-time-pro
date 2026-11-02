package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGCameraSet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 5;
    private int mRecordLocation;
    private int mVideoDuration;
    private int mVideoOrientation;

    @aa1
    private BleIPCSupport.VideoResolution mVideoResolution;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSGCameraSet() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ BleSGCameraSet copy$default(BleSGCameraSet bleSGCameraSet, int i, int i2, int i3, BleIPCSupport.VideoResolution videoResolution, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = bleSGCameraSet.mVideoDuration;
        }
        if ((i4 & 2) != 0) {
            i2 = bleSGCameraSet.mVideoOrientation;
        }
        if ((i4 & 4) != 0) {
            i3 = bleSGCameraSet.mRecordLocation;
        }
        if ((i4 & 8) != 0) {
            videoResolution = bleSGCameraSet.mVideoResolution;
        }
        return bleSGCameraSet.copy(i, i2, i3, videoResolution);
    }

    public final int component1() {
        return this.mVideoDuration;
    }

    public final int component2() {
        return this.mVideoOrientation;
    }

    public final int component3() {
        return this.mRecordLocation;
    }

    @aa1
    public final BleIPCSupport.VideoResolution component4() {
        return this.mVideoResolution;
    }

    @aa1
    public final BleSGCameraSet copy(int i, int i2, int i3, @aa1 BleIPCSupport.VideoResolution mVideoResolution) {
        Intrinsics.X0O(mVideoResolution, "mVideoResolution");
        return new BleSGCameraSet(i, i2, i3, mVideoResolution);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        this.mVideoDuration = readInt16(LITTLE_ENDIAN);
        this.mVideoOrientation = readUInt8();
        this.mRecordLocation = readUInt8();
        this.mVideoResolution = BleIPCSupport.VideoResolution.Companion.m39003of(readUInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.mVideoDuration;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i, LITTLE_ENDIAN);
        writeInt8(this.mVideoOrientation);
        writeInt8(this.mRecordLocation);
        writeInt8(this.mVideoResolution.getValue());
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSGCameraSet)) {
            return false;
        }
        BleSGCameraSet bleSGCameraSet = (BleSGCameraSet) obj;
        return this.mVideoDuration == bleSGCameraSet.mVideoDuration && this.mVideoOrientation == bleSGCameraSet.mVideoOrientation && this.mRecordLocation == bleSGCameraSet.mRecordLocation && this.mVideoResolution == bleSGCameraSet.mVideoResolution;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 5;
    }

    public final int getMRecordLocation() {
        return this.mRecordLocation;
    }

    public final int getMVideoDuration() {
        return this.mVideoDuration;
    }

    public final int getMVideoOrientation() {
        return this.mVideoOrientation;
    }

    @aa1
    public final BleIPCSupport.VideoResolution getMVideoResolution() {
        return this.mVideoResolution;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mVideoDuration) * 31) + Integer.hashCode(this.mVideoOrientation)) * 31) + Integer.hashCode(this.mRecordLocation)) * 31) + this.mVideoResolution.hashCode();
    }

    public final void setMRecordLocation(int i) {
        this.mRecordLocation = i;
    }

    public final void setMVideoDuration(int i) {
        this.mVideoDuration = i;
    }

    public final void setMVideoOrientation(int i) {
        this.mVideoOrientation = i;
    }

    public final void setMVideoResolution(@aa1 BleIPCSupport.VideoResolution videoResolution) {
        Intrinsics.X0O(videoResolution, "<set-?>");
        this.mVideoResolution = videoResolution;
    }

    @aa1
    public String toString() {
        return "BleSGCameraSet(mVideoDuration=" + this.mVideoDuration + ", mVideoOrientation=" + this.mVideoOrientation + ", mRecordLocation=" + this.mRecordLocation + ", mVideoResolution=" + this.mVideoResolution + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGCameraSet(int i, int i2, int i3, @aa1 BleIPCSupport.VideoResolution mVideoResolution) {
        Intrinsics.X0O(mVideoResolution, "mVideoResolution");
        this.mVideoDuration = i;
        this.mVideoOrientation = i2;
        this.mRecordLocation = i3;
        this.mVideoResolution = mVideoResolution;
    }

    public /* synthetic */ BleSGCameraSet(int i, int i2, int i3, BleIPCSupport.VideoResolution videoResolution, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? BleIPCSupport.VideoResolution.VR_100WP25 : videoResolution);
    }
}
