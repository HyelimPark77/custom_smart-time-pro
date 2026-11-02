package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleFilePath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleFilePath.kt\ncom/szabh/smable3/entity/BleAppAudioBookList\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,87:1\n222#2,4:88\n*S KotlinDebug\n*F\n+ 1 BleFilePath.kt\ncom/szabh/smable3/entity/BleAppAudioBookList\n*L\n76#1:88,4\n*E\n"})
public final class BleAppAudioBookList extends BleReadable {
    private int mCount;

    @aa1
    private List<BleFilePath> mList;

    /* JADX WARN: Multi-variable type inference failed */
    public BleAppAudioBookList() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleAppAudioBookList copy$default(BleAppAudioBookList r0, int r1, List r2, int r3, Object r4) {
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
    public final List<BleFilePath> component2() {
        return this.mList;
    }

    @aa1
    public final BleAppAudioBookList copy(int r2, @aa1 List<BleFilePath> r3) {
        Intrinsics.X0O(r3, "mList");
        return new BleAppAudioBookList(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        byte r0 = readInt8();     // Catch: Exception -> L9
        this.mCount = r0;     // Catch: Exception -> L9
        if (r0 <= 0) goto L15;
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L16;
        byte[] r3 = readBytes(5);     // Catch: Exception -> L9
        byte[] r4 = readBytesUtil((byte) 0);     // Catch: Exception -> L9
        skip((-((r3.length + r4.length) + 1)) * 8);     // Catch: Exception -> L9
        List<BleFilePath> r5 = this.mList;     // Catch: Exception -> L9
        int r6 = (r3.length + r4.length) + 1;     // Catch: Exception -> L9
        BleReadable r7 = (BleReadable) BleFilePath.class.newInstance();     // Catch: Exception -> L9
        r7.setMBytes(readBytes(r6));     // Catch: Exception -> L9
        r7.decode();     // Catch: Exception -> L9
        Intrinsics.XXI(r7);     // Catch: Exception -> L9
        r5.add((BleFilePath) r7);     // Catch: Exception -> L9
        r2 = r2 + 1;
        goto L6
    L16:
        return;
    L15:
        return;
    L9:
        e = move-exception;
        e.printStackTrace();
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleAppAudioBookList) == true) goto L8;
        return false;
    L8:
        BleAppAudioBookList r6 = (BleAppAudioBookList) r5;
        if (this.mCount == r6.mCount) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mList, r6.mList) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMCount() {
        return this.mCount;
    }

    @aa1
    public final List<BleFilePath> getMList() {
        return this.mList;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mCount) * 31) + this.mList.hashCode();
    }

    public final void setMCount(int r1) {
        this.mCount = r1;
    }

    public final void setMList(@aa1 List<BleFilePath> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mList = r2;
    }

    @aa1
    public String toString() {
        return "BleAppAudioBookList(mSize=" + this.mCount + ", mList=" + this.mList + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppAudioBookList(int r2, @aa1 List<BleFilePath> r3) {
        Intrinsics.X0O(r3, "mList");
        this.mCount = r2;
        this.mList = r3;
    }

    public /* synthetic */ BleAppAudioBookList(int r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = new ArrayList();
    L8:
        this(r1, r2);
    }
}
