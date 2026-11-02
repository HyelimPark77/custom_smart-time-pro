package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutGoalDoneDgBinding implements ViewBinding {

    @NonNull
    public final ImageView ivGoalDone;

    @NonNull
    private final LinearLayout rootView;

    private LayoutGoalDoneDgBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivGoalDone) {
        this.rootView = rootView;
        this.ivGoalDone = ivGoalDone;
    }

    @NonNull
    public static LayoutGoalDoneDgBinding bind(@NonNull View rootView) {
        ImageView r1 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_goal_done);
        if (r1 == null) goto L7;
        return new LayoutGoalDoneDgBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.iv_goal_done)));
    }

    @NonNull
    public static LayoutGoalDoneDgBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutGoalDoneDgBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_goal_done_dg, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
