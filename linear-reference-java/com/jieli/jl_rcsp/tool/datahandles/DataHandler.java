package com.jieli.jl_rcsp.tool.datahandles;

import com.jieli.jl_rcsp.model.DataInfo;

/* JADX INFO: loaded from: classes17.dex */
public interface DataHandler {
    void addRecvData(DataInfo r1);

    void addSendData(DataInfo r1);

    void release();
}
