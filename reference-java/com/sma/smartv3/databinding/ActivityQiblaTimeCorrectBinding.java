package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityQiblaTimeCorrectBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityQiblaTimeCorrectBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.recyclerView = recyclerView;
        this.root = root;
    }

    @NonNull
    public static ActivityQiblaTimeCorrectBinding bind(@NonNull View rootView) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.recyclerView)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ActivityQiblaTimeCorrectBinding(linearLayout, recyclerView, linearLayout);
    }

    @NonNull
    public static ActivityQiblaTimeCorrectBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityQiblaTimeCorrectBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_qibla_time_correct, parent, false);
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
