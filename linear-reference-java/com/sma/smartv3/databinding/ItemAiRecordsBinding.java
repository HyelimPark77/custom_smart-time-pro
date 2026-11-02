package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiRecordsBinding implements ViewBinding {

    @NonNull
    public final ImageView itemAiRecordsDelete;

    @NonNull
    public final TextView itemAiRecordsQuestion;

    @NonNull
    public final TextView itemAiRecordsResults;

    @NonNull
    public final ImageView itemAiRecordsShare;

    @NonNull
    public final TextView itemAiRecordsTime;

    @NonNull
    private final LinearLayout rootView;

    private ItemAiRecordsBinding(@NonNull LinearLayout rootView, @NonNull ImageView itemAiRecordsDelete, @NonNull TextView itemAiRecordsQuestion, @NonNull TextView itemAiRecordsResults, @NonNull ImageView itemAiRecordsShare, @NonNull TextView itemAiRecordsTime) {
        this.rootView = rootView;
        this.itemAiRecordsDelete = itemAiRecordsDelete;
        this.itemAiRecordsQuestion = itemAiRecordsQuestion;
        this.itemAiRecordsResults = itemAiRecordsResults;
        this.itemAiRecordsShare = itemAiRecordsShare;
        this.itemAiRecordsTime = itemAiRecordsTime;
    }

    @NonNull
    public static ItemAiRecordsBinding bind(@NonNull View rootView) {
        int r0 = R.id.item_ai_records_delete;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_delete);
        if (r4 == null) goto L15;
        r0 = R.id.item_ai_records_question;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_question);
        if (r5 == null) goto L15;
        r0 = R.id.item_ai_records_results;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_results);
        if (r6 == null) goto L15;
        r0 = R.id.item_ai_records_share;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_share);
        if (r7 == null) goto L15;
        r0 = R.id.item_ai_records_time;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_time);
        if (r8 == null) goto L15;
        return new ItemAiRecordsBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAiRecordsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiRecordsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_records, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
