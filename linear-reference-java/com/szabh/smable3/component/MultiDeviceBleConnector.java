package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiDeviceBleConnector extends BaseBleConnector {
    public MultiDeviceBleConnector() {
    }

    @Override // com.bestmafen.baseble.connector.AbsBleConnector
    @aa1
    public String getLOG_HEADER() {
        return super.getLOG_HEADER() + ' ' + getMTargetAddress();
    }

    @Override // com.szabh.smable3.component.BaseBleConnector
    @aa1
    public String getTAG() {
        return super.getTAG() + ' ' + getMTargetAddress();
    }

    public final void removeCallbacksAndMessages() {
        connect(false);
        removeHandleCallbackAll();
        getMHandler().removeCallbacksAndMessages("");
        getMBleMessenger().release();
    }
}
