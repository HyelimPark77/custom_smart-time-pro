package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class LanguageUpdateItem extends BaseDeviceItem {
    public LanguageUpdateItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (BleConnector.INSTANCE.isBound() == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        setItemHidden(r0);
        return;
    L5:
        if (q62.OXO1.OOXiOO() == false) goto L8;
        r0 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_language_update;
    }
}
