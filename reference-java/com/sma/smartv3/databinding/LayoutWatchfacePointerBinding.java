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
public final class LayoutWatchfacePointerBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvPointer;

    @NonNull
    public final RecyclerView rvScale;

    private LayoutWatchfacePointerBinding(@NonNull LinearLayout rootView, @NonNull RecyclerView rvPointer, @NonNull RecyclerView rvScale) {
        this.rootView = rootView;
        this.rvPointer = rvPointer;
        this.rvScale = rvScale;
    }

    @NonNull
    public static LayoutWatchfacePointerBinding bind(@NonNull View rootView) {
        int i = R.id.rvPointer;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvPointer);
        if (recyclerView != null) {
            i = R.id.rvScale;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rvScale);
            if (recyclerView2 != null) {
                return new LayoutWatchfacePointerBinding((LinearLayout) rootView, recyclerView, recyclerView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutWatchfacePointerBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutWatchfacePointerBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_watchface_pointer, parent, false);
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
