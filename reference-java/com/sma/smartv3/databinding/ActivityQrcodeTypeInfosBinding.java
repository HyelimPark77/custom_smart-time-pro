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

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQrcodeTypeInfosBinding implements ViewBinding {

    @NonNull
    public final SwipeMenuListView listView;

    @NonNull
    private final LinearLayout rootView;

    private ActivityQrcodeTypeInfosBinding(@NonNull LinearLayout rootView, @NonNull SwipeMenuListView listView) {
        this.rootView = rootView;
        this.listView = listView;
    }

    @NonNull
    public static ActivityQrcodeTypeInfosBinding bind(@NonNull View rootView) {
        SwipeMenuListView swipeMenuListView = (SwipeMenuListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
        if (swipeMenuListView != null) {
            return new ActivityQrcodeTypeInfosBinding((LinearLayout) rootView, swipeMenuListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.list_view)));
    }

    @NonNull
    public static ActivityQrcodeTypeInfosBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQrcodeTypeInfosBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qrcode_type_infos, parent, false);
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
