package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleGameTimeReminder;

/* JADX INFO: loaded from: classes18.dex */
public final class GameTimeSetItem extends BaseDeviceItem {
    public GameTimeSetItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.iiIi0());
        if (BleConnector.INSTANCE.isBound() == false) goto L12;
        BleGameTimeReminder r0 = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_TIME_REMINDER, BleGameTimeReminder.class, null, null, 12, null);
        TextView r1 = getTvRight();
        if (r1 != null) goto L7;
        return;
    L7:
        if (r0.getMEnabled() != 0) goto L9;
        String r2 = Utils.getApp().getString(R.string.off_text);
    L10:
        r1.setText(r2);
        return;
    L9:
        r2 = Utils.getApp().getString(R.string.d_minutes, new Object[]{Integer.valueOf(r0.getMMinute())});
        goto L10
    L12:
        TextView r3 = getTvRight();
        if (r3 == null) goto L17;
        r3.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_game_time_set;
    }
}
