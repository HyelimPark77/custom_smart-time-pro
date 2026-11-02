package com.jieli.watchtesttool.util;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.jieli.bluetooth_connect.util.BluetoothUtil;
import com.jieli.bluetooth_connect.util.ConnectUtil;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class AppUtil {
    public AppUtil() {
    }

    public static int convertOtaConnectStatus(int r2) {
        if (r2 != 1) goto L5;
        return 3;
    L5:
        if (r2 == 2) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static int convertWatchConnectStatus(int r2) {
        if (r2 != 1) goto L5;
        return 3;
    L5:
        if (r2 == 2) goto L8;
        return 0;
    L8:
        return 1;
    }

    public static void copyAssets(Context r7, String r8, String r9) {
        String[] r0 = r7.getAssets().list(r8);     // Catch: Exception -> L18
        int r2 = 0;
        if (r0.length <= 0) goto L12;
        File r1 = new File(r9);     // Catch: Exception -> L18
        if (r1.exists() == false) goto L7;
    L9:
        int r3 = r0.length;     // Catch: Exception -> L18
    L10:
        if (r2 >= r3) goto L25;
        String r4 = r0[r2];     // Catch: Exception -> L18
        StringBuilder r5 = new StringBuilder();     // Catch: Exception -> L18
        r5.append(r8);     // Catch: Exception -> L18
        String r6 = File.separator;     // Catch: Exception -> L18
        r5.append(r6);     // Catch: Exception -> L18
        r5.append(r4);     // Catch: Exception -> L18
        copyAssets(r7, r5.toString(), r9 + r6 + r4);     // Catch: Exception -> L18
        r2 = r2 + 1;     // Catch: Exception -> L18
        goto L10
    L25:
        return;
    L7:
        if (r1.mkdirs() == true) goto L9;
        return;
    L12:
        InputStream r10 = r7.getAssets().open(r8);     // Catch: Exception -> L18
        FileOutputStream r11 = new FileOutputStream(new File(r9));     // Catch: Exception -> L18
        byte[] r12 = new byte[1024];     // Catch: Exception -> L18
    L13:
        int r13 = r10.read(r12);     // Catch: Exception -> L18
        if (r13 == (-1)) goto L16;
        r11.write(r12, 0, r13);     // Catch: Exception -> L18
        goto L13
    L16:
        r11.flush();     // Catch: Exception -> L18
        r10.close();     // Catch: Exception -> L18
        r11.close();     // Catch: Exception -> L18
        return;
    L18:
        e = move-exception;
        e.printStackTrace();
    }

    public static String createFilePath(Context r5, String... r6) {
        if (r5 == null) goto L28;
        if (r6 == null) goto L28;
        if (r6.length == 0) goto L28;
        File r7 = r5.getExternalFilesDir(null);
        if (r7 == null) goto L28;
        if (r7.exists() == false) goto L28;
        StringBuilder r0 = new StringBuilder(r7.getPath());
        int r2 = 0;
        if (r0.toString().endsWith("/") == false) goto L16;
        r0 = new StringBuilder(r0.substring(0, r0.lastIndexOf("/")));
    L16:
        int r8 = r6.length;
    L17:
        if (r2 >= r8) goto L27;
        String r3 = r6[r2];
        r0.append("/");
        r0.append(r3);
        File r4 = new File(r0.toString());
        if (r4.exists() == false) goto L23;
        if (r4.isFile() == true) goto L23;
    L25:
        r2 = r2 + 1;
    L23:
        if (r4.mkdir() == true) goto L25;
        Log.w("jieli", "create dir failed. filePath = " + r0);
    L27:
        return r0.toString();
    L28:
        return null;
    }

    @NonNull
    public static String formatOTATime(int r2) {
        return String.format(Locale.getDefault(), ScarConstants.TOKEN_WITH_SCAR_FORMAT, new Object[]{formatTime(r2 / 60), formatTime(r2 % 60)});
    }

    @NonNull
    public static String formatTime(int r2) {
        if (r2 > 0) goto L6;
        return "00";
    L6:
        if (r2 >= 10) goto L10;
        return "0" + r2;
    L10:
        return String.valueOf(r2);
    }

    @SuppressLint({"MissingPermission"})
    public static String getDeviceName(BluetoothDevice r1) {
        if (r1 != null) goto L5;
        return null;
    L5:
        String r0 = r1.getName();
        if (r0 == null) goto L8;
        return r0;
    L8:
        return r1.getAddress();
    }

    public static String getFileNameByPath(String r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        int r0 = r2.lastIndexOf("/");
        if (r0 > (-1)) goto L8;
        return r2;
    L8:
        return r2.substring(r0 + 1);
    }

    @NonNull
    public static String getFileSizeDesc(long r2) {
        if (r2 < 1048576) goto L7;
        return String.format(Locale.getDefault(), "%.1f MB", new Object[]{Double.valueOf(r2 / 1048576.0d)});
    L7:
        return String.format(Locale.getDefault(), "%.1f KB", new Object[]{Double.valueOf(r2 / 1024.0d)});
    }

    public static BluetoothDevice getRemoteDevice(String r1) {
        return BluetoothUtil.getRemoteDevice(ConnectUtil.getContext(), r1);
    }

    public static int getTextValue(@NonNull EditText r1) {
        return getTextValue(r1, 0);
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

    public static String printBtDeviceInfo(BluetoothDevice r1) {
        return BluetoothUtil.printBtDeviceInfo(ConnectUtil.getContext(), r1);
    }

    public static int getTextValue(@NonNull EditText r1, int r2) {
        String r3 = r1.getText().toString().trim();
        if (TextUtils.isEmpty(r3) == false) goto L10;
    L9:
        return r2;
    L10:
        return Integer.parseInt(r3);
    L7:
        e = move-exception;
        e.printStackTrace();
        goto L9
    }
}
