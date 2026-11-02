package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleEcgSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class EcgMonitoringItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 q62Var = q62.OXO1;
        setItemHidden(!q62Var.XXI0XOIX());
        if (getItemHidden()) {
            return;
        }
        if (!BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        BleEcgSettings bleEcgSettings = (BleEcgSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.ECG_SET, BleEcgSettings.class, null, null, 12, null);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText(cp5.XiOIO(q62Var.IIX(bleEcgSettings.getMBleTimeRange().getMEnabled()) ? 1 : 0));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_ecg_monitoring;
    }

    @sf5(tag = I01XX0.XiOIii1)
    public final void onEcgMonitoringChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }
}
