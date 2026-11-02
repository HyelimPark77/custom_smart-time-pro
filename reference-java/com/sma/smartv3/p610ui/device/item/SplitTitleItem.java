package com.sma.smartv3.p610ui.device.item;

import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SplitTitleItem extends DslAdapterItem {
    private int resID;

    public SplitTitleItem(int i) {
        this.resID = i;
        setItemLayoutId(R.layout.device_item_split_title);
    }

    public final int getResID() {
        return this.resID;
    }

    @Override // com.angcyo.dsladapter.DslAdapterItem
    @CallSuper
    public void onItemBind(@aa1 DslViewHolder itemHolder, int i, @aa1 DslAdapterItem adapterItem) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        super.onItemBind(itemHolder, i, adapterItem);
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tvTitle);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(this.resID);
        }
    }

    public final void setResID(int i) {
        this.resID = i;
    }
}
