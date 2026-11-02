package com.sma.smartv3.model;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LevelItemAdapter extends RecyclerView.Adapter<LevelItemViewHolder> {

    @aa1
    private final Context context;

    @aa1
    private final int[] gridViewImgs;
    private final int level;

    @aa1
    private final String[] levelRangeText;

    public LevelItemAdapter(int i, @aa1 String[] levelRangeText, @aa1 int[] gridViewImgs, @aa1 Context context) {
        Intrinsics.X0O(levelRangeText, "levelRangeText");
        Intrinsics.X0O(gridViewImgs, "gridViewImgs");
        Intrinsics.X0O(context, "context");
        this.level = i;
        this.levelRangeText = levelRangeText;
        this.gridViewImgs = gridViewImgs;
        this.context = context;
    }

    @aa1
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.levelRangeText.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 LevelItemViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        holder.getTv().setText(this.levelRangeText[i]);
        holder.getIv().setImageResource(this.gridViewImgs[i]);
        holder.getLlLevelPanel().setBackground(null);
        if (i == this.level) {
            holder.getLlLevelPanel().setBackgroundColor(Color.parseColor("#3C8AF188"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public LevelItemViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.item_weight_report_level, parent, false);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        return new LevelItemViewHolder(viewInflate);
    }
}
