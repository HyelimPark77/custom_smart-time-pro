package com.jieli.jl_rcsp.interfaces.nfc;

import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.device.NfcMsg;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public interface OnSyncNfcMsgListener {
    void onError(BaseError r1);

    void onFinish(List<NfcMsg> r1);

    void onStart();
}
