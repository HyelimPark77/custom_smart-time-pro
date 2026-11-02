package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class XmlyAudioItem extends BaseDeviceItem {
    public XmlyAudioItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (i72.OXO1.IIi10() == true) goto L5;
    L8:
        boolean r0 = true;
    L9:
        setItemHidden(r0);
        return;
    L5:
        if (q62.OXO1.OiXI1OiX0() == true) goto L8;
        r0 = false;
        goto L9
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_xmly_audio;
    }
}
