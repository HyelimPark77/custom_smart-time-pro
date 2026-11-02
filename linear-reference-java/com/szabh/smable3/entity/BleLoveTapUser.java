package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLoveTapUser extends BleIdObject {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 28;
    private static final int NAME_LENGTH = 24;

    @aa1
    private String mName;

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
    public BleLoveTapUser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleLoveTapUser copy$default(BleLoveTapUser r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mName;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    @aa1
    public final BleLoveTapUser copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mName");
        return new BleLoveTapUser(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        setMId(readUInt8());
        BleReadable.readInt24$default(this, null, 1, null);
        this.mName = BleReadable.readString$default(this, 24, null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(getMId());
        BleWritable.writeInt24$default(this, 0, null, 2, null);
        BleWritable.writeStringWithFix$default(this, this.mName, 24, null, 4, null);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleLoveTapUser) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mName, ((BleLoveTapUser) r4).mName) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 28;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    public int hashCode() {
        return this.mName.hashCode();
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    @aa1
    public String toString() {
        return "BleLoveTapUser(mId=" + getMId() + ", mName='" + this.mName + "')";
    }

    public BleLoveTapUser(@aa1 String r2) {
        Intrinsics.X0O(r2, "mName");
        this.mName = r2;
    }

    public /* synthetic */ BleLoveTapUser(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
