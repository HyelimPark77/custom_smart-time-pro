package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class SyncContactItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden((BleConnector.INSTANCE.isBound() && q62.OXO1.i1O11001()) ? false : true);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_sync_contact;
    }
}
