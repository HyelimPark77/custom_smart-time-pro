package com.jieli.jl_rcsp.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes17.dex */
public class TestLog {
    /* JADX INFO: renamed from: a */
    public static void m27891a(String str, String str2, String str3) {
        System.out.println(str + "--->" + str2 + CertificateUtil.DELIMITER + str3);
    }

    /* JADX INFO: renamed from: d */
    public static void m27892d(String str, String str2) {
        m27891a("d", str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m27893e(String str, String str2) {
        m27891a("e", str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m27894i(String str, String str2) {
        m27891a(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m27895v(String str, String str2) {
        m27891a("v", str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m27896w(String str, String str2) {
        m27891a("w", str, str2);
    }
}
