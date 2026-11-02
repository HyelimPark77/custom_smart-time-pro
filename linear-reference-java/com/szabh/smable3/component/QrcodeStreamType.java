package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class QrcodeStreamType {

    @aa1
    public static final QrcodeStreamType INSTANCE = null;
    public static final int MY_CARD_CODE = 2;
    public static final int NUCLEIC_ACID_CODE = 0;
    public static final int QRCODE_CODE = 3;
    public static final int RECEIPT_CODE = 1;

    static {
        INSTANCE = new QrcodeStreamType();
    }

    private QrcodeStreamType() {
    }

    public final int getStreamType(boolean r1, int r2) {
        if (r1 == true) goto L4;
        return r2;
    L4:
        return r2 | 128;
    }
}
