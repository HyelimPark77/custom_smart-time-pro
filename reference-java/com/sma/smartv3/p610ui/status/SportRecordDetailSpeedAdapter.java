package com.sma.smartv3.p610ui.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b15;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportRecordDetailSpeedAdapter extends RecyclerView.Adapter<SportRecordDetailSpeedViewHolder> {

    @aa1
    private final Context context;

    @aa1
    private final ArrayList<b15> items;

    public SportRecordDetailSpeedAdapter(@aa1 ArrayList<b15> items, @aa1 Context context) {
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
    public void onBindViewHolder(@aa1 SportRecordDetailSpeedViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        b15 b15Var = this.items.get(i);
        Intrinsics.O10IXXX0X(b15Var, "get(...)");
        b15 b15Var2 = b15Var;
        holder.getNumber().setText(b15Var2.OXO1());
        holder.getPb().setPB(b15Var2.m1517iO());
        holder.getTvPace().setText(b15Var2.XIi00iiXO());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public SportRecordDetailSpeedViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_detail_pace_content, parent, false);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        return new SportRecordDetailSpeedViewHolder(viewInflate);
    }
}
