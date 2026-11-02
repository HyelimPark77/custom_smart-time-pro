package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleBtName extends BleWritable {

    @aa1
    public static final Companion Companion = null;
    public static final int ITEM_LENGTH = 31;
    private static final int NAME_LENGTH = 29;

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
    public BleBtName() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleBtName copy$default(BleBtName r0, String r1, int r2, Object r3) {
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
    public final BleBtName copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mName");
        return new BleBtName(r2);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mName.length());
        writeStringWithFix(this.mName, 29, Charsets.IiI10X);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleBtName) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mName, ((BleBtName) r4).mName) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 31;
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
        return "BleBtName(mName='" + this.mName + "')";
    }

    public BleBtName(@aa1 String r2) {
        Intrinsics.X0O(r2, "mName");
        this.mName = r2;
    }

    public /* synthetic */ BleBtName(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
