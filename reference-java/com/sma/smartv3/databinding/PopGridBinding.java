package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PopGridBinding implements ViewBinding {

    @NonNull
    public final GridView gridView;

    @NonNull
    private final LinearLayout rootView;

    private PopGridBinding(@NonNull LinearLayout rootView, @NonNull GridView gridView) {
        this.rootView = rootView;
        this.gridView = gridView;
    }

    @NonNull
    public static PopGridBinding bind(@NonNull View rootView) {
        GridView gridView = (GridView) ViewBindings.findChildViewById(rootView, R.id.grid_view);
        if (gridView != null) {
            return new PopGridBinding((LinearLayout) rootView, gridView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.grid_view)));
    }

    @NonNull
    public static PopGridBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopGridBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pop_grid, parent, false);
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
