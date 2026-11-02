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
import com.szabh.smable3.entity.BleEcgSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class EcgMonitoringItem extends BaseDeviceItem {
    private final boolean initEvent;

    public EcgMonitoringItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        setItemHidden(!r0.XXI0XOIX());
        if (getItemHidden() == false) goto L5;
        return;
    L5:
        if (BleConnector.INSTANCE.isBound() == false) goto L10;
        BleEcgSettings r1 = (BleEcgSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.ECG_SET, BleEcgSettings.class, null, null, 12, null);
        TextView r2 = getTvRight();
        if (r2 == null) goto L15;
        r2.setText(cp5.XiOIO(r0.IIX(r1.getMBleTimeRange().getMEnabled()) ? 1 : 0));
        return;
    L15:
        return;
    L10:
        TextView r3 = getTvRight();
        if (r3 == null) goto L16;
        r3.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_ecg_monitoring;
    }

    @sf5(tag = I01XX0.XiOIii1)
    public final void onEcgMonitoringChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }
}
