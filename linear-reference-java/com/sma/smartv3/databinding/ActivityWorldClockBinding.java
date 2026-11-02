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
        int r0 = R.id.list_view;
        SwipeMenuListView r1 = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r1 == null) goto L9;
        r0 = R.id.tv_tip;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r2 == null) goto L9;
        return new ActivityWorldClockBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWorldClockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_world_clock, parent, false);
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
