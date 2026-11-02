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
public final class FragmentCyclingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private FragmentCyclingBinding(@NonNull LinearLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static FragmentCyclingBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new FragmentCyclingBinding((LinearLayout) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentCyclingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentCyclingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_cycling, parent, false);
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
