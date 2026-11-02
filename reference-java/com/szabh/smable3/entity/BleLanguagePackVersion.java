package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.entity.BleLanguagePackVersion;
import com.tenmeter.smlibrary.utils.FileUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLanguagePackVersion extends BleReadable {
    private int mLanguageCode;

    @aa1
    private String mVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public BleLanguagePackVersion() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleLanguagePackVersion copy$default(BleLanguagePackVersion bleLanguagePackVersion, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bleLanguagePackVersion.mVersion;
        }
        if ((i2 & 2) != 0) {
            i = bleLanguagePackVersion.mLanguageCode;
        }
        return bleLanguagePackVersion.copy(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence decode$lambda$0(byte b) {
        int i = b & 255;
        return i > 9 ? "0" : String.valueOf(i);
    }

    @aa1
    public final String component1() {
        return this.mVersion;
    }

    public final int component2() {
        return this.mLanguageCode;
    }

    @aa1
    public final BleLanguagePackVersion copy(@aa1 String mVersion, int i) {
        Intrinsics.X0O(mVersion, "mVersion");
        return new BleLanguagePackVersion(mVersion, i);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        if (getMBytes() != null) {
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            if (mBytes.length == 4) {
                this.mVersion = ArraysKt___ArraysKt.i0I(readBytes(3), FileUtils.FILE_EXTENSION_SEPARATOR, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.OIOi1X
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return BleLanguagePackVersion.decode$lambda$0(((Byte) obj).byteValue());
                    }
                }, 30, null);
                this.mLanguageCode = readUInt8();
            }
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleLanguagePackVersion)) {
            return false;
        }
        BleLanguagePackVersion bleLanguagePackVersion = (BleLanguagePackVersion) obj;
        return Intrinsics.XOO0ii0(this.mVersion, bleLanguagePackVersion.mVersion) && this.mLanguageCode == bleLanguagePackVersion.mLanguageCode;
    }

    public final int getMLanguageCode() {
        return this.mLanguageCode;
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return (this.mVersion.hashCode() * 31) + Integer.hashCode(this.mLanguageCode);
    }

    public final void setMLanguageCode(int i) {
        this.mLanguageCode = i;
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    @aa1
    public String toString() {
        return "BleLanguagePackVersion(mVersion=" + this.mVersion + ", mLanguageCode=" + this.mLanguageCode + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLanguagePackVersion(@aa1 String mVersion, int i) {
        Intrinsics.X0O(mVersion, "mVersion");
        this.mVersion = mVersion;
        this.mLanguageCode = i;
    }

    public /* synthetic */ BleLanguagePackVersion(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "0.0.0" : str, (i2 & 2) != 0 ? 1 : i);
    }
}
