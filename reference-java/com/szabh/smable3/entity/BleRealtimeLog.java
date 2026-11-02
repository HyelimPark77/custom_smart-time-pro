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

    public static /* synthetic */ BleRealtimeLog copy$default(BleRealtimeLog bleRealtimeLog, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bleRealtimeLog.mContent;
        }
        return bleRealtimeLog.copy(str);
    }

    @aa1
    public final String component1() {
        return this.mContent;
    }

    @aa1
    public final BleRealtimeLog copy(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        return new BleRealtimeLog(mContent);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        String string;
        super.decode();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS    ", Locale.getDefault());
        if (getMBytes() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(simpleDateFormat.format(new Date()));
            byte[] mBytes = getMBytes();
            Intrinsics.XXI(mBytes);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.O10IXXX0X(UTF_8, "UTF_8");
            sb.append(new String(mBytes, UTF_8));
            string = sb.toString();
        } else {
            string = simpleDateFormat.format(new Date()) + "null";
        }
        this.mContent = string;
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BleRealtimeLog) && Intrinsics.XOO0ii0(this.mContent, ((BleRealtimeLog) obj).mContent);
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
        return "BleRealtimeLog(mContent=" + this.mContent + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BleRealtimeLog(@aa1 String mContent) {
        Intrinsics.X0O(mContent, "mContent");
        this.mContent = mContent;
    }

    public /* synthetic */ BleRealtimeLog(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
