package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class NfcFile {
    private NfcMsg message;
    private byte[] nfcData;

    public NfcFile(NfcMsg r1, byte[] r2) {
        setMessage(r1);
        setNfcData(r2);
    }

    public byte[] convertRawData() {
        byte[] r0 = this.message.convertRawData();
        byte[] r1 = new byte[r0.length + this.nfcData.length];
        if (r0.length <= 0) goto L5;
        System.arraycopy(r0, 0, r1, 0, r0.length);
        int r2 = r0.length;
    L6:
        byte[] r3 = this.nfcData;
        if (r3.length <= 0) goto L9;
        System.arraycopy(r3, 0, r1, r2, r3.length);
    L9:
        return r1;
    L5:
        r2 = 0;
        goto L6
    }

    public NfcMsg getMessage() {
        return this.message;
    }

    public byte[] getNfcData() {
        return this.nfcData;
    }

    public void setMessage(NfcMsg r1) {
        this.message = r1;
    }

    public void setNfcData(byte[] r1) {
        this.nfcData = r1;
    }

    public String toString() {
        return "NfcFile{message=" + this.message + ", nfcData=" + Arrays.toString(this.nfcData) + i0XO1.IO;
    }
}
