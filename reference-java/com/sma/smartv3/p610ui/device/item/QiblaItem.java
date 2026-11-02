package com.sma.smartv3.p610ui.device.item;

import android.app.Application;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleQiblaSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class QiblaItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Application app = Utils.getApp();
        Intrinsics.O10IXXX0X(app, "getApp(...)");
        boolean z = true;
        if (!UtilsKt.IiiXiI0I(app) && q62.OXO1.i1I1X0OX1()) {
            z = false;
        }
        setItemHidden(z);
        if (!BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        BleQiblaSettings bleQiblaSettings = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.QIBLA_SET, BleQiblaSettings.class, null, null, 12, null);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText(cp5.XiOIO(bleQiblaSettings.getMEnabled()));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_qibla;
    }

    @sf5(tag = I01XX0.XXIIO1i11)
    public final void onQiblaChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1("onQiblaChange");
        initView();
    }
}
