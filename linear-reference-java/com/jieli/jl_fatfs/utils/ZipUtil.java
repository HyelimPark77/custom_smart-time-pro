package com.jieli.jl_fatfs.utils;

import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.WatchFileUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes17.dex */
public class ZipUtil {
    public static final String a = "ZipUtil";

    static {
    }

    public ZipUtil() {
    }

    public static void a(String r6, String r7, ZipOutputStream r8) throws Exception {
        if (r8 == null) goto L23;
        File r0 = new File(r6 + r7);
        int r2 = 0;
        if (r0.isFile() == false) goto L12;
        ZipEntry r9 = new ZipEntry(r7);
        FileInputStream r10 = new FileInputStream(r0);
        r8.putNextEntry(r9);
        byte[] r11 = new byte[4096];
    L7:
        int r1 = r10.read(r11);
        if (r1 == (-1)) goto L10;
        r8.write(r11, 0, r1);
        goto L7
    L10:
        r8.closeEntry();
        return;
    L12:
        String[] r3 = r0.list();
        if (r3 != null) goto L15;
        return;
    L15:
        if (r3.length > 0) goto L17;
        r8.putNextEntry(new ZipEntry(r7 + File.separator));
        r8.closeEntry();
    L17:
        int r4 = r3.length;
    L18:
        if (r2 >= r4) goto L24;
        a(r6, r7 + File.separator + r3[r2], r8);
        r2 = r2 + 1;
        goto L18
    L24:
        return;
    }

    public static List<File> getFileList(String r4, boolean r5, boolean r6) throws Exception {
        ArrayList r0 = new ArrayList();
        ZipInputStream r1 = new ZipInputStream(new FileInputStream(r4));
    L3:
        ZipEntry r7 = r1.getNextEntry();
        if (r7 == null) goto L13;
        String r2 = r7.getName();
        if (r7.isDirectory() == true) goto L7;
        File r8 = new File(r2);
        if (r6 == false) goto L3;
        r0.add(r8);
        goto L3
    L7:
        File r3 = new File(r2.substring(0, r2.length() - 1));
        if (r5 == false) goto L3;
        r0.add(r3);
        goto L3
    L13:
        r1.close();
        return r0;
    }

    public static void unZipFolder(String r6, String r7) throws Exception {
        ZipInputStream r0 = new ZipInputStream(new FileInputStream(r6));
    L3:
        ZipEntry r8 = r0.getNextEntry();
        if (r8 == null) goto L51;
        String r1 = r8.getName();
        if (r1.contains("../") == true) goto L50;
        if (r8.isDirectory() == true) goto L9;
        String r9 = r7 + File.separator + r1;
        JL_Log.d(a, "unZipFolder", "path : " + r9);
        File r2 = new File(r9);
        if (r2.exists() == false) goto L24;
        if (r2.delete() == false) goto L40;
        if (r2.createNewFile() == false) goto L3;
    L40:
        String r10 = r2.getCanonicalPath();
        if (r10.startsWith(r7) == false) goto L48;
        FileOutputStream r11 = new FileOutputStream(r2);
        byte[] r3 = new byte[1024];
    L43:
        int r4 = r0.read(r3);
        if (r4 == (-1)) goto L46;
        r11.write(r3, 0, r4);
        r11.flush();
        goto L43
    L46:
        r11.close();
        goto L3
    L48:
        throw new SecurityException("unZipFolder : create file failed." + r10);
    L24:
        File r12 = r2.getParentFile();
    L25:
        if (r12 == null) goto L33;
        if (r12.exists() == true) goto L31;
        if (r12.mkdirs() == false) goto L33;
    L31:
        r12 = r12.getParentFile();
    L33:
        if (r2.createNewFile() == true) goto L40;
    L9:
        String r13 = r7 + File.separator + r1.substring(0, r1.length() - 1);
        File r5 = new File(r13);
        if (r5.exists() == false) goto L15;
        if (WatchFileUtil.deleteFile(r13) == true) goto L17;
        JL_Log.d(a, "unZipFolder", "Failed to delete folder. " + r13);
    L17:
        String r14 = r5.getCanonicalPath();
        if (r14.startsWith(r7) == true) goto L3;
        throw new SecurityException("unZipFolder : mkdir failed." + r14);
    L15:
        if (r5.mkdirs() == true) goto L17;
        JL_Log.d(a, "unZipFolder", "mkdirs failed." + r13);
        goto L17
    L50:
        throw new SecurityException("unZipFolder : Invalid path." + r1);
    L51:
        r0.close();
    }

    public static InputStream upZip(String r1, String r2) throws Exception {
        ZipFile r0 = new ZipFile(r1);
        return r0.getInputStream(r0.getEntry(r2));
    }

    public static void zipFolder(String r2, String r3) throws Exception {
        ZipOutputStream r0 = new ZipOutputStream(new FileOutputStream(r3));
        File r4 = new File(r2);
        a(r4.getParent() + File.separator, r4.getName(), r0);
        r0.finish();
        r0.close();
    }

    public static void unZipFolder(String r1, String r2, String r3) throws Exception {
        File r0 = new File(r2, r3);
        if (r0.exists() == false) goto L6;
        WatchFileUtil.deleteFile(r0.getPath());
    L6:
        if (r0.mkdirs() == false) goto L8;
        r2 = r0.getPath();
    L8:
        unZipFolder(r1, r2);
    }
}
