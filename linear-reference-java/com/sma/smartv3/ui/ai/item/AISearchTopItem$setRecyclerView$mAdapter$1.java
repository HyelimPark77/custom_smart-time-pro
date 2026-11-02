package com.sma.smartv3.ui.ai.item;

import android.content.Context;
import android.view.View;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.X10i;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AISearchTopItem$setRecyclerView$mAdapter$1 extends CommonAdapter<String> {
    public AISearchTopItem$setRecyclerView$mAdapter$1(List<String> r2, Context r3) {
        super(r3, R.layout.item_ai_search_tab, r2);
    }

    public static /* synthetic */ void OXO1(String r0, View r1) {
        convert$lambda$1(r0, r1);
    }

    private static final void convert$lambda$1(String r0, View r1) {
        I01XX0.OXO1(I01XX0.iiiO, r0);
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public /* bridge */ /* synthetic */ void convert(ViewHolder r1, String r2, int r3) {
        convert2(r1, r2, r3);
    }

    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public void convert2(ViewHolder r2, final String r3, int r4) {
        Intrinsics.X0O(r2, "viewHolder");
        Intrinsics.X0O(r3, MapController.ITEM_LAYER_TAG);
        r2.setText(R.id.tv, r3);
        r2.itemView.setBackgroundResource(R.drawable.ripple_ai_tab_seach_bg);
        r2.setOnClickListener(R.id.ll_item_panel, new X10i(r3));
    }
}
