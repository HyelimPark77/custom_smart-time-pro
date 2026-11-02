package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class DevStorageState {
    private int handle;
    private int index;
    private boolean isOnline;

    public DevStorageState() {
    }

    public int getHandle() {
        return this.handle;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isOnline() {
        return this.isOnline;
    }

    public int parseData(byte[] r5) {
        boolean r0 = false;
        if (r5 != null) goto L5;
    L17:
        return 0;
    L5:
        if (r5.length < 2) goto L17;
        if (CHexConver.byteToInt(r5[0]) != 1) goto L10;
        r0 = true;
    L10:
        setOnline(r0);
        this.index = CHexConver.byteToInt(r5[1]);
        if (this.isOnline == true) goto L13;
    L16:
        return 2;
    L13:
        if (r5.length < 6) goto L16;
        setHandle(CHexConver.bytesToInt(r5, 2, 4));
        return 6;
    }

    public DevStorageState setHandle(int r1) {
        this.handle = r1;
        return this;
    }

    public DevStorageState setIndex(int r1) {
        this.index = r1;
        return this;
    }

    public DevStorageState setOnline(boolean r1) {
        this.isOnline = r1;
        return this;
    }

    public String toString() {
        return "DevStorageState{isOnline=" + this.isOnline + ", index=" + this.index + ", handle=" + this.handle + i0XO1.IO;
    }
}
