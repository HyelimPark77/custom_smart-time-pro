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
public final class TimeFormatItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.Xii());
        if (BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText(Utils.getApp().getResources().getStringArray(R.array.time_format)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.HOUR_SYSTEM, 0, null, 6, null)]);
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
        return R.layout.device_item_time_format;
    }
}
