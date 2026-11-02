package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleTuyaKey extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 61;
    private static final int KEY_LENGTH = 32;
    private static final int MAC_LENGTH = 12;
    private static final int UUID_LENGTH = 16;

    @aa1
    private String mKey;

    @aa1
    private String mMac;
    private int mType;

    @aa1
    private String mUuid;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleTuyaKey() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ BleTuyaKey copy$default(BleTuyaKey bleTuyaKey, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleTuyaKey.mType;
        }
        if ((i2 & 2) != 0) {
            str = bleTuyaKey.mUuid;
        }
        if ((i2 & 4) != 0) {
            str2 = bleTuyaKey.mKey;
        }
        if ((i2 & 8) != 0) {
            str3 = bleTuyaKey.mMac;
        }
        return bleTuyaKey.copy(i, str, str2, str3);
    }

    public final int component1() {
        return this.mType;
    }

    @aa1
    public final String component2() {
        return this.mUuid;
    }

    @aa1
    public final String component3() {
        return this.mKey;
    }

    @aa1
    public final String component4() {
        return this.mMac;
    }

    @aa1
    public final BleTuyaKey copy(int i, @aa1 String mUuid, @aa1 String mKey, @aa1 String mMac) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        Intrinsics.X0O(mMac, "mMac");
        return new BleTuyaKey(i, mUuid, mKey, mMac);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        Charset charset = Charsets.IiI10X;
        this.mUuid = readString(16, charset);
        this.mKey = readString(32, charset);
        this.mMac = readString(12, charset);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        String str = this.mUuid;
        Charset charset = Charsets.IiI10X;
        writeStringWithFix(str, 16, charset);
        writeStringWithFix(this.mKey, 32, charset);
        writeStringWithFix(this.mMac, 12, charset);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleTuyaKey)) {
            return false;
        }
        BleTuyaKey bleTuyaKey = (BleTuyaKey) obj;
        return this.mType == bleTuyaKey.mType && Intrinsics.XOO0ii0(this.mUuid, bleTuyaKey.mUuid) && Intrinsics.XOO0ii0(this.mKey, bleTuyaKey.mKey) && Intrinsics.XOO0ii0(this.mMac, bleTuyaKey.mMac);
    }

    @aa1
    public final String getMKey() {
        return this.mKey;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 61;
    }

    @aa1
    public final String getMMac() {
        return this.mMac;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final String getMUuid() {
        return this.mUuid;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mType) * 31) + this.mUuid.hashCode()) * 31) + this.mKey.hashCode()) * 31) + this.mMac.hashCode();
    }

    public final void setMKey(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mKey = str;
    }

    public final void setMMac(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mMac = str;
    }

    public final void setMType(int i) {
        this.mType = i;
    }

    public final void setMUuid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUuid = str;
    }

    @aa1
    public String toString() {
        return "BleTuyaKey(key=" + this.mUuid + this.mKey + this.mMac + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTuyaKey(int i, @aa1 String mUuid, @aa1 String mKey, @aa1 String mMac) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        Intrinsics.X0O(mMac, "mMac");
        this.mType = i;
        this.mUuid = mUuid;
        this.mKey = mKey;
        this.mMac = mMac;
    }

    public /* synthetic */ BleTuyaKey(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
