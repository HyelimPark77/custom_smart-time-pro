package com.jieli.bmp_convert;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.C12616d4;
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

    /* JADX INFO: renamed from: d */
    public static final String f37457d = "BmpConvert";

    /* JADX INFO: renamed from: e */
    public static final int[] f37458e = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static boolean isLog = false;

    /* JADX INFO: renamed from: a */
    public volatile boolean f37459a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f37460b;

    /* JADX INFO: renamed from: c */
    public final Handler f37461c = new Handler(Looper.getMainLooper());

    static {
        try {
            System.loadLibrary("jl_bmp_convert");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BmpConvert() {
        m26863b(C12616d4.a.f34169f, String.format(Locale.ENGLISH, "Library name = %s(%d), clazz : %s", getLibVersionName(), Integer.valueOf(getLibVersionCode()), this));
    }

    public static int getLibVersionCode() {
        return BuildConfig.VERSION_CODE;
    }

    public static String getLibVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m26859a(final OnConvertListener onConvertListener, final String str, ConvertParam convertParam, int i, final String str2) {
        if (onConvertListener != null) {
            this.f37461c.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.I011XI
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1053IO.m26858a(onConvertListener, str);
                }
            });
        }
        if (convertParam == null) {
            convertParam = new ConvertParam();
        }
        final ConvertResult convertResultBitmapConvertAndCompressBlock = bitmapConvertAndCompressBlock(i, str, str2, convertParam);
        if (onConvertListener != null) {
            this.f37461c.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OXOIIOi1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3503IO.m26857a(convertResultBitmapConvertAndCompressBlock, onConvertListener, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m26862b(String str) {
        if (!isLog || str == null || str.isEmpty()) {
            return;
        }
        Log.i(f37457d, str);
    }

    @Deprecated
    public void bitmapConvert(String str, String str2, OnConvertListener onConvertListener) {
        bitmapConvert(0, str, str2, onConvertListener);
    }

    public ConvertResult bitmapConvertAndCompressBlock(int i, String str, String str2) {
        return bitmapConvertAndCompressBlock(i, str, str2, new ConvertParam());
    }

    public int bitmapConvertBlock(int i, String str, String str2) {
        ConvertResult convertResultBitmapConvertAndCompressBlock = bitmapConvertAndCompressBlock(i, str, str2);
        return convertResultBitmapConvertAndCompressBlock == null ? ERR_INVALID_PARAM : convertResultBitmapConvertAndCompressBlock.getResult();
    }

    public native ConvertResult bmpConvert_native(int i, String str, int i2, int i3, String str2, ConvertParam convertParam);

    public boolean isWorking() {
        return this.f37459a;
    }

    public void release() {
        m26863b("release", "clazz : " + this);
        ExecutorService executorService = this.f37460b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f37460b.shutdownNow();
        }
        this.f37460b = null;
        this.f37459a = false;
        this.f37461c.removeCallbacksAndMessages(null);
    }

    public void bitmapConvert(int i, String str, String str2, OnConvertListener onConvertListener) {
        bitmapConvert(i, str, str2, new ConvertParam(), onConvertListener);
    }

    public ConvertResult bitmapConvertAndCompressBlock(int i, String str, String str2, ConvertParam convertParam) {
        File file;
        String str3 = str;
        if (m26860a(i)) {
            m26863b("bitmapConvertAndCompressBlock", "Unknown Type : " + i);
            return new ConvertResult().setAlgorithm(i).setResult(ERR_INVALID_PARAM);
        }
        File file2 = new File(str3);
        if (!file2.exists() || !file2.isFile()) {
            m26863b("bitmapConvertAndCompressBlock", "File not found. path : " + str3);
            return new ConvertResult().setAlgorithm(i).setResult(ERR_NOT_FOUND_FILE);
        }
        if (isWorking()) {
            m26863b("bitmapConvertAndCompressBlock", "Conversion in progress.");
            return new ConvertResult().setAlgorithm(i).setResult(ERR_IN_PROGRESS);
        }
        this.f37459a = true;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str3, options);
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (i != 9) {
            int i2 = width * height;
            int[] iArr = new int[i2];
            bitmapDecodeFile.getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i2 * 4];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 << 2;
                int i5 = iArr[i3];
                bArr[i4] = (byte) (i5 & 255);
                bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
                bArr[i4 + 2] = (byte) ((i5 >> 16) & 255);
                bArr[i4 + 3] = (byte) ((i5 >> 24) & 255);
            }
            str3 = str3.substring(0, str3.lastIndexOf(FileUtils.FILE_EXTENSION_SEPARATOR)) + ".bin";
            file = new File(str3);
            try {
                if (file.exists() && !file.delete()) {
                    m26863b("bitmapConvertAndCompressBlock", "Failed to delete file. path : " + str3);
                }
                if (!file.createNewFile()) {
                    m26863b("bitmapConvertAndCompressBlock", "Failed to create new file. path : " + str3);
                    this.f37459a = false;
                    return new ConvertResult().setAlgorithm(i).setResult(ERR_IO_EXCEPTION);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str3);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                m26863b("bitmapConvertAndCompressBlock", "IOException : " + e);
                this.f37459a = false;
                return new ConvertResult().setAlgorithm(i).setResult(ERR_IO_EXCEPTION);
            }
        } else {
            if (!m26861a(file2.getName())) {
                m26863b("bitmapConvertAndCompressBlock", "It's not a JPG image.");
                return new ConvertResult().setAlgorithm(i).setResult(ERR_FILE_TYPE);
            }
            file = null;
        }
        File file3 = file;
        String str4 = str3;
        ConvertResult convertResultBmpConvert_native = bmpConvert_native(i, str4, width, height, str2, convertParam);
        m26863b("bitmapConvertAndCompressBlock", "result : " + convertResultBmpConvert_native);
        if (convertResultBmpConvert_native.isConvertSuccess() && file3 != null && file3.exists() && !file3.delete()) {
            m26863b("bitmapConvertAndCompressBlock", "Failed to delete cache file. path : " + str4);
        }
        this.f37459a = false;
        return convertResultBmpConvert_native;
    }

    /* JADX INFO: renamed from: b */
    public final void m26863b(String str, String str2) {
        m26862b(m26856a(str, str2));
    }

    public void bitmapConvert(final int i, final String str, final String str2, final ConvertParam convertParam, final OnConvertListener onConvertListener) {
        ExecutorService executorService = this.f37460b;
        if (executorService == null || executorService.isShutdown()) {
            this.f37460b = Executors.newSingleThreadExecutor();
        }
        this.f37460b.submit(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OI0X1XI1
            @Override // java.lang.Runnable
            public final void run() {
                this.f2888IO.m26859a(onConvertListener, str, convertParam, i, str2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m26858a(OnConvertListener onConvertListener, String str) {
        m26863b("bitmapConvert", "start");
        onConvertListener.onStart(str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m26857a(ConvertResult convertResult, OnConvertListener onConvertListener, String str) {
        m26863b("bitmapConvert", "end ... " + convertResult);
        if (convertResult.isConvertSuccess()) {
            onConvertListener.onStop(true, str);
        } else {
            onConvertListener.onStop(false, (String) null);
        }
        onConvertListener.onStop(convertResult, str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26860a(int i) {
        for (int i2 : f37458e) {
            if (i2 == i) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26861a(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(".jpg") || str.endsWith(".JPG") || str.endsWith(".jpeg") || str.endsWith(".JPEG");
    }

    /* JADX INFO: renamed from: a */
    public final String m26856a(String str, String str2) {
        return String.format(Locale.ENGLISH, "[%s]\t%s", str, str2);
    }
}
