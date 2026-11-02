package com.jieli.jl_rcsp.interfaces.network;

/* JADX INFO: loaded from: classes17.dex */
public interface OnNetworkOTACallback {
    void onCancel();

    void onError(int r1, String r2);

    void onProgress(int r1);

    void onStart();

    void onStop();
}
