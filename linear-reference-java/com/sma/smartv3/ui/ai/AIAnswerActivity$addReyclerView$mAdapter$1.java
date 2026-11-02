package com.sma.smartv3.ui.ai;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.iOO1ii1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIAnswerActivity$addReyclerView$mAdapter$1 extends CommonAdapter<String> {
    final /* synthetic */ AIAnswerActivity.OXO1 $tabData;

    public AIAnswerActivity$addReyclerView$mAdapter$1(List<String> r1, AIAnswerActivity.OXO1 r2, Activity r3) {
        this.$tabData = r2;
        super(r3, R.layout.item_ai_answer_tab, r1);
    }

    public static /* synthetic */ void OXO1(AIAnswerActivity.OXO1 r0, String r1, AIAnswerActivity$addReyclerView$mAdapter$1 r2, View r3) {
        convert$lambda$1(r0, r1, r2, r3);
    }

    private static final void convert$lambda$1(AIAnswerActivity.OXO1 r0, String r1, AIAnswerActivity$addReyclerView$mAdapter$1 r2, View r3) {
        r0.XOO0ii0(r1);
        r2.notifyDataSetChanged();
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
        View r5 = r2.itemView;
        if (Intrinsics.XOO0ii0(r3, this.$tabData.IiI10X()) == false) goto L5;
        int r0 = R.drawable.shape_ai_tab_selected_bg;
    L6:
        r5.setBackgroundResource(r0);
        final AIAnswerActivity.OXO1 r6 = this.$tabData;
        r2.setOnClickListener(R.id.ll_item_panel, new iOO1ii1(r6, r3, this));
        return;
    L5:
        r0 = R.drawable.ripple_ai_tab_not_selected;
        goto L6
    }
}
