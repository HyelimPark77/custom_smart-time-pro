package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.BleKey;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleStream {

    @aa1
    private final BleKey mBleKey;

    @aa1
    private final byte[] mData;
    private final int mType;

    public BleStream(@aa1 BleKey r2, int r3, @aa1 byte[] r4) {
        Intrinsics.X0O(r2, "mBleKey");
        Intrinsics.X0O(r4, "mData");
        this.mBleKey = r2;
        this.mType = r3;
        this.mData = r4;
    }

    @aa1
    public final BleKey getMBleKey() {
        return this.mBleKey;
    }

    @tb1
    public final BleStreamPacket getPacket(int r9, long r10) {
        byte[] r0 = this.mData;
        if (r9 < r0.length) goto L6;
        return null;
    L6:
        long r4 = r9;
        long r11 = r10 + r4;
        if (r11 <= r0.length) goto L10;
        int r1 = this.mType;
        byte[] r12 = this.mData;
        return new BleStreamPacket(r1, r12.length, r4, ArraysKt___ArraysJvmKt.I0IIOI(r12, r9, r12.length));
    L10:
        int r2 = this.mType;
        byte[] r3 = this.mData;
        return new BleStreamPacket(r2, r3.length, r4, ArraysKt___ArraysJvmKt.I0IIOI(r3, r9, (int) r11));
    }
}
