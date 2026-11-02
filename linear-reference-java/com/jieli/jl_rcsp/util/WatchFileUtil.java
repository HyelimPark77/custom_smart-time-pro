package com.jieli.jl_rcsp.util;

import android.text.TextUtils;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class WatchFileUtil {
    public static final String a = "WatchFileUtil";

    static {
    }

    public WatchFileUtil() {
    }

    public static boolean deleteFile(String r4) {
        int r0 = 0;
        if (r4 != null) goto L5;
        return false;
    L5:
        File r1 = new File(r4);
        if (r1.exists() == true) goto L9;
        return false;
    L9:
        if (r1.isFile() == false) goto L13;
        return r1.delete();
    L13:
        if (r1.isDirectory() == false) goto L21;
        File[] r5 = r1.listFiles();
        if (r5 == null) goto L20;
        int r2 = r5.length;
    L17:
        if (r0 >= r2) goto L20;
        deleteFile(r5[r0].getPath());
        r0 = r0 + 1;
    L20:
        return r1.delete();
    L21:
        return false;
    }

    public static String getDirPath(String r2) {
        if (TextUtils.isEmpty(r2) == true) goto L12;
        String r0 = File.separator;
        if (r2.equals(r0) == true) goto L14;
        int r1 = r2.lastIndexOf(r0);
        if (r1 != (-1)) goto L11;
        return r2;
    L11:
        return r2.substring(0, r1);
    L14:
        return null;
    L12:
        return null;
    }

    public static String getFileName(String r3) {
        if (TextUtils.isEmpty(r3) == true) goto L16;
        String r0 = File.separator;
        if (r3.equals(r0) == true) goto L18;
        int r1 = r3.lastIndexOf(r0);
        if (r1 != (-1)) goto L10;
        return r3;
    L10:
        int r2 = r1 + 1;
        if (r2 != r3.length()) goto L15;
        return getFileName(r3.substring(0, r1));
    L15:
        return r3.substring(r2);
    L18:
        return "";
    L16:
        return "";
    }

    public static String getJsonFileName(String r2) {
        String r3 = getFileName(r2);
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return r3;
    L5:
        int r0 = r3.lastIndexOf(FileUtils.FILE_EXTENSION_SEPARATOR);
        if (r0 == (-1)) goto L9;
        r3 = r3.substring(0, r0);
    L9:
        return r3 + ".json";
    }

    public static boolean isFileExist(String r2) {
        if (r2 != null) goto L5;
        return false;
    L5:
        File r1 = new File(r2);
        if (r1.exists() == true) goto L8;
    L11:
        return false;
    L8:
        if (r1.isFile() == false) goto L11;
        return true;
    }

    public static String obtainUpdateFilePath(String r3, String r4) {
        String r0 = null;
        if (r3 != null) goto L5;
        return null;
    L5:
        File r1 = new File(r3);
        if (r1.exists() == true) goto L9;
        return null;
    L9:
        if (r1.isFile() == false) goto L15;
        if (r3.endsWith(r4) == false) goto L13;
        return r3;
    L13:
        return null;
    L15:
        if (r1.isDirectory() == false) goto L24;
        File[] r5 = r1.listFiles();
        if (r5 == null) goto L24;
        int r2 = r5.length;
        int r6 = 0;
    L19:
        if (r6 >= r2) goto L24;
        r0 = obtainUpdateFilePath(r5[r6].getPath(), r4);
        if (r0 != null) goto L22;
        r6 = r6 + 1;
        goto L19
    L22:
        return r0;
    L24:
        return r0;
    }

    public static byte[] readFileData(String r7) {
        FileInputStream r0 = null;
        byte[] r1 = null;
        r1 = null;
        FileInputStream r2 = null;
        if (r7 != null) goto L5;
        return null;
    L5:
        File r3 = new File(r7);
        if (r3.exists() == true) goto L56;
    L52:
        JL_Log.w(a, "readFileData", "file path not exist.");
        return null;
    L56:
        if (r3.isFile() == false) goto L52;
        FileInputStream r8 = new FileInputStream(r3);     // Catch: Throwable -> L23 IOException -> L25 FileNotFoundException -> L27
    L65:
        byte[] r4 = new byte[r8.available()];     // Catch: Throwable -> L15 IOException -> L17 FileNotFoundException -> L19
        int r5 = r8.read(r4);     // Catch: Throwable -> L15 IOException -> L17 FileNotFoundException -> L19
        r1 = new byte[r5];     // Catch: Throwable -> L15 IOException -> L17 FileNotFoundException -> L19
        System.arraycopy(r4, 0, r1, 0, r5);     // Catch: Throwable -> L15 IOException -> L17 FileNotFoundException -> L19
        r8.close();     // Catch: IOException -> L13
        return r1;
    L13:
        IOException e = e;
    L44:
        e.printStackTrace();
        return r1;
    L19:
        FileNotFoundException e2 = e;
        byte[] r6 = r1;
        r2 = r8;
        byte[] r9 = r6;
    L38:
        e2.printStackTrace();     // Catch: Throwable -> L23
        JL_Log.w(a, "readFileData", "file not found");     // Catch: Throwable -> L23
        if (r2 == null) goto L69;
        r2.close();     // Catch: IOException -> L42
        return r9;
    L42:
        e = move-exception;
        r1 = r9;
        e = e;
        goto L44
    L69:
        return r9;
    L17:
        IOException e3 = e;
        byte[] r10 = r1;
        r0 = r8;
        byte[] r11 = r10;
    L30:
        e3.printStackTrace();     // Catch: Throwable -> L23
        JL_Log.w(a, "readFileData", "error : " + e3.getMessage());     // Catch: Throwable -> L23
        if (r0 == null) goto L67;
        r0.close();     // Catch: IOException -> L34
        return r11;
    L34:
        e = move-exception;
        e.printStackTrace();
        return r11;
    L67:
        return r11;
    L15:
        Throwable th = th;
    L46:
        if (r8 != null) goto L54;
    L51:
        throw th;
    L54:
        r8.close();     // Catch: IOException -> L49
    L49:
        e = move-exception;
        e.printStackTrace();
    L27:
        e = move-exception;
        e2 = e;
        r9 = null;
    L25:
        e = move-exception;
        e3 = e;
        r11 = null;
    L23:
        th = move-exception;
        th = th;
        r8 = null;
        goto L46
    }
}
