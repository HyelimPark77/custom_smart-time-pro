package com.jieli.bmp_convert;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ConvertParam {
    public static final int FORMAT_ARGB_8565 = 1;
    public static final int FORMAT_ARGB_8888 = 2;
    public static final int FORMAT_AUTO = 0;

    /* JADX INFO: renamed from: a */
    public int f37462a = 0;

    public int getFormat() {
        return this.f37462a;
    }

    public ConvertParam setFormat(int i) {
        this.f37462a = i;
        return this;
    }

    public String toString() {
        return "ConvertParam{format=" + this.f37462a + i0XO1.f7442IO;
    }
}
