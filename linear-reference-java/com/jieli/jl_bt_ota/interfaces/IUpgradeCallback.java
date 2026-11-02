package com.jieli.jl_bt_ota.interfaces;

import com.jieli.jl_bt_ota.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface IUpgradeCallback {
    void onCancelOTA();

    void onError(BaseError r1);

    void onNeedReconnect(String r1, boolean r2);

    void onProgress(int r1, float r2);

    void onStartOTA();

    void onStopOTA();
}
