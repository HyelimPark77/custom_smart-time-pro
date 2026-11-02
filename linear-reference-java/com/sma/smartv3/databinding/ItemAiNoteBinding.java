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
        int r0 = R.id.aiNoteContentTv;
        TextView r4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteContentTv);
        if (r4 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.aiNoteTimeTv;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteTimeTv);
        if (r6 == null) goto L11;
        r0 = R.id.aiNoteTitleTv;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.aiNoteTitleTv);
        if (r7 == null) goto L11;
        return new ItemAiNoteBinding(r3, r4, r3, r6, r7);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemAiNoteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemAiNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_ai_note, parent, false);
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
