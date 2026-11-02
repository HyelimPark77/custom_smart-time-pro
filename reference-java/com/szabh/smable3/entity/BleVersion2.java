package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleVersion2 extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 3;

    @aa1
    private String mVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleVersion2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleVersion2 copy$default(BleVersion2 bleVersion2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleVersion2.mVersion;
        }
        return bleVersion2.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mVersion;
    }

    @aa1
    public final BleVersion2 copy(@aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        return new BleVersion2(mVersion);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        String string;
        super.decode();
        int int8 = readInt8() & 255;
        int int9 = readInt8() & 255;
        byte intN = readIntN(4);
        byte intN2 = readIntN(4);
        StringBuilder sb = new StringBuilder();
        sb.append(int8);
        sb.append('.');
        sb.append(int9);
        sb.append('.');
        sb.append((int) intN2);
        if (intN > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('.');
            sb2.append((char) (intN + 64));
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        this.mVersion = sb.toString();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleVersion2) && Intrinsics.XOO0ii0(this.mVersion, ((BleVersion2) obj).mVersion);
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return this.mVersion.hashCode();
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    @aa1
    public String toString() {
        return "BleVersion2(mVersion=" + this.mVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleVersion2(@aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        this.mVersion = mVersion;
    }

    public /* synthetic */ BleVersion2(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
