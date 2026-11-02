package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrvMonitoringSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HrvSetItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.iXOXii());
        if (!BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        BleHrvMonitoringSettings bleHrvMonitoringSettings = (BleHrvMonitoringSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.HRV_SET, BleHrvMonitoringSettings.class, null, null, 12, null);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText(cp5.XiOIO(bleHrvMonitoringSettings.getMBleTimeRange().getMEnabled()));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_hrv_set;
    }

    @sf5(tag = I01XX0.IiiiOIIi0)
    public final void onHrvSetChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onHrvSetChange");
        initView();
    }
}
