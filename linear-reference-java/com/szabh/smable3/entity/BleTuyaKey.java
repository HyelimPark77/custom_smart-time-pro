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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleTuyaKey() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ BleTuyaKey copy$default(BleTuyaKey r0, int r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.mType;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mUuid;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.mKey;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.mMac;
    L15:
        return r0.copy(r1, r2, r3, r4);
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
    public final BleTuyaKey copy(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r3, "mUuid");
        Intrinsics.X0O(r4, "mKey");
        Intrinsics.X0O(r5, "mMac");
        return new BleTuyaKey(r2, r3, r4, r5);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mType = readInt8();
        Charset r0 = Charsets.IiI10X;
        this.mUuid = readString(16, r0);
        this.mKey = readString(32, r0);
        this.mMac = readString(12, r0);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mType);
        String r0 = this.mUuid;
        Charset r1 = Charsets.IiI10X;
        writeStringWithFix(r0, 16, r1);
        writeStringWithFix(this.mKey, 32, r1);
        writeStringWithFix(this.mMac, 12, r1);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleTuyaKey) == true) goto L8;
        return false;
    L8:
        BleTuyaKey r6 = (BleTuyaKey) r5;
        if (this.mType == r6.mType) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mUuid, r6.mUuid) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mKey, r6.mKey) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mMac, r6.mMac) == true) goto L20;
        return false;
    L20:
        return true;
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

    public final void setMKey(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mKey = r2;
    }

    public final void setMMac(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mMac = r2;
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
        return "BleTuyaKey(key=" + this.mUuid + this.mKey + this.mMac + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleTuyaKey(int r2, @aa1 String r3, @aa1 String r4, @aa1 String r5) {
        Intrinsics.X0O(r3, "mUuid");
        Intrinsics.X0O(r4, "mKey");
        Intrinsics.X0O(r5, "mMac");
        this.mType = r2;
        this.mUuid = r3;
        this.mKey = r4;
        this.mMac = r5;
    }

    public /* synthetic */ BleTuyaKey(int r2, String r3, String r4, String r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
