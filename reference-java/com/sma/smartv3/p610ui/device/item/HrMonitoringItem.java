package com.sma.smartv3.p610ui.device.item;

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
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 q62Var = q62.OXO1;
        setItemHidden((q62Var.m2889Xi() || q62Var.Ii1X()) ? false : true);
        if (getItemHidden()) {
            return;
        }
        BleConnector bleConnector = BleConnector.INSTANCE;
        if (!bleConnector.isBound() || !q62Var.m2889Xi() || !q62Var.iI0OIOO()) {
            if (!bleConnector.isBound() || !q62Var.Ii1X()) {
                TextView tvRight = getTvRight();
                if (tvRight != null) {
                    tvRight.setText("");
                    return;
                }
                return;
            }
            BleHrWarningSettings bleHrWarningSettings = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
            int mHighSwitch = bleHrWarningSettings.getMHighSwitch();
            int mLowSwitch = bleHrWarningSettings.getMLowSwitch();
            TextView tvRight2 = getTvRight();
            if (tvRight2 != null) {
                tvRight2.setText(cp5.XiOIO((mHighSwitch == 1 || mLowSwitch == 1) ? 1 : 0));
            }
            LogUtils.m11130i("HrMonitoringItem2", String.valueOf(mHighSwitch), Integer.valueOf(mLowSwitch));
            return;
        }
        BleCache bleCache = BleCache.INSTANCE;
        BleHrMonitoringSettings bleHrMonitoringSettings = (BleHrMonitoringSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.HR_MONITORING, BleHrMonitoringSettings.class, null, null, 12, null);
        if (!q62Var.Ii1X()) {
            TextView tvRight3 = getTvRight();
            if (tvRight3 != null) {
                tvRight3.setText(cp5.XiOIO(q62Var.IIX(bleHrMonitoringSettings.getMBleTimeRange().getMEnabled()) ? 1 : 0));
            }
            LogUtils.m11130i("HrMonitoringItem", Integer.valueOf(bleHrMonitoringSettings.getMBleTimeRange().getMEnabled()));
            return;
        }
        BleHrWarningSettings bleHrWarningSettings2 = (BleHrWarningSettings) BaseBleCache.getObjectNotNull$default(bleCache, BleKey.HR_WARNING_SET, BleHrWarningSettings.class, null, null, 12, null);
        int mHighSwitch2 = bleHrWarningSettings2.getMHighSwitch();
        int mLowSwitch2 = bleHrWarningSettings2.getMLowSwitch();
        boolean zIIX = q62Var.IIX(bleHrMonitoringSettings.getMBleTimeRange().getMEnabled());
        TextView tvRight4 = getTvRight();
        if (tvRight4 != null) {
            tvRight4.setText(cp5.XiOIO((mHighSwitch2 == 1 || mLowSwitch2 == 1 || zIIX) ? 1 : 0));
        }
        LogUtils.m11130i("HrMonitoringItem", String.valueOf(mHighSwitch2), Integer.valueOf(mLowSwitch2), Boolean.valueOf(zIIX));
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_heart_rate_monitoring;
    }

    @sf5(tag = I01XX0.OiIIX101O)
    public final void onHrMonitoringChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onHrMonitoringChange");
        initView();
    }
}
