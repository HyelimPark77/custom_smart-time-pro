package com.sma.smartv3.ui.device.item;

import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class VoiceItem extends BaseDeviceItem {
    public VoiceItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        q62 r0 = q62.OXO1;
        setItemHidden(!r0.IiO0());
        TextView r1 = getTvLeft();
        if (r1 == null) goto L5;
        r1.setText(r0.XI());
    L5:
        ImageView r2 = getIv();
        if (r2 == null) goto L9;
        r2.setImageResource(r0.IiiiOIIi0());
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_voice;
    }
}
