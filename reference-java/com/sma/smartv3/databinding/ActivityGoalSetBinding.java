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
public final class ActivityGoalSetBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private ActivityGoalSetBinding(@NonNull LinearLayout rootView) {
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityGoalSetBinding bind(@NonNull View rootView) {
        if (rootView != null) {
            return new ActivityGoalSetBinding((LinearLayout) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ActivityGoalSetBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityGoalSetBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_goal_set, parent, false);
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
