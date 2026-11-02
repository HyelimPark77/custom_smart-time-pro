package com.sma.smartv3.p610ui.device.item;

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
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        i72 i72Var = i72.OXO1;
        setItemHidden(!i72Var.IO0iXO0O());
        if (BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText(Utils.getApp().getResources().getStringArray(R.array.date_format)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.DATE_FORMAT, i72Var.XiOIO().getType(), null, 4, null)]);
                return;
            }
            return;
        }
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText("");
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_date_format;
    }
}
