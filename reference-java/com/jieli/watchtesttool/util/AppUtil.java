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
    public static int convertOtaConnectStatus(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 3;
    }

    public static int convertWatchConnectStatus(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 3;
    }

    public static void copyAssets(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                File file = new File(str2);
                if (file.exists() || file.mkdirs()) {
                    for (String str3 : list) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String str4 = File.separator;
                        sb.append(str4);
                        sb.append(str3);
                        copyAssets(context, sb.toString(), str2 + str4 + str3);
                    }
                    return;
                }
                return;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String createFilePath(Context context, String... strArr) {
        File externalFilesDir;
        if (context == null || strArr == null || strArr.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        if (sb.toString().endsWith("/")) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf("/")));
        }
        for (String str : strArr) {
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                Log.w("jieli", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
        }
        return sb.toString();
    }

    @NonNull
    public static String formatOTATime(int i) {
        return String.format(Locale.getDefault(), ScarConstants.TOKEN_WITH_SCAR_FORMAT, formatTime(i / 60), formatTime(i % 60));
    }

    @NonNull
    public static String formatTime(int i) {
        if (i <= 0) {
            return "00";
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    @SuppressLint({"MissingPermission"})
    public static String getDeviceName(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        String name = bluetoothDevice.getName();
        return name == null ? bluetoothDevice.getAddress() : name;
    }

    public static String getFileNameByPath(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        return iLastIndexOf > -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    @NonNull
    public static String getFileSizeDesc(long j) {
        return j >= 1048576 ? String.format(Locale.getDefault(), "%.1f MB", Double.valueOf(j / 1048576.0d)) : String.format(Locale.getDefault(), "%.1f KB", Double.valueOf(j / 1024.0d));
    }

    public static BluetoothDevice getRemoteDevice(String str) {
        return BluetoothUtil.getRemoteDevice(ConnectUtil.getContext(), str);
    }

    public static int getTextValue(@NonNull EditText editText) {
        return getTextValue(editText, 0);
    }

    public static String obtainUpdateFilePath(String str, String str2) {
        File[] fileArrListFiles;
        String strObtainUpdateFilePath = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        if (file.isFile()) {
            if (str.endsWith(str2)) {
                return str;
            }
            return null;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                strObtainUpdateFilePath = obtainUpdateFilePath(file2.getPath(), str2);
                if (strObtainUpdateFilePath != null) {
                    return strObtainUpdateFilePath;
                }
            }
        }
        return strObtainUpdateFilePath;
    }

    public static String printBtDeviceInfo(BluetoothDevice bluetoothDevice) {
        return BluetoothUtil.printBtDeviceInfo(ConnectUtil.getContext(), bluetoothDevice);
    }

    public static int getTextValue(@NonNull EditText editText, int i) {
        String strTrim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            try {
                return Integer.parseInt(strTrim);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }
}
