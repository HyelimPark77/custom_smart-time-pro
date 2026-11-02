package com.sma.smartv3.p610ui.p611ai.item;

import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.AIFunction;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchAIFillingItem extends BaseDslItem {
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Object itemData = getItemData();
        Intrinsics.X1ii(itemData, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction");
        AIFunction aIFunction = (AIFunction) itemData;
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(aIFunction.getTitle());
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.ai_item_function_filling;
    }
}
