package com.sma.smartv3.ui.ai.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchAIFillingItem extends BaseDslItem {
    public SearchAIFillingItem() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        Object r0 = getItemData();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        AIFunction r1 = (AIFunction) r0;
        TextView r4 = r3.tv(R.id.tv_title);
        if (r4 == null) goto L6;
        r4.setText(r1.getTitle());
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function_filling;
    }
}
