package com.sma.smartv3.p610ui.device.item;

import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class MemoryManagerItem extends BaseDeviceItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(!q62.OXO1.XI1O1111i());
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_memory_manager;
    }
}
