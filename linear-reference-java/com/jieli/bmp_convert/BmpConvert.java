package com.jieli.bmp_convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.mltcode.paycertificationapi.I011XI;
import com.android.mltcode.paycertificationapi.OI0X1XI1;
import com.android.mltcode.paycertificationapi.OXOIIOi1;
import com.ironsource.C2985d4;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes17.dex */
public class BmpConvert {
    public static final int ERR_FILE_TYPE = -3588;
    public static final int ERR_INVALID_PARAM = -3584;
    public static final int ERR_IN_PROGRESS = -3587;
    public static final int ERR_IO_EXCEPTION = -3586;
    public static final int ERR_NOT_FOUND_FILE = -3585;
    public static final int TYPE_695N_RBG = 0;
    public static final int TYPE_701N_ARGB = 2;
    public static final int TYPE_701N_ARGB_NO_PACK = 4;
    public static final int TYPE_701N_JPEG = 9;
    public static final int TYPE_701N_RGB = 1;
    public static final int TYPE_701N_RGB_NO_PACK = 3;
    public static final int TYPE_707N_ARGB = 6;
    public static final int TYPE_707N_ARGB_NO_PACK = 8;
    public static final int TYPE_707N_RGB = 5;
    public static final int TYPE_707N_RGB_NO_PACK = 7;

    @Deprecated
    public static final int TYPE_BR_23 = 0;

    @Deprecated
    public static final int TYPE_BR_28 = 1;

    @Deprecated
    public static final int TYPE_BR_28_ALPHA = 2;

    @Deprecated
    public static final int TYPE_BR_28_ALPHA_RAW = 4;

    @Deprecated
    public static final int TYPE_BR_28_RAW = 3;
    public static final String d = "BmpConvert";
    public static final int[] e = null;
    public static boolean isLog = false;
    public volatile boolean a;
    public ExecutorService b;
    public final Handler c;

    static {
        e = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.loadLibrary("jl_bmp_convert");     // Catch: Exception -> L5
        return;
    L5:
        e = move-exception;
        e.printStackTrace();
    }

    public BmpConvert() {
        this.c = new Handler(Looper.getMainLooper());
        b(C2985d4.a.f, String.format(Locale.ENGLISH, "Library name = %s(%d), clazz : %s", new Object[]{getLibVersionName(), Integer.valueOf(getLibVersionCode()), this}));
    }

    public static int getLibVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public static String getLibVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    public final /* synthetic */ void a(final OnConvertListener r3, final String r4, ConvertParam r5, int r6, final String r7) {
        if (r3 == null) goto L4;
        this.c.post(new I011XI(this, r3, r4));
    L4:
        if (r5 != null) goto L6;
        r5 = new ConvertParam();
    L6:
        final ConvertResult r8 = bitmapConvertAndCompressBlock(r6, r4, r7, r5);
        if (r3 == null) goto L10;
        this.c.post(new OXOIIOi1(this, r8, r3, r7));
        return;
    }

    public final void b(String r2) {
        if (isLog == false) goto L10;
        if (r2 != null) goto L6;
        return;
    L6:
        if (r2.isEmpty() == true) goto L12;
        Log.i(d, r2);
        return;
    L12:
        return;
    }

    @Deprecated
    public void bitmapConvert(String r2, String r3, OnConvertListener r4) {
        bitmapConvert(0, r2, r3, r4);
    }

    public ConvertResult bitmapConvertAndCompressBlock(int r2, String r3, String r4) {
        return bitmapConvertAndCompressBlock(r2, r3, r4, new ConvertParam());
    }

    public int bitmapConvertBlock(int r1, String r2, String r3) {
        ConvertResult r4 = bitmapConvertAndCompressBlock(r1, r2, r3);
        if (r4 != null) goto L7;
        return ERR_INVALID_PARAM;
    L7:
        return r4.getResult();
    }

    public native ConvertResult bmpConvert_native(int r1, String r2, int r3, int r4, String r5, ConvertParam r6);

    public boolean isWorking() {
        return this.a;
    }

    public void release() {
        b("release", "clazz : " + this);
        ExecutorService r0 = this.b;
        if (r0 != null) goto L5;
    L7:
        this.b = null;
        this.a = false;
        this.c.removeCallbacksAndMessages(null);
        return;
    L5:
        if (r0.isShutdown() == true) goto L7;
        this.b.shutdownNow();
        goto L7
    }

    public void bitmapConvert(int r7, String r8, String r9, OnConvertListener r10) {
        bitmapConvert(r7, r8, r9, new ConvertParam(), r10);
    }

