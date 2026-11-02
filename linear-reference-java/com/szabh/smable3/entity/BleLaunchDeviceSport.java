package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLaunchDeviceSport extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 12;
    private int mSportId;
    private int mSportMode;

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

    public BleLaunchDeviceSport() {
        int r2 = 0;
        this(r2, r2, 3, null);
    }

    public static /* synthetic */ BleLaunchDeviceSport copy$default(BleLaunchDeviceSport r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mSportId;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mSportMode;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mSportId;
    }

    public final int component2() {
        return this.mSportMode;
    }

    @aa1
    public final BleLaunchDeviceSport copy(int r2, int r3) {
        return new BleLaunchDeviceSport(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int r0 = this.mSportId;
        ByteOrder r1 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt32(r0, r1);
        int r2 = this.mSportMode;
        Intrinsics.O10IXXX0X(r1, "LITTLE_ENDIAN");
        writeInt16(r2, r1);
        BleWritable.writeBytes$default(this, new byte[6], null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleLaunchDeviceSport) == true) goto L8;
        return false;
    L8:
        BleLaunchDeviceSport r6 = (BleLaunchDeviceSport) r5;
        if (this.mSportId == r6.mSportId) goto L12;
        return false;
    L12:
        if (this.mSportMode == r6.mSportMode) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 12;
    }

    public final int getMSportId() {
        return this.mSportId;
    }

    public final int getMSportMode() {
        return this.mSportMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mSportId) * 31) + Integer.hashCode(this.mSportMode);
    }

    public final void setMSportId(int r1) {
        this.mSportId = r1;
    }

    public final void setMSportMode(int r1) {
        this.mSportMode = r1;
    }

    @aa1
    public String toString() {
        return "BleLaunchDeviceSport(mSportId=" + this.mSportId + ", mSportMode=" + this.mSportMode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLaunchDeviceSport(int r1, int r2) {
        this.mSportId = r1;
        this.mSportMode = r2;
    }

    public /* synthetic */ BleLaunchDeviceSport(int r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0;
    L8:
        this(r2, r3);
    }
}
