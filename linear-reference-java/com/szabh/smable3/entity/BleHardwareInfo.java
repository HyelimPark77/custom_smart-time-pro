package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleHardwareInfo extends BleReadable {

    @aa1
    private List<BleHardwareDevice> mDeviceTypeList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleHardwareInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleHardwareInfo copy$default(BleHardwareInfo r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mDeviceTypeList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<BleHardwareDevice> component1() {
        return this.mDeviceTypeList;
    }

    @aa1
    public final BleHardwareInfo copy(@aa1 List<BleHardwareDevice> r2) {
        Intrinsics.X0O(r2, "mDeviceTypeList");
        return new BleHardwareInfo(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();     // Catch: Exception -> L8
        if (r0 <= 0) goto L15;
    L5:
        this.mDeviceTypeList.add(new BleHardwareDevice(r0, readUInt8(), readUInt8(), readBytes(r0 - 2)));     // Catch: Exception -> L8
        r0 = readUInt8();     // Catch: Exception -> L8
        if (r0 > 0) goto L5;
        return;
    L15:
        return;
    L8:
        e = move-exception;
        e.printStackTrace();
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleHardwareInfo) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mDeviceTypeList, ((BleHardwareInfo) r4).mDeviceTypeList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<BleHardwareDevice> getMDeviceTypeList() {
        return this.mDeviceTypeList;
    }

    public int hashCode() {
        return this.mDeviceTypeList.hashCode();
    }

    public final void setMDeviceTypeList(@aa1 List<BleHardwareDevice> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDeviceTypeList = r2;
    }

    @aa1
    public String toString() {
        return "BleHardwareInfo(mDeviceTypeList=" + this.mDeviceTypeList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHardwareInfo(@aa1 List<BleHardwareDevice> r2) {
        Intrinsics.X0O(r2, "mDeviceTypeList");
        this.mDeviceTypeList = r2;
    }

    public /* synthetic */ BleHardwareInfo(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
