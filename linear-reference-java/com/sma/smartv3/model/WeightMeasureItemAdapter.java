package com.sma.smartv3.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WeightMeasureItemAdapter extends RecyclerView.Adapter<WeightMeasureItemHolder> {

    @aa1
    private final Context context;

    @aa1
    private final List<WeightMeasureItemData> items;

    public WeightMeasureItemAdapter(@aa1 List<WeightMeasureItemData> r2, @aa1 Context r3) {
        Intrinsics.X0O(r2, "items");
        Intrinsics.X0O(r3, "context");
        this.items = r2;
        this.context = r3;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
        onBindViewHolder((WeightMeasureItemHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public void onBindViewHolder(@aa1 WeightMeasureItemHolder r18, int r19) {
        Intrinsics.X0O(r18, "holder");
        WeightMeasureItemData r1 = this.items.get(r19);
        r18.getIvIcom().setImageResource(r1.getIcon());
        r18.getTvName().setText(r1.getName());
        r18.getTvValue().setVisibility(8);
        r18.getTvLevel().setVisibility(8);
        r18.getSbv().setVisibility(8);
        r18.getTvTips().setVisibility(8);
        r18.getIvSwitcher().setVisibility(0);
        r18.getExpandableLayout().setExpandEnable(true);
        r18.getRecyclerView().setVisibility(8);
        r18.getTvLevel().setTextColor(gk4.iO(this.context, R.color.text_color));
        r18.getTvLevel().setBackground(null);
        if (r1.isShowValue() == false) goto L6;
        r18.getTvValue().setVisibility(0);
        r18.getTvValue().setText(r1.getValue() + r1.getUnit());
    L6:
        if (r1.isShowLevel() == false) goto L9;
        r18.getTvLevel().setVisibility(0);
        WeightMeasureDataKt.setLevelView(r18.getTvLevel(), r1.getLevel() - 1, r1.getLevelRangeText(), r1.getLevelColor());
    L9:
        if (r1.isShowBarView() == false) goto L12;
        r18.getSbv().setVisibility(0);
        WeightMeasureDataKt.setBarView$default(r18.getSbv(), r1.getValue(), r1.getLevelRange(), r1.getLevelRangeText(), r1.getLevelColor(), false, 32, null);
    L12:
        if (r1.isShowTips() == false) goto L15;
        r18.getTvTips().setVisibility(0);
        r18.getTvTips().setText(r1.getTipText());
    L15:
        if (r1.isShowGridView() == false) goto L18;
        r18.getRecyclerView().setVisibility(0);
        RecyclerView r4 = r18.getRecyclerView();
        r4.setLayoutManager(new GridLayoutManager(r4.getContext(), 3));
        int r8 = r1.getLevel() - 1;
        String[] r7 = r1.getLevelRangeText();
        int[] r9 = r1.getGridViewImgs();
        Context r10 = r4.getContext();
        Intrinsics.O10IXXX0X(r10, "getContext(...)");
        r4.setAdapter(new LevelItemAdapter(r8, r7, r9, r10));
    L18:
        if (r1.isMore() == true) goto L20;
        r18.getExpandableLayout().setExpandEnable(false);
        r18.getIvSwitcher().setVisibility(4);
    L20:
        r18.updateItem(r19);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public WeightMeasureItemHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
        Intrinsics.X0O(r4, "parent");
        View r6 = LayoutInflater.from(this.context).inflate(R.layout.weight_measure_report_item, r4, false);
        Intrinsics.O10IXXX0X(r6, "inflate(...)");
        return new WeightMeasureItemHolder(r6);
    }
}
