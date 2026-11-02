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
    private static final String LOG_HEADER = "BleParser";

    @aa1
    public static final BleParser INSTANCE = new BleParser();

    @aa1
    private static byte[] mData = new byte[0];
    private static int mReceived = -1;

    private BleParser() {
    }

    @Override // com.android.mltcode.paycertificationapi.OIXOI
    @tb1
    public byte[] onReceive(@aa1 byte[] data) {
        byte[] bArr;
        Intrinsics.X0O(data, "data");
        try {
            if (mReceived != -1) {
                bArr = data;
            } else {
                if (data[0] != -85) {
                    i1O0OXO1O.OXO1.IiI10X("BleParser -> First packet data error : " + ByteArrayExtKt.getMHexString(data));
                    return null;
                }
                bArr = data;
                mData = new byte[ByteArrayExtKt.getInt$default(bArr, 2, 2, null, 4, null) + 6];
                mReceived = 0;
            }
            int i = mReceived;
            byte[] bArr2 = mData;
            if (i < bArr2.length) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
                mReceived += bArr.length;
                i1O0OXO1O.OXO1.IiI10X("BleParser -> data length=" + mData.length + ", received=" + mReceived);
                int i2 = mReceived;
                byte[] bArr3 = mData;
                if (i2 >= bArr3.length) {
                    mReceived = -1;
                    return bArr3;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            reset();
        }
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.OIXOI
    public void reset() {
        mData = new byte[0];
        mReceived = -1;
    }
}
