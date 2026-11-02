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
    public static final Companion Companion = new Companion(null);

    @aa1
    private String mAssistant;
    private int mEnabled;

    @aa1
    private String mWakeWords;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleSGKeywordAwake() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ BleSGKeywordAwake copy$default(BleSGKeywordAwake bleSGKeywordAwake, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bleSGKeywordAwake.mEnabled;
        }
        if ((i2 & 2) != 0) {
            str = bleSGKeywordAwake.mWakeWords;
        }
        if ((i2 & 4) != 0) {
            str2 = bleSGKeywordAwake.mAssistant;
        }
        return bleSGKeywordAwake.copy(i, str, str2);
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
    public final BleSGKeywordAwake copy(int i, @aa1 String mWakeWords, @aa1 String mAssistant) {
        Intrinsics.X0O(mWakeWords, "mWakeWords");
        Intrinsics.X0O(mAssistant, "mAssistant");
        return new BleSGKeywordAwake(i, mWakeWords, mAssistant);
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
        String str = this.mWakeWords;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        writeInt8(bytes.length);
        byte[] bytes2 = this.mWakeWords.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        BleWritable.writeBytes$default(this, bytes2, null, 2, null);
        byte[] bytes3 = this.mAssistant.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes3, "getBytes(...)");
        writeInt8(bytes3.length);
        byte[] bytes4 = this.mAssistant.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes4, "getBytes(...)");
        BleWritable.writeBytes$default(this, bytes4, null, 2, null);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSGKeywordAwake)) {
            return false;
        }
        BleSGKeywordAwake bleSGKeywordAwake = (BleSGKeywordAwake) obj;
        return this.mEnabled == bleSGKeywordAwake.mEnabled && Intrinsics.XOO0ii0(this.mWakeWords, bleSGKeywordAwake.mWakeWords) && Intrinsics.XOO0ii0(this.mAssistant, bleSGKeywordAwake.mAssistant);
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
        String str = this.mWakeWords;
        Charset charset = Charsets.XIi00iiXO;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes, "getBytes(...)");
        int length = bytes.length + 3;
        byte[] bytes2 = this.mAssistant.getBytes(charset);
        Intrinsics.O10IXXX0X(bytes2, "getBytes(...)");
        return length + bytes2.length;
    }

    @aa1
    public final String getMWakeWords() {
        return this.mWakeWords;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mEnabled) * 31) + this.mWakeWords.hashCode()) * 31) + this.mAssistant.hashCode();
    }

    public final void setMAssistant(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mAssistant = str;
    }

    public final void setMEnabled(int i) {
        this.mEnabled = i;
    }

    public final void setMWakeWords(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mWakeWords = str;
    }

    @aa1
    public String toString() {
        return "BleSGKeywordAwake(mEnabled=" + this.mEnabled + ", mWakeWords=" + this.mWakeWords + ", mAssistant=" + this.mAssistant + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleSGKeywordAwake(int i, @aa1 String mWakeWords, @aa1 String mAssistant) {
        Intrinsics.X0O(mWakeWords, "mWakeWords");
        Intrinsics.X0O(mAssistant, "mAssistant");
        this.mEnabled = i;
        this.mWakeWords = mWakeWords;
        this.mAssistant = mAssistant;
    }

    public /* synthetic */ BleSGKeywordAwake(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
