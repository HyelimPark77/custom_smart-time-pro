package com.sma.smartv3.p610ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 q62Var = q62.OXO1;
        setItemHidden(!q62Var.IiO0());
        TextView tvLeft = getTvLeft();
        if (tvLeft != null) {
            tvLeft.setText(q62Var.m2887XI());
        }
        ImageView iv = getIv();
        if (iv != null) {
            iv.setImageResource(q62Var.IiiiOIIi0());
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_voice;
    }
}
