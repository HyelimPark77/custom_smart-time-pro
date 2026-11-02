package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
final class BleBrandInfoItem0 extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 128;
    private static final int NAME_LENGTH = 126;

    @aa1
    private String mBleName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleBrandInfoItem0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleBrandInfoItem0 copy$default(BleBrandInfoItem0 bleBrandInfoItem0, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleBrandInfoItem0.mBleName;
        }
        return bleBrandInfoItem0.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mBleName;
    }

    @aa1
    public final BleBrandInfoItem0 copy(@aa1 String mBleName) {
        Intrinsics.X0O(mBleName, "mBleName");
        return new BleBrandInfoItem0(mBleName);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(Integer.min(this.mBleName.length(), 126) + 1);
        writeStringWithFix(this.mBleName, 126, Charsets.IiI10X);
        writeInt8(0);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleBrandInfoItem0) && Intrinsics.XOO0ii0(this.mBleName, ((BleBrandInfoItem0) obj).mBleName);
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 128;
    }

    public int hashCode() {
        return this.mBleName.hashCode();
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    @aa1
    public String toString() {
        return "BleBrandInfoItem0(mBleName=" + this.mBleName + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleBrandInfoItem0(@aa1 String mBleName) {
        Intrinsics.X0O(mBleName, "mBleName");
        this.mBleName = mBleName;
    }

    public /* synthetic */ BleBrandInfoItem0(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
