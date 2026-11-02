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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 12;
    private int mSportId;
    private int mSportMode;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BleLaunchDeviceSport() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BleLaunchDeviceSport copy$default(BleLaunchDeviceSport bleLaunchDeviceSport, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleLaunchDeviceSport.mSportId;
        }
        if ((i3 & 2) != 0) {
            i2 = bleLaunchDeviceSport.mSportMode;
        }
        return bleLaunchDeviceSport.copy(i, i2);
    }

    public final int component1() {
        return this.mSportId;
    }

    public final int component2() {
        return this.mSportMode;
    }

    @aa1
    public final BleLaunchDeviceSport copy(int i, int i2) {
        return new BleLaunchDeviceSport(i, i2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        int i = this.mSportId;
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt32(i, LITTLE_ENDIAN);
        int i2 = this.mSportMode;
        Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        writeInt16(i2, LITTLE_ENDIAN);
        BleWritable.writeBytes$default(this, new byte[6], null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLaunchDeviceSport)) {
            return false;
        }
        BleLaunchDeviceSport bleLaunchDeviceSport = (BleLaunchDeviceSport) obj;
        return this.mSportId == bleLaunchDeviceSport.mSportId && this.mSportMode == bleLaunchDeviceSport.mSportMode;
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

    public final void setMSportId(int i) {
        this.mSportId = i;
    }

    public final void setMSportMode(int i) {
        this.mSportMode = i;
    }

    @aa1
    public String toString() {
        return "BleLaunchDeviceSport(mSportId=" + this.mSportId + ", mSportMode=" + this.mSportMode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLaunchDeviceSport(int i, int i2) {
        this.mSportId = i;
        this.mSportMode = i2;
    }

    public /* synthetic */ BleLaunchDeviceSport(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
