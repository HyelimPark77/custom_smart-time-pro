package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleHrMonitoringSettings;
import com.szabh.smable3.entity.BleHrWarningSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HrMonitoringItem extends BaseDeviceItem {
    private final boolean initEvent;

    public HrMonitoringItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        int r2 = 0;
        if (r0.Xi() == false) goto L5;
    L7:
        boolean r1 = false;
    L8:
        setItemHidden(r1);
        if (getItemHidden() == true) goto L48;
        BleConnector r3 = BleConnector.INSTANCE;
        if (r3.isBound() == false) goto L33;
        if (r0.Xi() == false) goto L33;
        if (r0.iI0OIOO() == false) goto L33;
        BleCache r5 = BleCache.INSTANCE;
        BleHrMonitoringSettings r4 = (BleHrMonitoringSettings) BaseBleCache.getObjectNotNull$default(r5, BleKey.HR_MONITORING, BleHrMonitoringSettings.class, null, null, 12, null);
        if (r0.Ii1X() == false) goto L27;
        BleHrWarningSettings r6 = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(r5, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
        int r7 = r6.getMHighSwitch();
        int r8 = r6.getMLowSwitch();
        boolean r9 = r0.IIX(r4.getMBleTimeRange().getMEnabled());
        TextView r10 = getTvRight();
        if (r10 == null) goto L25;
        if (r7 == 1) goto L23;
        if (r8 == 1) goto L23;
        if (r9 == true) goto L23;
    L24:
        r10.setText(cp5.XiOIO(r2));
    L23:
        r2 = 1;
    L25:
        LogUtils.i(new Object[]{"HrMonitoringItem", String.valueOf(r7), Integer.valueOf(r8), Boolean.valueOf(r9)});
        return;
    L27:
        TextView r11 = getTvRight();
        if (r11 == null) goto L30;
        r11.setText(cp5.XiOIO(r0.IIX(r4.getMBleTimeRange().getMEnabled()) ? 1 : 0));
    L30:
        LogUtils.i(new Object[]{"HrMonitoringItem", Integer.valueOf(r4.getMBleTimeRange().getMEnabled())});
        return;
    L33:
        if (r3.isBound() == true) goto L35;
    L44:
        TextView r12 = getTvRight();
        if (r12 == null) goto L49;
        r12.setText("");
        return;
    L49:
        return;
    L35:
        if (r0.Ii1X() == false) goto L44;
        BleHrWarningSettings r13 = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
        int r14 = r13.getMHighSwitch();
        int r15 = r13.getMLowSwitch();
        TextView r16 = getTvRight();
        if (r16 == null) goto L42;
        if (r14 == 1) goto L40;
        if (r15 == 1) goto L40;
    L41:
        r16.setText(cp5.XiOIO(r2));
    L40:
        r2 = 1;
    L42:
        LogUtils.i(new Object[]{"HrMonitoringItem2", String.valueOf(r14), Integer.valueOf(r15)});
        return;
    L48:
        return;
    L5:
        if (r0.Ii1X() == true) goto L7;
        r1 = true;
        goto L8
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_heart_rate_monitoring;
    }

    @sf5(tag = I01XX0.OiIIX101O)
    public final void onHrMonitoringChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onHrMonitoringChange");
        initView();
    }
}