    public ConvertResult bitmapConvertAndCompressBlock(int r18, String r19, String r20, ConvertParam r21) {
        String r0 = r19;
        if (a(r18) == false) goto L6;
        b("bitmapConvertAndCompressBlock", "Unknown Type : " + r18);
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_INVALID_PARAM);
    L6:
        File r3 = new File(r0);
        if (r3.exists() == true) goto L9;
    L52:
        b("bitmapConvertAndCompressBlock", "File not found. path : " + r0);
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_NOT_FOUND_FILE);
    L9:
        if (r3.isFile() == false) goto L52;
        if (isWorking() == false) goto L15;
        b("bitmapConvertAndCompressBlock", "Conversion in progress.");
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_IN_PROGRESS);
    L15:
        this.a = true;
        BitmapFactory.Options r4 = new BitmapFactory.Options();
        r4.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap r9 = BitmapFactory.decodeFile(r0, r4);
        int r12 = r9.getWidth();
        int r16 = r9.getHeight();
        if (r18 == 9) goto L18;
        int r5 = r12 * r16;
        int[] r10 = new int[r5];
        r9.getPixels(r10, 0, r12, 0, 0, r12, r16);
        byte[] r6 = new byte[r5 * 4];
        int r7 = 0;
    L24:
        if (r7 >= r5) goto L26;
        int r8 = r7 << 2;
        int r11 = r10[r7];
        r6[r8] = (byte) (r11 & 255);
        r6[r8 + 1] = (byte) ((r11 >> 8) & 255);
        r6[r8 + 2] = (byte) ((r11 >> 16) & 255);
        r6[r8 + 3] = (byte) ((r11 >> 24) & 255);
        r7 = r7 + 1;
        goto L24
    L26:
        r0 = r0.substring(0, r0.lastIndexOf(FileUtils.FILE_EXTENSION_SEPARATOR)) + ".bin";
        File r13 = new File(r0);
    L32:
        e = move-exception;
        e.printStackTrace();
        b("bitmapConvertAndCompressBlock", "IOException : " + e);
        this.a = false;
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_IO_EXCEPTION);
    L28:
        if (r13.exists() == false) goto L35;
        if (r13.delete() == true) goto L35;
        b("bitmapConvertAndCompressBlock", "Failed to delete file. path : " + r0);     // Catch: IOException -> L32
    L35:
        if (r13.createNewFile() == true) goto L38;
        b("bitmapConvertAndCompressBlock", "Failed to create new file. path : " + r0);     // Catch: IOException -> L32
        this.a = false;     // Catch: IOException -> L32
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_IO_EXCEPTION);
    L38:
        FileOutputStream r14 = new FileOutputStream(r0);     // Catch: IOException -> L32
        r14.write(r6);     // Catch: IOException -> L32
        r14.close();     // Catch: IOException -> L32
    L22:
        File r15 = r13;
        String r17 = r0;
        ConvertResult r2 = bmpConvert_native(r18, r17, r12, r16, r20, r21);
        b("bitmapConvertAndCompressBlock", "result : " + r2);
        if (r2.isConvertSuccess() == false) goto L48;
        if (r15 == null) goto L48;
        if (r15.exists() == false) goto L48;
        if (r15.delete() == true) goto L48;
        b("bitmapConvertAndCompressBlock", "Failed to delete cache file. path : " + r17);
    L48:
        this.a = false;
        return r2;
    L18:
        if (a(r3.getName()) == true) goto L21;
        b("bitmapConvertAndCompressBlock", "It's not a JPG image.");
        return new ConvertResult().setAlgorithm(r18).setResult(ERR_FILE_TYPE);
    L21:
        r13 = null;
        goto L22
    }

    public final void b(String r1, String r2) {
        b(a(r1, r2));
    }

    public void bitmapConvert(final int r9, final String r10, final String r11, final ConvertParam r12, final OnConvertListener r13) {
        ExecutorService r0 = this.b;
        if (r0 != null) goto L5;
    L6:
        this.b = Executors.newSingleThreadExecutor();
    L7:
        this.b.submit(new OI0X1XI1(this, r13, r10, r12, r9, r11));
        return;
    L5:
        if (r0.isShutdown() == false) goto L7;
        goto L6
    }

    public final /* synthetic */ void a(OnConvertListener r3, String r4) {
        b("bitmapConvert", "start");
        r3.onStart(r4);
    }

    public final /* synthetic */ void a(ConvertResult r3, OnConvertListener r4, String r5) {
        b("bitmapConvert", "end ... " + r3);
        if (r3.isConvertSuccess() == false) goto L5;
        r4.onStop(true, r5);
    L6:
        r4.onStop(r3, r5);
        return;
    L5:
        r4.onStop(false, null);
        goto L6
    }

    public final boolean a(int r6) {
        int[] r0 = e;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r0[r3] == r6) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return false;
    L8:
        return true;
    }

    public final boolean a(String r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if (r3.endsWith(".jpg") == false) goto L8;
        return true;
    L8:
        if (r3.endsWith(".JPG") == false) goto L10;
        return true;
    L10:
        if (r3.endsWith(".jpeg") == false) goto L12;
        return true;
    L12:
        if (r3.endsWith(".JPEG") == true) goto L19;
        return false;
    L19:
        return true;
    }

    public final String a(String r2, String r3) {
        return String.format(Locale.ENGLISH, "[%s]\t%s", new Object[]{r2, r3});
    }
}
