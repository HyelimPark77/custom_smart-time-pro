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

    public LevelItemAdapter(int r2, @aa1 String[] r3, @aa1 int[] r4, @aa1 Context r5) {
        Intrinsics.X0O(r3, "levelRangeText");
        Intrinsics.X0O(r4, "gridViewImgs");
        Intrinsics.X0O(r5, "context");
        this.level = r2;
        this.levelRangeText = r3;
        this.gridViewImgs = r4;
        this.context = r5;
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
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
        onBindViewHolder((LevelItemViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public void onBindViewHolder(@aa1 LevelItemViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        r3.getTv().setText(this.levelRangeText[r4]);
        r3.getIv().setImageResource(this.gridViewImgs[r4]);
        r3.getLlLevelPanel().setBackground(null);
        if (r4 != this.level) goto L6;
        r3.getLlLevelPanel().setBackgroundColor(Color.parseColor("#3C8AF188"));
        return;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public LevelItemViewHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
        Intrinsics.X0O(r4, "parent");
        View r6 = LayoutInflater.from(this.context).inflate(R.layout.item_weight_report_level, r4, false);
        Intrinsics.O10IXXX0X(r6, "inflate(...)");
        return new LevelItemViewHolder(r6);
    }
}
