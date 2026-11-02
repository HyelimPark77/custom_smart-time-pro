package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleLogText extends BleReadable {
    private static final int COMOTION_HEADER_HIGH_BYTE_OFFSET = 3;
    private static final int COMOTION_HEADER_MASK = 252;
    private static final int COMOTION_HEADER_V1 = 196;
    private static final int COMOTION_RECORDS_PER_BLOCK = 2;
    private static final int COMOTION_RECORD_LENGTH = 32;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int ITEM_LENGTH = 64;

    @aa1
    private String mContent;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasCoMotionHeader(@aa1 byte[] bytes, int i) {
            Intrinsics.X0O(bytes, "bytes");
            return i >= 0 && i + 32 <= bytes.length && (bytes[i + 3] & 252) == 196;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleLogText() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleLogText copy$default(BleLogText bleLogText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleLogText.mContent;
        }
        return bleLogText.copy(str);
    }

    @aa1
    public final List<byte[]> coMotionRecords() {
        byte[] mBytes = getMBytes();
        if (mBytes == null) {
            return CollectionsKt__CollectionsKt.m39402iI();
        }
        if (mBytes.length == 64) {
            Companion companion = Companion;
            if (companion.hasCoMotionHeader(mBytes, 0)) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(ArraysKt___ArraysJvmKt.I0IIOI(mBytes, 0, 32));
                if (companion.hasCoMotionHeader(mBytes, 32)) {
                    arrayList.add(ArraysKt___ArraysJvmKt.I0IIOI(mBytes, 32, 64));
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.m39402iI();
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleLogText copy(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        return new BleLogText(mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        String str;
        super.decode();
        byte[] mBytes = getMBytes();
        if (mBytes != null) {
            if (mBytes.length == 0) {
                return;
            }
            if (Companion.hasCoMotionHeader(mBytes, 0)) {
                this.mContent = "";
                return;
            }
            int iOO1XIX = ArraysKt___ArraysKt.OO1XIX(mBytes, (byte) 0);
            if (iOO1XIX == -1) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.O10IXXX0X(UTF_8, "UTF_8");
                str = new String(mBytes, UTF_8);
            } else {
                Charset UTF_9 = StandardCharsets.UTF_8;
                Intrinsics.O10IXXX0X(UTF_9, "UTF_8");
                str = new String(mBytes, 0, iOO1XIX, UTF_9);
            }
            this.mContent = str;
        }
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleLogText) && Intrinsics.XOO0ii0(this.mContent, ((BleLogText) obj).mContent);
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public int hashCode() {
        return this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    @aa1
    public String toString() {
        return "BleLogText(mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleLogText(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        this.mContent = mContent;
    }

    public /* synthetic */ BleLogText(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
