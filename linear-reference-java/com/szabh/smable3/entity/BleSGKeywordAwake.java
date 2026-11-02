package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.bestmafen.baseble.data.BleWritable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGKeywordAwake extends BleWritable {

    @aa1
    public static final Companion Companion = null;

    @aa1
    private String mAssistant;
    private int mEnabled;

    @aa1
    private String mWakeWords;

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

    public BleSGKeywordAwake() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ BleSGKeywordAwake copy$default(BleSGKeywordAwake r0, int r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.mEnabled;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.mWakeWords;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mAssistant;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public final int component1() {
        return this.mEnabled;
    }

    @aa1
    public final String component2() {
        return this.mWakeWords;
    }

    @aa1
    public final String component3() {
        return this.mAssistant;
    }

    @aa1
    public final BleSGKeywordAwake copy(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "mWakeWords");
        Intrinsics.X0O(r4, "mAssistant");
        return new BleSGKeywordAwake(r2, r3, r4);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mEnabled = readInt8();
        this.mWakeWords = BleReadable.readString$default(this, readUInt8(), null, 2, null);
        this.mAssistant = BleReadable.readString$default(this, readUInt8(), null, 2, null);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        writeInt8(this.mEnabled);
        String r0 = this.mWakeWords;
        Charset r1 = Charsets.XIi00iiXO;
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        writeInt8(r2.length);
        byte[] r3 = this.mWakeWords.getBytes(r1);
        Intrinsics.O10IXXX0X(r3, "getBytes(...)");
        BleWritable.writeBytes$default(this, r3, null, 2, null);
        byte[] r4 = this.mAssistant.getBytes(r1);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        writeInt8(r4.length);
        byte[] r5 = this.mAssistant.getBytes(r1);
        Intrinsics.O10IXXX0X(r5, "getBytes(...)");
        BleWritable.writeBytes$default(this, r5, null, 2, null);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BleSGKeywordAwake) == true) goto L8;
        return false;
    L8:
        BleSGKeywordAwake r6 = (BleSGKeywordAwake) r5;
        if (this.mEnabled == r6.mEnabled) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mWakeWords, r6.mWakeWords) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mAssistant, r6.mAssistant) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @aa1
    public final String getMAssistant() {
        return this.mAssistant;
    }

    public final int getMEnabled() {
        return this.mEnabled;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        String r0 = this.mWakeWords;
        Charset r1 = Charsets.XIi00iiXO;
        byte[] r2 = r0.getBytes(r1);
        Intrinsics.O10IXXX0X(r2, "getBytes(...)");
        int r3 = r2.length + 3;
        byte[] r4 = this.mAssistant.getBytes(r1);
        Intrinsics.O10IXXX0X(r4, "getBytes(...)");
        return r3 + r4.length;
    }

    @aa1
    public final String getMWakeWords() {
        return this.mWakeWords;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mEnabled) * 31) + this.mWakeWords.hashCode()) * 31) + this.mAssistant.hashCode();
    }

    public final void setMAssistant(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mAssistant = r2;
    }

    public final void setMEnabled(int r1) {
        this.mEnabled = r1;
    }

    public final void setMWakeWords(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mWakeWords = r2;
    }

    @aa1
    public String toString() {
        return "BleSGKeywordAwake(mEnabled=" + this.mEnabled + ", mWakeWords=" + this.mWakeWords + ", mAssistant=" + this.mAssistant + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGKeywordAwake(int r2, @aa1 String r3, @aa1 String r4) {
        Intrinsics.X0O(r3, "mWakeWords");
        Intrinsics.X0O(r4, "mAssistant");
        this.mEnabled = r2;
        this.mWakeWords = r3;
        this.mAssistant = r4;
    }

    public /* synthetic */ BleSGKeywordAwake(int r2, String r3, String r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
