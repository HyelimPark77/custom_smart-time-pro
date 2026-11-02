package com.jieli.jl_fatfs.tool;

import com.jieli.jl_fatfs.model.PackFileInfo;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class PackResFormat {
    public static final String b = "PackResFormat";
    public volatile long a;

    static {
        System.loadLibrary("jl_pack_format");     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    public PackResFormat() {
        this.a = 0;
        this.a = libInit();
        if (this.a == 0) goto L6;
        return;
    L6:
        throw new RuntimeException("init lib failed.");
    }

    public void destroy() {
        libDestroy(this.a);
        this.a = 0;
    }

    public native byte[] getFileData(long r1, String r3);

    public byte[] getFileData(String r3) {
        return getFileData(this.a, r3);
    }

    public native void libDestroy(long r1);

    public native long libInit();

    public native ArrayList<PackFileInfo> uncompressData(long r1, byte[] r3);

    public ArrayList<PackFileInfo> uncompressPackDataFile(byte[] r3) {
        return uncompressData(this.a, r3);
    }

    public byte[] getFileData(byte[] r5, String r6) {
        ArrayList<PackFileInfo> r7 = uncompressPackDataFile(r5);
        if (r7 != null) goto L5;
    L12:
        JL_Log.e(b, "getFileData", "Did not extract the file.");
        return null;
    L5:
        if (r7.isEmpty() == true) goto L12;
        JL_Log.i(b, "getFileData", RcspUtil.formatString("========= Unzip file :[%d], target : %s =========", new Object[]{Integer.valueOf(r7.size()), r6}));
        Iterator<PackFileInfo> r8 = r7.iterator();
    L8:
        if (r8.hasNext() == false) goto L10;
        PackFileInfo r1 = r8.next();
        JL_Log.d(b, "getFileData", r1.toString());
        goto L8
    L10:
        JL_Log.i(b, "getFileData", "================= Unzip file End ===============");
        return getFileData(r6);
    }
}
