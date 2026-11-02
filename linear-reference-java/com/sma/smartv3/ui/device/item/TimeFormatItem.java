package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.i72;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class TimeFormatItem extends BaseDeviceItem {
    public TimeFormatItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.Xii());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        TextView r0 = getTvRight();
        if (r0 == null) goto L12;
        r0.setText(Utils.getApp().getResources().getStringArray(R.array.time_format)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.HOUR_SYSTEM, 0, null, 6, null)]);
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
        return R.layout.device_item_time_format;
    }
}
