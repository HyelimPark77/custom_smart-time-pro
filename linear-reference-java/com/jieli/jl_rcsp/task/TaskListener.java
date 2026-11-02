package com.jieli.jl_rcsp.task;

/* JADX INFO: loaded from: classes17.dex */
public interface TaskListener {
    void onBegin();

    void onCancel(int r1);

    void onError(int r1, String r2);

    void onFinish();

    void onProgress(int r1);
}
