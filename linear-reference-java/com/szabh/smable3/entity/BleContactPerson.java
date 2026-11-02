package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleContactPerson extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 40;
    private static final int NAME_LENGTH = 24;
    private static final int PHONE_LENGTH = 16;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleContactPerson() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleContactPerson copy$default(BleContactPerson r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mPhone;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    @aa1
    public final String component2() {
        return this.mPhone;
    }

    @aa1
    public final BleContactPerson copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mName");
        Intrinsics.X0O(r3, "mPhone");
        return new BleContactPerson(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mName = BleReadable.readString$default(this, 24, null, 2, null);
        this.mPhone = BleReadable.readString$default(this, 16, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        BleWritable.writeStringWithFix$default(this, this.mName, 24, null, 4, null);
        BleWritable.writeStringWithFix$default(this, this.mPhone, 16, null, 4, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleContactPerson) == true) goto L8;
        return false;
    L8:
        BleContactPerson r6 = (BleContactPerson) r5;
        if (Intrinsics.XOO0ii0(this.mName, r6.mName) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPhone, r6.mPhone) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 40;
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
        return (this.mName.hashCode() * 31) + this.mPhone.hashCode();
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
        return "BleContactPerson(mName=" + this.mName + ", mPhone='" + this.mPhone + "')";
    }

    public BleContactPerson(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mName");
        Intrinsics.X0O(r3, "mPhone");
        this.mName = r2;
        this.mPhone = r3;
    }

    public /* synthetic */ BleContactPerson(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
