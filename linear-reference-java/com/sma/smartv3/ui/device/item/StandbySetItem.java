package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class StandbySetItem extends BaseDeviceItem {
    public StandbySetItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.O0OX());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        TextView r0 = getTvRight();
        if (r0 == null) goto L12;
        r0.setText(cp5.XiOIO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.STANDBY_SET, 0, null, 4, null)));
        return;
    L12:
        return;
    L8:
        TextView r1 = getTvRight();
        if (r1 == null) goto L13;
        r1.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_standby_set;
    }
}
