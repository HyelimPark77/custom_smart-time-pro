package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMResponse<T> {

    @tb1
    private final T data;

    @tb1
    private BGEMStatus status;

    @tb1
    public final T getData() {
        return this.data;
    }

    @tb1
    public final BGEMStatus getStatus() {
        return this.status;
    }

    public final void setStatus(@tb1 BGEMStatus bGEMStatus) {
        this.status = bGEMStatus;
    }

    @aa1
    public String toString() {
        return "BGEMResponse(status=" + this.status + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }
}
