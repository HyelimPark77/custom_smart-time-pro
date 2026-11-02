package com.jieli.p600bt.decryption;

/* JADX INFO: loaded from: classes17.dex */
public final class HashDecryption {
    static {
        System.loadLibrary("jl_enc");
    }

    public static void decrypt(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        decryptData(bArr, i, bArr2, i2, bArr3);
    }

    private static native void decryptData(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3);
}
