package com.jieli.jl_rcsp.task.contacts;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i0XO1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceContacts {

    /* JADX INFO: renamed from: a */
    public short f38094a;

    /* JADX INFO: renamed from: b */
    public String f38095b;

    /* JADX INFO: renamed from: c */
    public String f38096c;

    public DeviceContacts(short s, String str, String str2) {
        this.f38094a = s;
        this.f38095b = str;
        this.f38096c = str2;
    }

    public static List<DeviceContacts> fromData(short s, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null && bArr.length >= 40) {
            for (int i = 0; i <= bArr.length - 40; i += 40) {
                byte[] bArr2 = new byte[20];
                byte[] bArr3 = new byte[20];
                System.arraycopy(bArr, i, bArr2, 0, 20);
                System.arraycopy(bArr, i + 20, bArr3, 0, 20);
                arrayList.add(new DeviceContacts(s, new String(bArr2).trim(), new String(bArr3).trim()));
            }
        }
        return arrayList;
    }

    public static byte[] getTextData(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes();
        while (bytes.length > 20) {
            str = str.substring(0, str.length() - 1);
            bytes = str.getBytes();
        }
        return bytes;
    }

    public static String toString(List<DeviceContacts> list) {
        if (list == null || list.size() < 1) {
            return "no contacts";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<DeviceContacts> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    public short getFileId() {
        return this.f38094a;
    }

    public String getMobile() {
        return this.f38096c;
    }

    public String getName() {
        return this.f38095b;
    }

    public void setMobile(String str) {
        this.f38096c = str;
    }

    public void setName(String str) {
        this.f38095b = str;
    }

    public byte[] toData() {
        byte[] textData = getTextData(this.f38095b);
        byte[] textData2 = getTextData(this.f38096c);
        return ByteBuffer.allocate(40).put(textData).put(new byte[20 - textData.length]).put(textData2).put(new byte[20 - textData2.length]).array();
    }

    public String toString() {
        return "DeviceContacts{fileId=" + ((int) this.f38094a) + ", name='" + this.f38095b + "', mobile='" + this.f38096c + '\'' + i0XO1.f7442IO;
    }

    public static byte[] toData(List<DeviceContacts> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(list.size() * 40);
        Iterator<DeviceContacts> it = list.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next().toData());
        }
        return byteBufferAllocate.array();
    }
}
