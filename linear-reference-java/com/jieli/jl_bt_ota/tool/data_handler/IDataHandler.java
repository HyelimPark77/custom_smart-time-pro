package com.jieli.jl_bt_ota.tool.data_handler;

import com.jieli.jl_bt_ota.model.data.ReceivedDataInfo;
import com.jieli.jl_bt_ota.model.data.SendDataInfo;

/* JADX INFO: loaded from: classes17.dex */
public interface IDataHandler {
    void addRecvData(ReceivedDataInfo r1);

    void addSendData(SendDataInfo<?> r1);

    void release();
}
