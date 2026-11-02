package com.sma.smartv3.ui.device.item;

import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes18.dex */
public final class NucleicAcidCodeItem extends BaseDeviceItem {
    public NucleicAcidCodeItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        setItemHidden(true);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_nucleic_acid_code;
    }
}
