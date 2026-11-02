package com.sma.smartv3.ui.device.item;

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
    private final boolean initEvent;

    public QiblaItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        Application r0 = Utils.getApp();
        Intrinsics.O10IXXX0X(r0, "getApp(...)");
        boolean r1 = true;
        if (UtilsKt.IiiXiI0I(r0) == false) goto L6;
    L9:
        setItemHidden(r1);
        if (BleConnector.INSTANCE.isBound() == false) goto L15;
        BleQiblaSettings r2 = (BleQiblaSettings) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.QIBLA_SET, BleQiblaSettings.class, null, null, 12, null);
        TextView r3 = getTvRight();
        if (r3 == null) goto L19;
        r3.setText(cp5.XiOIO(r2.getMEnabled()));
        return;
    L19:
        return;
    L15:
        TextView r4 = getTvRight();
        if (r4 == null) goto L20;
        r4.setText("");
        return;
    L20:
        return;
    L6:
        if (q62.OXO1.i1I1X0OX1() == false) goto L9;
        r1 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_qibla;
    }

    @sf5(tag = I01XX0.XXIIO1i11)
    public final void onQiblaChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onQiblaChange");
        initView();
    }
}
