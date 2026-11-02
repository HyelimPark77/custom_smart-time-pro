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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 40;
    private static final int NAME_LENGTH = 24;
    private static final int PHONE_LENGTH = 16;

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

    /* JADX WARN: Multi-variable type inference failed */
    public BleContactPerson() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleContactPerson copy$default(BleContactPerson bleContactPerson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleContactPerson.mName;
        }
        if ((i & 2) != 0) {
            str2 = bleContactPerson.mPhone;
        }
        return bleContactPerson.copy(str, str2);
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
    public final BleContactPerson copy(@aa1 String mName, @aa1 String mPhone) {
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mPhone, "mPhone");
        return new BleContactPerson(mName, mPhone);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleContactPerson)) {
            return false;
        }
        BleContactPerson bleContactPerson = (BleContactPerson) obj;
        return Intrinsics.XOO0ii0(this.mName, bleContactPerson.mName) && Intrinsics.XOO0ii0(this.mPhone, bleContactPerson.mPhone);
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
        return "BleContactPerson(mName=" + this.mName + ", mPhone='" + this.mPhone + "')";
    }

    public BleContactPerson(@aa1 String mName, @aa1 String mPhone) {
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mPhone, "mPhone");
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public /* synthetic */ BleContactPerson(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
