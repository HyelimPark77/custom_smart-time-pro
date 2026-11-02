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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 31;
    private static final int NAME_LENGTH = 29;

    @aa1
    private String mName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleBtName() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleBtName copy$default(BleBtName bleBtName, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleBtName.mName;
        }
        return bleBtName.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    @aa1
    public final BleBtName copy(@aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        return new BleBtName(mName);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mName.length());
        writeStringWithFix(this.mName, 29, Charsets.IiI10X);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleBtName) && Intrinsics.XOO0ii0(this.mName, ((BleBtName) obj).mName);
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

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    @aa1
    public String toString() {
        return "BleBtName(mName='" + this.mName + "')";
    }

    public BleBtName(@aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        this.mName = mName;
    }

    public /* synthetic */ BleBtName(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
