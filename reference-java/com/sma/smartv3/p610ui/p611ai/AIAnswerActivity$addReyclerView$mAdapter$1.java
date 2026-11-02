package com.sma.smartv3.p610ui.p611ai;

import android.app.Activity;
import android.view.View;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.sma.smartv3.p610ui.p611ai.AIAnswerActivity$addReyclerView$mAdapter$1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class AIAnswerActivity$addReyclerView$mAdapter$1 extends CommonAdapter<String> {
    final /* synthetic */ AIAnswerActivity.OXO1 $tabData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAnswerActivity$addReyclerView$mAdapter$1(List<String> list, AIAnswerActivity.OXO1 oxo1, Activity activity) {
        super(activity, R.layout.item_ai_answer_tab, list);
        this.$tabData = oxo1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$1(AIAnswerActivity.OXO1 oxo1, String str, AIAnswerActivity$addReyclerView$mAdapter$1 aIAnswerActivity$addReyclerView$mAdapter$1, View view) {
        oxo1.XOO0ii0(str);
        aIAnswerActivity$addReyclerView$mAdapter$1.notifyDataSetChanged();
    }

    @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
    public void convert(ViewHolder viewHolder, final String item, int i) {
        Intrinsics.X0O(viewHolder, "viewHolder");
        Intrinsics.X0O(item, "item");
        viewHolder.setText(R.id.f51423tv, item);
        viewHolder.itemView.setBackgroundResource(Intrinsics.XOO0ii0(item, this.$tabData.IiI10X()) ? R.drawable.shape_ai_tab_selected_bg : R.drawable.ripple_ai_tab_not_selected);
        final AIAnswerActivity.OXO1 oxo1 = this.$tabData;
        viewHolder.setOnClickListener(R.id.ll_item_panel, new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOO1ii1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIAnswerActivity$addReyclerView$mAdapter$1.convert$lambda$1(oxo1, item, this, view);
            }
        });
    }
}
