package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityContactListBinding implements ViewBinding {

    @NonNull
    public final FrameLayout empty;

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    public final FrameLayout llData;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityContactListBinding(@NonNull LinearLayout rootView_, @NonNull FrameLayout empty, @NonNull SwipeMenuListView listView, @NonNull FrameLayout llData, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.empty = empty;
        this.listView = listView;
        this.llData = llData;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityContactListBinding bind(@NonNull View rootView) {
        int r0 = R.id.empty;
        FrameLayout r4 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (r4 == null) goto L11;
        r0 = R.id.list_view;
        SwipeMenuListView r5 = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (r5 == null) goto L11;
        r0 = R.id.ll_data;
        FrameLayout r6 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
        if (r6 == null) goto L11;
        LinearLayout r3 = (LinearLayout) rootView;
        return new ActivityContactListBinding(r3, r4, r5, r6, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_contact_list, parent, false);
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
