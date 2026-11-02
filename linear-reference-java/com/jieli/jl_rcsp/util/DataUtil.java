package com.jieli.jl_rcsp.util;

import com.jieli.jl_rcsp.model.LtvBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DataUtil {
    public DataUtil() {
    }

    public static List<LtvBean> parseLTVData2(byte[] r8) {
        if (r8 == null) goto L14;
        if (r8.length <= 2) goto L14;
        ArrayList r0 = new ArrayList();
        int r3 = 0;
    L8:
        if ((r3 + 1) >= r8.length) goto L12;
        int r4 = CHexConver.bytesToInt(r8, r3, 2);
        int r5 = r3 + 2;
        if ((r5 + r4) > r8.length) goto L12;
        int r6 = CHexConver.byteToInt(r8[r5]);
        int r7 = r3 + 3;
        int r9 = r4 - 1;
        byte[] r10 = new byte[r9];
        System.arraycopy(r8, r7, r10, 0, r9);
        r3 = r7 + r9;
        r0.add(new LtvBean(r4, r6, r10));
    L12:
        return r0;
    L14:
        return new ArrayList();
    }
}
