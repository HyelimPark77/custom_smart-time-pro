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
    public SportRecordItemAdapter(@aa1 List<? extends SportRecordItemData> r2, @aa1 Context r3) {
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
        onBindViewHolder((SportRecordItemViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public void onBindViewHolder(@aa1 SportRecordItemViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        SportRecordItemData r5 = this.items.get(r4);
        r3.getTv().setText(r5.getTv());
        r3.getIv().setImageResource(r5.getIv());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public SportRecordItemViewHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
        Intrinsics.X0O(r4, "parent");
        View r6 = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_content, r4, false);
        Intrinsics.O10IXXX0X(r6, "inflate(...)");
        return new SportRecordItemViewHolder(r6);
    }
}
