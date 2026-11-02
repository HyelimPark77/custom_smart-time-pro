package com.jieli.jl_fatfs.model;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class CallInfo {
    private String name;
    private String phone;

    public CallInfo() {
    }

    public byte[] getBytes() {
        String str = this.name;
        if (str == null || this.phone == null) {
            return null;
        }
        byte[] bArr = new byte[40];
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        if (length > 19) {
            length = 19;
        }
        System.arraycopy(bytes, 0, bArr, 0, length);
        byte[] bytes2 = this.phone.getBytes();
        int length2 = bytes2.length;
        System.arraycopy(bytes2, 0, bArr, 20, length2 <= 19 ? length2 : 19);
        return bArr;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public String toString() {
        return "CallInfo{name='" + this.name + "', phone='" + this.phone + '\'' + i0XO1.f7442IO;
    }

    public CallInfo(String str, String str2) {
        setName(str);
        setPhone(str2);
    }
}
