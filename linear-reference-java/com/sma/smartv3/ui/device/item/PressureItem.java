package com.sma.smartv3.ui.device.item;

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
    private final boolean initEvent;

    public PressureItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        setItemHidden(!r0.OOI1i0());
        if (BleConnector.INSTANCE.isBound() == false) goto L7;
        BlePressureTimingMeasurement r1 = (BlePressureTimingMeasurement) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.PRESSURE_TIMING_MEASUREMENT, BlePressureTimingMeasurement.class, null, null, 12, null);
        TextView r2 = getTvRight();
        if (r2 == null) goto L11;
        r2.setText(cp5.XiOIO(r1.getMBleTimeRange().getMEnabled()));
    L11:
        if (r0.XI1OX0IO() == false) goto L16;
        ImageView r3 = getIv();
        if (r3 == null) goto L17;
        r3.setImageResource(R.drawable.icon_bracelet_pressure_set);
        return;
    L17:
        return;
    L16:
        return;
    L7:
        TextView r4 = getTvRight();
        if (r4 == null) goto L11;
        r4.setText("");
        goto L11
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_pressure;
    }

    @sf5(tag = I01XX0.iX)
    public final void onPressureSetChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onPressureSetChange");
        initView();
    }
}
