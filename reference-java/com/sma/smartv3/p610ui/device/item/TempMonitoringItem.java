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
import com.szabh.smable3.entity.BleTemperatureDetecting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TempMonitoringItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView tvLeft;
        q62 q62Var = q62.OXO1;
        setItemHidden(!q62Var.X0I1());
        if (!getItemHidden()) {
            if (BleConnector.INSTANCE.isBound()) {
                BleTemperatureDetecting bleTemperatureDetecting = (BleTemperatureDetecting) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.TEMPERATURE_DETECTING, BleTemperatureDetecting.class, null, null, 12, null);
                TextView tvRight = getTvRight();
                if (tvRight != null) {
                    tvRight.setText(cp5.XiOIO(bleTemperatureDetecting.getMBleTimeRange().getMEnabled()));
                }
            } else {
                TextView tvRight2 = getTvRight();
                if (tvRight2 != null) {
                    tvRight2.setText("");
                }
            }
        }
        if (!q62Var.XI1OX0IO() || (tvLeft = getTvLeft()) == null) {
            return;
        }
        tvLeft.setText(R.string.check_skin_temperature);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_temperature_monitoring;
    }

    @sf5(tag = I01XX0.OII)
    public final void onHrMonitoringChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }
}
