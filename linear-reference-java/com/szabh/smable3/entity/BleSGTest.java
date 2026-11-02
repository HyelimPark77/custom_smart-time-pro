package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGTest extends BleWritable {

    @aa1
    private SGTestType mType;

    /* JADX WARN: Multi-variable type inference failed */
    public BleSGTest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSGTest copy$default(BleSGTest r0, SGTestType r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final SGTestType component1() {
        return this.mType;
    }

    @aa1
    public final BleSGTest copy(@aa1 SGTestType r2) {
        Intrinsics.X0O(r2, "mType");
        return new BleSGTest(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = SGTestType.Companion.of(readUInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType.getType());
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleSGTest) == true) goto L9;
        return false;
    L9:
        if (this.mType == ((BleSGTest) r4).mType) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 4;
    }

    @aa1
    public final SGTestType getMType() {
        return this.mType;
    }

    public int hashCode() {
        return this.mType.hashCode();
    }

    public final void setMType(@aa1 SGTestType r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mType = r2;
    }

    @aa1
    public String toString() {
        return "BleSGTest(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGTest(@aa1 SGTestType r2) {
        Intrinsics.X0O(r2, "mType");
        this.mType = r2;
    }

    public /* synthetic */ BleSGTest(SGTestType r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = SGTestType.ENTER;
    L5:
        this(r1);
    }
}
