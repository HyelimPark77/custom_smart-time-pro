package com.sma.smartv3.ui.device.item;

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
    private final boolean initEvent;

    public TempMonitoringItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        setItemHidden(!r0.X0I1());
        if (getItemHidden() == true) goto L13;
        if (BleConnector.INSTANCE.isBound() == false) goto L9;
        BleTemperatureDetecting r1 = (BleTemperatureDetecting) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.TEMPERATURE_DETECTING, BleTemperatureDetecting.class, null, null, 12, null);
        TextView r2 = getTvRight();
        if (r2 == null) goto L13;
        r2.setText(cp5.XiOIO(r1.getMBleTimeRange().getMEnabled()));
        goto L13
    L9:
        TextView r3 = getTvRight();
        if (r3 == null) goto L13;
        r3.setText("");
    L13:
        if (r0.XI1OX0IO() == false) goto L18;
        TextView r4 = getTvLeft();
        if (r4 == null) goto L19;
        r4.setText(R.string.check_skin_temperature);
        return;
    L19:
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_temperature_monitoring;
    }

    @sf5(tag = I01XX0.OII)
    public final void onHrMonitoringChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }
}
