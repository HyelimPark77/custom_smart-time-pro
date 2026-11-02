package com.jieli.jl_rcsp.util;

import android.text.TextUtils;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class WatchFileUtil {

    /* JADX INFO: renamed from: a */
    public static final String f38372a = "WatchFileUtil";

    public static boolean deleteFile(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleteFile(file2.getPath());
            }
        }
        return file.delete();
    }

    public static String getDirPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = File.separator;
        if (str.equals(str2)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(str2);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static String getFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = File.separator;
        if (str.equals(str2)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(str2);
        if (iLastIndexOf == -1) {
            return str;
        }
        int i = iLastIndexOf + 1;
        return i == str.length() ? getFileName(str.substring(0, iLastIndexOf)) : str.substring(i);
    }

    public static String getJsonFileName(String str) {
        String fileName = getFileName(str);
        if (TextUtils.isEmpty(fileName)) {
            return fileName;
        }
        int iLastIndexOf = fileName.lastIndexOf(FileUtils.FILE_EXTENSION_SEPARATOR);
        if (iLastIndexOf != -1) {
            fileName = fileName.substring(0, iLastIndexOf);
        }
        return fileName + ".json";
    }

    public static boolean isFileExist(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
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

    public static byte[] readFileData(String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        IOException e;
        byte[] bArr;
        FileNotFoundException e2;
        byte[] bArr2;
        IOException e3;
        FileInputStream fileInputStream2 = null;
        bArr = null;
        byte[] bArr3 = null;
        FileInputStream fileInputStream3 = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (file.exists()) {
            try {
                if (file.isFile()) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr4 = new byte[fileInputStream.available()];
                            int i = fileInputStream.read(bArr4);
                            bArr3 = new byte[i];
                            System.arraycopy(bArr4, 0, bArr3, 0, i);
                            try {
                                fileInputStream.close();
                                return bArr3;
                            } catch (IOException e4) {
                                e3 = e4;
                                e3.printStackTrace();
                                return bArr3;
                            }
                        } catch (FileNotFoundException e5) {
                            e2 = e5;
                            byte[] bArr5 = bArr3;
                            fileInputStream3 = fileInputStream;
                            bArr2 = bArr5;
                            e2.printStackTrace();
                            JL_Log.m27887w(f38372a, "readFileData", "file not found");
                            if (fileInputStream3 == null) {
                                return bArr2;
                            }
                            try {
                                fileInputStream3.close();
                                return bArr2;
                            } catch (IOException e6) {
                                bArr3 = bArr2;
                                e3 = e6;
                                e3.printStackTrace();
                                return bArr3;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            byte[] bArr6 = bArr3;
                            fileInputStream2 = fileInputStream;
                            bArr = bArr6;
                            e.printStackTrace();
                            JL_Log.m27887w(f38372a, "readFileData", "error : " + e.getMessage());
                            if (fileInputStream2 == null) {
                                return bArr;
                            }
                            try {
                                fileInputStream2.close();
                                return bArr;
                            } catch (IOException e8) {
                                e8.printStackTrace();
                                return bArr;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e10) {
                        e2 = e10;
                        bArr2 = null;
                    } catch (IOException e11) {
                        e = e11;
                        bArr = null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        }
        JL_Log.m27887w(f38372a, "readFileData", "file path not exist.");
        return null;
    }
}
