package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSosItem extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 46;
    private static final int NAME_LENGTH = 24;
    private static final int PHONE_LENGTH = 18;
    private int mEnabled;

    @aa1
    private String mName;

    @aa1
    private String mPhone;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSosItem() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ BleSosItem copy$default(BleSosItem bleSosItem, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleSosItem.mEnabled;
        }
        if ((i2 & 2) != 0) {
            str = bleSosItem.mPhone;
        }
        if ((i2 & 4) != 0) {
            str2 = bleSosItem.mName;
        }
        return bleSosItem.copy(i, str, str2);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final String component2() {
        return this.mPhone;
    }

    @aa1
    public final String component3() {
        return this.mName;
    }

    @aa1
    public final BleSosItem copy(int i, @aa1 String mPhone, @aa1 String mName) {
        Intrinsics.X0O(mPhone, "mPhone");
        Intrinsics.X0O(mName, "mName");
        return new BleSosItem(i, mPhone, mName);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        readInt8();
        readInt8();
        this.mPhone = BleReadable.readString$default(this, 18, null, 2, null);
        readInt8();
        this.mName = BleReadable.readString$default(this, 24, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        writeInt8(0);
        writeInt8(this.mPhone.length());
        BleWritable.writeStringWithFix$default(this, this.mPhone, 18, null, 4, null);
        writeInt8(this.mName.length());
        BleWritable.writeStringWithFix$default(this, this.mName, 24, null, 4, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSosItem)) {
            return false;
        }
        BleSosItem bleSosItem = (BleSosItem) obj;
        return this.mEnabled == bleSosItem.mEnabled && Intrinsics.XOO0ii0(this.mPhone, bleSosItem.mPhone) && Intrinsics.XOO0ii0(this.mName, bleSosItem.mName);
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 46;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    @aa1
    public final String getMPhone() {
        return this.mPhone;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mEnabled) * 31) + this.mPhone.hashCode()) * 31) + this.mName.hashCode();
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMPhone(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPhone = str;
    }

    @aa1
    public String toString() {
        return "BleSosItem(mEnabled=" + this.mEnabled + ", mPhone='" + this.mPhone + "', mName='" + this.mName + "')";
    }

    public BleSosItem(int i, @aa1 String mPhone, @aa1 String mName) {
        Intrinsics.X0O(mPhone, "mPhone");
        Intrinsics.X0O(mName, "mName");
        this.mEnabled = i;
        this.mPhone = mPhone;
        this.mName = mName;
    }

    public /* synthetic */ BleSosItem(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
