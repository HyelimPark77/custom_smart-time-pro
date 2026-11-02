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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleGoMoreSettings() {
        String r1 = null;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleGoMoreSettings copy$default(BleGoMoreSettings r0, String r1, String r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mUuid;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mKey;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mType;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mClientId;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleGoMoreSettings copy(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "mUuid");
        Intrinsics.X0O(r3, "mKey");
        Intrinsics.X0O(r5, "mClientId");
        return new BleGoMoreSettings(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        char r0 = readUInt8();
        this.mUuidLength = r0;
        Charset r1 = Charsets.XIi00iiXO;
        this.mUuid = readString(r0, r1);
        char r2 = readUInt8();
        this.mKeyLength = r2;
        this.mKey = readString(r2, r1);
        readInt8();
        this.mType = readUInt8();
        char r3 = readUInt8();
        this.mClientIdLength = r3;
        this.mClientId = readString(r3, r1);
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
        int r0 = this.mClientIdLength;
        if (r0 <= 0) goto L6;
        writeInt8(r0);
        BleWritable.writeBytes$default(this, this.mClientIdBytes, null, 2, null);
        return;
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleGoMoreSettings) == true) goto L8;
        return false;
    L8:
        BleGoMoreSettings r6 = (BleGoMoreSettings) r5;
        if (Intrinsics.XOO0ii0(this.mUuid, r6.mUuid) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mKey, r6.mKey) == true) goto L15;
        return false;
    L15:
        if (this.mType == r6.mType) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mClientId, r6.mClientId) == true) goto L20;
        return false;
    L20:
        return true;
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
        return ((this.mUuidLength + 5) + this.mKeyLength) + this.mClientIdLength;
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

    public final void setMClientId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mClientId = r2;
    }

    public final void setMKey(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mKey = r2;
    }

    public final void setMType(int r1) {
        this.mType = r1;
    }

    public final void setMUuid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUuid = r2;
    }

    @aa1
    public String toString() {
        return "BleGoMoreSettings(mUuidLength=" + this.mUuidLength + ", mUuid=" + this.mUuid + ", mKeyLength=" + this.mKeyLength + ", mKey=" + this.mKey + ", mType=" + this.mType + ", mClientId=" + this.mClientId + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleGoMoreSettings(@aa1 String r2, @aa1 String r3, int r4, @aa1 String r5) {
        Intrinsics.X0O(r2, "mUuid");
        Intrinsics.X0O(r3, "mKey");
        Intrinsics.X0O(r5, "mClientId");
        this.mUuid = r2;
        this.mKey = r3;
        this.mType = r4;
        this.mClientId = r5;
        Charset r6 = Charsets.XIi00iiXO;
        byte[] r7 = r2.getBytes(r6);
        Intrinsics.O10IXXX0X(r7, "getBytes(...)");
        this.mUuidBytes = r7;
        this.mUuidLength = r7.length;
        byte[] r8 = this.mKey.getBytes(r6);
        Intrinsics.O10IXXX0X(r8, "getBytes(...)");
        this.mKeyBytes = r8;
        this.mKeyLength = r8.length;
        byte[] r9 = this.mClientId.getBytes(r6);
        Intrinsics.O10IXXX0X(r9, "getBytes(...)");
        this.mClientIdBytes = r9;
        this.mClientIdLength = r9.length;
    }

    public /* synthetic */ BleGoMoreSettings(String r2, String r3, int r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
