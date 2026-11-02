package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleFilePath extends BleReadable {
    private int mAttribute;

    @aa1
    private String mName;
    private int mSize;

    public BleFilePath() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ BleFilePath copy$default(BleFilePath bleFilePath, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bleFilePath.mSize;
        }
        if ((i3 & 2) != 0) {
            i2 = bleFilePath.mAttribute;
        }
        if ((i3 & 4) != 0) {
            str = bleFilePath.mName;
        }
        return bleFilePath.copy(i, i2, str);
    }

    public final int component1() {
        return this.mSize;
    }

    public final int component2() {
        return this.mAttribute;
    }

    @aa1
    public final String component3() {
        return this.mName;
    }

    @aa1
    public final BleFilePath copy(int i, int i2, @aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        return new BleFilePath(i, i2, mName);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() != null) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            if (mBytes.length == 0) {
                return;
            }
            ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
            Intrinsics.O10IXXX0X(LITTLE_ENDIAN, "LITTLE_ENDIAN");
            this.mSize = readInt32(LITTLE_ENDIAN);
            this.mAttribute = readInt8();
            this.mName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleFilePath)) {
            return false;
        }
        BleFilePath bleFilePath = (BleFilePath) obj;
        return this.mSize == bleFilePath.mSize && this.mAttribute == bleFilePath.mAttribute && Intrinsics.XOO0ii0(this.mName, bleFilePath.mName);
    }

    public final int getMAttribute() {
        return this.mAttribute;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public final int getMSize() {
        return this.mSize;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mSize) * 31) + Integer.hashCode(this.mAttribute)) * 31) + this.mName.hashCode();
    }

    public final void setMAttribute(int i) {
        this.mAttribute = i;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMSize(int i) {
        this.mSize = i;
    }

    @aa1
    public String toString() {
        return "BleFilePath(mSize='" + this.mSize + "', mAttribute='" + this.mAttribute + "', mName='" + this.mName + "')";
    }

    public BleFilePath(int i, int i2, @aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        this.mSize = i;
        this.mAttribute = i2;
        this.mName = mName;
    }

    public /* synthetic */ BleFilePath(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
