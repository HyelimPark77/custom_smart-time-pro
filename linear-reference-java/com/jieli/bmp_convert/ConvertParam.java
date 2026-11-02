package com.jieli.bmp_convert;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class ConvertParam {
    public static final int FORMAT_ARGB_8565 = 1;
    public static final int FORMAT_ARGB_8888 = 2;
    public static final int FORMAT_AUTO = 0;
    public int a;

    public ConvertParam() {
        this.a = 0;
    }

    public int getFormat() {
        return this.a;
    }

    public ConvertParam setFormat(int r1) {
        this.a = r1;
        return this;
    }

    public String toString() {
        return "ConvertParam{format=" + this.a + i0XO1.IO;
    }
}
