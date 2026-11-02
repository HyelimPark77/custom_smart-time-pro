package com.sma.smartv3.p610ui.translate.sparkchain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.translate.sparkchain.TranslateListAdapter;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTranslateListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n87#2,7:71\n94#2,3:79\n70#2,7:82\n97#2:89\n1#3:78\n*S KotlinDebug\n*F\n+ 1 TranslateListAdapter.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateListAdapter\n*L\n49#1:71,7\n49#1:79,3\n49#1:82,7\n49#1:89\n49#1:78\n*E\n"})
public final class TranslateListAdapter extends RecyclerView.Adapter<AiNoteViewHolder> {

    @aa1
    private final List<AIRecords> dataList = new ArrayList();

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AiNoteViewHolder(@aa1 TranslateListAdapter translateListAdapter, View itemView) {
            super(itemView);
            Intrinsics.X0O(itemView, "itemView");
            this.this$0 = translateListAdapter;
            this.itemLl = (LinearLayout) itemView.findViewById(R.id.aiNoteItemLl);
            this.titleTv = (TextView) itemView.findViewById(R.id.aiNoteTitleTv);
            this.contentTv = (TextView) itemView.findViewById(R.id.aiNoteContentTv);
            this.timeTv = (TextView) itemView.findViewById(R.id.aiNoteTimeTv);
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

        public final void setContentTv(@tb1 TextView textView) {
            this.contentTv = textView;
        }

        public final void setItemLl(@tb1 LinearLayout linearLayout) {
            this.itemLl = linearLayout;
        }

        public final void setTimeTv(@tb1 TextView textView) {
            this.timeTv = textView;
        }

        public final void setTitleTv(@tb1 TextView textView) {
            this.titleTv = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AiNoteViewHolder aiNoteViewHolder, AIRecords aIRecords, View view) {
        LinearLayout itemLl = aiNoteViewHolder.getItemLl();
        Activity activity = (Activity) (itemLl != null ? itemLl.getContext() : null);
        if (activity != null) {
            String mAITitle = aIRecords.getMAITitle();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", mAITitle);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(activity, (Class<?>) TranslateSessionDetailActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    public final void deleteAll() {
        this.dataList.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void submitData(@aa1 List<AIRecords> list) {
        Intrinsics.X0O(list, "list");
        this.dataList.clear();
        this.dataList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@aa1 final AiNoteViewHolder holder, int i) {
        Intrinsics.X0O(holder, "holder");
        final AIRecords aIRecords = this.dataList.get(i);
        TextView timeTv = holder.getTimeTv();
        if (timeTv != null) {
            timeTv.setText(aIRecords.getMLocalTime());
        }
        TextView contentTv = holder.getContentTv();
        if (contentTv != null) {
            contentTv.setText(aIRecords.getMContent());
        }
        LinearLayout itemLl = holder.getItemLl();
        if (itemLl != null) {
            itemLl.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.l06
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TranslateListAdapter.onBindViewHolder$lambda$0(holder, aIRecords, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @aa1
    public AiNoteViewHolder onCreateViewHolder(@aa1 ViewGroup parent, int i) {
        Intrinsics.X0O(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ai_note, parent, false);
        Intrinsics.XXI(viewInflate);
        return new AiNoteViewHolder(this, viewInflate);
    }
}
