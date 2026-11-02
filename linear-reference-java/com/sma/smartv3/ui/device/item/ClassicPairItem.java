package com.sma.smartv3.ui.device.item;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.component.BleConnector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ClassicPairItem extends BaseDslItem {
    public ClassicPairItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        if (i72.OXO1.X10i() == false) goto L12;
        BleConnector r0 = BleConnector.INSTANCE;
        if (r0.isBound() == false) goto L12;
        if (r0.isBoundClassic() == true) goto L12;
        if (q62.OXO1.I1Ii() == false) goto L12;
        boolean r1 = false;
    L13:
        setItemHidden(r1);
        return;
    L12:
        r1 = true;
        goto L13
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_classic_pair;
    }
}
