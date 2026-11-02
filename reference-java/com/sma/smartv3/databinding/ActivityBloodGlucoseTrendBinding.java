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
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBloodGlucoseTrendBinding implements ViewBinding {

    @NonNull
    public final FrameLayout content;

    @NonNull
    private final LinearLayout rootView;

    private ActivityBloodGlucoseTrendBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout content) {
        this.rootView = rootView;
        this.content = content;
    }

    @NonNull
    public static ActivityBloodGlucoseTrendBinding bind(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.content);
        if (frameLayout != null) {
            return new ActivityBloodGlucoseTrendBinding((LinearLayout) rootView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.content)));
    }

    @NonNull
    public static ActivityBloodGlucoseTrendBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBloodGlucoseTrendBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_blood_glucose_trend, parent, false);
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
