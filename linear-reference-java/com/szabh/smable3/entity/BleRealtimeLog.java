package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleRealtimeLog extends BleReadable {

    @aa1
    private String mContent;

    /* JADX WARN: Multi-variable type inference failed */
    public BleRealtimeLog() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BleRealtimeLog copy$default(BleRealtimeLog r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.mContent;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleRealtimeLog copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        return new BleRealtimeLog(r2);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        SimpleDateFormat r0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS    ", Locale.getDefault());
        if (getMBytes() == null) goto L5;
        StringBuilder r1 = new StringBuilder();
        r1.append(r0.format(new Date()));
        byte[] r2 = getMBytes();
        Intrinsics.XXI(r2);
        Charset r3 = StandardCharsets.UTF_8;
        Intrinsics.O10IXXX0X(r3, "UTF_8");
        r1.append(new String(r2, r3));
        String r4 = r1.toString();
    L6:
        this.mContent = r4;
        return;
    L5:
        r4 = r0.format(new Date()) + "null";
        goto L6
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof BleRealtimeLog) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.mContent, ((BleRealtimeLog) r4).mContent) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public int hashCode() {
        return this.mContent.hashCode();
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    @aa1
    public String toString() {
        return "BleRealtimeLog(mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRealtimeLog(@aa1 String r2) {
        Intrinsics.X0O(r2, "mContent");
        this.mContent = r2;
    }

    public /* synthetic */ BleRealtimeLog(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
