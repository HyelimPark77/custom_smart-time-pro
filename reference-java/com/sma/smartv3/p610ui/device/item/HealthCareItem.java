package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGirlCareSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HealthCareItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.XXiO0i());
        if (!getItemHidden()) {
            if (BleConnector.INSTANCE.isBound()) {
                BleGirlCareSettings bleGirlCareSettings = (BleGirlCareSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GIRL_CARE, BleGirlCareSettings.class, null, null, 12, null);
                TextView tvRight = getTvRight();
                if (tvRight != null) {
                    tvRight.setText(cp5.XiOIO(bleGirlCareSettings.getMEnabled()));
                }
            } else {
                TextView tvRight2 = getTvRight();
                if (tvRight2 != null) {
                    tvRight2.setText("");
                }
            }
        }
        TextView tvLeft = getTvLeft();
        if (tvLeft != null) {
            tvLeft.setText(q62.OXO1.XX1Oi());
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_health_care;
    }

    @sf5(tag = I01XX0.f1088OX)
    public final void onGirlCareChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }
}
