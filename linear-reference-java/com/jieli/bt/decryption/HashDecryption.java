package com.jieli.bt.decryption;

/* JADX INFO: loaded from: classes17.dex */
public final class HashDecryption {
    static {
        System.loadLibrary("jl_enc");
    }

    public HashDecryption() {
    }

    public static void decrypt(byte[] r0, int r1, byte[] r2, int r3, byte[] r4) {
        decryptData(r0, r1, r2, r3, r4);
    }

    private static native void decryptData(byte[] r0, int r1, byte[] r2, int r3, byte[] r4);
}
