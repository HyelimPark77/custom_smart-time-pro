package com.sma.smartv3.p610ui.ai_note;

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
import com.sma.smartv3.p610ui.ai_note.AiNoteAdapter;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nAiNoteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteAdapter.kt\ncom/sma/smartv3/ui/ai_note/AiNoteAdapter\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n87#2,7:70\n94#2,3:78\n70#2,7:81\n97#2:88\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AiNoteAdapter.kt\ncom/sma/smartv3/ui/ai_note/AiNoteAdapter\n*L\n48#1:70,7\n48#1:78,3\n48#1:81,7\n48#1:88\n48#1:77\n*E\n"})
public final class AiNoteAdapter extends RecyclerView.Adapter<AiNoteViewHolder> {

    @aa1
    private final List<AIRecords> dataList = new ArrayList();

    public final class AiNoteViewHolder extends RecyclerView.ViewHolder {

        @tb1
        private TextView contentTv;

        @tb1
        private LinearLayout itemLl;
        final /* synthetic */ AiNoteAdapter this$0;

        @tb1
        private TextView timeTv;

        @tb1
        private TextView titleTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AiNoteViewHolder(@aa1 AiNoteAdapter aiNoteAdapter, View itemView) {
            super(itemView);
            Intrinsics.X0O(itemView, "itemView");
            this.this$0 = aiNoteAdapter;
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
            int mId = aIRecords.getMId();
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", null);
            bundle.putInt("mArg1", mId);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(activity, (Class<?>) AiNoteDetailActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }

    public final void clear() {
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
        TextView titleTv = holder.getTitleTv();
        if (titleTv != null) {
            titleTv.setText(aIRecords.getMAITitle());
        }
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
            itemLl.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XiXi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AiNoteAdapter.onBindViewHolder$lambda$0(holder, aIRecords, view);
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
