package com.sma.smartv3.p610ui.device.item;

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
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.iiIi0());
        if (!BleConnector.INSTANCE.isBound()) {
            TextView tvRight = getTvRight();
            if (tvRight != null) {
                tvRight.setText("");
                return;
            }
            return;
        }
        BleGameTimeReminder bleGameTimeReminder = (BleGameTimeReminder) BaseBleCache.getObjectNotNull$default(BleCache.INSTANCE, BleKey.GAME_TIME_REMINDER, BleGameTimeReminder.class, null, null, 12, null);
        TextView tvRight2 = getTvRight();
        if (tvRight2 != null) {
            tvRight2.setText(bleGameTimeReminder.getMEnabled() == 0 ? Utils.getApp().getString(R.string.off_text) : Utils.getApp().getString(R.string.d_minutes, Integer.valueOf(bleGameTimeReminder.getMMinute())));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_game_time_set;
    }
}
