package com.sma.smartv3.ui.device.item;

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
import com.szabh.smable3.entity.BleRelaxReminder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RelaxReminderItem extends BaseDeviceItem {
    private final boolean initEvent;

    public RelaxReminderItem() {
        this.initEvent = true;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.XXX());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        BleRelaxReminder r0 = (BleRelaxReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.RELAX_REMINDER, BleRelaxReminder.class, null, null, 12, null);
        TextView r1 = getTvRight();
        if (r1 == null) goto L12;
        r1.setText(cp5.XiOIO(r0.getMBleTimeRange().getMEnabled()));
        return;
    L12:
        return;
    L8:
        TextView r2 = getTvRight();
        if (r2 == null) goto L13;
        r2.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_relax_reminder;
    }

    @sf5(tag = I01XX0.X01IiOiIi)
    public final void onRelaxReminderChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        i1O0OXO1O.OXO1.OXO1("onRelaxReminderChange");
        initView();
    }
}
