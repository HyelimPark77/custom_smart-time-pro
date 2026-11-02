package com.jieli.jl_filebrowse.interfaces;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_filebrowse.bean.FileChangeInfo;
import com.jieli.jl_filebrowse.bean.SDCardBean;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface OnFileBrowseCallback {
    void OnFlayCallback(boolean r1);

    void onBluetoothConnectionChange(BluetoothDevice r1, int r2);

    void onFileDataReceive(byte[] r1);

    void onFileReadFailed(int r1);

    void onFileReadStart();

    void onFileReadStop(boolean r1);

    void onFileStructureChange(FileChangeInfo r1);

    void onSdCardChange(List<SDCardBean> r1);
}
