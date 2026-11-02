package com.jieli.jl_rcsp.interfaces.data;

import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.data.DataParams;
import com.jieli.jl_rcsp.model.data.SendParams;

/* JADX INFO: loaded from: classes17.dex */
public interface IDataTransferOp {
    void addListener(OnDataTransferListener r1);

    void cancelDataTransfer(OnOperationCallback<Boolean> r1);

    boolean isDataTransfer();

    void readLargeData(DataParams r1, OnDataEventCallback r2);

    void removeListener(OnDataTransferListener r1);

    void sendLargeData(SendParams r1, OnDataEventCallback r2);
}
