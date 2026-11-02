package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class FindWatchItem extends BaseDeviceItem {
    public FindWatchItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (BleConnector.INSTANCE.isBound() == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        setItemHidden(r0);
        if (q62.OXO1.XI1OX0IO() == false) goto L18;
        TextView r1 = getTvLeft();
        if (r1 == null) goto L14;
        r1.setText(R.string.find_watch__title_wristband);
    L14:
        ImageView r2 = getIv();
        if (r2 == null) goto L19;
        r2.setImageResource(R.drawable.icon_find_wristband);
        return;
    L19:
        return;
    L18:
        return;
    L5:
        if (q62.OXO1.OI1O() == false) goto L8;
        r0 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_find_watch;
    }
}
