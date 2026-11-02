package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachItemCompleteBinding implements ViewBinding {

    @NonNull
    public final Button coachItemCreatePlan;

    @NonNull
    private final LinearLayout rootView;

    private CoachItemCompleteBinding(@NonNull LinearLayout rootView, @NonNull Button coachItemCreatePlan) {
        this.rootView = rootView;
        this.coachItemCreatePlan = coachItemCreatePlan;
    }

    @NonNull
    public static CoachItemCompleteBinding bind(@NonNull View rootView) {
        Button r1 = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_item_create_plan);
        if (r1 == null) goto L7;
        return new CoachItemCompleteBinding((LinearLayout) rootView, r1);
    L7:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.coach_item_create_plan)));
    }

    @NonNull
    public static CoachItemCompleteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CoachItemCompleteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.coach_item_complete, parent, false);
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
