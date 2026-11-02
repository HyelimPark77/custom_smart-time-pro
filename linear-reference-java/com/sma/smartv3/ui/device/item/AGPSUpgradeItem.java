package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AGPSUpgradeItem extends BaseDslItem {
    public AGPSUpgradeItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (BleCache.INSTANCE.getMAGpsType() != 0) goto L5;
        boolean r0 = true;
    L6:
        setItemHidden(r0);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_agps_upgrade;
    }
}
