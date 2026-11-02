package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.OIXOI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.ByteArrayExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BleParser implements OIXOI {

    @aa1
    public static final BleParser INSTANCE = null;

    @aa1
    private static final String LOG_HEADER = "BleParser";

    @aa1
    private static byte[] mData;
    private static int mReceived;

    static {
        INSTANCE = new BleParser();
        mData = new byte[0];
        mReceived = -1;
    }

    private BleParser() {
    }

    @Override // com.android.mltcode.paycertificationapi.OIXOI
    @tb1
    public byte[] onReceive(@aa1 byte[] r11) {
        Intrinsics.X0O(r11, "data");
    L9:
        e = move-exception;
        e.printStackTrace();
        reset();
    L20:
        return null;
    L4:
        if (mReceived == (-1)) goto L6;
        byte[] r4 = r11;
    L13:
        int r12 = mReceived;     // Catch: Exception -> L9
        byte[] r0 = mData;     // Catch: Exception -> L9
        if (r12 >= r0.length) goto L20;
        System.arraycopy(r4, 0, r0, r12, r4.length);     // Catch: Exception -> L9
        mReceived += r4.length;     // Catch: Exception -> L9
        i1O0OXO1O.OXO1.IiI10X("BleParser -> data length=" + mData.length + ", received=" + mReceived);     // Catch: Exception -> L9
        int r13 = mReceived;     // Catch: Exception -> L9
        byte[] r1 = mData;     // Catch: Exception -> L9
        if (r13 < r1.length) goto L20;
        mReceived = -1;     // Catch: Exception -> L9
        return r1;
    L6:
        if (r11[0] == (-85)) goto L11;
        i1O0OXO1O.OXO1.IiI10X("BleParser -> First packet data error : " + ByteArrayExtKt.getMHexString(r11));     // Catch: Exception -> L9
        return null;
    L11:
        r4 = r11;
        mData = new byte[ByteArrayExtKt.getInt$default(r4, 2, 2, null, 4, null) + 6];     // Catch: Exception -> L9
        mReceived = 0;     // Catch: Exception -> L9
        goto L13
    }

    @Override // com.android.mltcode.paycertificationapi.OIXOI
    public void reset() {
        mData = new byte[0];
        mReceived = -1;
    }
}
