package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityElectrocardiogramDetailsLandscapeBinding implements ViewBinding {

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    private ActivityElectrocardiogramDetailsLandscapeBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout root) {
        this.rootView = rootView;
        this.root = root;
    }

    @NonNull
    public static ActivityElectrocardiogramDetailsLandscapeBinding bind(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new ActivityElectrocardiogramDetailsLandscapeBinding(linearLayout, linearLayout);
    }

    @NonNull
    public static ActivityElectrocardiogramDetailsLandscapeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityElectrocardiogramDetailsLandscapeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_electrocardiogram_details_landscape, parent, false);
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
