package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleFilePath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFilePath.kt\ncom/szabh/smable3/entity/BleAppAudioBookPath\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1869#2,2:88\n1869#2,2:90\n*S KotlinDebug\n*F\n+ 1 BleFilePath.kt\ncom/szabh/smable3/entity/BleAppAudioBookPath\n*L\n38#1:88,2\n46#1:90,2\n*E\n"})
public final class BleAppAudioBookPath extends BleWritable {
    private int mCount;

    @aa1
    private List<String> mList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleAppAudioBookPath() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAppAudioBookPath copy$default(BleAppAudioBookPath r0, int r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mCount;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mList;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mCount;
    }

    @aa1
    public final List<String> component2() {
        return this.mList;
    }

    @aa1
    public final BleAppAudioBookPath copy(int r2, @aa1 List<String> r3) {
        Intrinsics.X0O(r3, "mList");
        return new BleAppAudioBookPath(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mCount);
        Iterator<T> r0 = this.mList.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        BleWritable.writeString$default(this, (String) r0.next(), null, 2, null);
        writeInt8(0);
        goto L4
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppAudioBookPath) == true) goto L8;
        return false;
    L8:
        BleAppAudioBookPath r6 = (BleAppAudioBookPath) r5;
        if (this.mCount == r6.mCount) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getListSize() {
        Iterator<T> r0 = this.mList.iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L7;
        String r2 = (String) r0.next();
        Charset r3 = Charset.defaultCharset();
        Intrinsics.O10IXXX0X(r3, "defaultCharset(...)");
        byte[] r4 = r2.getBytes(r3);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        r1 = r1 + (r4.length + 1);
        goto L4
    L7:
        return r1 + 1;
    }

    public final int getMCount() {
        return this.mCount;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return getListSize();
    }

    @aa1
    public final List<String> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mCount) * 31) + this.mList.hashCode();
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMList(@aa1 List<String> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleAppAudioBookPath(mCount=" + this.mCount + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppAudioBookPath(int r2, @aa1 List<String> r3) {
        Intrinsics.X0O(r3, "mList");
        this.mCount = r2;
        this.mList = r3;
    }

    public /* synthetic */ BleAppAudioBookPath(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
