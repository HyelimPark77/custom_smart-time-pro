package com.sma.smartv3.p610ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;

/* JADX INFO: loaded from: classes18.dex */
public final class WechatPaySetItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        ImageView iv = getIv();
        if (iv != null) {
            iv.setImageResource(R.drawable.icon_app_wechat);
        }
        TextView tvLeft = getTvLeft();
        if (tvLeft != null) {
            tvLeft.setText(UtilsKt.XXO(R.string.wechat));
        }
        setItemHidden(!q62.OXO1.I1X01IO());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_alipay_set;
    }
}
