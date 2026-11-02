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

    public BleStream(@aa1 BleKey mBleKey, int i, @aa1 byte[] mData) {
        Intrinsics.X0O(mBleKey, "mBleKey");
        Intrinsics.X0O(mData, "mData");
        this.mBleKey = mBleKey;
        this.mType = i;
        this.mData = mData;
    }

    @aa1
    public final BleKey getMBleKey() {
        return this.mBleKey;
    }

    @tb1
    public final BleStreamPacket getPacket(int i, long j) {
        byte[] bArr = this.mData;
        if (i >= bArr.length) {
            return null;
        }
        long j2 = i;
        long j3 = j + j2;
        if (j3 > bArr.length) {
            int i2 = this.mType;
            byte[] bArr2 = this.mData;
            return new BleStreamPacket(i2, bArr2.length, j2, ArraysKt___ArraysJvmKt.I0IIOI(bArr2, i, bArr2.length));
        }
        int i3 = this.mType;
        byte[] bArr3 = this.mData;
        return new BleStreamPacket(i3, bArr3.length, j2, ArraysKt___ArraysJvmKt.I0IIOI(bArr3, i, (int) j3));
    }
}
