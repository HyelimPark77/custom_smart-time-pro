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
        int i = R.id.item_ai_records_delete;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_delete);
        if (imageView != null) {
            i = R.id.item_ai_records_question;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_question);
            if (textView != null) {
                i = R.id.item_ai_records_results;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_results);
                if (textView2 != null) {
                    i = R.id.item_ai_records_share;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_share);
                    if (imageView2 != null) {
                        i = R.id.item_ai_records_time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.item_ai_records_time);
                        if (textView3 != null) {
                            return new ItemAiRecordsBinding((LinearLayout) rootView, imageView, textView, textView2, imageView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAiRecordsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiRecordsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_records, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
