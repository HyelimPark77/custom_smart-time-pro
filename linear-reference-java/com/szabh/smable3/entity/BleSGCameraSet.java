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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 5;
    private int mRecordLocation;
    private int mVideoDuration;
    private int mVideoOrientation;

    @aa1
    private BleIPCSupport.VideoResolution mVideoResolution;

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

    public BleSGCameraSet() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        BleIPCSupport.VideoResolution r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleSGCameraSet copy$default(BleSGCameraSet r0, int r1, int r2, int r3, BleIPCSupport.VideoResolution r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mVideoDuration;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mVideoOrientation;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mRecordLocation;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mVideoResolution;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleSGCameraSet copy(int r2, int r3, int r4, @aa1 BleIPCSupport.VideoResolution r5) {
        Intrinsics.X0O(r5, "mVideoResolution");
        return new BleSGCameraSet(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");
        this.mVideoDuration = readInt16(r0);
        this.mVideoOrientation = readUInt8();
        this.mRecordLocation = readUInt8();
        this.mVideoResolution = BleIPCSupport.VideoResolution.Companion.of(readUInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mVideoDuration;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r0, r1);
        writeInt8(this.mVideoOrientation);
        writeInt8(this.mRecordLocation);
        writeInt8(this.mVideoResolution.getValue());
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSGCameraSet) == true) goto L8;
        return false;
    L8:
        BleSGCameraSet r6 = (BleSGCameraSet) r5;
        if (this.mVideoDuration == r6.mVideoDuration) goto L12;
        return false;
    L12:
        if (this.mVideoOrientation == r6.mVideoOrientation) goto L15;
        return false;
    L15:
        if (this.mRecordLocation == r6.mRecordLocation) goto L18;
        return false;
    L18:
        if (this.mVideoResolution == r6.mVideoResolution) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMRecordLocation(int r1) {
        this.mRecordLocation = r1;
    }

    public final void setMVideoDuration(int r1) {
        this.mVideoDuration = r1;
    }

    public final void setMVideoOrientation(int r1) {
        this.mVideoOrientation = r1;
    }

    public final void setMVideoResolution(@aa1 BleIPCSupport.VideoResolution r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mVideoResolution = r2;
    }

    @aa1
    public String toString() {
        return "BleSGCameraSet(mVideoDuration=" + this.mVideoDuration + ", mVideoOrientation=" + this.mVideoOrientation + ", mRecordLocation=" + this.mRecordLocation + ", mVideoResolution=" + this.mVideoResolution + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGCameraSet(int r2, int r3, int r4, @aa1 BleIPCSupport.VideoResolution r5) {
        Intrinsics.X0O(r5, "mVideoResolution");
        this.mVideoDuration = r2;
        this.mVideoOrientation = r3;
        this.mRecordLocation = r4;
        this.mVideoResolution = r5;
    }

    public /* synthetic */ BleSGCameraSet(int r2, int r3, int r4, BleIPCSupport.VideoResolution r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = BleIPCSupport.VideoResolution.VR_100WP25;
    L14:
        this(r2, r3, r4, r5);
    }
}
