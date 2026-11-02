package com.jieli.jl_rcsp.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes17.dex */
public class TestLog {
    public TestLog() {
    }

    public static void a(String r2, String r3, String r4) {
        System.out.println(r2 + "--->" + r3 + CertificateUtil.DELIMITER + r4);
    }

    public static void d(String r1, String r2) {
        a("d", r1, r2);
    }

    public static void e(String r1, String r2) {
        a("e", r1, r2);
    }

    public static void i(String r1, String r2) {
        a(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, r1, r2);
    }

    public static void v(String r1, String r2) {
        a("v", r1, r2);
    }

    public static void w(String r1, String r2) {
        a("w", r1, r2);
    }
}
