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
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_CAL = 1;
    public static final int TYPE_DISTANCE = 2;
    public static final int TYPE_STEP = 0;

    @aa1
    private List<Integer> mList;
    private int mType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleActivityDetail() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleActivityDetail copy$default(BleActivityDetail bleActivityDetail, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleActivityDetail.mType;
        }
        if ((i2 & 2) != 0) {
            list = bleActivityDetail.mList;
        }
        return bleActivityDetail.copy(i, list);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mList;
    }

    @aa1
    public final BleActivityDetail copy(int i, @aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleActivityDetail(i, mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readUInt8();
        BleReadable.readInt24$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 24; i++) {
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            arrayList.add(Integer.valueOf(readUInt16(LITTLE_ENDIAN)));
        }
        this.mList = arrayList;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleActivityDetail)) {
            return false;
        }
        BleActivityDetail bleActivityDetail = (BleActivityDetail) obj;
        return this.mType == bleActivityDetail.mType && Intrinsics.XOO0ii0(this.mList, bleActivityDetail.mList);
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

    public final void setMList(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    @aa1
    public String toString() {
        return "BleActivityDetail(mType=" + this.mType + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleActivityDetail(int i, @aa1 List<Integer> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mType = i;
        this.mList = mList;
    }

    public /* synthetic */ BleActivityDetail(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list);
    }
}
