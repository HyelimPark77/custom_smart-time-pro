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
    public static /* synthetic */ BleAppInfoList copy$default(BleAppInfoList r0, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mList;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final List<BleAppInfo> component1() {
        return this.mList;
    }

    @aa1
    public final BleAppInfoList copy(@aa1 List<BleAppInfo> r2) {
        Intrinsics.X0O(r2, "mList");
        return new BleAppInfoList(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;     // Catch: Exception -> L6
        Intrinsics.O10IXXX0X(r0, "LITTLE_ENDIAN");     // Catch: Exception -> L6
        this.mAppInfoLength = readInt32(r0);     // Catch: Exception -> L6
        byte[] r1 = getMBytes();     // Catch: Exception -> L6
        Intrinsics.XXI(r1);     // Catch: Exception -> L6
        int r2 = r1.length - 4;     // Catch: Exception -> L6
        int r3 = this.mAppInfoLength;     // Catch: Exception -> L6
        int r4 = r2 / r3;     // Catch: Exception -> L6
        ArrayList r5 = new ArrayList();     // Catch: Exception -> L6
        int r6 = 0;
    L4:
        if (r6 >= r4) goto L8;
        BleReadable r7 = (BleReadable) BleAppInfo.class.newInstance();     // Catch: Exception -> L6
        r7.setMBytes(readBytes(r3));     // Catch: Exception -> L6
        r7.decode();     // Catch: Exception -> L6
        Intrinsics.XXI(r7);     // Catch: Exception -> L6
        r5.add(r7);     // Catch: Exception -> L6
        r6 = r6 + 1;     // Catch: Exception -> L6
        goto L4
    L8:
        this.mList = r5;     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleAppInfoList) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mList, ((BleAppInfoList) r4).mList) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final List<BleAppInfo> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return this.mList.hashCode();
    }

    public final void setMList(@aa1 List<BleAppInfo> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleAppInfoList(mSize=" + this.mList.size() + ", mAppInfoLength=" + this.mAppInfoLength + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppInfoList(@aa1 List<BleAppInfo> r2) {
        Intrinsics.X0O(r2, "mList");
        this.mList = r2;
    }

    public /* synthetic */ BleAppInfoList(List r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new ArrayList();
    L5:
        this(r1);
    }
}
