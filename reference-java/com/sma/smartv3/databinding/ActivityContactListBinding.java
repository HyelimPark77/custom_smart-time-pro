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
        int i = R.id.empty;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.empty);
        if (frameLayout != null) {
            i = R.id.list_view;
            SwipeMenuListView swipeMenuListView = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
            if (swipeMenuListView != null) {
                i = R.id.ll_data;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_data);
                if (frameLayout2 != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    return new ActivityContactListBinding(linearLayout, frameLayout, swipeMenuListView, frameLayout2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityContactListBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_contact_list, parent, false);
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
