package com.jieli.jl_fatfs.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class CallInfo {
    private String name;
    private String phone;

    public CallInfo() {
    }

    public byte[] getBytes() {
        String r0 = this.name;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (this.phone == null) goto L18;
        byte[] r1 = new byte[40];
        byte[] r2 = r0.getBytes();
        int r3 = r2.length;
        int r4 = 19;
        if (r3 <= 19) goto L10;
        r3 = 19;
    L10:
        System.arraycopy(r2, 0, r1, 0, r3);
        byte[] r5 = this.phone.getBytes();
        int r6 = r5.length;
        if (r6 > 19) goto L14;
        r4 = r6;
    L14:
        System.arraycopy(r5, 0, r1, 20, r4);
        return r1;
    L18:
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setPhone(String r1) {
        this.phone = r1;
    }

    public String toString() {
        return "CallInfo{name='" + this.name + "', phone='" + this.phone + '\'' + i0XO1.IO;
    }

    public CallInfo(String r1, String r2) {
        setName(r1);
        setPhone(r2);
    }
}
