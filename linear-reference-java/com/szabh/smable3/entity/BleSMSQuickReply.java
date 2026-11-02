package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSMSQuickReply extends BleWritable {
    private int mId;

    @aa1
    private String mPhone;

    /* JADX WARN: Multi-variable type inference failed */
    public BleSMSQuickReply() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSMSQuickReply copy$default(BleSMSQuickReply r0, int r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mId;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mPhone;
    L9:
        return r0.copy(r1, r2);
    }

    public final int component1() {
        return this.mId;
    }

    @aa1
    public final String component2() {
        return this.mPhone;
    }

    @aa1
    public final BleSMSQuickReply copy(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mPhone");
        return new BleSMSQuickReply(r2, r3);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mId = readUInt8();
        this.mPhone = BleReadable.readString$default(this, 32, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSMSQuickReply) == true) goto L8;
        return false;
    L8:
        BleSMSQuickReply r6 = (BleSMSQuickReply) r5;
        if (this.mId == r6.mId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mPhone, r6.mPhone) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int getMId() {
        return this.mId;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 33;
    }

    @aa1
    public final String getMPhone() {
        return this.mPhone;
    }

    public int hashCode() {
        return (Integer.hashCode(this.mId) * 31) + this.mPhone.hashCode();
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMPhone(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPhone = r2;
    }

    @aa1
    public String toString() {
        return "BleSMSQuickReply(mId=" + this.mId + ", mPhone='" + this.mPhone + "')";
    }

    public BleSMSQuickReply(int r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "mPhone");
        this.mId = r2;
        this.mPhone = r3;
    }

    public /* synthetic */ BleSMSQuickReply(int r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
