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
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mIds.clear();
        byte r0 = readInt8();
        this.mCount = r0;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.mIds.add(Integer.valueOf(readInt8()));
        r1 = r1 + 1;
        goto L3
    }

    public final int getMCount() {
        return this.mCount;
    }

    @aa1
    public final List<Integer> getMIds() {
        return this.mIds;
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMIds(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIds = r2;
    }

    @aa1
    public String toString() {
        return "BleCoachingIds(mCount=" + this.mCount + ", mIds=" + this.mIds + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleCoachingIds(int r2, @aa1 List<Integer> r3) {
        Intrinsics.X0O(r3, "mIds");
        this.mCount = r2;
        this.mIds = r3;
    }

    public /* synthetic */ BleCoachingIds(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
