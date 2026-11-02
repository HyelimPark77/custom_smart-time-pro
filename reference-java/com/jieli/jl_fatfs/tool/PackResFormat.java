package com.jieli.jl_fatfs.tool;

import com.jieli.jl_fatfs.model.PackFileInfo;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class PackResFormat {

    /* JADX INFO: renamed from: b */
    public static final String f37780b = "PackResFormat";

    /* JADX INFO: renamed from: a */
    public volatile long f37781a;

    static {
        try {
            System.loadLibrary("jl_pack_format");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PackResFormat() {
        this.f37781a = 0L;
        this.f37781a = libInit();
        if (this.f37781a == 0) {
            throw new RuntimeException("init lib failed.");
        }
    }

    public void destroy() {
        libDestroy(this.f37781a);
        this.f37781a = 0L;
    }

    public native byte[] getFileData(long j, String str);

    public byte[] getFileData(String str) {
        return getFileData(this.f37781a, str);
    }

    public native void libDestroy(long j);

    public native long libInit();

    public native ArrayList<PackFileInfo> uncompressData(long j, byte[] bArr);

    public ArrayList<PackFileInfo> uncompressPackDataFile(byte[] bArr) {
        return uncompressData(this.f37781a, bArr);
    }

    public byte[] getFileData(byte[] bArr, String str) {
        ArrayList<PackFileInfo> arrayListUncompressPackDataFile = uncompressPackDataFile(bArr);
        if (arrayListUncompressPackDataFile == null || arrayListUncompressPackDataFile.isEmpty()) {
            JL_Log.m27880e(f37780b, "getFileData", "Did not extract the file.");
            return null;
        }
        JL_Log.m27883i(f37780b, "getFileData", RcspUtil.formatString("========= Unzip file :[%d], target : %s =========", Integer.valueOf(arrayListUncompressPackDataFile.size()), str));
        Iterator<PackFileInfo> it = arrayListUncompressPackDataFile.iterator();
        while (it.hasNext()) {
            JL_Log.m27877d(f37780b, "getFileData", it.next().toString());
        }
        JL_Log.m27883i(f37780b, "getFileData", "================= Unzip file End ===============");
        return getFileData(str);
    }
}
