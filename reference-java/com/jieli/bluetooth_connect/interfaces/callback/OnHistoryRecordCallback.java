package com.jieli.bluetooth_connect.interfaces.callback;

import com.jieli.bluetooth_connect.bean.history.HistoryRecord;

/* JADX INFO: loaded from: classes17.dex */
public interface OnHistoryRecordCallback {
    void onFailed(int code, String message);

    void onSuccess(HistoryRecord record);
}
