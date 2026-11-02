package com.jieli.jl_rcsp.util;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoUtil {
    static {
        System.loadLibrary("jl_crc");
    }

    public CryptoUtil() {
    }

    public static short CRC16(byte[] r0, short r1) {
        if (r0 != null) goto L6;
        return 0;
    L6:
        return crc16(r0, r1);
    }

    private static native short crc16(byte[] r0, short r1);
}
