package com.sma.smartv3.ui.device.item;

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

    public SplitTitleItem(int r1) {
        this.resID = r1;
        setItemLayoutId(R.layout.device_item_split_title);
    }

    public final int getResID() {
        return this.resID;
    }

    @Override // com.angcyo.dsladapter.DslAdapterItem
    @CallSuper
    public void onItemBind(@aa1 DslViewHolder r2, int r3, @aa1 DslAdapterItem r4) {
        Intrinsics.X0O(r2, "itemHolder");
        Intrinsics.X0O(r4, "adapterItem");
        super.onItemBind(r2, r3, r4);
        TextView r5 = r2.tv(R.id.tvTitle);
        if (r5 == null) goto L6;
        r5.setText(this.resID);
        return;
    }

    public final void setResID(int r1) {
        this.resID = r1;
    }
}
