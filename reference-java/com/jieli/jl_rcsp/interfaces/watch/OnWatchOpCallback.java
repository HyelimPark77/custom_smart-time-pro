package com.jieli.jl_rcsp.interfaces.watch;

import com.jieli.jl_rcsp.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface OnWatchOpCallback<T> {
    void onFailed(BaseError baseError);

    void onSuccess(T t);
}
