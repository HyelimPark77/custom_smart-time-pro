package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityAiNoteBinding implements ViewBinding {

    @NonNull
    public final LinearLayout aiNoteEmptyListLl;

    @NonNull
    public final RecyclerView aiNoteRv;

    @NonNull
    public final SwipeRefreshLayout aiNoteSwipeRefreshLayout;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityAiNoteBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout aiNoteEmptyListLl, @NonNull RecyclerView aiNoteRv, @NonNull SwipeRefreshLayout aiNoteSwipeRefreshLayout, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.aiNoteEmptyListLl = aiNoteEmptyListLl;
        this.aiNoteRv = aiNoteRv;
        this.aiNoteSwipeRefreshLayout = aiNoteSwipeRefreshLayout;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityAiNoteBinding bind(@NonNull View rootView) {
        int r0 = R.id.aiNoteEmptyListLl;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.aiNoteEmptyListLl);
        if (r4 == null) goto L11;
        r0 = R.id.aiNoteRv;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.aiNoteRv);
        if (r5 == null) goto L11;
        r0 = R.id.aiNoteSwipeRefreshLayout;
        SwipeRefreshLayout r6 = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.aiNoteSwipeRefreshLayout);
        if (r6 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityAiNoteBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityAiNoteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityAiNoteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_ai_note, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
