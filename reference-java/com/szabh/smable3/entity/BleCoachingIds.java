package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleCoachingIds extends BleReadable {
    private int mCount;

    @aa1
    private List<Integer> mIds;

    /* JADX WARN: Multi-variable type inference failed */
    public BleCoachingIds() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mIds.clear();
        byte int8 = readInt8();
        this.mCount = int8;
        for (int i = 0; i < int8; i++) {
            this.mIds.add(Integer.valueOf(readInt8()));
        }
    }

    public final int getMCount() {
        return this.mCount;
    }

    @aa1
    public final List<Integer> getMIds() {
        return this.mIds;
    }

    public final void setMCount(int i) {
        this.mCount = i;
    }

    public final void setMIds(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mIds = list;
    }

    @aa1
    public String toString() {
        return "BleCoachingIds(mCount=" + this.mCount + ", mIds=" + this.mIds + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCoachingIds(int i, @aa1 List<Integer> mIds) {
        Intrinsics.X0O(mIds, "mIds");
        this.mCount = i;
        this.mIds = mIds;
    }

    public /* synthetic */ BleCoachingIds(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
