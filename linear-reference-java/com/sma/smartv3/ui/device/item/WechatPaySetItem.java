package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;

/* JADX INFO: loaded from: classes18.dex */
public final class WechatPaySetItem extends BaseDeviceItem {
    public WechatPaySetItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ImageView r0 = getIv();
        if (r0 == null) goto L5;
        r0.setImageResource(R.drawable.icon_app_wechat);
    L5:
        TextView r1 = getTvLeft();
        if (r1 == null) goto L8;
        r1.setText(UtilsKt.XXO(R.string.wechat));
    L8:
        setItemHidden(!q62.OXO1.I1X01IO());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_alipay_set;
    }
}
