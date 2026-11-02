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
public final class ActivityTranslateSessionListBinding implements ViewBinding {

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

    private ActivityTranslateSessionListBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout aiNoteEmptyListLl, @NonNull RecyclerView aiNoteRv, @NonNull SwipeRefreshLayout aiNoteSwipeRefreshLayout, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.aiNoteEmptyListLl = aiNoteEmptyListLl;
        this.aiNoteRv = aiNoteRv;
        this.aiNoteSwipeRefreshLayout = aiNoteSwipeRefreshLayout;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityTranslateSessionListBinding bind(@NonNull View rootView) {
        int i = R.id.aiNoteEmptyListLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.aiNoteEmptyListLl);
        if (linearLayout != null) {
            i = R.id.aiNoteRv;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.aiNoteRv);
            if (recyclerView != null) {
                i = R.id.aiNoteSwipeRefreshLayout;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(rootView, R.id.aiNoteSwipeRefreshLayout);
                if (swipeRefreshLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) rootView;
                    return new ActivityTranslateSessionListBinding(linearLayout2, linearLayout, recyclerView, swipeRefreshLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityTranslateSessionListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityTranslateSessionListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_translate_session_list, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
