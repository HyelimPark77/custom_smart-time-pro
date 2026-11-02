package com.jieli.jl_bt_ota.interfaces;

import com.jieli.jl_bt_ota.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface IActionCallback<T> {
    void onError(BaseError r1);

    void onSuccess(T r1);
}
