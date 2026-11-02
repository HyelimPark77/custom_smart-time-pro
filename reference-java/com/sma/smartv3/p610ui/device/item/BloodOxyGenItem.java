package com.sma.smartv3.p610ui.device.item;

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
import com.szabh.smable3.entity.BleBloodOxyGenSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BloodOxyGenItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.I1IXIOX1());
        if (!BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        BleBloodOxyGenSettings bleBloodOxyGenSettings = (BleBloodOxyGenSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.BLOOD_OXYGEN_SET, BleBloodOxyGenSettings.class, null, null, 12, null);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText(cp5.XiOIO(bleBloodOxyGenSettings.getMBleTimeRange().getMEnabled()));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_blood_oxygen;
    }

    @sf5(tag = I01XX0.iOOX010X)
    public final void onBloodOxyGenChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onBloodOxyGenChange");
        initView();
    }
}
