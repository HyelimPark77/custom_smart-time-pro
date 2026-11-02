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
public final class BleMapFileList extends BleReadable {

    @aa1
    private List<String> mList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleMapFileList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMapFileList copy$default(BleMapFileList bleMapFileList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleMapFileList.mList;
        }
        return bleMapFileList.copy(list);
    }

    @aa1
    public final List<String> component1() {
        return this.mList;
    }

    @aa1
    public final BleMapFileList copy(@aa1 List<String> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleMapFileList(mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        if (uInt8 > 0) {
            do {
                this.mList.add(BleReadable.readString$default(this, uInt8, null, 2, null));
                uInt8 = readUInt8();
            } while (uInt8 > 0);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleMapFileList) && Intrinsics.XOO0ii0(this.mList, ((BleMapFileList) obj).mList);
    }

    @aa1
    public final List<String> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<String> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    @aa1
    public String toString() {
        return "BleMapFileList(mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMapFileList(@aa1 List<String> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mList = mList;
    }

    public /* synthetic */ BleMapFileList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
