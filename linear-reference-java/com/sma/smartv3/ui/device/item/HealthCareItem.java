package com.sma.smartv3.ui.device.item;

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
    private final boolean initEvent;

    public HealthCareItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.XXiO0i());
        if (getItemHidden() == false) goto L5;
    L12:
        TextView r0 = getTvLeft();
        if (r0 == null) goto L16;
        r0.setText(q62.OXO1.XX1Oi());
        return;
    L16:
        return;
    L5:
        if (BleConnector.INSTANCE.isBound() == false) goto L9;
        BleGirlCareSettings r1 = (BleGirlCareSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GIRL_CARE, BleGirlCareSettings.class, null, null, 12, null);
        TextView r2 = getTvRight();
        if (r2 == null) goto L12;
        r2.setText(cp5.XiOIO(r1.getMEnabled()));
        goto L12
    L9:
        TextView r3 = getTvRight();
        if (r3 == null) goto L12;
        r3.setText("");
        goto L12
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_health_care;
    }

    @sf5(tag = I01XX0.OX)
    public final void onGirlCareChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }
}
