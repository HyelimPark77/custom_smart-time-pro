package com.jieli.jl_filebrowse.interfaces;

import com.jieli.jl_filebrowse.bean.PathData;

/* JADX INFO: loaded from: classes17.dex */
public interface FileBrowseOperator {
    boolean dataHasPacket();

    void deleteFile(int r1, byte r2, int r3, boolean r4, boolean r5, OperatCallback r6);

    void formatDevice(int r1, OperatCallback r2);

    void sendPathDataCmd(PathData r1, byte[] r2, OperatCallback r3);
}
