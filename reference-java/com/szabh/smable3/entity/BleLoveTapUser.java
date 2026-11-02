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
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 28;
    private static final int NAME_LENGTH = 24;

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
    public BleLoveTapUser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleLoveTapUser copy$default(BleLoveTapUser bleLoveTapUser, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleLoveTapUser.mName;
        }
        return bleLoveTapUser.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mName;
    }

    @aa1
    public final BleLoveTapUser copy(@aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        return new BleLoveTapUser(mName);
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

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleLoveTapUser) && Intrinsics.XOO0ii0(this.mName, ((BleLoveTapUser) obj).mName);
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

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    @aa1
    public String toString() {
        return "BleLoveTapUser(mId=" + getMId() + ", mName='" + this.mName + "')";
    }

    public BleLoveTapUser(@aa1 String mName) {
        Intrinsics.X0O(mName, "mName");
        this.mName = mName;
    }

    public /* synthetic */ BleLoveTapUser(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
