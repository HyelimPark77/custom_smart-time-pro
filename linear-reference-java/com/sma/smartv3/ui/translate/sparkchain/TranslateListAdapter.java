package com.sma.smartv3.ui.translate.sparkchain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.l06;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTranslateListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n87#2,7:71\n94#2,3:79\n70#2,7:82\n97#2:89\n1#3:78\n*S KotlinDebug\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n*L\n49#1:71,7\n49#1:79,3\n49#1:82,7\n49#1:89\n49#1:78\n*E\n"})
public final class TranslateListAdapter extends RecyclerView.Adapter<AiNoteViewHolder> {

    @aa1
    private final List<AIRecords> dataList;

    public final class AiNoteViewHolder extends RecyclerView.ViewHolder {

        @tb1
        private TextView contentTv;

        @tb1
        private LinearLayout itemLl;
        final /* synthetic */ TranslateListAdapter this$0;

        @tb1
        private TextView timeTv;

        @tb1
        private TextView titleTv;

        public AiNoteViewHolder(@aa1 TranslateListAdapter r2, View r3) {
            Intrinsics.X0O(r3, "itemView");
            this.this$0 = r2;
            super(r3);
            this.itemLl = (LinearLayout) r3.findViewById(R.id.aiNoteItemLl);
            this.titleTv = (TextView) r3.findViewById(R.id.aiNoteTitleTv);
            this.contentTv = (TextView) r3.findViewById(R.id.aiNoteContentTv);
            this.timeTv = (TextView) r3.findViewById(R.id.aiNoteTimeTv);
        }

        @tb1
        public final TextView getContentTv() {
            return this.contentTv;
        }

        @tb1
        public final LinearLayout getItemLl() {
            return this.itemLl;
        }

        @tb1
        public final TextView getTimeTv() {
            return this.timeTv;
        }

        @tb1
        public final TextView getTitleTv() {
            return this.titleTv;
        }

        public final void setContentTv(@tb1 TextView r1) {
            this.contentTv = r1;
        }

        public final void setItemLl(@tb1 LinearLayout r1) {
            this.itemLl = r1;
        }

        public final void setTimeTv(@tb1 TextView r1) {
            this.timeTv = r1;
        }

        public final void setTitleTv(@tb1 TextView r1) {
            this.titleTv = r1;
        }
    }

    public TranslateListAdapter() {
        this.dataList = new ArrayList();
    }

    public static /* synthetic */ void OXO1(AiNoteViewHolder r0, AIRecords r1, View r2) {
        onBindViewHolder$lambda$0(r0, r1, r2);
    }

    private static final void onBindViewHolder$lambda$0(AiNoteViewHolder r2, AIRecords r3, View r4) {
        LinearLayout r5 = r2.getItemLl();
        if (r5 == null) goto L5;
        Context r6 = r5.getContext();
    L6:
        Activity r7 = (Activity) r6;
        if (r7 == null) goto L10;
        String r8 = r3.getMAITitle();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", r8);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r9 = new Intent(r7, TranslateSessionDetailActivity.class);
        r9.putExtras(r0);
        r7.startActivity(r9);
        return;
    L10:
        return;
    L5:
        r6 = null;
        goto L6
    }

    public final void deleteAll() {
        this.dataList.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder r1, int r2) {
        onBindViewHolder((AiNoteViewHolder) r1, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup r1, int r2) {
        return onCreateViewHolder(r1, r2);
    }

    public final void submitData(@aa1 List<AIRecords> r2) {
        Intrinsics.X0O(r2, "list");
        this.dataList.clear();
        this.dataList.addAll(r2);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(@aa1 final AiNoteViewHolder r3, int r4) {
        Intrinsics.X0O(r3, "holder");
        final AIRecords r5 = this.dataList.get(r4);
        TextView r0 = r3.getTimeTv();
        if (r0 == null) goto L5;
        r0.setText(r5.getMLocalTime());
    L5:
        TextView r1 = r3.getContentTv();
        if (r1 == null) goto L8;
        r1.setText(r5.getMContent());
    L8:
        LinearLayout r2 = r3.getItemLl();
        if (r2 == null) goto L12;
        r2.setOnClickListener(new l06(r3, r5));
        return;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public AiNoteViewHolder onCreateViewHolder(@aa1 ViewGroup r3, int r4) {
        Intrinsics.X0O(r3, "parent");
        View r5 = LayoutInflater.from(r3.getContext()).inflate(R.layout.item_ai_note, r3, false);
        Intrinsics.XXI(r5);
        return new AiNoteViewHolder(this, r5);
    }
}
