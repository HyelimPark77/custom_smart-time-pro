package com.jieli.jl_bt_ota.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.ironsource.Y5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class FileUtil {
    public static final int FILE_TYPE_PIC = 1;
    public static final int FILE_TYPE_UNKNOWN = 0;
    public static final int FILE_TYPE_VIDEO = 2;
    private static final String a = "FileUtil";

    public FileUtil() {
    }

    private static String a(Context r3) {
        String r0 = Environment.getExternalStorageDirectory().getPath();
        if (Build.VERSION.SDK_INT < 29) goto L11;
        if (r3 == null) goto L11;
        File r4 = r3.getExternalFilesDir(null);
        if (r4 == null) goto L11;
        return r4.getPath();
    L11:
        return r0;
    }

    public static boolean bitmapToFile(Bitmap r2, String r3, int r4) {
        if (r2 != null) goto L4;
    L33:
        return false;
    L4:
        if (TextUtils.isEmpty(r3) == true) goto L33;
        FileOutputStream r0 = null;
        FileOutputStream r1 = new FileOutputStream(r3);     // Catch: Throwable -> L17 IOException -> L19
        r2.compress(Bitmap.CompressFormat.JPEG, r4, r1);     // Catch: Throwable -> L13 IOException -> L15
        r1.flush();     // Catch: IOException -> L10
        r1.close();     // Catch: IOException -> L10
    L12:
        return true;
    L10:
        e = move-exception;
        e.printStackTrace();
        goto L12
    L15:
        e = e;
        r0 = r1;
    L20:
        e.printStackTrace();     // Catch: Throwable -> L17
        if (r0 == null) goto L33;
        r0.flush();     // Catch: IOException -> L24
        r0.close();     // Catch: IOException -> L24
    L24:
        e = move-exception;
        e.printStackTrace();
    L13:
        th = th;
    L27:
        if (r1 != null) goto L40;
    L32:
        throw th;
    L40:
        r1.flush();     // Catch: IOException -> L30
        r1.close();     // Catch: IOException -> L30
    L30:
        e = move-exception;
        e.printStackTrace();
    L19:
        e = e;
    L17:
        th = th;
        r1 = r0;
        goto L27
    }

    public static boolean bytesToFile(byte[] r2, String r3) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (TextUtils.isEmpty(r3) == true) goto L47;
        FileOutputStream r0 = null;
        FileOutputStream r1 = new FileOutputStream(r3);     // Catch: Throwable -> L18 IOException -> L20
        r1.write(r2);     // Catch: Throwable -> L14 IOException -> L16
    L40:
        r1.close();     // Catch: IOException -> L11
        return true;
    L11:
        e = move-exception;
        e.printStackTrace();
        return true;
    L16:
        e = e;
        r0 = r1;
    L21:
        e.printStackTrace();     // Catch: Throwable -> L18
        if (r0 == null) goto L48;
        r0.close();     // Catch: IOException -> L25
        return false;
    L25:
        e = move-exception;
        e.printStackTrace();
        return false;
    L48:
        return false;
    L14:
        th = th;
    L28:
        if (r1 != null) goto L38;
    L33:
        throw th;
    L38:
        r1.close();     // Catch: IOException -> L31
    L31:
        e = move-exception;
        e.printStackTrace();
    L18:
        th = th;
        r1 = r0;
    L20:
        e = e;
        goto L21
    L47:
        return false;
    }

    public static boolean checkFileExist(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L5;
        return false;
    L5:
        return new File(r1).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void copyFromAssetsToSdcard(Context r3, boolean r4, String r5, String r6) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
        return;
    L5:
        if (TextUtils.isEmpty(r6) == true) goto L101;
        File r0 = new File(r6);
        if (r4 == true) goto L91;
        if (r4 == false) goto L10;
        return;
    L10:
        if (r0.exists() == false) goto L91;
        return;
    L91:
        r3 = r3.getResources().getAssets().open(r5);     // Catch: Throwable -> L38 IOException -> L40 FileNotFoundException -> L42
        FileOutputStream r7 = new FileOutputStream(r6);     // Catch: Throwable -> L32 IOException -> L34 FileNotFoundException -> L36
    L92:
        byte[] r8 = new byte[1024];     // Catch: Throwable -> L20 IOException -> L22 FileNotFoundException -> L24
    L16:
        int r1 = r3.read(r8, 0, 1024);     // Catch: Throwable -> L20 IOException -> L22 FileNotFoundException -> L24
        if (r1 < 0) goto L85;
        r7.write(r8, 0, r1);     // Catch: Throwable -> L20 IOException -> L22 FileNotFoundException -> L24
    L85:
        r7.close();     // Catch: IOException -> L28
    L30:
        r3.close();     // Catch: IOException -> L64
    L80:
        return;
    L28:
        e = move-exception;
        e.printStackTrace();
    L24:
        FileNotFoundException e = e;
    L55:
        e.printStackTrace();     // Catch: Throwable -> L20
        if (r7 != null) goto L87;
    L61:
        if (r3 == 0) goto L105;
        r3.close();     // Catch: IOException -> L64
        goto L80
    L105:
        return;
    L87:
        r7.close();     // Catch: IOException -> L59
    L59:
        e = move-exception;
        e.printStackTrace();
    L22:
        IOException e2 = e;
    L45:
        e2.printStackTrace();     // Catch: Throwable -> L20
        if (r7 != null) goto L78;
    L51:
        if (r3 == 0) goto L104;
        r3.close();     // Catch: IOException -> L64
        goto L80
    L104:
        return;
    L78:
        r7.close();     // Catch: IOException -> L49
    L49:
        e = move-exception;
        e.printStackTrace();
    L36:
        FileNotFoundException e3 = e;
    L54:
        FileNotFoundException r2 = e3;
        r7 = null;
        e = r2;
    L34:
        IOException e4 = e;
    L44:
        IOException r9 = e4;
        r7 = null;
        e2 = r9;
    L32:
        th = move-exception;
        r5 = 0;
        th = th;
    L66:
        if (r5 != 0) goto L89;
    L71:
        if (r3 == 0) goto L98;
        r3.close();     // Catch: IOException -> L74
        throw th;
    L74:
        e = move-exception;
        e.printStackTrace();
        throw th;
    L98:
        throw th;
    L89:
        r5.close();     // Catch: IOException -> L69
    L69:
        e = move-exception;
        e.printStackTrace();
        goto L71
    L64:
        e = move-exception;
        e.printStackTrace();
        return;
    L42:
        e = move-exception;
        e3 = e;
        r3 = 0;
    L40:
        e = move-exception;
        e4 = e;
        r3 = 0;
    L38:
        th = move-exception;
        r5 = 0;
        th = th;
        r3 = 0;
    L20:
        th = th;
        goto L66
    }

    public static void deleteFile(File r7) {
        if (r7 != null) goto L4;
        return;
    L4:
        if (r7.exists() == true) goto L7;
        return;
    L7:
        if (r7.isFile() == false) goto L13;
        if (r7.delete() == false) goto L32;
        JL_Log.i(a, Y5.b.b, "delete file success!");
        return;
    L32:
        return;
    L13:
        if (r7.isDirectory() == false) goto L33;
        File[] r0 = r7.listFiles();
        if (r0 == null) goto L27;
        if (r0.length == 0) goto L27;
        int r4 = r0.length;
        int r5 = 0;
    L20:
        if (r5 >= r4) goto L23;
        deleteFile(r0[r5]);
        r5 = r5 + 1;
        goto L20
    L23:
        if (r7.delete() == false) goto L34;
        JL_Log.i(a, Y5.b.b, "delete empty file success!");
        return;
    L34:
        return;
    L27:
        if (r7.delete() == false) goto L35;
        JL_Log.i(a, Y5.b.b, "delete empty file success!");
        return;
    L35:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.io.FileInputStream] */
    public static byte[] getBytes(String r6) {
        byte[] r0 = null;
        ?? r1 = 0;
        r0 = null;
        r0 = null;
        if (r6 != 0) goto L5;
    L82:
        return null;
    L5:
        if (r6.isEmpty() == true) goto L82;
        File r2 = new File(r6);
        r6 = new FileInputStream(r2);     // Catch: Throwable -> L40 IOException -> L42 FileNotFoundException -> L44
        ByteArrayOutputStream r3 = new ByteArrayOutputStream();     // Catch: Throwable -> L32 IOException -> L34 FileNotFoundException -> L36
    L97:
        byte[] r4 = new byte[1024];     // Catch: Throwable -> L16 IOException -> L18 FileNotFoundException -> L20
    L12:
        int r5 = r6.read(r4);     // Catch: Throwable -> L16 IOException -> L18 FileNotFoundException -> L20
        if (r5 == (-1)) goto L83;
        r3.write(r4, 0, r5);     // Catch: Throwable -> L16 IOException -> L18 FileNotFoundException -> L20
    L83:
        r3.close();     // Catch: IOException -> L24
    L26:
        r0 = r3.toByteArray();
        r6.close();     // Catch: IOException -> L29
    L92:
    L69:
        return r0;
    L24:
        e = move-exception;
        e.printStackTrace();
    L20:
        FileNotFoundException e = e;
    L58:
        e.printStackTrace();     // Catch: Throwable -> L16
        if (r3 != null) goto L90;
    L65:
        if (r6 == 0) goto L69;
        r6.close();     // Catch: IOException -> L29
        goto L92
    L90:
        r3.close();     // Catch: IOException -> L62
    L64:
        r0 = r3.toByteArray();
    L62:
        e = move-exception;
        e.printStackTrace();
    L18:
        IOException e2 = e;
    L47:
        e2.printStackTrace();     // Catch: Throwable -> L16
        if (r3 != null) goto L86;
    L54:
        if (r6 == 0) goto L69;
        r6.close();     // Catch: IOException -> L29
        goto L92
    L86:
        r3.close();     // Catch: IOException -> L51
    L53:
        r0 = r3.toByteArray();
    L51:
        e = move-exception;
        e.printStackTrace();
    L36:
        e = move-exception;
        e = e;
        r3 = null;
    L34:
        e = move-exception;
        e2 = e;
        r3 = null;
    L32:
        Throwable th = th;
    L70:
        if (r1 != 0) goto L95;
    L76:
        if (r6 != 0) goto L88;
    L81:
        throw th;
    L88:
        r6.close();     // Catch: IOException -> L79
    L79:
        e = move-exception;
        e.printStackTrace();
        goto L81
    L95:
        r1.close();     // Catch: IOException -> L73
    L75:
        r1.toByteArray();
    L73:
        e = move-exception;
        e.printStackTrace();
        goto L75
    L16:
        Throwable th2 = th;
    L31:
        File r7 = r2;
        th = th2;
        r1 = r7;
    L44:
        e = move-exception;
        e = e;
        r6 = 0;
        r3 = null;
    L42:
        e = move-exception;
        e2 = e;
        r6 = 0;
        r3 = null;
    L40:
        th = move-exception;
        r2 = null;
        th2 = th;
        r6 = 0;
    L29:
        e = move-exception;
        e.printStackTrace();
        goto L69
    }

    public static byte[] getFromRaw(Context r9, int r10) {
        InputStream r0 = null;
        byte[] r1 = null;
        r1 = null;
        r0 = null;
        InputStream r11 = r9.getResources().openRawResource(r10);     // Catch: Throwable -> L25 Exception -> L27
        Runtime r12 = Runtime.getRuntime();     // Catch: Throwable -> L9 Exception -> L11
        int r2 = 512000;
        if (r12 != null) goto L7;
    L13:
        byte[] r13 = new byte[r2];     // Catch: Throwable -> L9 Exception -> L11
        byte[] r3 = new byte[1024];     // Catch: Throwable -> L9 Exception -> L11
        int r5 = 0;
    L14:
        int r6 = r11.read(r3, 0, 1024);     // Catch: Throwable -> L9 Exception -> L11
        if (r6 < 0) goto L19;
        int r7 = r5 + r6;     // Catch: Throwable -> L9 Exception -> L11
        if (r7 > r2) goto L14;
        System.arraycopy(r3, 0, r13, r5, r6);     // Catch: Throwable -> L9 Exception -> L11
        r5 = r7;
        goto L14
    L19:
        if (r5 <= 0) goto L50;
        r1 = new byte[r5];     // Catch: Throwable -> L9 Exception -> L11
        System.arraycopy(r13, 0, r1, 0, r5);     // Catch: Throwable -> L9 Exception -> L11
    L50:
        r11.close();     // Catch: IOException -> L23
        return r1;
    L23:
        IOException e = e;
    L35:
        e.printStackTrace();
        return r1;
    L7:
        if (r12.freeMemory() >= 512000) goto L13;
        r2 = (int) r12.freeMemory();     // Catch: Throwable -> L9 Exception -> L11
    L11:
        e = e;
        byte[] r8 = r1;
        r0 = r11;
        byte[] r14 = r8;
    L29:
        e.printStackTrace();     // Catch: Throwable -> L25
        if (r0 == null) goto L59;
        r0.close();     // Catch: IOException -> L33
        return r14;
    L33:
        e = move-exception;
        r1 = r14;
        e = e;
        goto L35
    L59:
        return r14;
    L9:
        th = th;
        r0 = r11;
    L37:
        if (r0 != null) goto L47;
    L42:
        throw th;
    L47:
        r0.close();     // Catch: IOException -> L40
    L40:
        e = move-exception;
        e.printStackTrace();
    L27:
        e = e;
        r14 = null;
    L25:
        th = th;
        goto L37
    }

    public static int judgeFileType(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L5;
        return 0;
    L5:
        if (r1.endsWith(".png") == false) goto L7;
        return 1;
    L7:
        if (r1.endsWith(".PNG") == false) goto L9;
        return 1;
    L9:
        if (r1.endsWith(".JPEG") == false) goto L11;
        return 1;
    L11:
        if (r1.endsWith(".jpeg") == false) goto L13;
        return 1;
    L13:
        if (r1.endsWith(".jpg") == false) goto L15;
        return 1;
    L15:
        if (r1.endsWith(".JPG") == false) goto L18;
        return 1;
    L18:
        if (r1.endsWith(".mov") == false) goto L20;
        return 2;
    L20:
        if (r1.endsWith(".MOV") == false) goto L22;
        return 2;
    L22:
        if (r1.endsWith(".mp4") == false) goto L24;
        return 2;
    L24:
        if (r1.endsWith(".MP4") == false) goto L26;
        return 2;
    L26:
        if (r1.endsWith(".avi") == false) goto L28;
        return 2;
    L28:
        if (r1.endsWith(".AVI") == false) goto L45;
        return 2;
    L45:
        return 0;
    }

    public static String splicingFilePath(Context r7, String r8, String r9, String r10, String r11) {
        String r12 = a(r7);
        if (TextUtils.isEmpty(r8) == true) goto L45;
        String r0 = File.separator;
        if (r8.contains(r0) == false) goto L16;
        String[] r13 = r8.split(r0);
        int r1 = r13.length;
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L22;
        String r5 = r13[r2];
        if (TextUtils.isEmpty(r5) == true) goto L15;
        r12 = r12 + File.separator + r5;
        File r6 = new File(r12);
        if (r6.exists() == true) goto L15;
        if (r6.mkdir() == false) goto L15;
        JL_Log.w(a, "splicingFilePath", "create root dir success! path : " + r12);
    L15:
        r2 = r2 + 1;
    L22:
        if (TextUtils.isEmpty(r9) == false) goto L24;
        return r12;
    L24:
        StringBuilder r14 = new StringBuilder();
        r14.append(r12);
        String r15 = File.separator;
        r14.append(r15);
        r14.append(r9);
        String r16 = r14.toString();
        File r17 = new File(r16);
        if (r17.exists() == true) goto L30;
        if (r17.mkdir() == false) goto L30;
        JL_Log.w(a, "splicingFilePath", "create one dir success!");
    L30:
        if (TextUtils.isEmpty(r10) == false) goto L32;
        return r16;
    L32:
        String r18 = r16 + r15 + r10;
        File r19 = new File(r18);
        if (r19.exists() == true) goto L38;
        if (r19.mkdir() == false) goto L38;
        JL_Log.w(a, "splicingFilePath", "create two dir success!");
    L38:
        if (TextUtils.isEmpty(r11) == false) goto L40;
        return r18;
    L40:
        r12 = r18 + r15 + r11;
        File r20 = new File(r12);
        if (r20.exists() == true) goto L45;
        if (r20.mkdir() == false) goto L45;
        JL_Log.w(a, "splicingFilePath", "create three sub dir success!");
        goto L45
    L16:
        r12 = r12 + r0 + r8;
        File r21 = new File(r12);
        if (r21.exists() == true) goto L22;
        if (r21.mkdir() == false) goto L22;
        JL_Log.w(a, "splicingFilePath", "create root dir success! path : " + r12);
    L45:
        return r12;
    }
}
