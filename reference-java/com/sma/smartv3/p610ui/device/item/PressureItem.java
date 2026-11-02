package com.sma.smartv3.p610ui.device.item;

import android.widget.ImageView;
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
import com.szabh.smable3.entity.BlePressureTimingMeasurement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class PressureItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ImageView iv;
        q62 q62Var = q62.OXO1;
        setItemHidden(!q62Var.OOI1i0());
        if (BleConnector.INSTANCE.isBound()) {
            BlePressureTimingMeasurement blePressureTimingMeasurement = (BlePressureTimingMeasurement) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.PRESSURE_TIMING_MEASUREMENT, BlePressureTimingMeasurement.class, null, null, 12, null);
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText(cp5.XiOIO(blePressureTimingMeasurement.getMBleTimeRange().getMEnabled()));
            }
        } else {
            TextView tvRight2 = getTvRight();
            if (tvRight2 != null) {
                tvRight2.setText("");
            }
        }
        if (!q62Var.XI1OX0IO() || (iv = getIv()) == null) {
            return;
        }
        iv.setImageResource(R.drawable.icon_bracelet_pressure_set);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_pressure;
    }

    @sf5(tag = I01XX0.f1095iX)
    public final void onPressureSetChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onPressureSetChange");
        initView();
    }
}
