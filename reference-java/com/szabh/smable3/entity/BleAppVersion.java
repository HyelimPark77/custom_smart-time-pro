package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.entity.BleAppVersion;
import com.tenmeter.smlibrary.utils.FileUtils;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleAppVersion extends BleReadable {

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 4;

    @aa1
    private String mVersion;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleAppVersion() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleAppVersion copy$default(BleAppVersion bleAppVersion, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleAppVersion.mVersion;
        }
        return bleAppVersion.copy(str);
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

    @aa1
    public final BleAppVersion copy(@aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        return new BleAppVersion(mVersion);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        String strI0I;
        super.decode();
        byte[] mBytes = getMBytes();
        if (mBytes == null || (strI0I = ArraysKt___ArraysKt.i0I(mBytes, FileUtils.FILE_EXTENSION_SEPARATOR, null, null, 0, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.ii1i0X1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BleAppVersion.decode$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, null)) == null) {
            strI0I = "";
        }
        this.mVersion = strI0I;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleAppVersion) && Intrinsics.XOO0ii0(this.mVersion, ((BleAppVersion) obj).mVersion);
    }

    @aa1
    public final String getMVersion() {
        return this.mVersion;
    }

    public int hashCode() {
        return this.mVersion.hashCode();
    }

    public final void setMVersion(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mVersion = str;
    }

    @aa1
    public String toString() {
        return "BleAppVersion(mVersion=" + this.mVersion + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleAppVersion(@aa1 String mVersion) {
        Intrinsics.X0O(mVersion, "mVersion");
        this.mVersion = mVersion;
    }

    public /* synthetic */ BleAppVersion(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
