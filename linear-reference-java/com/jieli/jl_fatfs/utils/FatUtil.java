package com.jieli.jl_fatfs.utils;

import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.jieli.jl_fatfs.model.CallInfo;
import com.jieli.jl_rcsp.constant.WatchError;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class FatUtil {
    public FatUtil() {
    }

    public static byte[] getCallInfoData(List<CallInfo> r5) {
        if (r5 == null) goto L14;
        if (r5.isEmpty() == true) goto L14;
        byte[] r0 = new byte[r5.size() * 40];
        Iterator<CallInfo> r6 = r5.iterator();
        int r2 = 0;
    L8:
        if (r6.hasNext() == false) goto L12;
        byte[] r3 = r6.next().getBytes();
        if (r3 == null) goto L8;
        System.arraycopy(r3, 0, r0, r2, r3.length);
        r2 = r2 + r3.length;
        goto L8
    L12:
        return r0;
    L14:
        return new byte[20];
    }

    public static String getFatFilePath(String r1) {
        return getFatFilePath("/", r1);
    }

    public static String getFatFsErrorCodeMsg(int r0) {
        return WatchError.getErrorDesc(WatchError.fatfsToWatchErr(r0));
    }

    public static String getFatFsName(String r1) {
        return getFatFsName(12, r1);
    }

    public static List<CallInfo> parseCallInfoList(byte[] r7) {
        if (r7 != null) goto L4;
        return null;
    L4:
        if (r7.length < 40) goto L14;
        ArrayList r0 = new ArrayList();
        int r2 = 0;
    L8:
        if ((r7.length - r2) < 40) goto L10;
        String r3 = new String(r7, r2, 20).trim();
        String r4 = new String(r7, r2 + 20, 20).trim();
        r2 = r2 + 40;
        r0.add(new CallInfo(r3, r4));
        goto L8
    L10:
        return r0;
    L14:
        return null;
    }

    public static String getFatFilePath(String r2, String r3) {
        String r4 = WatchFileUtil.getFileName(r3);
        if (r4 != null) goto L5;
        return null;
    L5:
        if (r2 != null) goto L7;
        return null;
    L7:
        String r5 = getFatFsName(r4);
        if (r2.equalsIgnoreCase(r5) == false) goto L10;
        return r2;
    L10:
        if (r2.equalsIgnoreCase("/") == false) goto L14;
        return r2 + r5;
    L14:
        return r2 + "/" + r5;
    }

    public static String getFatFsName(int r4, String r5) {
        if (r5 != null) goto L4;
        return null;
    L4:
        if (r5.isEmpty() == false) goto L7;
        return null;
    L7:
        if (r5.length() <= r4) goto L16;
        int r1 = r5.lastIndexOf(FileUtils.FILE_EXTENSION_SEPARATOR);
        if (r1 == (-1)) goto L14;
        String r2 = r5.substring(0, r1);
        String r6 = r5.substring(r1 + 1);
        int r7 = (r4 - 1) - r6.length();
        if (r7 <= r2.length()) goto L13;
        r7 = r2.length();
    L13:
        r5 = r2.substring(0, r7).replaceAll("\\.", IiXI1X1OO.O00) + FileUtils.FILE_EXTENSION_SEPARATOR + r6;
        goto L16
    L14:
        r5 = r5.substring(0, r4);
    L16:
        return r5.toUpperCase();
    }
}
