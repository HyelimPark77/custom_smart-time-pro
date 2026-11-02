package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleAppStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAppStore.kt\ncom/szabh/smable3/entity/BleAppInfoList\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,174:1\n232#2,3:175\n222#2,15:178\n*S KotlinDebug\n*F\n+ 1 BleAppStore.kt\ncom/szabh/smable3/entity/BleAppInfoList\n*L\n106#1:175,3\n106#1:178,15\n*E\n"})
public final class BleAppInfoList extends BleReadable {
    private int mAppInfoLength;

    @aa1
    private List<BleAppInfo> mList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleAppInfoList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAppInfoList copy$default(BleAppInfoList bleAppInfoList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bleAppInfoList.mList;
        }
        return bleAppInfoList.copy(list);
    }

    @aa1
    public final List<BleAppInfo> component1() {
        return this.mList;
    }

    @aa1
    public final BleAppInfoList copy(@aa1 List<BleAppInfo> mList) {
        Intrinsics.X0O(mList, "mList");
        return new BleAppInfoList(mList);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        try {
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            this.mAppInfoLength = readInt32(LITTLE_ENDIAN);
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            int length = mBytes.length - 4;
            int i = this.mAppInfoLength;
            int i2 = length / i;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                BleReadable bleReadable = (BleReadable) BleAppInfo.class.newInstance();
                bleReadable.setMBytes(readBytes(i));
                bleReadable.decode();
                Intrinsics.XXI(bleReadable);
                arrayList.add(bleReadable);
            }
            this.mList = arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleAppInfoList) && Intrinsics.XOO0ii0(this.mList, ((BleAppInfoList) obj).mList);
    }

    @aa1
    public final List<BleAppInfo> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<BleAppInfo> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mList = list;
    }

    @aa1
    public String toString() {
        return "BleAppInfoList(mSize=" + this.mList.size() + ", mAppInfoLength=" + this.mAppInfoLength + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppInfoList(@aa1 List<BleAppInfo> mList) {
        Intrinsics.X0O(mList, "mList");
        this.mList = mList;
    }

    public /* synthetic */ BleAppInfoList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
