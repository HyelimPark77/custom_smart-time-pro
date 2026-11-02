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
    public static /* synthetic */ BleMapFileList copy$default(BleMapFileList r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<String> component1() {
        return this.mList;
    }

    @aa1
    public final BleMapFileList copy(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "mList");
        return new BleMapFileList(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
        if (r0 <= 0) goto L6;
    L4:
        String r1 = BleReadable.readString$default(this, r0, null, 2, null);
        this.mList.add(r1);
        r0 = readUInt8();
        if (r0 > 0) goto L4;
        return;
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleMapFileList) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mList, ((BleMapFileList) r4).mList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<String> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleMapFileList(mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleMapFileList(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "mList");
        this.mList = r2;
    }

    public /* synthetic */ BleMapFileList(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
