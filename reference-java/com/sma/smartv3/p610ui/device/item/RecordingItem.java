package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class RecordingItem extends BaseDeviceItem {
    private final boolean initEvent = true;

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!i72.OXO1.X111IO());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_sync_recording;
    }
}
