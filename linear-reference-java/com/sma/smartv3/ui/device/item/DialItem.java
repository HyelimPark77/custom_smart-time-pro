package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class DialItem extends BaseDslItem {
    public DialItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        BleCache r0 = BleCache.INSTANCE;
        if (r0.getMWatchFaceType() != 0) goto L5;
    L10:
        boolean r1 = true;
    L11:
        setItemHidden(r1);
        return;
    L5:
        if (i72.OXO1.XX00i10X() == false) goto L10;
        if (r0.getMWatchFaceType() == 14) goto L10;
        r1 = false;
        goto L11
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_dial;
    }
}
