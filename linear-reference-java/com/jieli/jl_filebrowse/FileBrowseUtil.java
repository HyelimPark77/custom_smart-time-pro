package com.jieli.jl_filebrowse;

import androidx.exifinterface.media.ExifInterface;
import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class FileBrowseUtil {
    public static final String a = "FileBrowseUtil";
    public static byte b = 0;
    public static final byte[] c = null;
    public static final byte d = -17;

    static {
        c = new byte[]{-2, -36, -70};
    }

    public FileBrowseUtil() {
    }

    public static byte[] coverPathDataToCmd(PathData r6) {
        if (r6 == null) goto L5;
        byte[] r7 = r6.toData();
        if (r7 == null) goto L14;
        if (r7.length == 0) goto L14;
        short r1 = (short) (r7.length + 1);
        byte[] r2 = new byte[r1 + 8];
        System.arraycopy(c, 0, r2, 0, 3);
        r2[3] = -64;
        r2[4] = 12;
        r2[5] = (byte) (r1 >> 8);
        r2[6] = (byte) (r1 & 255);
        byte r3 = b;
        b = (byte) (r3 + 1);
        r2[7] = r3;
        System.arraycopy(r7, 0, r2, 8, r7.length);
        r2[r1 + 7] = -17;
        JL_Log.d(a, "coverPathDataToCmd", "data : " + CHexConver.byte2HexStr(r2));
        return r2;
    L14:
        return new byte[0];
    L5:
        return new byte[0];
    }

    public static String getDevName(int r2) {
        switch(r2) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L4;
        };
    L5:
        return "Flash3";
    L7:
        return "Flash2";
    L9:
        return "LineIn";
    L11:
        return ExifInterface.TAG_FLASH;
    L13:
        return "SD Card 1";
    L15:
        return "SD Card 0";
    L17:
        return "USB";
    L4:
        return String.format(Locale.ENGLISH, "Unknown Type[%d]", new Object[]{Integer.valueOf(r2)});
    }

    public static List<FileStruct> parseData(byte[] r2) {
        if (r2 == null) goto L9;
        if (r2.length == 0) goto L9;
        ArrayList r0 = new ArrayList();
        FileStruct.parseFileStruct(r2, 0, r0);
        return r0;
    L9:
        return new ArrayList();
    }

    public static List<FileStruct> parseDataHasPacket(byte[] r4) {
        if (r4 == null) goto L9;
        if (r4.length < 10) goto L9;
        int r0 = r4.length - 10;
        byte[] r1 = new byte[r0];
        System.arraycopy(r4, 9, r1, 0, r0);
        return parseData(r1);
    L9:
        return new ArrayList();
    }
}
