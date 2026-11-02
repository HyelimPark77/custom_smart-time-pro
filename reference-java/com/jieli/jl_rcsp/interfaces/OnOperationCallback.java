package com.jieli.jl_rcsp.interfaces;

import com.jieli.jl_rcsp.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface OnOperationCallback<T> {
    void onFailed(BaseError baseError);

    void onSuccess(T t);
}
