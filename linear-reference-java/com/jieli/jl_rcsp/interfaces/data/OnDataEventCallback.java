package com.jieli.jl_rcsp.interfaces.data;

import com.jieli.jl_rcsp.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface OnDataEventCallback {
    void onBegin(int r1);

    void onError(BaseError r1);

    void onProgress(float r1);

    void onStop(int r1, byte[] r2);
}
