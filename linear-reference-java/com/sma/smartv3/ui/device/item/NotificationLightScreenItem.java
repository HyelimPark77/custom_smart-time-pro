package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class NotificationLightScreenItem extends BaseDeviceItem {
    public NotificationLightScreenItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.OIXIiX111());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        int r0 = BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.NOTIFICATION_LIGHT_SCREEN_SET, 0, null, 6, null);
        TextView r1 = getTvRight();
        if (r1 == null) goto L12;
        r1.setText(cp5.XiOIO(r0));
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
        return R.layout.device_item_notificationlightscreen;
    }
}
