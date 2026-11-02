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
public final class ActivityScreenLockBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    private ActivityScreenLockBinding(@NonNull RelativeLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityScreenLockBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new ActivityScreenLockBinding((RelativeLayout) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityScreenLockBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityScreenLockBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_screen_lock, parent, false);
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
