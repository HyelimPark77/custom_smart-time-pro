package com.sma.smartv3.p610ui.p611ai.item;

import android.content.Context;
import android.view.View;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AISearchTopItem$setRecyclerView$mAdapter$1 extends CommonAdapter<String> {
    public AISearchTopItem$setRecyclerView$mAdapter$1(List<String> list, Context context) {
        super(context, R.layout.item_ai_search_tab, list);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final String item, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.setText(R.id.f51423tv, item);
        viewHolder.itemView.setBackgroundResource(R.drawable.ripple_ai_tab_seach_bg);
        viewHolder.setOnClickListener(R.id.ll_item_panel, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.X10i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I01XX0.OXO1(I01XX0.iiiO, item);
            }
        });
    }
}
