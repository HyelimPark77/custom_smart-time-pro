package com.sma.smartv3.dsl;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AdapterStatusItem extends DslAdapterStatusItem {
    public AdapterStatusItem() {
    }

    @Override // com.angcyo.dsladapter.DslAdapterStatusItem, com.angcyo.dsladapter.BaseDslStateItem
    public void _onBindStateLayout(@aa1 DslViewHolder r2, int r3) {
        Intrinsics.X0O(r2, "itemHolder");
        super._onBindStateLayout(r2, r3);
        if (r3 != 2) goto L8;
        TextView r4 = (TextView) r2.v(R.id.text_view);
        if (r4 == null) goto L9;
        r4.setText("");
        r4.setTextColor(0);
        return;
    L9:
        return;
    }
}
