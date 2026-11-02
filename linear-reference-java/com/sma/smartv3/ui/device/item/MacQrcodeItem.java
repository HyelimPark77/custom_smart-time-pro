package com.sma.smartv3.ui.device.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.Utils;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;

/* JADX INFO: loaded from: classes18.dex */
public final class MacQrcodeItem extends BaseDeviceItem {
    public MacQrcodeItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.OXOIiXO1());
        if (BleConnector.INSTANCE.isBound() == false) goto L8;
        TextView r0 = getTvRight();
        if (r0 == null) goto L12;
        r0.setText(Utils.getApp().getResources().getStringArray(R.array.mac_qrcodes)[BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.MAC_QRCODE, 1, null, 4, null) - 1]);
        return;
    L12:
        return;
    L8:
        TextView r1 = getTvRight();
        if (r1 == null) goto L13;
        r1.setText("");
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_mac_qrcode;
    }
}
