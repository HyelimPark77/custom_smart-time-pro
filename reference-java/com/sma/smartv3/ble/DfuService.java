package com.sma.smartv3.ble;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.aa1;
import no.nordicsemi.android.dfu.DfuBaseService;

/* JADX INFO: loaded from: classes18.dex */
public final class DfuService extends DfuBaseService {
    @Override // no.nordicsemi.android.dfu.DfuBaseService
    @aa1
    public Class<? extends Activity> getNotificationTarget() {
        return DfuNotificationActivity.class;
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    public boolean isDebug() {
        return false;
    }
}
