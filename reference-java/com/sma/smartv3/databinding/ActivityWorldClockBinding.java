package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWorldClockBinding implements ViewBinding {

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTip;

    private ActivityWorldClockBinding(@NonNull LinearLayout rootView, @NonNull SwipeMenuListView listView, @NonNull PFMedium tvTip) {
        this.rootView = rootView;
        this.listView = listView;
        this.tvTip = tvTip;
    }

    @NonNull
    public static ActivityWorldClockBinding bind(@NonNull View rootView) {
        int i = R.id.list_view;
        SwipeMenuListView swipeMenuListView = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (swipeMenuListView != null) {
            i = R.id.tv_tip;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
            if (pFMedium != null) {
                return new ActivityWorldClockBinding((LinearLayout) rootView, swipeMenuListView, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_world_clock, parent, false);
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
