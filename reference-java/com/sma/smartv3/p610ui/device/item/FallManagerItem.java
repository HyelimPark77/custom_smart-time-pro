package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class FallManagerItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.IO0IXI());
        if (BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText(cp5.XiOIO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.FALL_SET, 0, null, 6, null)));
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
        return R.layout.device_item_fall_manager;
    }
}
