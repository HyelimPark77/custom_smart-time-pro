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
public final class DateFormatItem extends BaseDeviceItem {
    public DateFormatItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        i72 r0 = i72.OXO1;
        setItemHidden(!r0.IO0iXO0O());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        TextView r1 = getTvRight();
        if (r1 == null) goto L12;
        r1.setText(Utils.getApp().getResources().getStringArray(R.array.date_format)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.DATE_FORMAT, r0.XiOIO().getType(), null, 4, null)]);
        return;
    L12:
        return;
    L8:
        TextView r2 = getTvRight();
        if (r2 == null) goto L13;
        r2.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_date_format;
    }
}
