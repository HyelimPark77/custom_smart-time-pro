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

    public WeightMeasureItemAdapter(@aa1 List<WeightMeasureItemData> items, @aa1 Context context) {
        Intrinsics.X0O(items, "items");
        Intrinsics.X0O(context, "context");
        this.items = items;
        this.context = context;
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
    public void onBindViewHolder(@aa1 WeightMeasureItemHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        WeightMeasureItemData weightMeasureItemData = this.items.get(i);
        holder.getIvIcom().setImageResource(weightMeasureItemData.getIcon());
        holder.getTvName().setText(weightMeasureItemData.getName());
        holder.getTvValue().setVisibility(8);
        holder.getTvLevel().setVisibility(8);
        holder.getSbv().setVisibility(8);
        holder.getTvTips().setVisibility(8);
        holder.getIvSwitcher().setVisibility(0);
        holder.getExpandableLayout().setExpandEnable(true);
        holder.getRecyclerView().setVisibility(8);
        holder.getTvLevel().setTextColor(gk4.m1859iO(this.context, R.color.text_color));
        holder.getTvLevel().setBackground(null);
        if (weightMeasureItemData.isShowValue()) {
            holder.getTvValue().setVisibility(0);
            holder.getTvValue().setText(weightMeasureItemData.getValue() + weightMeasureItemData.getUnit());
        }
        if (weightMeasureItemData.isShowLevel()) {
            holder.getTvLevel().setVisibility(0);
            WeightMeasureDataKt.setLevelView(holder.getTvLevel(), weightMeasureItemData.getLevel() - 1, weightMeasureItemData.getLevelRangeText(), weightMeasureItemData.getLevelColor());
        }
        if (weightMeasureItemData.isShowBarView()) {
            holder.getSbv().setVisibility(0);
            WeightMeasureDataKt.setBarView$default(holder.getSbv(), weightMeasureItemData.getValue(), weightMeasureItemData.getLevelRange(), weightMeasureItemData.getLevelRangeText(), weightMeasureItemData.getLevelColor(), false, 32, null);
        }
        if (weightMeasureItemData.isShowTips()) {
            holder.getTvTips().setVisibility(0);
            holder.getTvTips().setText(weightMeasureItemData.getTipText());
        }
        if (weightMeasureItemData.isShowGridView()) {
            holder.getRecyclerView().setVisibility(0);
            RecyclerView recyclerView = holder.getRecyclerView();
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            int level = weightMeasureItemData.getLevel() - 1;
            String[] levelRangeText = weightMeasureItemData.getLevelRangeText();
            int[] gridViewImgs = weightMeasureItemData.getGridViewImgs();
            Context context = recyclerView.getContext();
            Intrinsics.O10IXXX0X(context, "getContext(...)");
            recyclerView.setAdapter(new LevelItemAdapter(level, levelRangeText, gridViewImgs, context));
        }
        if (!weightMeasureItemData.isMore()) {
            holder.getExpandableLayout().setExpandEnable(false);
            holder.getIvSwitcher().setVisibility(4);
        }
        holder.updateItem(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public WeightMeasureItemHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.weight_measure_report_item, parent, false);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        return new WeightMeasureItemHolder(viewInflate);
    }
}
