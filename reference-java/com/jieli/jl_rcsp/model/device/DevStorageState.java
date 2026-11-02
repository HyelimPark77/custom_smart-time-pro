package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DevStorageState {
    private int handle;
    private int index;
    private boolean isOnline;

    public int getHandle() {
        return this.handle;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public int parseData(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        setOnline(CHexConver.byteToInt(bArr[0]) == 1);
        this.index = CHexConver.byteToInt(bArr[1]);
        if (!this.isOnline || bArr.length < 6) {
            return 2;
        }
        setHandle(CHexConver.bytesToInt(bArr, 2, 4));
        return 6;
    }

    public DevStorageState setHandle(int i) {
        this.handle = i;
        return this;
    }

    public DevStorageState setIndex(int i) {
        this.index = i;
        return this;
    }

    public DevStorageState setOnline(boolean z) {
        this.isOnline = z;
        return this;
    }

    public String toString() {
        return "DevStorageState{isOnline=" + this.isOnline + ", index=" + this.index + ", handle=" + this.handle + i0XO1.f7442IO;
    }
}
