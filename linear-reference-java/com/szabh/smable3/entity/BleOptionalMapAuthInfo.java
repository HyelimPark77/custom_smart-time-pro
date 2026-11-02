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
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleOptionalMapAuthInfo copy$default(BleOptionalMapAuthInfo r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.mUuid;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.mKey;
    L9:
        return r0.copy(r1, r2);
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
    public final BleOptionalMapAuthInfo copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mUuid");
        Intrinsics.X0O(r3, "mKey");
        return new BleOptionalMapAuthInfo(r2, r3);
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
        if (r2 <= 0) goto L6;
        this.mKey = readString(r2, r1);
        return;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mUuidLength);
        BleWritable.writeBytes$default(this, this.mUuidBytes, null, 2, null);
        writeInt8(this.mKeyLength);
        BleWritable.writeBytes$default(this, this.mKeyBytes, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleOptionalMapAuthInfo) == true) goto L8;
        return false;
    L8:
        BleOptionalMapAuthInfo r6 = (BleOptionalMapAuthInfo) r5;
        if (Intrinsics.XOO0ii0(this.mUuid, r6.mUuid) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mKey, r6.mKey) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getMKey() {
        return this.mKey;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return (this.mUuidLength + 2) + this.mKeyLength;
    }

    @aa1
    public final String getMUuid() {
        return this.mUuid;
    }

    public int hashCode() {
        return (this.mUuid.hashCode() * 31) + this.mKey.hashCode();
    }

    public final void setMKey(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mKey = r2;
    }

    public final void setMUuid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUuid = r2;
    }

    @aa1
    public String toString() {
        return "BleGoMoreSettings(mUuidLength=" + this.mUuidLength + ", mUuid=" + this.mUuid + ", mKeyLength=" + this.mKeyLength + ", mKey=" + this.mKey + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleOptionalMapAuthInfo(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "mUuid");
        Intrinsics.X0O(r3, "mKey");
        this.mUuid = r2;
        this.mKey = r3;
        Charset r4 = Charsets.XIi00iiXO;
        byte[] r5 = r2.getBytes(r4);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        this.mUuidBytes = r5;
        this.mUuidLength = r5.length;
        byte[] r6 = this.mKey.getBytes(r4);
        Intrinsics.O10IXXX0X(r6, "getBytes(...)");
        this.mKeyBytes = r6;
        this.mKeyLength = r6.length;
    }

    public /* synthetic */ BleOptionalMapAuthInfo(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
