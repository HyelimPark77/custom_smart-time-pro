package com.jieli.jl_filebrowse.interfaces;

import com.jieli.jl_filebrowse.bean.FileStruct;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class SimpleFileObserver implements FileObserver {
    public SimpleFileObserver() {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void OnFlayCallback(boolean r1) {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadFailed(int r1) {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadStart() {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReadStop(boolean r1) {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onFileReceiver(List<FileStruct> r1) {
    }

    @Override // com.jieli.jl_filebrowse.interfaces.FileObserver
    public void onSdCardStatusChange(List<SDCardBean> r1) {
    }
}
