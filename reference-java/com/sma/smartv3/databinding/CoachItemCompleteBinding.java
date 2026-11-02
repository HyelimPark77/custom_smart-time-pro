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
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_item_create_plan);
        if (button != null) {
            return new CoachItemCompleteBinding((LinearLayout) rootView, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.coach_item_create_plan)));
    }

    @NonNull
    public static CoachItemCompleteBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CoachItemCompleteBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.coach_item_complete, parent, false);
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
