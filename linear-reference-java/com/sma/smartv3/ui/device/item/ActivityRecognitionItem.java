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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivityRecognitionItem extends BaseDeviceItem {
    public ActivityRecognitionItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isBound() == true) goto L5;
    L8:
        boolean r1 = true;
    L9:
        setItemHidden(r1);
        if (r0.isBound() == false) goto L15;
        TextView r2 = getTvRight();
        if (r2 == null) goto L19;
        r2.setText(cp5.XiOIO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.ACTIVITY_RECOGNIYION, 0, null, 6, null)));
        return;
    L19:
        return;
    L15:
        TextView r3 = getTvRight();
        if (r3 == null) goto L20;
        r3.setText("");
        return;
    L20:
        return;
    L5:
        if (q62.OXO1.OiO1iiO1O() == false) goto L8;
        r1 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_activity_recognition;
    }

    @sf5(tag = I01XX0.II1Xi0)
    public final void onActivityRecognitionChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        initView();
    }
}
