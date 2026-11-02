package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class LanguageUpdateItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden((BleConnector.INSTANCE.isBound() && q62.OXO1.OOXiOO()) ? false : true);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_language_update;
    }
}
