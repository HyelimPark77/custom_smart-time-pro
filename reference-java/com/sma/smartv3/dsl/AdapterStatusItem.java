package com.sma.smartv3.dsl;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AdapterStatusItem extends DslAdapterStatusItem {
    @Override // com.angcyo.dsladapter.DslAdapterStatusItem, com.angcyo.dsladapter.BaseDslStateItem
    public void _onBindStateLayout(@aa1 DslViewHolder itemHolder, int i) {
        TextView textView;
        Intrinsics.X0O(itemHolder, "itemHolder");
        super._onBindStateLayout(itemHolder, i);
        if (i != 2 || (textView = (TextView) itemHolder.m3483v(R.id.text_view)) == null) {
            return;
        }
        textView.setText("");
        textView.setTextColor(0);
    }
}
