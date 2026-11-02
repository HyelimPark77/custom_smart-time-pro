package com.sma.smartv3.ui.status;

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

    public SportRecordDetailSpeedAdapter(@aa1 ArrayList<b15> r2, @aa1 Context r3) {
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
        onBindViewHolder((SportRecordDetailSpeedViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public void onBindViewHolder(@aa1 SportRecordDetailSpeedViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        b15 r5 = this.items.get(r4);
        Intrinsics.O10IXXX0X(r5, "get(...)");
        b15 r6 = r5;
        r3.getNumber().setText(r6.OXO1());
        r3.getPb().setPB(r6.iO());
        r3.getTvPace().setText(r6.XIi00iiXO());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public SportRecordDetailSpeedViewHolder onCreateViewHolder(@aa1 ViewGroup r4, int r5) {
        Intrinsics.X0O(r4, "parent");
        View r6 = LayoutInflater.from(this.context).inflate(R.layout.item_sport_record_detail_pace_content, r4, false);
        Intrinsics.O10IXXX0X(r6, "inflate(...)");
        return new SportRecordDetailSpeedViewHolder(r6);
    }
}
