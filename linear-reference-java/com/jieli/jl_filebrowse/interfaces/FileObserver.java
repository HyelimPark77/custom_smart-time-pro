package com.jieli.jl_filebrowse.interfaces;

import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface FileObserver {
    void OnFlayCallback(boolean r1);

    void onFileReadFailed(int r1);

    void onFileReadStart();

    void onFileReadStop(boolean r1);

    void onFileReceiver(List<FileStruct> r1);

    void onSdCardStatusChange(List<SDCardBean> r1);
}
