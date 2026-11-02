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

    public static /* synthetic */ BleSGTest copy$default(BleSGTest bleSGTest, SGTestType sGTestType, int i, Object obj) {
        if ((i & 1) != 0) {
            sGTestType = bleSGTest.mType;
        }
        return bleSGTest.copy(sGTestType);
    }

    @aa1
    public final SGTestType component1() {
        return this.mType;
    }

    @aa1
    public final BleSGTest copy(@aa1 SGTestType mType) {
        Intrinsics.X0O(mType, "mType");
        return new BleSGTest(mType);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = SGTestType.Companion.m39009of(readUInt8());
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType.getType());
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleSGTest) && this.mType == ((BleSGTest) obj).mType;
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

    public final void setMType(@aa1 SGTestType sGTestType) {
        Intrinsics.X0O(sGTestType, "<set-?>");
        this.mType = sGTestType;
    }

    @aa1
    public String toString() {
        return "BleSGTest(mType=" + this.mType + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGTest(@aa1 SGTestType mType) {
        Intrinsics.X0O(mType, "mType");
        this.mType = mType;
    }

    public /* synthetic */ BleSGTest(SGTestType sGTestType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SGTestType.ENTER : sGTestType);
    }
}
