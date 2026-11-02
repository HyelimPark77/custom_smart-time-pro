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
public final class BleGoMoreSettings extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_LITE = 1;
    public static final int TYPE_PRO = 2;

    @aa1
    private String mClientId;

    @aa1
    private byte[] mClientIdBytes;
    private int mClientIdLength;

    @aa1
    private String mKey;

    @aa1
    private byte[] mKeyBytes;
    private int mKeyLength;
    private int mType;

    @aa1
    private String mUuid;

    @aa1
    private byte[] mUuidBytes;
    private int mUuidLength;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleGoMoreSettings() {
        this(null, null, 0, null, 15, null);
    }

    public static /* synthetic */ BleGoMoreSettings copy$default(BleGoMoreSettings bleGoMoreSettings, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleGoMoreSettings.mUuid;
        }
        if ((i2 & 2) != 0) {
            str2 = bleGoMoreSettings.mKey;
        }
        if ((i2 & 4) != 0) {
            i = bleGoMoreSettings.mType;
        }
        if ((i2 & 8) != 0) {
            str3 = bleGoMoreSettings.mClientId;
        }
        return bleGoMoreSettings.copy(str, str2, i, str3);
    }

    @aa1
    public final String component1() {
        return this.mUuid;
    }

    @aa1
    public final String component2() {
        return this.mKey;
    }

    public final int component3() {
        return this.mType;
    }

    @aa1
    public final String component4() {
        return this.mClientId;
    }

    @aa1
    public final BleGoMoreSettings copy(@aa1 String mUuid, @aa1 String mKey, int i, @aa1 String mClientId) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        Intrinsics.X0O(mClientId, "mClientId");
        return new BleGoMoreSettings(mUuid, mKey, i, mClientId);
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
        this.mKey = readString(uInt9, charset);
        readInt8();
        this.mType = readUInt8();
        char uInt10 = readUInt8();
        this.mClientIdLength = uInt10;
        this.mClientId = readString(uInt10, charset);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUuidLength);
        BleWritable.writeBytes$default(this, this.mUuidBytes, null, 2, null);
        writeInt8(this.mKeyLength);
        BleWritable.writeBytes$default(this, this.mKeyBytes, null, 2, null);
        writeInt8(1);
        writeInt8(this.mType);
        int i = this.mClientIdLength;
        if (i > 0) {
            writeInt8(i);
            BleWritable.writeBytes$default(this, this.mClientIdBytes, null, 2, null);
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleGoMoreSettings)) {
            return false;
        }
        BleGoMoreSettings bleGoMoreSettings = (BleGoMoreSettings) obj;
        return Intrinsics.XOO0ii0(this.mUuid, bleGoMoreSettings.mUuid) && Intrinsics.XOO0ii0(this.mKey, bleGoMoreSettings.mKey) && this.mType == bleGoMoreSettings.mType && Intrinsics.XOO0ii0(this.mClientId, bleGoMoreSettings.mClientId);
    }

    @aa1
    public final String getMClientId() {
        return this.mClientId;
    }

    @aa1
    public final String getMKey() {
        return this.mKey;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return this.mUuidLength + 5 + this.mKeyLength + this.mClientIdLength;
    }

    public final int getMType() {
        return this.mType;
    }

    @aa1
    public final String getMUuid() {
        return this.mUuid;
    }

    public int hashCode() {
        return (((((this.mUuid.hashCode() * 31) + this.mKey.hashCode()) * 31) + Integer.hashCode(this.mType)) * 31) + this.mClientId.hashCode();
    }

    public final void setMClientId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mClientId = str;
    }

    public final void setMKey(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mKey = str;
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
        return "BleGoMoreSettings(mUuidLength=" + this.mUuidLength + ", mUuid=" + this.mUuid + ", mKeyLength=" + this.mKeyLength + ", mKey=" + this.mKey + ", mType=" + this.mType + ", mClientId=" + this.mClientId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGoMoreSettings(@aa1 String mUuid, @aa1 String mKey, int i, @aa1 String mClientId) {
        Intrinsics.X0O(mUuid, "mUuid");
        Intrinsics.X0O(mKey, "mKey");
        Intrinsics.X0O(mClientId, "mClientId");
        this.mUuid = mUuid;
        this.mKey = mKey;
        this.mType = i;
        this.mClientId = mClientId;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = mUuid.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        this.mUuidBytes = bytes;
        this.mUuidLength = bytes.length;
        byte[] bytes2 = this.mKey.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        this.mKeyBytes = bytes2;
        this.mKeyLength = bytes2.length;
        byte[] bytes3 = this.mClientId.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes3, "getBytes(...)");
        this.mClientIdBytes = bytes3;
        this.mClientIdLength = bytes3.length;
    }

    public /* synthetic */ BleGoMoreSettings(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
