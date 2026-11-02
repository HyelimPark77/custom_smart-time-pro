package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemAiNoteBinding implements ViewBinding {

    @NonNull
    public final TextView aiNoteContentTv;

    @NonNull
    public final LinearLayout aiNoteItemLl;

    @NonNull
    public final TextView aiNoteTimeTv;

    @NonNull
    public final TextView aiNoteTitleTv;

    @NonNull
    private final LinearLayout rootView;

    private ItemAiNoteBinding(@NonNull LinearLayout rootView, @NonNull TextView aiNoteContentTv, @NonNull LinearLayout aiNoteItemLl, @NonNull TextView aiNoteTimeTv, @NonNull TextView aiNoteTitleTv) {
        this.rootView = rootView;
        this.aiNoteContentTv = aiNoteContentTv;
        this.aiNoteItemLl = aiNoteItemLl;
        this.aiNoteTimeTv = aiNoteTimeTv;
        this.aiNoteTitleTv = aiNoteTitleTv;
    }

    @NonNull
    public static ItemAiNoteBinding bind(@NonNull View rootView) {
        int i = R.id.aiNoteContentTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteContentTv);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView;
            i = R.id.aiNoteTimeTv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteTimeTv);
            if (textView2 != null) {
                i = R.id.aiNoteTitleTv;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteTitleTv);
                if (textView3 != null) {
                    return new ItemAiNoteBinding(linearLayout, textView, linearLayout, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemAiNoteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemAiNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_ai_note, parent, false);
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
