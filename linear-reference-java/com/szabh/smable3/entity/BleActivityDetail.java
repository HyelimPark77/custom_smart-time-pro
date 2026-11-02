package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleActivityDetail extends BleReadable {

    @aa1
    public static final Companion Companion = null;
    public static final int TYPE_CAL = 1;
    public static final int TYPE_DISTANCE = 2;
    public static final int TYPE_STEP = 0;

    @aa1
    private List<Integer> mList;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleActivityDetail() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleActivityDetail copy$default(BleActivityDetail r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mList;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mList;
    }

    @aa1
    public final BleActivityDetail copy(int r2, @aa1 List<Integer> r3) {
        Intrinsics.X0O(r3, "mList");
        return new BleActivityDetail(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= 24) goto L6;
        ByteOrder r2 = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.O10IXXX0X(r2, "LITTLE_ENDIAN");
        r0.add(Integer.valueOf(readUInt16(r2)));
        r1 = r1 + 1;
        goto L4
    L6:
        this.mList = r0;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleActivityDetail) == true) goto L8;
        return false;
    L8:
        BleActivityDetail r6 = (BleActivityDetail) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final List<Integer> getMList() {
        return this.mList;
    }

    public final int getMType() {
        return this.mType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mType) * 31) + this.mList.hashCode();
    }

    public final void setMList(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    @aa1
    public String toString() {
        return "BleActivityDetail(mType=" + this.mType + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleActivityDetail(int r2, @aa1 List<Integer> r3) {
        Intrinsics.X0O(r3, "mList");
        this.mType = r2;
        this.mList = r3;
    }

    public /* synthetic */ BleActivityDetail(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = CollectionsKt__CollectionsKt.iI();
    L8:
        this(r1, r2);
    }
}
