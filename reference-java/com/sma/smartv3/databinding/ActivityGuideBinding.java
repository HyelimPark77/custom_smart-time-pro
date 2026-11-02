package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityGuideBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    private ActivityGuideBinding(@NonNull RelativeLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityGuideBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new ActivityGuideBinding((RelativeLayout) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_guide, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
