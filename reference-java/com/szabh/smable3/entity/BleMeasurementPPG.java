package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleMeasurementPPG extends BleReadable {

    @aa1
    private List<Integer> mPpgData;

    /* JADX WARN: Multi-variable type inference failed */
    public BleMeasurementPPG() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMeasurementPPG copy$default(BleMeasurementPPG bleMeasurementPPG, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleMeasurementPPG.mPpgData;
        }
        return bleMeasurementPPG.copy(list);
    }

    @aa1
    public final List<Integer> component1() {
        return this.mPpgData;
    }

    @aa1
    public final BleMeasurementPPG copy(@aa1 List<Integer> mPpgData) {
        Intrinsics.X0O(mPpgData, "mPpgData");
        return new BleMeasurementPPG(mPpgData);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        try {
            byte[] mBytes = getMBytes();
            int length = (mBytes != null ? mBytes.length : 0) / 4;
            for (int i = 0; i < length; i++) {
                List<Integer> list = this.mPpgData;
                ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
                Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
                list.add(Integer.valueOf(readInt32(LITTLE_ENDIAN)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleMeasurementPPG) && Intrinsics.XOO0ii0(this.mPpgData, ((BleMeasurementPPG) obj).mPpgData);
    }

    @aa1
    public final List<Integer> getMPpgData() {
        return this.mPpgData;
    }

    public int hashCode() {
        return this.mPpgData.hashCode();
    }

    public final void setMPpgData(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mPpgData = list;
    }

    @aa1
    public String toString() {
        return "BleMeasurementPPG(mSize=" + this.mPpgData.size() + ", mPpgData=" + this.mPpgData + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMeasurementPPG(@aa1 List<Integer> mPpgData) {
        Intrinsics.X0O(mPpgData, "mPpgData");
        this.mPpgData = mPpgData;
    }

    public /* synthetic */ BleMeasurementPPG(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
