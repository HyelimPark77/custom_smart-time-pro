package com.sma.smartv3.p610ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class FindWatchItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden((BleConnector.INSTANCE.isBound() && q62.OXO1.OI1O()) ? false : true);
        if (q62.OXO1.XI1OX0IO()) {
            TextView tvLeft = getTvLeft();
            if (tvLeft != null) {
                tvLeft.setText(R.string.find_watch__title_wristband);
            }
            ImageView iv = getIv();
            if (iv != null) {
                iv.setImageResource(R.drawable.icon_find_wristband);
            }
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_find_watch;
    }
}
