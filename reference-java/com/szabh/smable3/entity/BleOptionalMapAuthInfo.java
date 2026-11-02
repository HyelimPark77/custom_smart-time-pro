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
public final class BleOptionalMapAuthInfo extends BleWritable {

    @aa1
    private String mKey;

    @aa1
    private byte[] mKeyBytes;
    private int mKeyLength;

    @aa1
    private String mUuid;

    @aa1
    private byte[] mUuidBytes;
    private int mUuidLength;

    /* JADX WARN: Multi-variable type inference failed */
    public BleOptionalMapAuthInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleOptionalMapAuthInfo copy$default(BleOptionalMapAuthInfo bleOptionalMapAuthInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleOptionalMapAuthInfo.mUuid;
        }
        if ((i & 2) != 0) {
            str2 = bleOptionalMapAuthInfo.mKey;
        }
        return bleOptionalMapAuthInfo.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.mUuid;
    }

    @aa1
    public final String component2() {
        return this.mKey;
    }

    @aa1
    public final BleOptionalMapAuthInfo copy(@aa1 String mUuid, @aa1 String mKey) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        return new BleOptionalMapAuthInfo(mUuid, mKey);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char uInt8 = readUInt8();
        this.mUuidLength = uInt8;
        Charset charset = Charsets.XIi00iiXO;
        this.mUuid = readString(uInt8, charset);
        char uInt9 = readUInt8();
        this.mKeyLength = uInt9;
        if (uInt9 > 0) {
            this.mKey = readString(uInt9, charset);
        }
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUuidLength);
        BleWritable.writeBytes$default(this, this.mUuidBytes, null, 2, null);
        writeInt8(this.mKeyLength);
        BleWritable.writeBytes$default(this, this.mKeyBytes, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleOptionalMapAuthInfo)) {
            return false;
        }
        BleOptionalMapAuthInfo bleOptionalMapAuthInfo = (BleOptionalMapAuthInfo) obj;
        return Intrinsics.XOO0ii0(this.mUuid, bleOptionalMapAuthInfo.mUuid) && Intrinsics.XOO0ii0(this.mKey, bleOptionalMapAuthInfo.mKey);
    }

    @aa1
    public final String getMKey() {
        return this.mKey;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mUuidLength + 2 + this.mKeyLength;
    }

    @aa1
    public final String getMUuid() {
        return this.mUuid;
    }

    public int hashCode() {
        return (this.mUuid.hashCode() * 31) + this.mKey.hashCode();
    }

    public final void setMKey(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mKey = str;
    }

    public final void setMUuid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUuid = str;
    }

    @aa1
    public String toString() {
        return "BleGoMoreSettings(mUuidLength=" + this.mUuidLength + ", mUuid=" + this.mUuid + ", mKeyLength=" + this.mKeyLength + ", mKey=" + this.mKey + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleOptionalMapAuthInfo(@aa1 String mUuid, @aa1 String mKey) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        this.mUuid = mUuid;
        this.mKey = mKey;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = mUuid.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        this.mUuidBytes = bytes;
        this.mUuidLength = bytes.length;
        byte[] bytes2 = this.mKey.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        this.mKeyBytes = bytes2;
        this.mKeyLength = bytes2.length;
    }

    public /* synthetic */ BleOptionalMapAuthInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
