package com.jieli.jl_filebrowse.interfaces.lrc;

/* JADX INFO: loaded from: classes17.dex */
public interface OnLrcCallback {
    void onLrcDataReceive(byte[] r1);

    void onLrcReadFailed(int r1);

    void onLrcReadStart();

    void onLrcReadStop();
}
