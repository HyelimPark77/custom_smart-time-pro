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
public final class BleXMLYBandSet extends BleWritable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 68;

    @aa1
    private String mEncrypt;

    @aa1
    private String mRandom;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleXMLYBandSet() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleXMLYBandSet copy$default(BleXMLYBandSet bleXMLYBandSet, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleXMLYBandSet.mRandom;
        }
        if ((i & 2) != 0) {
            str2 = bleXMLYBandSet.mEncrypt;
        }
        return bleXMLYBandSet.copy(str, str2);
    }

    @aa1
    public final String component1() {
        return this.mRandom;
    }

    @aa1
    public final String component2() {
        return this.mEncrypt;
    }

    @aa1
    public final BleXMLYBandSet copy(@aa1 String mRandom, @aa1 String mEncrypt) {
        Intrinsics.X0O(mRandom, "mRandom");
        Intrinsics.X0O(mEncrypt, "mEncrypt");
        return new BleXMLYBandSet(mRandom, mEncrypt);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        Charset charset = Charsets.IiI10X;
        this.mRandom = readString(34, charset);
        this.mEncrypt = readString(34, charset);
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public void encode() {
        super.encode();
        String str = this.mRandom;
        Charset charset = Charsets.IiI10X;
        writeStringWithFix(str, 34, charset);
        writeStringWithFix(this.mEncrypt, 34, charset);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleXMLYBandSet)) {
            return false;
        }
        BleXMLYBandSet bleXMLYBandSet = (BleXMLYBandSet) obj;
        return Intrinsics.XOO0ii0(this.mRandom, bleXMLYBandSet.mRandom) && Intrinsics.XOO0ii0(this.mEncrypt, bleXMLYBandSet.mEncrypt);
    }

    @aa1
    public final String getMEncrypt() {
        return this.mEncrypt;
    }

    @Override // com.bestmafen.baseble.data.BleWritable
    public int getMLengthToWrite() {
        return 68;
    }

    @aa1
    public final String getMRandom() {
        return this.mRandom;
    }

    public int hashCode() {
        return (this.mRandom.hashCode() * 31) + this.mEncrypt.hashCode();
    }

    public final void setMEncrypt(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mEncrypt = str;
    }

    public final void setMRandom(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mRandom = str;
    }

    @aa1
    public String toString() {
        return "BleXMLYBandSet(mRandom=" + this.mRandom + ", mEncrypt=" + this.mEncrypt + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleXMLYBandSet(@aa1 String mRandom, @aa1 String mEncrypt) {
        Intrinsics.X0O(mRandom, "mRandom");
        Intrinsics.X0O(mEncrypt, "mEncrypt");
        this.mRandom = mRandom;
        this.mEncrypt = mEncrypt;
    }

    public /* synthetic */ BleXMLYBandSet(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
