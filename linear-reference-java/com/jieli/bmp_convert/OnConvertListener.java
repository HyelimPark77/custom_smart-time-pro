package com.jieli.bmp_convert;

/* JADX INFO: loaded from: classes17.dex */
public interface OnConvertListener {
    void onStart(String r1);

    void onStop(ConvertResult r1, String r2);

    @Deprecated
    void onStop(boolean r1, String r2);
}
