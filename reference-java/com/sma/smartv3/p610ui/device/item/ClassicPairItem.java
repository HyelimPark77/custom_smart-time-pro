package com.sma.smartv3.p610ui.device.item;

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
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        boolean z;
        if (i72.OXO1.X10i()) {
            BleConnector bleConnector = BleConnector.INSTANCE;
            if (bleConnector.isBound() && !bleConnector.isBoundClassic() && q62.OXO1.I1Ii()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        setItemHidden(z);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.device_item_classic_pair;
    }
}
