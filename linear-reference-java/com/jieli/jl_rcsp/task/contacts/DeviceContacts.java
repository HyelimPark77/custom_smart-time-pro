package com.jieli.jl_rcsp.task.contacts;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i0XO1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceContacts {
    public short a;
    public String b;
    public String c;

    public DeviceContacts(short r1, String r2, String r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public static List<DeviceContacts> fromData(short r8, byte[] r9) {
        ArrayList r0 = new ArrayList();
        if (r9 != null) goto L5;
    L11:
        return r0;
    L5:
        if (r9.length < 40) goto L11;
        int r3 = 0;
    L9:
        if (r3 > (r9.length - 40)) goto L11;
        byte[] r5 = new byte[20];
        byte[] r6 = new byte[20];
        System.arraycopy(r9, r3, r5, 0, 20);
        System.arraycopy(r9, r3 + 20, r6, 0, 20);
        r0.add(new DeviceContacts(r8, new String(r5).trim(), new String(r6).trim()));
        r3 = r3 + 40;
        goto L9
    }

    public static byte[] getTextData(String r4) {
        if (TextUtils.isEmpty(r4) == true) goto L5;
        byte[] r0 = r4.getBytes();
    L8:
        if (r0.length <= 20) goto L10;
        r4 = r4.substring(0, r4.length() - 1);
        r0 = r4.getBytes();
        goto L8
    L10:
        return r0;
    L5:
        return new byte[0];
    }

    public static String toString(List<DeviceContacts> r2) {
        if (r2 != null) goto L4;
        return "no contacts";
    L4:
        if (r2.size() < 1) goto L15;
        StringBuilder r0 = new StringBuilder();
        Iterator<DeviceContacts> r3 = r2.iterator();
    L8:
        if (r3.hasNext() == false) goto L11;
        r0.append(r3.next().toString());
        goto L8
    L11:
        return r0.toString();
    L15:
        return "no contacts";
    }

    public short getFileId() {
        return this.a;
    }

    public String getMobile() {
        return this.c;
    }

    public String getName() {
        return this.b;
    }

    public void setMobile(String r1) {
        this.c = r1;
    }

    public void setName(String r1) {
        this.b = r1;
    }

    public byte[] toData() {
        byte[] r0 = getTextData(this.b);
        byte[] r1 = getTextData(this.c);
        return ByteBuffer.allocate(40).put(r0).put(new byte[20 - r0.length]).put(r1).put(new byte[20 - r1.length]).array();
    }

    public String toString() {
        return "DeviceContacts{fileId=" + this.a + ", name='" + this.b + "', mobile='" + this.c + '\'' + i0XO1.IO;
    }

    public static byte[] toData(List<DeviceContacts> r2) {
        ByteBuffer r0 = ByteBuffer.allocate(r2.size() * 40);
        Iterator<DeviceContacts> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        r0.put(r3.next().toData());
        goto L4
    L7:
        return r0.array();
    }
}
