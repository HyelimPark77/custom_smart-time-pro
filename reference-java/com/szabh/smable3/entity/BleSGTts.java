package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleSGTts extends BleReadable {

    @aa1
    private Charset mCharset;

    @aa1
    private String mTts;

    /* JADX WARN: Multi-variable type inference failed */
    public BleSGTts() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleSGTts copy$default(BleSGTts bleSGTts, Charset charset, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = bleSGTts.mCharset;
        }
        if ((i & 2) != 0) {
            str = bleSGTts.mTts;
        }
        return bleSGTts.copy(charset, str);
    }

    private final boolean isUtf8(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = bArr[i2] & 255;
            if (i3 <= 127) {
                i2++;
            } else if (194 <= i3 && i3 < 224) {
                int i4 = i2 + 1;
                if (i4 >= bArr.length || (bArr[i4] & 192) != 128) {
                    return false;
                }
                i2 += 2;
            } else if (224 <= i3 && i3 < 240) {
                int i5 = i2 + 2;
                if (i5 >= bArr.length || (bArr[i2 + 1] & 192) != 128 || (bArr[i5] & 192) != 128) {
                    return false;
                }
                i2 += 3;
            } else {
                if (240 > i3 || i3 >= 245 || (i = i2 + 3) >= bArr.length || (bArr[i2 + 1] & 192) != 128 || (bArr[i2 + 2] & 192) != 128 || (bArr[i] & 192) != 128) {
                    return false;
                }
                i2 += 4;
            }
        }
        return true;
    }

    @aa1
    public final Charset component1() {
        return this.mCharset;
    }

    @aa1
    public final String component2() {
        return this.mTts;
    }

    @aa1
    public final BleSGTts copy(@aa1 Charset mCharset, @aa1 String mTts) {
        Intrinsics.X0O(mCharset, "mCharset");
        Intrinsics.X0O(mTts, "mTts");
        return new BleSGTts(mCharset, mTts);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        String str;
        super.decode();
        if (getMBytes() != null) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            Charset charsetForName = !isUtf8(mBytes) ? Charset.forName("GBK") : StandardCharsets.UTF_8;
            Intrinsics.XXI(charsetForName);
            this.mCharset = charsetForName;
            byte[] mBytes2 = getMBytes();
            Intrinsics.XXI(mBytes2);
            str = new String(mBytes2, this.mCharset);
        } else {
            str = "";
        }
        this.mTts = str;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSGTts)) {
            return false;
        }
        BleSGTts bleSGTts = (BleSGTts) obj;
        return Intrinsics.XOO0ii0(this.mCharset, bleSGTts.mCharset) && Intrinsics.XOO0ii0(this.mTts, bleSGTts.mTts);
    }

    @aa1
    public final Charset getMCharset() {
        return this.mCharset;
    }

    @aa1
    public final String getMTts() {
        return this.mTts;
    }

    public int hashCode() {
        return (this.mCharset.hashCode() * 31) + this.mTts.hashCode();
    }

    public final void setMCharset(@aa1 Charset charset) {
        Intrinsics.X0O(charset, "<set-?>");
        this.mCharset = charset;
    }

    public final void setMTts(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTts = str;
    }

    @aa1
    public String toString() {
        return "BleSGTTS(mCharset=" + this.mCharset + ", mContent='" + this.mTts + "')";
    }

    public BleSGTts(@aa1 Charset mCharset, @aa1 String mTts) {
        Intrinsics.X0O(mCharset, "mCharset");
        Intrinsics.X0O(mTts, "mTts");
        this.mCharset = mCharset;
        this.mTts = mTts;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleSGTts(Charset UTF_8, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.O10IXXX0X(UTF_8, "UTF_8");
        }
        this(UTF_8, (i & 2) != 0 ? "" : str);
    }
}
