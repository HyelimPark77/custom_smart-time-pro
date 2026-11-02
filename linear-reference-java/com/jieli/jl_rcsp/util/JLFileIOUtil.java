package com.jieli.jl_rcsp.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes17.dex */
public class JLFileIOUtil {
    public JLFileIOUtil() {
    }

    public static void isToFile(String r3, InputStream r4) throws IOException {
        FileOutputStream r0 = new FileOutputStream(r3);
        byte[] r5 = new byte[4096];
    L3:
        int r1 = r4.read(r5);
        if (r1 == (-1)) goto L6;
        r0.write(r5, 0, r1);
        goto L3
    L6:
        r0.close();
    }
}
