package com.jieli.jl_filebrowse.interfaces;

import com.jieli.jl_filebrowse.bean.FileStruct;

/* JADX INFO: loaded from: classes17.dex */
public interface DeleteCallback {
    void onError(int r1, FileStruct r2);

    void onFinish();

    void onSuccess(FileStruct r1);
}
