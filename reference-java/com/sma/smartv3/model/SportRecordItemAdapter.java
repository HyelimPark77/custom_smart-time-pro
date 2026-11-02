package com.sma.smartv3.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.pro.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SportRecordItemAdapter extends RecyclerView.Adapter<SportRecordItemViewHolder> {

    @aa1
    private final Context context;

    @aa1
    private final List<SportRecordItemData> items;

    /* JADX WARN: Multi-variable type inference failed */
    public SportRecordItemAdapter(@aa1 List<? extends SportRecordItemData> items, @aa1 Context context) {
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
    public void onBindViewHolder(@aa1 SportRecordItemViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        SportRecordItemData sportRecordItemData = this.items.get(i);
        holder.getTv().setText(sportRecordItemData.getTv());
        holder.getIv().setImageResource(sportRecordItemData.getIv());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public SportRecordItemViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_content, parent, false);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        return new SportRecordItemViewHolder(viewInflate);
    }
}
