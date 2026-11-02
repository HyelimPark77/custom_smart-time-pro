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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivityRecognitionItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BleConnector bleConnector = BleConnector.INSTANCE;
        setItemHidden((bleConnector.isBound() && q62.OXO1.OiO1iiO1O()) ? false : true);
        if (bleConnector.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText(cp5.XiOIO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.ACTIVITY_RECOGNIYION, 0, null, 6, null)));
                return;
            }
            return;
        }
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText("");
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_activity_recognition;
    }

    @sf5(tag = I01XX0.II1Xi0)
    public final void onActivityRecognitionChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        initView();
    }
}
