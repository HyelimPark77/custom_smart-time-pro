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
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 46;
    private static final int NAME_LENGTH = 24;
    private static final int PHONE_LENGTH = 18;
    private int mEnabled;

    @aa1
    private String mName;

    @aa1
    private String mPhone;

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

    public BleSosItem() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleSosItem copy$default(BleSosItem r0, int r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mPhone;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mName;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final BleSosItem copy(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "mPhone");
        Intrinsics.X0O(r4, "mName");
        return new BleSosItem(r2, r3, r4);
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

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSosItem) == true) goto L8;
        return false;
    L8:
        BleSosItem r6 = (BleSosItem) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPhone, r6.mPhone) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L17;
        return false;
    L17:
        return true;
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

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPhone = r2;
    }

    @aa1
    public String toString() {
        return "BleSosItem(mEnabled=" + this.mEnabled + ", mPhone='" + this.mPhone + "', mName='" + this.mName + "')";
    }

    public BleSosItem(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "mPhone");
        Intrinsics.X0O(r4, "mName");
        this.mEnabled = r2;
        this.mPhone = r3;
        this.mName = r4;
    }

    public /* synthetic */ BleSosItem(int r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
