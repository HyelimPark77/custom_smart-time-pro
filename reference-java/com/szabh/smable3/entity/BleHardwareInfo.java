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
    public static /* synthetic */ BleHardwareInfo copy$default(BleHardwareInfo bleHardwareInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleHardwareInfo.mDeviceTypeList;
        }
        return bleHardwareInfo.copy(list);
    }

    @aa1
    public final List<BleHardwareDevice> component1() {
        return this.mDeviceTypeList;
    }

    @aa1
    public final BleHardwareInfo copy(@aa1 List<BleHardwareDevice> mDeviceTypeList) {
        Intrinsics.X0O(mDeviceTypeList, "mDeviceTypeList");
        return new BleHardwareInfo(mDeviceTypeList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        try {
            char uInt8 = readUInt8();
            if (uInt8 > 0) {
                do {
                    this.mDeviceTypeList.add(new BleHardwareDevice(uInt8, readUInt8(), readUInt8(), readBytes(uInt8 - 2)));
                    uInt8 = readUInt8();
                } while (uInt8 > 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleHardwareInfo) && Intrinsics.XOO0ii0(this.mDeviceTypeList, ((BleHardwareInfo) obj).mDeviceTypeList);
    }

    @aa1
    public final List<BleHardwareDevice> getMDeviceTypeList() {
        return this.mDeviceTypeList;
    }

    public int hashCode() {
        return this.mDeviceTypeList.hashCode();
    }

    public final void setMDeviceTypeList(@aa1 List<BleHardwareDevice> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mDeviceTypeList = list;
    }

    @aa1
    public String toString() {
        return "BleHardwareInfo(mDeviceTypeList=" + this.mDeviceTypeList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleHardwareInfo(@aa1 List<BleHardwareDevice> mDeviceTypeList) {
        Intrinsics.X0O(mDeviceTypeList, "mDeviceTypeList");
        this.mDeviceTypeList = mDeviceTypeList;
    }

    public /* synthetic */ BleHardwareInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
